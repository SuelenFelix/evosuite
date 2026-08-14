import os
import shutil
import subprocess
import zipfile
import pandas as pd
import random
import time
from concurrent.futures import ThreadPoolExecutor, as_completed

# --- CONFIGURAÇÕES ---
MAX_WORKERS = 2  
JAVA_MAX_MEM = "-Xmx1G" 
SEARCH_BUDGET = 60
TIMEOUT_CMD = 600
MAX_CLASSES_PER_PROJECT = 100 

BASE_PATH = os.path.dirname(os.path.abspath(__file__))
REPO_ROOT = os.path.dirname(BASE_PATH)

CSV_PATH = os.path.join(REPO_ROOT, "projetos_selecionados.csv")
BASE_DIR = os.path.join(REPO_ROOT, "projects")
EVOSUITE_JAR = os.path.join(REPO_ROOT, "evosuite-1.1.0.jar")
JAVA_CMD = "/usr/lib/jvm/java-11-openjdk-amd64/bin/java"
JAVA_HOME = "/usr/lib/jvm/java-11-openjdk-amd64"
ALGORITHM = "DYNAMOSA"

if not os.path.exists(EVOSUITE_JAR):
    raise SystemExit(f"EvoSuite jar não encontrado em {EVOSUITE_JAR}")
print(f"EvoSuite jar: {EVOSUITE_JAR}")

os.makedirs(BASE_DIR, exist_ok=True)

def sanitize_jars(dep_dir, out_dir):
    """Remove entradas META-INF/versions/* dos jars multi-release.

    O ASM embutido no EvoSuite 1.1.0 não lê bytecode acima do Java 11 e aborta a
    análise de herança ao varrer o classpath ("Unsupported class file major
    version 61"), o que impede a geração de testes em projetos que dependem de
    jars multi-release (ex.: jackson-core 2.17).
    """
    os.makedirs(out_dir, exist_ok=True)
    jars = []

    for nome in sorted(os.listdir(dep_dir)):
        if not nome.endswith(".jar"):
            continue

        origem = os.path.join(dep_dir, nome)
        destino = os.path.join(out_dir, nome)

        try:
            with zipfile.ZipFile(origem) as zin:
                entradas = zin.infolist()
                if not any(e.filename.startswith("META-INF/versions/") for e in entradas):
                    shutil.copy(origem, destino)
                else:
                    with zipfile.ZipFile(destino, "w", zipfile.ZIP_DEFLATED) as zout:
                        for entrada in entradas:
                            if entrada.filename.startswith("META-INF/versions/"):
                                continue
                            zout.writestr(entrada, zin.read(entrada.filename))
        except zipfile.BadZipFile:
            continue

        jars.append(destino)

    return jars

def has_evosuite_tests(project_path):
    test_dir = os.path.join(project_path, "evosuite-tests")

    if not os.path.isdir(test_dir):
        return False

    for _, _, files in os.walk(test_dir):
        if any(f.endswith(".java") for f in files):
            return True

    return False

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
    
    if os.path.exists(path) and has_evosuite_tests(path):
        return f"{nome}: ⏭️ Já possui evosuite-tests"

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
        cp_entries.extend(sanitize_jars(dep_dir, os.path.join(path, "target/evosuite-deps")))

    classpath = ":".join(cp_entries)

    # 5. Loop em todas as classes
    print(f"[{nome}] Iniciando geração para {total_classes} classes...")
    
    for idx, cls in enumerate(classes_to_run, 1):
        print(f"  ({idx}/{total_classes}) Processando: {cls}")
        
        evosuite_cmd = [
            JAVA_CMD, JAVA_MAX_MEM, "-jar", EVOSUITE_JAR,
            "-class", cls,
            "-projectCP", classpath,
            f"-Dalgorithm={ALGORITHM}",
            "-Dstrategy=MOSUITE",
            "-Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH",
            f"-Dsearch_budget={SEARCH_BUDGET}",
            "-Dtest_dir=evosuite-tests",
            "-Dassertions=false"
        ]

        ok, err = run(evosuite_cmd, cwd=path)

        # Verifica o arquivo da própria classe: um único ESTest antigo no diretório
        # marcaria todas as classes seguintes como sucesso.
        test_file = os.path.join(
            path, "evosuite-tests", *cls.split(".")[:-1], f"{cls.split('.')[-1]}_ESTest.java"
        )
        gerou_testes = os.path.exists(test_file)

        if ok and gerou_testes:
            sucessos += 1
        else:
            motivo = (err or "").strip().splitlines()
            motivo = motivo[-1] if motivo else "sem stderr"
            print(f"    ⚠️ Nenhum teste gerado para {cls} :: {motivo[:200]}")

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
    meta = 327

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