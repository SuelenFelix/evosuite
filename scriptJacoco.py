#!/usr/bin/env python3
import os
import csv
import subprocess
import xml.etree.ElementTree as ET

# Script para comparacao da cobertura entre os testes originais dos projetos, os testes gerados
# pelo evosuite e os testes gerados pelo Kex.

BASE_PATH = os.path.dirname(os.path.abspath(__file__))

BASE_DIR = os.path.join(BASE_PATH, "projects")
CSV_FILE = "results_tests_evosuite_kex.csv"
JAVA_HOME = "/usr/lib/jvm/java-11-openjdk-amd64"

def run(cmd, cwd=None):
    env = os.environ.copy()
    env["JAVA_HOME"] = JAVA_HOME
    env["PATH"] = f"{JAVA_HOME}/bin:{env['PATH']}"

    print(f"[RUN] {' '.join(cmd)}")
    subprocess.run(cmd, cwd=cwd, check=True, env=env)

# --- INJETAR JACOCO ---
def inject_jacoco(pom_path):
    tree = ET.parse(pom_path)
    root = tree.getroot()
    ns = {"m": "http://maven.apache.org/POM/4.0.0"}

    ET.register_namespace('', ns["m"])

    build = root.find("m:build", ns)
    if build is None:
        build = ET.SubElement(root, "build")

    plugins = build.find("m:plugins", ns)
    if plugins is None:
        plugins = ET.SubElement(build, "plugins")

    # evita duplicar
    for p in plugins.findall("m:plugin", ns):
        artifact = p.find("m:artifactId", ns)
        if artifact is not None and artifact.text == "jacoco-maven-plugin":
            return

    plugin = ET.SubElement(plugins, "plugin")
    ET.SubElement(plugin, "groupId").text = "org.jacoco"
    ET.SubElement(plugin, "artifactId").text = "jacoco-maven-plugin"
    ET.SubElement(plugin, "version").text = "0.8.14"

    executions = ET.SubElement(plugin, "executions")

    e1 = ET.SubElement(executions, "execution")
    goals1 = ET.SubElement(e1, "goals")
    ET.SubElement(goals1, "goal").text = "prepare-agent"

    e2 = ET.SubElement(executions, "execution")
    ET.SubElement(e2, "phase").text = "test"
    goals2 = ET.SubElement(e2, "goals")
    ET.SubElement(goals2, "goal").text = "report"

    tree.write(pom_path, encoding="utf-8", xml_declaration=True)

# --- ADICIONAR TEST SOURCES (EvoSuite + Kex) ---
def inject_test_sources(pom_path):
    tree = ET.parse(pom_path)
    root = tree.getroot()
    ns = {"m": "http://maven.apache.org/POM/4.0.0"}

    build = root.find("m:build", ns)
    if build is None:
        build = ET.SubElement(root, "build")

    plugins = build.find("m:plugins", ns)
    if plugins is None:
        plugins = ET.SubElement(build, "plugins")

    # build-helper-plugin
    plugin = ET.SubElement(plugins, "plugin")
    ET.SubElement(plugin, "groupId").text = "org.codehaus.mojo"
    ET.SubElement(plugin, "artifactId").text = "build-helper-maven-plugin"
    ET.SubElement(plugin, "version").text = "3.5.0"

    executions = ET.SubElement(plugin, "executions")
    execution = ET.SubElement(executions, "execution")

    ET.SubElement(execution, "phase").text = "generate-test-sources"

    goals = ET.SubElement(execution, "goals")
    ET.SubElement(goals, "goal").text = "add-test-source"

    config = ET.SubElement(execution, "configuration")
    sources = ET.SubElement(config, "sources")

    ET.SubElement(sources, "source").text = "evosuite-tests"
    ET.SubElement(sources, "source").text = "kex-tests"

    tree.write(pom_path, encoding="utf-8", xml_declaration=True)

# --- PARSE JACOCO ---
def parse_jacoco(csv_path):
    with open(csv_path) as f:
        reader = csv.DictReader(f)

        total_missed = 0
        total_covered = 0

        for row in reader:
            total_missed += int(row["LINE_MISSED"])
            total_covered += int(row["LINE_COVERED"])

        total = total_missed + total_covered
        coverage = (total_covered / total * 100) if total else 0

        return round(coverage, 2)

# --- PROCESSAR PROJETO ---
def process_project(project_path):
    nome = os.path.basename(project_path)
    print(f"\n=== {nome} ===")

    pom = os.path.join(project_path, "pom.xml")
    if not os.path.exists(pom):
        print("Sem pom.xml")
        return

    inject_jacoco(pom)
    inject_test_sources(pom)

    run(["mvn", "clean", "test", "jacoco:report", "-DskipTests=false"], cwd=project_path)

    csv_path = os.path.join(project_path, "target/site/jacoco/jacoco.csv")

    if not os.path.exists(csv_path):
        print("Sem relatório JaCoCo")
        return

    cov = parse_jacoco(csv_path)

    with open(CSV_FILE, "a") as f:
        f.write(f"{nome},{cov}\n")

    print(f"{nome} -> Coverage: {cov}%")

# --- MAIN ---
def main():
    projects = [
        os.path.join(BASE_DIR, p)
        for p in os.listdir(BASE_DIR)
        if os.path.isdir(os.path.join(BASE_DIR, p))
    ]

    for p in projects:
        process_project(p)

if __name__ == "__main__":
    main()