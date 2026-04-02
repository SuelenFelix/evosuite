#!/bin/bash

PROJECT_DIR="/home/suelenfelix/TCC/evosuite/projects/FENGYU-008_ERP"
cd "$PROJECT_DIR"

echo "========================================="
echo "INSPECIONANDO TESTES EVOSUITE"
echo "========================================="

# Ver um teste específico
TEST_FILE="src/test/java/evosuite-tests/com/shark/erp/ErpApplication_ESTest.java"

if [ -f "$TEST_FILE" ]; then
    echo "Arquivo: $TEST_FILE"
    echo ""
    echo "=== CONTEÚDO (primeiras 50 linhas) ==="
    head -50 "$TEST_FILE"
    echo ""
    echo "=== MÉTODOS DE TESTE ==="
    grep -n "@Test" "$TEST_FILE"
    echo ""
    echo "=== EXTENDS ==="
    grep "extends" "$TEST_FILE"
fi

echo ""
echo "========================================="
echo "VERIFICANDO CLASSE COMPILADA"
echo "========================================="

# Verificar se a classe compilada existe
if [ -f "target/test-classes/com/shark/erp/ErpApplication_ESTest.class" ]; then
    echo "✅ Classe compilada encontrada"
    echo ""
    echo "Métodos públicos:"
    javap -cp target/test-classes com.shark.erp.ErpApplication_ESTest 2>/dev/null | grep "public void test"
else
    echo "❌ Classe compilada NÃO encontrada"
fi

echo ""
echo "========================================="
echo "VERIFICANDO SCAFFOLDING"
echo "========================================="

SCAFFOLDING="target/test-classes/com/shark/erp/ErpApplication_ESTest_scaffolding.class"
if [ -f "$SCAFFOLDING" ]; then
    echo "✅ Scaffolding encontrado"
    javap -cp target/test-classes com.shark.erp.ErpApplication_ESTest_scaffolding 2>/dev/null | head -20
else
    echo "❌ Scaffolding NÃO encontrado"
fi
