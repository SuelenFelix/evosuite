#!/bin/bash

PROJECT_DIR="${1:-$PWD}"
cd "$PROJECT_DIR"

echo "========================================="
echo "ANALISANDO PROJETO"
echo "========================================="

echo ""
echo "1. Testes encontrados:"
echo "   Nativos: $(find src/test/java -name '*Test.java' 2>/dev/null | grep -v evosuite | grep -v kex | wc -l)"
echo "   EvoSuite: $(find . -name '*_ESTest.java' 2>/dev/null | wc -l)"
echo "   Kex: $(find src/test/java/kex-tests -name '*.java' 2>/dev/null | wc -l)"

echo ""
echo "2. Dependências de teste no pom.xml:"
grep -E "junit|evosuite|spring-boot-starter-test" pom.xml | head -10

echo ""
echo "3. Testes nativos (exemplos):"
find src/test/java -name '*Test.java' 2>/dev/null | grep -v evosuite | grep -v kex | head -5

echo ""
echo "4. Testes EvoSuite (exemplos):"
find . -name '*_ESTest.java' 2>/dev/null | head -5

echo ""
echo "5. Testes Kex (exemplos):"
find src/test/java/kex-tests -name '*.java' 2>/dev/null | head -5
