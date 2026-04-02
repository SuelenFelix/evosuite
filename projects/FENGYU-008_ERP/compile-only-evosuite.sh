#!/bin/bash

PROJECT_DIR="/home/suelenfelix/TCC/evosuite/projects/FENGYU-008_ERP"
cd "$PROJECT_DIR"

echo "========================================="
echo "COMPILANDO APENAS TESTES EVOSUITE"
echo "========================================="

# Remover temporariamente os testes Kex problemáticos
echo "Movendo testes Kex temporariamente..."
if [ -d "src/test/java/kex-tests" ]; then
    mv src/test/java/kex-tests src/test/java/kex-tests.bak
    echo "✅ Testes Kex movidos para kex-tests.bak"
fi

# Compilar projeto com apenas testes EvoSuite
echo ""
echo "Compilando projeto..."
mvn compile test-compile -q

# Verificar se os testes EvoSuite compilaram
echo ""
echo "Verificando classes compiladas:"
evosuite_count=$(find target/test-classes -name "*_ESTest.class" 2>/dev/null | wc -l)
echo "  ✅ Testes EvoSuite compilados: $evosuite_count"

# Restaurar testes Kex
if [ -d "src/test/java/kex-tests.bak" ]; then
    mv src/test/java/kex-tests.bak src/test/java/kex-tests
    echo "✅ Testes Kex restaurados"
fi

echo ""
if [ $evosuite_count -gt 0 ]; then
    echo "✅ Sucesso! ${evosuite_count} testes EvoSuite compilados."
else
    echo "❌ Falha: Nenhum teste EvoSuite compilou"
fi
