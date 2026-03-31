import os
import subprocess
import pandas as pd
import random
import time
from concurrent.futures import ThreadPoolExecutor, as_completed

# --- CONFIGURAÇÕES ---
MAX_WORKERS = 2  
JAVA_MAX_MEM = "-Xmx1G" 
SEARCH_BUDGET = 60
TIMEOUT_CMD = 600
MAX_CLASSES_PER_PROJECT = 50 

CSV_PATH = "projetos_final.csv"
BASE_PATH = os.path.dirname(os.path.abspath(__file__))

BASE_DIR = os.path.join(BASE_PATH, "projects")
EVOSUITE_JAR = os.path.join(BASE_PATH, "evosuite-1.1.0.jar")
JAVA_CMD = "/usr/lib/jvm/java-11-openjdk-amd64/bin/java"
JAVA_HOME = "/usr/lib/jvm/java-11-openjdk-amd64"

print(EVOSUITE_JAR)
print(os.path.exists(EVOSUITE_JAR))

os.makedirs(BASE_DIR, exist_ok=True)

def run(cmd, cwd=None, timeout=TIMEOUT_CMD):
    env = os.environ.copy()
    env["JAVA_HOME"] = JAVA_HOME
    env["PATH"] = f"{JAVA_HOME}/bin:{env['PATH']}"
    
    if os.name != 'nt':
        cmd = ["nice", "-n", "15"] + cmd

    try:
        result = subprocess.run(
            cmd,
            cwd=cwd,
            timeout=timeout,
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            text=True,
            env=env
        )
        return result.returncode == 0, result.stderr
    except subprocess.TimeoutExpired:
        return False, "TIMEOUT"
    except Exception as e:
        return False, str(e)

def process_project(row):
    nome = row["Project Name"]
    commit = row["Artifacts"]
    path = os.path.abspath(os.path.join(BASE_DIR, nome))

    print(f"\n>>> [PROJETO] {nome} - Iniciando...")

    # 1. Clone/Checkout
    if not os.path.exists(path):
        repo_url = f"https://github.com/{nome.replace('_', '/')}.git"
        ok, _ = run(["git", "clone", "--depth", "1", repo_url, path])
        if ok: run(["git", "checkout", commit], cwd=path)
        else: return f"{nome}: ERRO clone"

    # 2. Build Maven
    os.environ["MAVEN_OPTS"] = JAVA_MAX_MEM
    ok, err = run(["mvn", "clean", "package", "dependency:copy-dependencies", "-DskipTests", "-q"], cwd=path)
    if not ok:
        return f"{nome}: ERRO build"

    # 3. Localizar Classes
    classes_dir = os.path.join(path, "target/classes")
    if not os.path.exists(classes_dir):
        return f"{nome}: SEM target/classes"

    all_classes = []
    for root, _, files in os.walk(classes_dir):
        for f in files:
            if f.endswith(".class") and "$" not in f:
                # Ajuste no replace para funcionar melhor em diferentes caminhos
                rel_path = os.path.relpath(os.path.join(root, f), classes_dir)
                cls_name = rel_path.replace(os.sep, ".").replace(".class", "")
                all_classes.append(cls_name)
    
    blacklist = ["config", "dto", "entity", "exception", "repository", "model"]
    classes = [c for c in all_classes if not any(b in c.lower() for b in blacklist)]
    
    if not classes:
        return f"{nome}: Nenhuma classe alvo"

    # Limitar quantidade de classes se necessário
    classes_to_run = classes[:MAX_CLASSES_PER_PROJECT]
    total_classes = len(classes_to_run)
    sucessos = 0

    # 4. Montar Classpath
    cp_entries = [classes_dir]
    dep_dir = os.path.join(path, "target/dependency")
    if os.path.exists(dep_dir):
        jars = [os.path.join(dep_dir, j) for j in os.listdir(dep_dir) if j.endswith(".jar")]
        cp_entries.extend(jars)
    
    classpath = ":".join(cp_entries)

    # 5. Loop em todas as classes
    print(f"[{nome}] Iniciando geração para {total_classes} classes...")
    
    for idx, cls in enumerate(classes_to_run, 1):
        print(f"  ({idx}/{total_classes}) Processando: {cls}")
        
        evosuite_cmd = [
            JAVA_CMD, JAVA_MAX_MEM, "-jar", EVOSUITE_JAR,
            "-class", cls,
            "-projectCP", classpath,
            f"-Dsearch_budget={SEARCH_BUDGET}",
            "-Dtest_dir=evosuite-tests",
            "-Dassertions=false"
        ]

        ok, _ = run(evosuite_cmd, cwd=path)

        test_dir = os.path.join(path, "evosuite-tests")

        gerou_testes = False
        if os.path.exists(test_dir):
            for root, _, files in os.walk(test_dir):
                if any(f.endswith(".java") for f in files):
                    gerou_testes = True
                    break

        if ok and gerou_testes:
            sucessos += 1
        else:
            print(f"    ⚠️ Nenhum teste gerado para {cls}")

    # Limpeza para poupar espaço em disco (Opcional - descomente se o HD estiver enchendo)
    # run(["mvn", "clean"], cwd=path)

    return f"{nome}: ✅ Finalizado ({sucessos}/{total_classes} classes com sucesso)"

# --- MAIN ---
if __name__ == "__main__":
    df = pd.read_csv(CSV_PATH)
    df_shuffled = df.sample(frac=1, random_state=42).reset_index(drop=True)

    print(f"Executando com {MAX_WORKERS} workers. Pressione Ctrl+C para parar.")

    resultados = []
    sucessos = 0
    meta = 120

    with ThreadPoolExecutor(max_workers=MAX_WORKERS) as executor:
        futures = {}
        i = 0

        # continua submetendo enquanto não atingiu 100 sucessos
        while sucessos < meta and i < len(df_shuffled):
            row = df_shuffled.iloc[i]
            futures[executor.submit(process_project, row)] = row["Project Name"]
            i += 1

            if len(futures) >= MAX_WORKERS:
                for future in as_completed(list(futures.keys())):
                    res = future.result()
                    print(f"RESULTADO FINAL PROJETO: {res}")
                    resultados.append(res)

                    if "Finalizado" in res:
                        sucessos += 1

                    futures.pop(future)
                    break

        for future in as_completed(futures):
            res = future.result()
            print(f"RESULTADO FINAL PROJETO: {res}")
            resultados.append(res)
            if "Finalizado" in res:
                sucessos += 1

    with open("resultado_geral.txt", "w") as f:
        for r in resultados:
            f.write(r + "\n")

    print(f"\nTotal de projetos com sucesso: {sucessos}")