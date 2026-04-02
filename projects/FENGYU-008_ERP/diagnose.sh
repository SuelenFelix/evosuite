#!/bin/bash

PROJECT_DIR="/home/suelenfelix/TCC/evosuite/projects/FENGYU-008_ERP"
cd "$PROJECT_DIR"

echo "========================================="
echo "DIAGNÓSTICO DO PROJETO"
echo "========================================="

echo ""
echo "1. Verificando se há métodos @Test nos testes EvoSuite:"
find . -name "*_ESTest.java" -exec grep -l "@Test" {} \; | head -3
if [ $? -eq 0 ]; then
    echo "   ✅ Testes EvoSuite têm anotações @Test"
else
    echo "   ❌ Testes EvoSuite NÃO têm @Test"
fi

echo ""
echo "2. Verificando se há métodos @Test nos testes Kex:"
find src/test/java/kex-tests -name "*.java" -exec grep -l "@Test" {} \; 2>/dev/null | head -3
if [ $? -eq 0 ]; then
    echo "   ✅ Testes Kex têm anotações @Test"
else
    echo "   ❌ Testes Kex NÃO têm @Test"
fi

echo ""
echo "3. Verificando estrutura de um teste EvoSuite:"
SAMPLE=$(find . -name "*_ESTest.java" | head -1)
if [ -n "$SAMPLE" ]; then
    echo "   Arquivo: $SAMPLE"
    head -30 "$SAMPLE" | grep -E "(@Test|public void|class.*extends)"
fi

echo ""
echo "4. Verificando se os testes compilaram:"
find target/test-classes -name "*_ESTest.class" 2>/dev/null | wc -l | xargs echo "   Classes EvoSuite compiladas:"
find target/test-classes -path "*/kex-tests/*" -name "*.class" 2>/dev/null | wc -l | xargs echo "   Classes Kex compiladas:"

echo ""
echo "5. Verificando dependências:"
echo "   EvoSuite runtime: $(find ~/.m2/repository/org/evosuite -name "*.jar" 2>/dev/null | wc -l) arquivos"
echo "   JUnit 4: $(find ~/.m2/repository/junit/junit -name "*.jar" 2>/dev/null | wc -l) arquivos"
