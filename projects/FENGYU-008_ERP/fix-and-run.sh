#!/bin/bash

PROJECT_DIR="${1:-$PWD}"
cd "$PROJECT_DIR"

echo "========================================="
echo "CONFIGURANDO E EXECUTANDO TESTES"
echo "========================================="

# Backup do pom.xml
cp pom.xml pom.xml.backup

# Verificar se JUnit está presente
if ! grep -q "junit" pom.xml; then
    echo "1. Adicionando dependências JUnit..."
    
    # Adicionar JUnit 4
    sed -i '/<\/dependencies>/i\
    <dependency>\
      <groupId>junit</groupId>\
      <artifactId>junit</artifactId>\
      <version>4.13.2</version>\
      <scope>test</scope>\
    </dependency>' pom.xml
    
    # Adicionar JUnit 5 (vintage) para compatibilidade
    sed -i '/<\/dependencies>/i\
    <dependency>\
      <groupId>org.junit.vintage</groupId>\
      <artifactId>junit-vintage-engine</artifactId>\
      <version>5.8.2</version>\
      <scope>test</scope>\
    </dependency>' pom.xml
fi

# Adicionar configuração do Surefire
if ! grep -q "maven-surefire-plugin" pom.xml; then
    echo "2. Adicionando configuração do Surefire..."
    
    sed -i '/<\/plugins>/i\
      <plugin>\
        <groupId>org.apache.maven.plugins</groupId>\
        <artifactId>maven-surefire-plugin</artifactId>\
        <version>2.22.2</version>\
        <configuration>\
          <includes>\
            <include>**/*Test.java</include>\
            <include>**/*_ESTest.java</include>\
          </includes>\
          <testFailureIgnore>true</testFailureIgnore>\
          <argLine>\
            --add-opens java.base/java.lang=ALL-UNNAMED\
            --add-opens java.base/java.util=ALL-UNNAMED\
            --add-opens java.base/java.net=ALL-UNNAMED\
            -Djava.awt.headless=true\
          </argLine>\
        </configuration>\
      </plugin>' pom.xml
fi

# Adicionar JaCoCo se não existir
if ! grep -q "jacoco-maven-plugin" pom.xml; then
    echo "3. Adicionando JaCoCo..."
    
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
fi

# Executar apenas testes que compilam (excluindo Kex se necessário)
echo ""
echo "4. Executando testes..."

# Opção 1: Executar apenas testes nativos e EvoSuite
mvn clean test jacoco:report \
    -Dtest="**/*Test,**/*_ESTest" \
    -DfailIfNoTests=false \
    -Dmaven.test.failure.ignore=true

# Restaurar pom.xml
mv pom.xml.backup pom.xml

echo ""
echo "✅ Relatório: target/site/jacoco/index.html"
