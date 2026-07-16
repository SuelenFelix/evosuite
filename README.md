# Geração de Testes para Atualizações Conservadoras de Dependências: Um Estudo Empírico
Este README traz as informações necessárias para a reprodução do experimento


## Geração automática de testes

Para geração dos testes gerados pelo evosuite, é necessário executar o script:
```
script_geracao_Evosuite.py
```

Para geração dos testes gerados pelo kex, é necessário executar o script:

```
script_geracao_Kex.py
```

Ambos os processos podem demorar horas para serem finalizados, a depender de cada máquina.

## Avaliação utilizando Safer
Aqui, vamos utilizar a ferramenta safer para avaliar se os testes de fato impactam a atualização de dependências. Com isso, utilizamos a versão do safer disponível em: https://github.com/lsi-ufcg/safer-reproduction-kit/tree/test-execution-support

É necessário seguir as orientaçõe de execução descritas do README do safer, mas basicamente, é necessário rodar o script:
```
./setup-safer.sh
```

A partir disso, ajustamos o run-maven-build.sh do safer (path: /path_do_usuario/safer-reproduction-kit/safer/src/runners/maven/run-maven-build.sh) para a seguinte estrutura:

```
#!/bin/bash
set -e

PROJECT_TESTS=$1
PROJECT_PATH=$2
VERBOSE=true

container_name="java-container-safer-$(basename "$PROJECT_PATH")"

POM="$PROJECT_PATH/pom.xml"

# Adiciona dependências necessárias para EvoSuite
if [ -f "$POM" ] && \
   { find "$PROJECT_PATH/src/test/java" -type d \( -name kex-tests -o -name evosuite-tests \) | grep -q .; }; then
     
python3 - "$POM" <<'PY'
import sys
import xml.etree.ElementTree as ET

pom = sys.argv[1]

ET.register_namespace('', 'http://maven.apache.org/POM/4.0.0')

tree = ET.parse(pom)
root = tree.getroot()

ns = {'m': 'http://maven.apache.org/POM/4.0.0'}

deps = root.find('m:dependencies', ns)

if deps is None:
    deps = ET.SubElement(root, 'dependencies')

existing = {
    (
        d.findtext('m:groupId', default='', namespaces=ns),
        d.findtext('m:artifactId', default='', namespaces=ns)
    )
    for d in deps.findall('m:dependency', ns)
}

required = [
    ("org.evosuite", "evosuite-standalone-runtime", "1.0.6"),
    ("junit", "junit", "4.13.2"),
    ("org.junit.vintage", "junit-vintage-engine", "5.10.0")
]

for groupId, artifactId, version in required:
    if (groupId, artifactId) not in existing:
        dep = ET.SubElement(deps, 'dependency')

        ET.SubElement(dep, 'groupId').text = groupId
        ET.SubElement(dep, 'artifactId').text = artifactId
        ET.SubElement(dep, 'version').text = version
        ET.SubElement(dep, 'scope').text = 'test'

tree.write(pom, encoding='utf-8', xml_declaration=True)
PY

fi

    CMD="mvn clean test -U \
        -Dmaven.repo.local=/opt/maven-repo \
        -DskipTests=false \
        -Dmaven.test.skip=false \
        -Ddependency-check.skip=true \
        -DfailIfNoTests=false \
        -Dgit.buildhook.skip=true \
        -Dmaven.test.failure.ignore=true \
        -Dtest='*Test,*Tests,*TestCase,*_init_*,*_equals_*,*Utils*,*_*'"

echo "Container: $container_name"
echo "Project path: $PROJECT_PATH"
echo "Command: $CMD"

docker exec "$container_name" sh -lc "$CMD"

```

Em seguida, vamos criar o script de execução na raíz do safer-reproduction-kit, o mesmo já está anexado neste repositório e pode ser replicado (execucao_safer.sh)

## Pontos de atenção para rodar o execucao_safer.sh

- É necessário ajustar o path de acordo com o que foi clonado localmente
- Temos 8 combinações que serão descritas abaixo. Para que cada uma delas seja executada corretamente, é necessário ajustar a função `run_project()`.
- Utilizar Java 11.
- Utilizar Python 3.
- Indicamos separar cada análise do safer em CSV separado por combinação, para isso, ajuste o script `run-experiment.sh` para que dataset_path seja atualizado ao fim de cada execução. Ex:

```
dataset_path="results/dataset_all_tests.csv"
ou
dataset_path="results/dataset_only_evosuite.csv"
...
```

- Após CADA execução e CSV único gerado, também sugerimos ajustar o script disponível em `/seu_path/safer-reproduction-kit/post-processing/count-version-changes/src/script.js`, assim é possível coletar mais métricas, como o countMajor. Novamente, esse processo deve ser feito como o anterior para separar os CSV conforme combinação. Ex:

```
const inputFile = path.join(__dirname, "../../../results/dataset_all_tests.csv");
const outputFile = path.join(__dirname, "../../../results/final_all_tests.csv");
ou
const inputFile = path.join(__dirname, "../../../results/dataset_only_evosuite.csv");
const outputFile = path.join(__dirname, "../../../results/final_only_evosuite.csv");
...
```

### Combinações analisadas:

- Apenas testes nativos
- testes nativos + testes kex 
- testes nativos + testes evosuite
- testes evosuite + testes kex
- Somente tests evosuite
- Somente tests kex
- Todos os testes (nativos, evosuite, kex)
- Sem testes

## Coleta de cobertura
Caso tenha interesse, também adicionamos scripts para coleta de cobertura em cada projeto (os scripts estão dentro da pasta `scripts_coleta_cobertura`), de acordo com cada combinação. Todos eles criam CSVs unitário em cada projeto, com a cobertura daquela combinação, logo, quase todos podem ser executados idenpendente da ordem. Contudo, o último script a ser executado é o `script_coleta_totais.py`, que irá unificar os resultados de todos os projetos e criar um CSV específico, agrupando-os em sua respectiva combinação.

