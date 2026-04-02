#!/bin/bash

PROJECT_DIR="/home/suelenfelix/TCC/evosuite/projects/FENGYU-008_ERP"
cd "$PROJECT_DIR"

echo "========================================="
echo "ERP COVERAGE REPORT"
echo "========================================="

# Backup do pom.xml
cp pom.xml pom.xml.backup

# 1. Configurar para ignorar testes Kex na compilação (mas manter no classpath)
echo "1. Configurando exclusão de testes problemáticos..."

# Adicionar exclusão para o compilador
if ! grep -q "testExclude" pom.xml; then
    sed -i '/<plugin>/{
        /maven-compiler-plugin/,/<\/plugin>/ {
            /<configuration>/a\
                <testExcludes>\
                    <testExclude>**/kex-tests/**/*.java</testExclude>\
                </testExcludes>
        }
    }' pom.xml 2>/dev/null || true
fi

# 2. Garantir que as fontes de teste estão configuradas
echo "2. Verificando fontes de teste..."

if ! grep -q "evosuite-tests" pom.xml; then
    sed -i '/<\/plugins>/i\
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
                <source>evosuite-tests</source>\
              </sources>\
            </configuration>\
          </execution>\
        </executions>\
      </plugin>' pom.xml
fi

# 3. Executar testes (apenas EvoSuite, pular Kex)
echo ""
echo "3. Executando testes EvoSuite..."
echo ""

# Executar testes com cobertura
mvn clean test jacoco:report \
    -Dtest="**/*_ESTest" \
    -DfailIfNoTests=false \
    -Dmaven.test.failure.ignore=true \
    -Dmaven.test.skip=false

# 4. Restaurar pom.xml
mv pom.xml.backup pom.xml

# 5. Mostrar resultados
echo ""
echo "========================================="
echo "RESULTADO FINAL"
echo "========================================="

if [ -f "target/site/jacoco/index.html" ]; then
    echo "✅ RELATÓRIO GERADO COM SUCESSO!"
    echo "📁 target/site/jacoco/index.html"
    
    # Extrair estatísticas
    if [ -f "target/site/jacoco/jacoco.csv" ]; then
        echo ""
        echo "📊 COBERTURA TOTAL:"
        awk -F',' '
        NR>1 {
            total_inst += $5 + $6
            covered_inst += $6
            total_line += $9 + $10
            covered_line += $10
            classes++
        }
        END {
            if (total_inst > 0) {
                printf "   Classes Analisadas: %d\n", classes
                printf "   Instruções: %.2f%% (%d/%d)\n", (covered_inst*100/total_inst), covered_inst, total_inst
                printf "   Linhas: %.2f%% (%d/%d)\n", (covered_line*100/total_line), covered_line, total_line
            } else {
                print "   Nenhuma instrução coberta"
            }
        }' target/site/jacoco/jacoco.csv
        
        echo ""
        echo "📈 CLASSES COM MAIOR COBERTURA:"
        tail -n +2 target/site/jacoco/jacoco.csv | awk -F',' '
        {
            total = $5 + $6
            if (total > 0) {
                pct = ($6 * 100) / total
                if (pct > 0) {
                    printf "   %6.2f%% - %s\n", pct, $3
                }
            }
        }' | sort -k1 -rn | head -10
    fi
    
    # Mostrar quantidade de testes executados
    if [ -d "target/surefire-reports" ]; then
        echo ""
        tests_run=$(grep -r "Tests run:" target/surefire-reports/*.txt 2>/dev/null | head -1 | grep -oP 'Tests run: \K\d+')
        errors=$(grep -r "Tests run:" target/surefire-reports/*.txt 2>/dev/null | head -1 | grep -oP 'Errors: \K\d+')
        failures=$(grep -r "Tests run:" target/surefire-reports/*.txt 2>/dev/null | head -1 | grep -oP 'Failures: \K\d+')
        
        if [ -n "$tests_run" ]; then
            echo "📊 EXECUÇÃO DE TESTES:"
            echo "   Tests run: $tests_run"
            echo "   Failures: ${failures:-0}"
            echo "   Errors: ${errors:-0}"
        fi
    fi
else
    echo "❌ Falha: Relatório não foi gerado"
    echo ""
    echo "Diagnóstico rápido:"
    echo "   Testes EvoSuite compilados: $(find target/test-classes -name '*_ESTest.class' 2>/dev/null | wc -l)"
    echo "   Testes Kex compilados: $(find target/test-classes -path '*/kex-tests/*' -name '*.class' 2>/dev/null | wc -l)"
fi

echo ""
echo "📈 Para visualizar: firefox target/site/jacoco/index.html"
