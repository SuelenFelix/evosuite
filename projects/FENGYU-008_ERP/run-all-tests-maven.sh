#!/bin/bash

PROJECT_DIR="/home/suelenfelix/TCC/evosuite/projects/FENGYU-008_ERP"
cd $PROJECT_DIR

echo "========================================="
echo "EXECUTANDO TODOS OS TESTES COM MAVEN"
echo "Nativos + EvoSuite + Kex"
echo "========================================="

# 1. Adicionar diretório Kex como fonte de teste no pom.xml
echo "1. Configurando fontes de teste..."

# Backup do pom.xml
cp pom.xml pom.xml.backup

# Adicionar diretório Kex como fonte de teste se não existir
if ! grep -q "kex-tests/tests" pom.xml; then
    # Inserir build-helper-plugin para adicionar fontes de teste
    sed -i '/<build>/a\
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
              <sources>\
                <source>src/test/java/kex-tests/tests</source>\
                <source>evosuite-tests</source>\
              </sources>\
            </configuration>\
          </execution>\
        </executions>\
      </plugin>' pom.xml
fi

# 2. Executar todos os testes com Maven
echo ""
echo "2. Executando testes com Maven..."
echo "   (Isso pode levar vários minutos)"

# Executar testes com cobertura
mvn clean test jacoco:report \
    -Dtest="com.shark.erp.**.*Test,com.shark.erp.**.*_ESTest,com.shark.erp.**.*_*" \
    -DfailIfNoTests=false \
    -Dmaven.test.failure.ignore=true

# 3. Restaurar pom.xml
mv pom.xml.backup pom.xml

# 4. Mostrar resultados
echo ""
echo "========================================="
echo "✅ RELATÓRIO FINAL"
echo "========================================="

if [ -f target/site/jacoco/index.html ]; then
    echo "📁 Relatório HTML: target/site/jacoco/index.html"

    # Extrair estatísticas
    if [ -f target/site/jacoco/jacoco.csv ]; then
        echo ""
        echo "📊 COBERTURA TOTAL:"
        awk -F',' '
        NR>1 {
            total += $5 + $6
            covered += $6
            classes++
        }
        END {
            printf "   Classes: %d\n", classes
            printf "   Instruções: %d/%d (%.2f%%)\n", covered, total, (covered*100/total)
        }' target/site/jacoco/jacoco.csv
    fi
fi

echo ""
echo "Para visualizar: firefox target/site/jacoco/index.html"
