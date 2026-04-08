import os
import csv
import re
import shutil
import subprocess
from pathlib import Path

BASE_PATH = os.path.dirname(os.path.abspath(__file__))
PROJECTS_DIR = os.path.join(BASE_PATH, "projects")

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

TIMEOUT_SECONDS = 900


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


def inject_assets_kex_only(pom_path):
    with open(pom_path, "r", encoding="utf-8") as f:
        text = f.read()

    deps_to_add = ""

    if "<artifactId>junit</artifactId>" not in text:
        deps_to_add += JUNIT4_DEP

    if deps_to_add:
        project_dependencies_pattern = re.compile(
            r"(<project\b[^>]*>.*?)(<dependencies>)",
            re.DOTALL
        )

        if project_dependencies_pattern.search(text):
            text = project_dependencies_pattern.sub(
                r"\1<dependencies>\n" + deps_to_add,
                text,
                count=1
            )
        else:
            text = re.sub(
                r"</project>",
                f"<dependencies>\n{deps_to_add}</dependencies>\n</project>",
                text,
                count=1
            )

    if "jacoco-maven-plugin" not in text and "<plugins>" in text:
        text = text.replace("<plugins>", "<plugins>\n" + JACOCO_PLUGIN, 1)

    with open(pom_path, "w", encoding="utf-8") as f:
        f.write(text)


def isolate_native_tests(project_path):
    test_dir = Path(project_path) / "src/test/java"
    backup_dir = Path(project_path) / "src/test/java_backup_native"

    if not test_dir.exists():
        return None, None

    if backup_dir.exists():
        shutil.rmtree(backup_dir)

    shutil.move(str(test_dir), str(backup_dir))
    print(f"📦 Testes nativos isolados: {test_dir} -> {backup_dir}")
    return backup_dir, test_dir


def restore_native_tests(backup_dir, original_dir):
    if not backup_dir or not original_dir:
        return

    if backup_dir.exists():
        if original_dir.exists():
            shutil.rmtree(original_dir)
        shutil.move(str(backup_dir), str(original_dir))
        print(f"↩️ Testes nativos restaurados: {backup_dir} -> {original_dir}")


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


def discover_kex_test_classes(project_path):
    """
    Descobre dinamicamente os testes dentro de:
      src/test/java/kex-tests
    Retorna uma lista de nomes de classes para usar no -Dtest.
    """
    root = Path(project_path) / "src/test/java/kex-tests"
    if not root.exists():
        return []

    class_names = []

    for java_file in root.rglob("*.java"):
        class_name = java_file.stem
        class_names.append(class_name)

    seen = set()
    unique = []
    for name in class_names:
        if name not in seen:
            seen.add(name)
            unique.append(name)

    return unique


def build_dtest_argument(project_path):
    class_names = discover_kex_test_classes(project_path)
    if not class_names:
        return None
    return ",".join(class_names)


def run_maven_in_container(project_path):
    m2 = os.path.expanduser("~/.m2")
    abs_path = os.path.abspath(project_path)
    image = "maven:3.8.6-jdk-11"

    dtest = build_dtest_argument(project_path)
    if not dtest:
        raise RuntimeError("Nenhuma classe de teste Kex encontrada para executar.")

    return run(f"""
docker run --rm \
-v {abs_path}:/app \
-v {m2}:/root/.m2 \
-w /app \
{image} \
mvn clean test jacoco:report \
-Dtest="{dtest}" \
-DfailIfNoTests=false \
-Dsurefire.failIfNoSpecifiedTests=false \
-DtestFailureIgnore=true \
-Dmaven.test.failure.ignore=true
""", timeout=TIMEOUT_SECONDS)


def try_generate_partial_jacoco_report(project_path):
    m2 = os.path.expanduser("~/.m2")
    abs_path = os.path.abspath(project_path)
    image = "maven:3.8.6-jdk-11"

    return run(f"""
docker run --rm \
-v {abs_path}:/app \
-v {m2}:/root/.m2 \
-w /app \
{image} \
mvn jacoco:report -DskipTests
""", timeout=300)


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

    for item in sorted(base.iterdir(), key=lambda p: p.name.lower()):
        if item.is_dir() and (item / "pom.xml").exists():
            projects.append(item)

    return projects


