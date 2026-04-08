import os
import csv
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

def inject_assets_native_only(pom_path):
    with open(pom_path, "r", encoding="utf-8") as f:
        text = f.read()

    if "<artifactId>junit</artifactId>" not in text:
        if "<dependencies>" in text:
            text = text.replace("<dependencies>", "<dependencies>\n" + JUNIT4_DEP)
        else:
            text = text.replace("</project>", f"<dependencies>{JUNIT4_DEP}</dependencies>\n</project>")

    if "jacoco-maven-plugin" not in text and "<plugins>" in text:
        text = text.replace("<plugins>", "<plugins>\n" + JACOCO_PLUGIN)

    with open(pom_path, "w", encoding="utf-8") as f:
        f.write(text)

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
-Dtest="**/*Test,**/*Tests,**/*TestCase" \
-DfailIfNoTests=false \
-DtestFailureIgnore=true \
-Dmaven.test.failure.ignore=true
""", timeout=900)

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
    project_csv = project_path / "coverage_native.csv"
    log_file = project_path / "coverage_native.log"

    print("=" * 80)
    print(f"🚀 Processando apenas nativos: {project_name}")
    print("=" * 80)

    try:
        inject_assets_native_only(pom)
        result = run_maven_in_container(project_path)

        with open(log_file, "w", encoding="utf-8") as f:
            f.write(result.stdout or "")

        csv_path = project_path / "target/site/jacoco/jacoco.csv"
        metrics = parse_jacoco(csv_path)

        if metrics:
            coverage = metrics["instruction_coverage"]
            print(f"✅ Cobertura Nativa: {coverage}%")

            status = "success" if result.returncode == 0 else "build_with_test_issues"
            details = f"maven_returncode={result.returncode}"

            save_result(
                project_csv,
                project_name,
                coverage,
                mode="nativo",
                status=status,
                details=details
            )
        else:
            print("❌ Erro: JaCoCo não gerou o CSV.")
            save_result(
                project_csv,
                project_name,
                "",
                mode="nativo",
                status="no_jacoco_csv",
                details=f"maven_returncode={result.returncode}"
            )

    except subprocess.TimeoutExpired:
        print(f"⏰ Timeout ao processar {project_name}")
        save_result(
            project_csv,
            project_name,
            "",
            mode="nativo",
            status="timeout",
            details="maven_timeout"
        )

    except Exception as e:
        print(f"❌ Falha ao processar {project_name}: {e}")
        save_result(
            project_csv,
            project_name,
            "",
            mode="nativo",
            status="exception",
            details=str(e)
        )

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