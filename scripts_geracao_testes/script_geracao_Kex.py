#!/usr/bin/env python3
import os
import subprocess
import shutil
import xml.etree.ElementTree as ET
from concurrent.futures import ThreadPoolExecutor, as_completed

# --- CONFIGURAÇÃO ---
BASE_PATH = os.path.dirname(os.path.abspath(__file__))
REPO_ROOT = os.path.dirname(BASE_PATH)

BASE_DIR = os.path.join(REPO_ROOT, "projects")
KEX_SCRIPT = os.path.join(REPO_ROOT, "kex/kex.py")
JAVA_HOME = "/usr/lib/jvm/java-11-openjdk-amd64"

MAX_WORKERS = 2
KEX_TIMEOUT = 300

# --- EXECUÇÃO COM JAVA 11 ---
def run(cmd, cwd=None, timeout=None):
    env = os.environ.copy()
    env["JAVA_HOME"] = JAVA_HOME
    env["PATH"] = f"{JAVA_HOME}/bin:/usr/bin:/bin"

    print(f"\n[CMD] {' '.join(cmd)}")
    try:
        subprocess.run(cmd, cwd=cwd, check=True, env=env, timeout=timeout)
        return True
    except subprocess.TimeoutExpired:
        print("Timeout atingido — pulando")
        return False
    except subprocess.CalledProcessError:
        print("Comando falhou")
        return False

def tem_evosuite_tests(path):
    return os.path.exists(os.path.join(path, "evosuite-tests"))

def ajustar_pom(pom_path):
    ET.register_namespace('', "http://maven.apache.org/POM/4.0.0")
    tree = ET.parse(pom_path)
    root = tree.getroot()
    ns = {"m": "http://maven.apache.org/POM/4.0.0"}

    build = root.find("m:build", ns)
    if build is None:
        build = ET.SubElement(root, "build")

    plugins = build.find("m:plugins", ns)
    if plugins is None:
        plugins = ET.SubElement(build, "plugins")

    shade_plugin = None
    for plugin in plugins.findall("m:plugin", ns):
        artifact = plugin.find("m:artifactId", ns)
        if artifact is not None and artifact.text == "maven-shade-plugin":
            shade_plugin = plugin
            break

    if shade_plugin is None:
        shade_plugin = ET.SubElement(plugins, "plugin")
        ET.SubElement(shade_plugin, "groupId").text = "org.apache.maven.plugins"
        ET.SubElement(shade_plugin, "artifactId").text = "maven-shade-plugin"
        ET.SubElement(shade_plugin, "version").text = "3.4.1"

        executions = ET.SubElement(shade_plugin, "executions")
        execution = ET.SubElement(executions, "execution")
        ET.SubElement(execution, "phase").text = "package"

        goals = ET.SubElement(execution, "goals")
        ET.SubElement(goals, "goal").text = "shade"

        configuration = ET.SubElement(execution, "configuration")
        descriptorRefs = ET.SubElement(configuration, "descriptorRefs")
        ET.SubElement(descriptorRefs, "descriptorRef").text = "jar-with-dependencies"

        print(f"Shade plugin adicionado em {pom_path}")

    tree.write(pom_path, encoding="utf-8", xml_declaration=True)
    
def tem_kex_tests(path):
    return os.path.exists(os.path.join(path, "kex-tests"))

def get_packages(classes_dir):
    packages = set()
    for root, _, files in os.walk(classes_dir):
        if any(f.endswith(".class") for f in files):
            rel = os.path.relpath(root, classes_dir)
            if rel != ".":
                packages.add(rel.replace(os.sep, "."))
    return sorted(packages)

# --- KEX POR PACOTE ---
def run_kex_for_package(project_path, pkg):
    target = f"{pkg}.*"
    print(f"▶️ Kex: {target}")

    cmd = [
        "python3", KEX_SCRIPT,
        "--classpath", "target/classes",
        "--target", target,
        "--output", "kex-tests",
        "--mode", "concolic",
    ]

    return run(cmd, cwd=project_path, timeout=KEX_TIMEOUT)

# --- PROCESSAMENTO DO PROJETO ---
def process_project(project_path):
    nome = os.path.basename(project_path)
    print(f"\n{'='*50}")
    print(f"PROCESSANDO: {nome}")
    print(f"{'='*50}")

    pom_path = os.path.join(project_path, "pom.xml")
    if not os.path.exists(pom_path):
        print("Sem pom.xml")
        return

    if not tem_evosuite_tests(project_path):
        print("⏭ Ignorado (sem evosuite-tests)")
        return
    
    if tem_kex_tests(project_path):
        print("⏭ Ignorado (já possui kex-tests)")
        return

    ajustar_pom(pom_path)

    if not run(["mvn", "clean", "process-classes", "-DskipTests"], cwd=project_path):
        return

    classes_dir = os.path.join(project_path, "target/classes")
    if not os.path.exists(classes_dir):
        print("Sem classes")
        return

    packages = get_packages(classes_dir)
    if not packages:
        print("Nenhum pacote encontrado")
        return

    print(f"📦 {len(packages)} pacotes detectados")

    kex_output = os.path.join(project_path, "kex-tests")
    if os.path.exists(kex_output):
        shutil.rmtree(kex_output)

    for pkg in packages:
        run_kex_for_package(project_path, pkg)

def main():
    projects = [
        os.path.join(BASE_DIR, p)
        for p in os.listdir(BASE_DIR)
        if os.path.isdir(os.path.join(BASE_DIR, p))
    ]

    with ThreadPoolExecutor(max_workers=MAX_WORKERS) as executor:
        futures = [executor.submit(process_project, p) for p in projects]

        for future in as_completed(futures):
            try:
                future.result()
            except Exception as e:
                print(f"Erro inesperado: {e}")

    print("\n✅ FINALIZADO")

if __name__ == "__main__":
    main()