def process_project(project_path):
    pom = project_path / "pom.xml"
    project_name = project_path.name
    project_csv = project_path / "coverage_kex.csv"
    log_file = project_path / "coverage_kex.log"

    print("=" * 80)
    print(f"🚀 Processando apenas Kex: {project_name}")
    print("=" * 80)

    backup_native = None
    original_test_dir = None
    temp_kex = None
    orig_kex = None

    try:
        backup_native, original_test_dir = isolate_native_tests(project_path)

        (project_path / "src/test/java").mkdir(parents=True, exist_ok=True)

        temp_kex, orig_kex = move_test_dir_to_src(project_path, "kex-tests")

        inject_assets_kex_only(pom)

        selected_tests = discover_kex_test_classes(project_path)
        if not selected_tests:
            print("ℹ️ Nenhum teste Kex encontrado.")
            save_result(
                project_csv,
                project_name,
                "",
                mode="kex",
                status="no_generated_tests",
                details="Nenhuma classe encontrada em kex-tests"
            )
            return

        print(f"🧪 {len(selected_tests)} teste(s) Kex selecionado(s).")

        result = run_maven_in_container(project_path)

        with open(log_file, "w", encoding="utf-8") as f:
            f.write(result.stdout or "")

        csv_path = project_path / "target/site/jacoco/jacoco.csv"
        metrics = parse_jacoco(csv_path)

        if metrics:
            coverage = metrics["instruction_coverage"]
            print(f"✅ Cobertura Kex: {coverage}%")

            status = "success" if result.returncode == 0 else "build_with_test_issues"
            details = f"maven_returncode={result.returncode}; tests_selected={len(selected_tests)}"

            save_result(
                project_csv,
                project_name,
                coverage,
                mode="kex",
                status=status,
                details=details
            )
        else:
            print("❌ Erro: JaCoCo não gerou o CSV.")
            details = f"maven_returncode={result.returncode}; tests_selected={len(selected_tests)}"
            if result.stdout:
                details += " | " + result.stdout[-800:].replace("\n", " ")
            save_result(
                project_csv,
                project_name,
                "",
                mode="kex",
                status="no_jacoco_csv",
                details=details
            )

    except subprocess.TimeoutExpired as e:
        print(f"⏰ Timeout ao processar {project_name}")

        timeout_output = e.stdout or ""
        if isinstance(timeout_output, bytes):
            timeout_output = timeout_output.decode("utf-8", errors="ignore")

        with open(log_file, "w", encoding="utf-8") as f:
            f.write(timeout_output)

        partial_result = try_generate_partial_jacoco_report(project_path)

        with open(log_file, "a", encoding="utf-8") as f:
            f.write("\n\n===== PARTIAL JACOCO REPORT ATTEMPT =====\n")
            f.write(partial_result.stdout or "")

        csv_path = project_path / "target/site/jacoco/jacoco.csv"
        metrics = parse_jacoco(csv_path)

        if metrics:
            coverage = metrics["instruction_coverage"]
            print(f"⚠️ Cobertura parcial após timeout: {coverage}%")
            save_result(
                project_csv,
                project_name,
                coverage,
                mode="kex",
                status="timeout_with_partial_coverage",
                details="maven_timeout"
            )
        else:
            save_result(
                project_csv,
                project_name,
                "",
                mode="kex",
                status="timeout",
                details="maven_timeout"
            )

    except Exception as e:
        print(f"❌ Falha ao processar {project_name}: {e}")
        save_result(
            project_csv,
            project_name,
            "",
            mode="kex",
            status="exception",
            details=str(e)
        )

    finally:
        restore_test_dir(temp_kex, orig_kex)
        restore_native_tests(backup_native, original_test_dir)


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