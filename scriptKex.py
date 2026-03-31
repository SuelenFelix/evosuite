#!/usr/bin/env python3
import os
import subprocess
import time
import shutil
from concurrent.futures import ThreadPoolExecutor, as_completed

# --- CONFIGURAÇÕES ---
MAX_WORKERS = 1
TIMEOUT_KEX = 600

BASE_DIR = "projects"
KEX_ROOT = os.path.expanduser("~/TCC/evosuite")
KEX_SCRIPT = os.path.join(KEX_ROOT, "kex.py")

# Verifica se o script existe
if not os.path.exists(KEX_SCRIPT):
    print(f"❌ Script Kex não encontrado em: {KEX_SCRIPT}")
    # Tenta encontrar em outros locais
    possible_scripts = glob.glob(os.path.join(KEX_ROOT, "**", "kex.py"), recursive=True)
    if possible_scripts:
        KEX_SCRIPT = possible_scripts[0]
        print(f"✅ Usando script encontrado: {KEX_SCRIPT}")
    else:
        print("❌ Não foi possível encontrar kex.py")
        exit(1)

def run_kex_logic(project_path, cls, output_dir):
    """Executa o Kex usando o script Python"""
    
    # Limpa saída
    if os.path.exists(output_dir):
        shutil.rmtree(output_dir)
    os.makedirs(output_dir, exist_ok=True)
    
    classes_path = os.path.join(project_path, "target/classes")
    dep_path = os.path.join(project_path, "target/dependency")
    
    # Classpath correto
    if os.path.exists(dep_path):
        full_classpath = f"{classes_path}:{dep_path}/*"
    else:
        full_classpath = classes_path
    
    cmd = [
        "python3", KEX_SCRIPT,
        "--classpath", full_classpath,
        "--target", cls,
        "--mode", "concolic",
        "--output", output_dir
    ]
    
    print(f"\n🧪 Executando para {cls}")
    
    try:
        result = subprocess.run(
            cmd,
            cwd=KEX_ROOT,
            timeout=TIMEOUT_KEX,
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            text=True
        )
        
        # Verifica testes gerados
        test_files = []
        for root, _, files in os.walk(output_dir):
            for f in files:
                if f.endswith(".java"):
                    test_files.append(os.path.join(root, f))
        
        if test_files:
            print(f"✅ {len(test_files)} testes gerados")
            return len(test_files), result.stdout, result.stderr
        else:
            print("⚠️ Nenhum teste gerado")
            if result.stderr:
                print(f"Erro: {result.stderr[:200]}")
            return 0, result.stdout, result.stderr
    
    except subprocess.TimeoutExpired:
        print(f"⏱️ Timeout após {TIMEOUT_KEX}s")
        return -1, "", "Timeout"
    except Exception as e:
        print(f"❌ Erro: {e}")
        return -1, "", str(e)

def process_project(project_name):
    """Processa um projeto inteiro"""
    project_path = os.path.abspath(os.path.join(BASE_DIR, project_name))
    classes_dir = os.path.join(project_path, "target/classes")
    
    if not os.path.exists(classes_dir):
        return f"{project_name}: ⏭️ Não compilado"
    
    # Coleta todas as classes (exceto inner classes)
    classes = []
    for root, _, files in os.walk(classes_dir):
        for f in files:
            if f.endswith(".class") and "$" not in f:
                rel = os.path.relpath(os.path.join(root, f), classes_dir)
                classes.append(rel.replace(os.sep, ".").replace(".class", ""))
    
    if not classes:
        return f"{project_name}: ⚠️ Nenhuma classe encontrada"
    
    success_total = 0
    test_total = 0
    
    print(f"\n🚀 Analisando {project_name}... ({len(classes)} classes)")
    
    # Limita para teste inicial
    classes_to_test = classes[:5] if len(classes) > 5 else classes
    
    for cls in classes_to_test:
        print(f"\n   🔍 Processando {cls}")
        
        output_dir = os.path.join(project_path, "kex-tests", cls.replace(".", "_"))
        
        num_tests, out, err = run_kex_logic(project_path, cls, output_dir)
        
        if num_tests > 0:
            success_total += 1
            test_total += num_tests
            print(f"   ✅ {num_tests} testes gerados")
        else:
            print(f"   ❌ Falhou para {cls}")
            if err and "Exception" in err:
                print(f"   📝 Erro: {err[:200]}")
    
    return f"{project_name}: {success_total}/{len(classes_to_test)} classes OK, {test_total} testes gerados"


def main():
    if not os.path.exists(BASE_DIR):
        print(f"❌ Pasta {BASE_DIR} não encontrada!")
        return
    
    projects = [
        d for d in os.listdir(BASE_DIR)
        if os.path.isdir(os.path.join(BASE_DIR, d))
    ]
    
    if not projects:
        print(f"❌ Nenhum projeto encontrado em {BASE_DIR}")
        return
    
    print(f"\n🚀 Iniciando Kex em {len(projects)} projetos...")
    print(f"📦 Kex JAR: {KEX_JAR}")
    print(f"⚙️  Workers: {MAX_WORKERS}")
    print(f"⏱️  Timeout: {TIMEOUT_KEX}s\n")
    
    with ThreadPoolExecutor(max_workers=MAX_WORKERS) as executor:
        futures = {executor.submit(process_project, p): p for p in projects}
        
        for future in as_completed(futures):
            try:
                result = future.result()
                print(f"\n📊 RESULTADO: {result}")
            except Exception as e:
                print(f"\n❌ ERRO no projeto {futures[future]}: {e}")


if __name__ == "__main__":
    main()