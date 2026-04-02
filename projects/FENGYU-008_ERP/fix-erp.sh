#!/bin/bash

PROJECT_DIR="/home/suelenfelix/TCC/evosuite/projects/FENGYU-008_ERP"
cd "$PROJECT_DIR"

echo "========================================="
echo "CONFIGURANDO PROJETO ERP"
echo "========================================="

# 1. Backup do pom.xml
cp pom.xml pom.xml.backup

# 2. Remover referências a testes que não compilam
echo "1. Configurando para ignorar testes problemáticos..."

# Adicionar exclusão para testes Kex e EvoSuite problemáticos
if ! grep -q "excludes" pom.xml; then
    sed -i '/<configuration>/a\
          <excludes>\
            <exclude>**/kex-tests/**/*.java</exclude>\
            <exclude>**/evosuite-tests/**/*.java</exclude>\
          </excludes>' pom.xml || true
fi

# 3. Garantir dependências mínimas
echo "2. Garantindo dependências..."

# Adicionar Spring Boot Test se não existir
if ! grep -q "spring-boot-starter-test" pom.xml; then
    sed -i '/<\/dependencies>/i\
    <dependency>\
      <groupId>org.springframework.boot</groupId>\
      <artifactId>spring-boot-starter-test</artifactId>\
      <scope>test</scope>\
    </dependency>' pom.xml
fi

# 4. Executar testes
echo ""
echo "3. Executando testes disponíveis..."
echo ""

# Executar apenas testes que compilam
mvn clean test jacoco:report \
    -Dtest="**/*Test.java" \
    -DfailIfNoTests=false \
    -Dmaven.test.failure.ignore=true \
    -Dmaven.test.skip=false

# 5. Restaurar pom.xml
mv pom.xml.backup pom.xml

# 6. Resultados
echo ""
echo "========================================="
echo "RESULTADO"
echo "========================================="

if [ -f "target/site/jacoco/index.html" ]; then
    echo "✅ Relatório: target/site/jacoco/index.html"
    
    if [ -f "target/site/jacoco/jacoco.csv" ]; then
        echo ""
        awk -F',' 'NR>1 {t+=$5+$6; c+=$6} END {
            if (t > 0) {
                printf "📊 Cobertura: %.2f%% (%d/%d instruções)\n", (c*100)/t, c, t
            } else {
                print "📊 Nenhum dado de cobertura disponível"
            }
        }' target/site/jacoco/jacoco.csv
    fi
else
    echo "❌ Nenhum relatório gerado"
    echo ""
    echo "Possíveis causas:"
    echo "  - Projeto não tem testes JUnit"
    echo "  - Testes existentes não compilam"
    echo ""
    echo "Para verificar testes existentes:"
    echo "  find src/test/java -name '*.java'"
fi
