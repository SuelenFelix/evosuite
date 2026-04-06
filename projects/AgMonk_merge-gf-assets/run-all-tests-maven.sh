# !/bin/bash

PROJECT_DIR="/home/suelenfelix/TCC/evosuite/projects/AgMonk_merge-gf-assets"
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
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64 \
PATH=/usr/lib/jvm/java-11-openjdk-amd64/bin:$PATH \
mvn clean test jacoco:report \
    -DforkCount=0 \
    -DargLine="-Xmx2g" \
    -Dtest="*Tests,com.gin.mergegfassets.**.*Test,com.gin.mergegfassets.**.*_ESTest,com.gin.mergegfassets.**.*_*" \
    -DfailIfNoTests=false \
    -Dmaven.test.failure.ignore=true

# 3. Restaurar pom.xml
mv pom.xml.backup pom.xml

# 4. Mostrar resultados
if [ -f target/site/jacoco/index.html ]; then
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
            echo "📊 COBERTURA TOTAL (Calculada do CSV):"

            awk -F',' '
            NR==1 {
                for(i=1;i<=NF;i++) {
                    if($i=="INSTRUCTION_MISSED") m=i
                    if($i=="INSTRUCTION_COVERED") c=i
                }
            }
            NR>1 {
                missed += $m
                covered += $c
                count++
            }
            END {
                total = missed + covered
                printf "   Classes Processadas: %d\n", count
                if (total > 0) {
                    printf "   Instruções Totais:   %d\n", total
                    printf "   Instruções Cobertas: %d\n", covered
                    printf "   Percentual Real:     %.2f%%\n", (covered*100/total)
                }
            }' target/site/jacoco/jacoco.csv
        fi
    fi
  fi

echo ""
echo "Para visualizar: firefox target/site/jacoco/index.html"
