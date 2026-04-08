import os
import csv
import re
import shutil
import subprocess
from pathlib import Path

BASE_PATH = os.path.dirname(os.path.abspath(__file__))

PROJECTS_DIR = os.path.join(BASE_PATH, "projects")
CSV_FILE = "coverage_general.csv"

JUNIT4_DEP = """
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.vintage</groupId>
    <artifactId>junit-vintage-engine</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
"""

EVOSUITE_DEP = """
<dependency>
    <groupId>org.evosuite</groupId>
    <artifactId>evosuite-standalone-runtime</artifactId>
    <version>1.1.0</version>
    <scope>test</scope>
</dependency>
"""

JACOCO_PLUGIN = """
<plugin>
    <groupId>org.jacoco</groupId>
    <artifactId>jacoco-maven-plugin</artifactId>
    <version>0.8.11</version>
    <executions>
        <execution>
            <goals>
                <goal>prepare-agent</goal>
            </goals>
        </execution>
        <execution>
            <id>report</id>
            <phase>test</phase>
            <goals>
                <goal>report</goal>
            </goals>
        </execution>
    </executions>
</plugin>
"""

def run(cmd, cwd=None, timeout=None):
    print("RUN:", cmd)
    return subprocess.run(
        cmd,
        shell=True,
        cwd=cwd,
        check=False,
        text=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        timeout=timeout
    )

def inject_assets_general(pom_path):
    with open(pom_path, "r", encoding="utf-8") as f:
        text = f.read()

    deps_to_add = ""

    if "<artifactId>junit</artifactId>" not in text:
        deps_to_add += JUNIT4_DEP

    if "evosuite-standalone-runtime" not in text:
        deps_to_add += EVOSUITE_DEP

    if deps_to_add:
        if "<dependencies>" in text:
            text = text.replace("<dependencies>", "<dependencies>\n" + deps_to_add)
        else:
            text = text.replace("</project>", f"<dependencies>{deps_to_add}</dependencies>\n</project>")

    if "jacoco-maven-plugin" not in text and "<plugins>" in text:
        text = text.replace("<plugins>", "<plugins>\n" + JACOCO_PLUGIN)

    with open(pom_path, "w", encoding="utf-8") as f:
        f.write(text)

def move_test_dir_to_src(project_path, folder_name):
    original = Path(project_path) / folder_name
    test_root = Path(project_path) / "src/test/java"
    temp_dest = test_root / folder_name

    if not original.exists():
        print(f"ℹ️ Pasta {folder_name} não encontrada em {project_path}")
        return None, None

    test_root.mkdir(parents=True, exist_ok=True)

    if temp_dest.exists():
        raise RuntimeError(f"Destino já existe: {temp_dest}")

    shutil.move(str(original), str(temp_dest))
    print(f"📦 Movido temporariamente: {original} -> {temp_dest}")
    return temp_dest, original

def restore_test_dir(temp_path, original_path):
    if not temp_path or not original_path:
        return

    if temp_path.exists():
        if original_path.exists():
            shutil.rmtree(original_path)
        shutil.move(str(temp_path), str(original_path))
        print(f"↩️ Restaurado: {temp_path} -> {original_path}")

def patch_evosuite_tests(project_path):
    evosuite_dir = Path(project_path) / "src/test/java/evosuite-tests"
    if not evosuite_dir.exists():
        return

    pattern = re.compile(r"separateClassLoader\s*=\s*true")

    for java_file in evosuite_dir.rglob("*.java"):
        text = java_file.read_text(encoding="utf-8", errors="ignore")
        new_text = pattern.sub("separateClassLoader = false", text)
        if new_text != text:
            java_file.write_text(new_text, encoding="utf-8")
            print(f"PATCH EVO: {java_file}")

def run_maven_in_container(project_path):
    m2 = os.path.expanduser("~/.m2")
    abs_path = os.path.abspath(project_path)
    image = "maven:3.8.6-jdk-11"

    return run(f"""
docker run --rm \
-v {abs_path}:/app \
-v {m2}:/root/.m2 \
-w /app \
{image} \
mvn clean test jacoco:report \
-Dtest="**/*Test,**/*Tests,**/*TestCase,**/*_ESTest,**/*_*" \
-DfailIfNoTests=false \
-DtestFailureIgnore=true \
-Dmaven.test.failure.ignore=true
""", timeout=1800)

def parse_jacoco(csv_path):
    if not os.path.exists(csv_path):
        return None

    totals = {"missed": 0, "covered": 0}
    with open(csv_path, encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for row in reader:
            totals["missed"] += int(row["INSTRUCTION_MISSED"])
            totals["covered"] += int(row["INSTRUCTION_COVERED"])

    total = totals["missed"] + totals["covered"]
    return {
        "instruction_coverage": round((totals["covered"] / total * 100), 2) if total else 0
    }

def save_result(csv_file, project_name, coverage, mode, status, details=""):
    file_exists = os.path.exists(csv_file)

    with open(csv_file, "a", newline="", encoding="utf-8") as f:
        writer = csv.writer(f)

        if not file_exists:
            writer.writerow(["project", "mode", "coverage", "status", "details"])

        writer.writerow([project_name, mode, coverage, status, details])

def list_projects(projects_dir):
    base = Path(projects_dir)
    projects = []

    for item in sorted(base.iterdir()):
        if item.is_dir() and (item / "pom.xml").exists():
            projects.append(item)

    return projects

def process_project(project_path):
    pom = project_path / "pom.xml"
    project_name = project_path.name
    project_csv = project_path / "coverage_general.csv"


    print("=" * 80)
    print(f"🚀 Processando cobertura geral: {project_name}")
    print("=" * 80)

    temp_kex = None
    orig_kex = None
    temp_evo = None
    orig_evo = None

    try:
        temp_kex, orig_kex = move_test_dir_to_src(project_path, "kex-tests")
        temp_evo, orig_evo = move_test_dir_to_src(project_path, "evosuite-tests")

        inject_assets_general(pom)
        patch_evosuite_tests(project_path)

        result = run_maven_in_container(project_path)

        csv_path = project_path / "target/site/jacoco/jacoco.csv"
        metrics = parse_jacoco(csv_path)

        if metrics:
            coverage = metrics["instruction_coverage"]
            print(f"✅ Cobertura Geral: {coverage}%")

            status = "success" if result.returncode == 0 else "build_with_test_issues"
            details = f"maven_returncode={result.returncode}"

            save_result(
                project_csv,
                project_name,
                coverage,
                mode="nativo+kex+evosuite",
                status=status,
                details=details
            )
        else:
            print("❌ Erro: JaCoCo não gerou o CSV.")
            save_result(
                project_csv,
                project_name,
                "",
                mode="nativo+kex+evosuite",
                status="no_jacoco_csv",
                details=f"maven_returncode={result.returncode}"
            )

    except Exception as e:
        print(f"❌ Falha ao processar {project_name}: {e}")
        save_result(
            CSV_FILE,
            project_name,
            "",
            mode="nativo+kex+evosuite",
            status="exception",
            details=str(e)
        )
    finally:
        restore_test_dir(temp_kex, orig_kex)
        restore_test_dir(temp_evo, orig_evo)

def main():
    projects = list_projects(PROJECTS_DIR)

    if not projects:
        print(f"❌ Nenhum projeto com pom.xml encontrado em: {PROJECTS_DIR}")
        return

    print(f"📁 {len(projects)} projeto(s) encontrado(s) em {PROJECTS_DIR}")

    for project_path in projects:
        process_project(project_path)

    print("\n✅ Processamento finalizado.")

if __name__ == "__main__":
    main()