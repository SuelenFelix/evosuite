#!/bin/bash

# Script genérico para executar testes e gerar cobertura JaCoCo
# Funciona em qualquer projeto Maven com JaCoCo

echo "========================================="
echo "JACOCO COVERAGE REPORT GENERATOR"
echo "========================================="

# Detectar diretório do projeto
PROJECT_DIR="${1:-$PWD}"
cd "$PROJECT_DIR"

echo "📁 Projeto: $PROJECT_DIR"
echo ""

# 1. Verificar se é um projeto Maven
if [ ! -f "pom.xml" ]; then
    echo "❌ Erro: pom.xml não encontrado!"
    exit 1
fi

# 2. Detectar padrões de teste automaticamente
echo "1. Detectando padrões de teste..."

# Descobrir o package base do projeto
BASE_PACKAGE=$(find src/main/java -name "*.java" 2>/dev/null | head -1 | sed 's/src\/main\/java\///' | sed 's/\/[^\/]*$//' | tr '/' '.')
if [ -z "$BASE_PACKAGE" ]; then
    BASE_PACKAGE="com.analytics.covid19"  # fallback
fi

echo "   Package base: $BASE_PACKAGE"

# Detectar tipos de teste
TEST_PATTERN=""

if [ -d "src/test/java/evosuite-tests" ] || [ -d "evosuite-tests" ]; then
    TEST_PATTERN="${BASE_PACKAGE}.**.*_ESTest"
    echo "   ✅ Testes EvoSuite detectados"
fi

if [ -d "src/test/java/kex-tests" ] || [ -d "kex-tests" ]; then
    if [ -n "$TEST_PATTERN" ]; then
        TEST_PATTERN="${TEST_PATTERN},${BASE_PACKAGE}.**.*_*"
    else
        TEST_PATTERN="${BASE_PACKAGE}.**.*_*"
    fi
    echo "   ✅ Testes Kex detectados"
fi

if [ -d "src/test/java" ] && [ -n "$(find src/test/java -name '*Test.java' 2>/dev/null)" ]; then
    if [ -n "$TEST_PATTERN" ]; then
        TEST_PATTERN="${TEST_PATTERN},${BASE_PACKAGE}.**.*Test"
    else
        TEST_PATTERN="${BASE_PACKAGE}.**.*Test"
    fi
    echo "   ✅ Testes nativos detectados"
fi

# Padrão fallback
if [ -z "$TEST_PATTERN" ]; then
    TEST_PATTERN="**/*Test,**/*_ESTest,**/*_*Test"
fi

echo "   Padrão: $TEST_PATTERN"

# 3. Backup do pom.xml
cp pom.xml pom.xml.backup

# 4. Adicionar build-helper-plugin se necessário (para incluir diretórios extras)
echo ""
echo "2. Configurando fontes de teste..."

if [ -d "evosuite-tests" ] || [ -d "kex-tests" ]; then
    if ! grep -q "build-helper-maven-plugin" pom.xml; then
        echo "   Adicionando build-helper-plugin..."
        
        sed -i '/<\/build>/i\
    <plugins>\
      <plugin>\
        <groupId>org.codehaus.mojo</groupId>\
        <artifactId>build-helper-maven-plugin</artifactId>\
        <version>3.3.0</version>\
        <executions>\
          <execution>\
            <id>add-test-source</id>\
            <phase>generate-test-sources</phase>\
            <goals>\
              <goal>add-test-source</goal>\
            </goals>\
            <configuration>\
              <sources>' pom.xml
        
        # Adicionar diretórios encontrados
        if [ -d "evosuite-tests" ]; then
            sed -i '/<sources>/a\                <source>evosuite-tests</source>' pom.xml
        fi
        if [ -d "kex-tests/tests" ]; then
            sed -i '/<sources>/a\                <source>kex-tests/tests</source>' pom.xml
        elif [ -d "kex-tests" ]; then
            sed -i '/<sources>/a\                <source>kex-tests</source>' pom.xml
        fi
        
        sed -i '/<sources>/a\              </sources>' pom.xml
        sed -i '/<source>/a\            </configuration>' pom.xml
        sed -i '/<configuration>/a\          </execution>' pom.xml
        sed -i '/<execution>/a\        </executions>' pom.xml
        sed -i '/<executions>/a\      </plugin>' pom.xml
        
        echo "   ✅ Fontes de teste configuradas"
    else
        echo "   ✅ build-helper-plugin já configurado"
    fi
