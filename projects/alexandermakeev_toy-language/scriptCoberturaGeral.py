import os
import csv
import re
import shutil
import subprocess
from pathlib import Path

PROJECT_DIR = "/home/suelenfelix/TCC/evosuite/projects/alexandermakeev_toy-language"
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
            <configuration>
                <includes>
                    <include>org/example/toylanguage/**</include>
                </includes>
            </configuration>
        </execution>
    </executions>
</plugin>
"""

def run(cmd, cwd=None):
    print("RUN:", cmd)
    return subprocess.run(cmd, shell=True, cwd=cwd, check=False)

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
    """
    Move temporariamente:
      <project>/<folder_name>
    para:
      <project>/src/test/java/<folder_name>
    """
    src_root = Path(project_path)
    original = src_root / folder_name
    test_root = src_root / "src/test/java"
    temp_dest = test_root / folder_name

    if not original.exists():
        print(f"ℹ️ Pasta {folder_name} não encontrada na raiz do projeto.")
        return None, None

    test_root.mkdir(parents=True, exist_ok=True)

    if temp_dest.exists():
        raise RuntimeError(f"Destino já existe: {temp_dest}")

    shutil.move(str(original), str(temp_dest))
    print(f"📦 Movido temporariamente: {original} -> {temp_dest}")
    return temp_dest, original

def restore_test_dir(temp_path, original_path):
    """
    Restaura:
      <project>/src/test/java/<folder_name>
    para:
      <project>/<folder_name>
    """
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
mvn -o clean test jacoco:report \
-Dtest="**/*Test,**/*Tests,**/*TestCase,**/*_ESTest,**/*_*" \
-DfailIfNoTests=false \
-DtestFailureIgnore=true \
-Dmaven.test.failure.ignore=true
""")

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

def save_result(csv_file, project_name, coverage, mode):
    file_exists = os.path.exists(csv_file)

    with open(csv_file, "a", newline="", encoding="utf-8") as f:
        writer = csv.writer(f)

        if not file_exists:
            writer.writerow(["project", "mode", "coverage"])

        writer.writerow([project_name, mode, coverage])

def main():
    path = PROJECT_DIR
    pom = os.path.join(path, "pom.xml")
    project_name = os.path.basename(path)

    print(f"🚀 Processando cobertura geral: {project_name}")

    temp_kex = None
    orig_kex = None
    temp_evo = None
    orig_evo = None

    try:
        temp_kex, orig_kex = move_test_dir_to_src(path, "kex-tests")
        temp_evo, orig_evo = move_test_dir_to_src(path, "evosuite-tests")

        inject_assets_general(pom)
        patch_evosuite_tests(path)

        result = run_maven_in_container(path)

        csv_path = os.path.join(path, "target/site/jacoco/jacoco.csv")
        metrics = parse_jacoco(csv_path)

        if metrics:
            coverage = metrics["instruction_coverage"]
            print(f"✅ Cobertura Geral: {coverage}%")
            save_result(
                CSV_FILE,
                project_name,
                coverage,
                mode="nativo+kex+evosuite"
            )
        else:
            print("❌ Erro: JaCoCo não gerou o CSV.")

        if result.returncode != 0:
            print(f"⚠️ Maven retornou código {result.returncode}")

    finally:
        restore_test_dir(temp_kex, orig_kex)
        restore_test_dir(temp_evo, orig_evo)

if __name__ == "__main__":
    main()