fi

# 5. Adicionar configuração do Surefire se necessário
echo ""
echo "3. Configurando Surefire..."

if ! grep -q "maven-surefire-plugin" pom.xml; then
    echo "   Adicionando maven-surefire-plugin..."
    
    sed -i '/<\/plugins>/i\
      <plugin>\
        <groupId>org.apache.maven.plugins</groupId>\
        <artifactId>maven-surefire-plugin</artifactId>\
        <version>2.22.2</version>\
        <configuration>\
          <includes>\
            <include>**/*Test.java</include>\
            <include>**/*_ESTest.java</include>\
            <include>**/*_*Test.java</include>\
          </includes>\
          <testFailureIgnore>true</testFailureIgnore>\
          <forkCount>1</forkCount>\
          <reuseForks>false</reuseForks>\
          <argLine>\
            --add-opens java.base/java.lang=ALL-UNNAMED\
            --add-opens java.base/java.util=ALL-UNNAMED\
            --add-opens java.base/java.net=ALL-UNNAMED\
            --add-opens java.desktop/java.awt=ALL-UNNAMED\
            --add-opens java.desktop/sun.awt=ALL-UNNAMED\
            -Djava.awt.headless=true\
            -Djava.security.manager=allow\
            -noverify\
          </argLine>\
        </configuration>\
      </plugin>' pom.xml
    
    echo "   ✅ Surefire configurado"
else
    echo "   ✅ Surefire já configurado"
fi

# 6. Adicionar JaCoCo se necessário
echo ""
echo "4. Configurando JaCoCo..."

if ! grep -q "jacoco-maven-plugin" pom.xml; then
    echo "   Adicionando JaCoCo..."
    
    sed -i '/<\/plugins>/i\
      <plugin>\
        <groupId>org.jacoco</groupId>\
        <artifactId>jacoco-maven-plugin</artifactId>\
        <version>0.8.11</version>\
        <executions>\
          <execution>\
            <goals>\
              <goal>prepare-agent</goal>\
            </goals>\
          </execution>\
          <execution>\
            <id>report</id>\
            <phase>test</phase>\
            <goals>\
              <goal>report</goal>\
            </goals>\
          </execution>\
        </executions>\
      </plugin>' pom.xml
    
    echo "   ✅ JaCoCo adicionado"
else
    echo "   ✅ JaCoCo já configurado"
fi

# 7. Executar testes
echo ""
echo "5. Executando testes com Maven..."
echo "   (Isso pode levar alguns minutos)"
echo ""

# Configurar MAVEN_OPTS para Java 9+
export MAVEN_OPTS="--add-opens java.base/java.lang=ALL-UNNAMED \
                   --add-opens java.base/java.util=ALL-UNNAMED \
                   --add-opens java.base/java.net=ALL-UNNAMED \
                   --add-opens java.desktop/java.awt=ALL-UNNAMED \
                   -Djava.awt.headless=true"

# Executar Maven
mvn clean test jacoco:report \
    -Dtest="$TEST_PATTERN" \
    -DfailIfNoTests=false \
    -Dmaven.test.failure.ignore=true

# 8. Restaurar pom.xml
mv pom.xml.backup pom.xml

# 9. Mostrar resultados
echo ""
echo "========================================="
echo "✅ RELATÓRIO DE COBERTURA"
echo "========================================="

if [ -f "target/site/jacoco/index.html" ]; then
    echo "📁 Relatório: target/site/jacoco/index.html"
    
    if [ -f "target/site/jacoco/jacoco.csv" ]; then
        echo ""
        echo "📊 COBERTURA:"
        awk -F',' '
        NR>1 {
            total_inst += $5 + $6
            covered_inst += $6
            total_line += $9 + $10
            covered_line += $10
            classes++
        }
        END {
            if (classes > 0) {
                printf "   Classes:     %d\n", classes
                printf "   Instruções:  %.2f%% (%d/%d)\n", (covered_inst*100/total_inst), covered_inst, total_inst
                printf "   Linhas:      %.2f%% (%d/%d)\n", (covered_line*100/total_line), covered_line, total_line
            } else {
                printf "   Nenhum dado de cobertura encontrado\n"
            }
        }' target/site/jacoco/jacoco.csv 2>/dev/null || echo "   Aguardando dados..."
    fi
else
    echo "❌ Relatório não encontrado"
fi

echo ""
echo "📈 Para visualizar: firefox target/site/jacoco/index.html"
