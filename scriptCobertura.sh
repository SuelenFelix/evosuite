#!/bin/bash

BASE_PATH="$(cd "$(dirname "$0")" && pwd)"
BASE_DIR="$BASE_PATH/projects"

echo "========================================="
echo "EXECUTANDO TODOS OS PROJETOS"
echo "========================================="

for PROJECT_DIR in "$BASE_DIR"/*; do

    if [ ! -f "$PROJECT_DIR/pom.xml" ]; then
        continue
    fi

    PROJECT_NAME=$(basename "$PROJECT_DIR")

    echo ""
    echo "========================================="
    echo "📦 PROJETO: $PROJECT_NAME"
    echo "========================================="

    cd "$PROJECT_DIR" || continue

    TEST_DIR="src/test/java"
    mkdir -p "$TEST_DIR"

    echo "➡️ Movendo testes..."

    # Kex
    if [ -d "kex-tests" ]; then
        echo "📦 Copiando kex-tests..."
        rsync -av kex-tests/ "$TEST_DIR/kex-tests/"
        rm -rf kex-tests
    fi

    # EvoSuite
    if [ -d "evosuite-tests" ]; then
        echo "📦 Copiando evosuite-tests..."
        rsync -av evosuite-tests/ "$TEST_DIR/evosuite-tests/"
        rm -rf evosuite-tests
    fi

    echo "➡️ Ajustando dependências..."

    cp pom.xml pom.xml.backup

    # =========================
    # DEPENDÊNCIAS
    # =========================

    if ! grep -q "evosuite-standalone-runtime" pom.xml; then
        sed -i '/<dependencies>/a\
        <dependency>\
            <groupId>org.junit.vintage</groupId>\
            <artifactId>junit-vintage-engine</artifactId>\
            <version>5.9.3</version>\
            <scope>test</scope>\
        </dependency>\
        <dependency>\
            <groupId>org.evosuite</groupId>\
            <artifactId>evosuite-standalone-runtime</artifactId>\
            <version>1.1.0</version>\
            <scope>test</scope>\
        </dependency>\
        <dependency>\
            <groupId>junit</groupId>\
            <artifactId>junit</artifactId>\
            <version>4.13.2</version>\
            <scope>test</scope>\
        </dependency>' pom.xml
    fi

    # =========================
    # CORREÇÃO AUTOMÁTICA (plugins duplicado)
    # =========================

    sed -i ':a;N;$!ba;s#</plugin>[[:space:]]*\n[[:space:]]*<plugins>#</plugin>#g' pom.xml

    # =========================
    # GARANTIR <build><plugins>
    # =========================

    if ! grep -q "<build>" pom.xml; then
        sed -i '/</project>/i\
  <build>\
    <plugins>\
    </plugins>\
  </build>' pom.xml
    fi

    if ! grep -q "<plugins>" pom.xml; then
        sed -i '/<build>/a\
    <plugins>\
    </plugins>' pom.xml
    fi

    # =========================
    # INSERIR PLUGINS (CORRETO)
    # =========================

    if ! grep -q "build-helper-maven-plugin" pom.xml; then
        sed -i '/<plugins>/a\
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
                            <source>src/test/java/evosuite-tests</source>\
                            <source>src/test/java/kex-tests</source>\
                        </sources>\
                    </configuration>\
                </execution>\
            </executions>\
        </plugin>' pom.xml
    fi

    if ! grep -q "jacoco-maven-plugin" pom.xml; then
        sed -i '/<plugins>/a\
        <plugin>\
            <groupId>org.jacoco</groupId>\
            <artifactId>jacoco-maven-plugin</artifactId>\
            <version>0.8.11</version>\
            <executions>\
                <execution>\
                    <id>prepare-agent</id>\
                    <goals><goal>prepare-agent</goal></goals>\
                    <configuration>\
                        <destFile>\${project.build.directory}/jacoco.exec</destFile>\
                        <append>true</append>\
                        <propertyName>surefire.argLine</propertyName>\
                    </configuration>\
                </execution>\
                <execution>\
                    <id>report</id>\
                    <phase>test</phase>\
                    <goals><goal>report</goal></goals>\
                </execution>\
            </executions>\
        </plugin>' pom.xml
    fi

    if ! grep -q "maven-surefire-plugin" pom.xml; then
        sed -i '/<plugins>/a\
        <plugin>\
            <groupId>org.apache.maven.plugins</groupId>\
            <artifactId>maven-surefire-plugin</artifactId>\
            <version>3.0.0-M7</version>\
            <configuration>\
                <testFailureIgnore>true</testFailureIgnore>\
                <forkCount>1</forkCount>\
                <reuseForks>false</reuseForks>\
                <argLine>\${surefire.argLine}</argLine>\
            </configuration>\
        </plugin>' pom.xml
    fi

    # =========================
    # VALIDAR POM
    # =========================

    echo "➡️ Validando pom.xml..."

    mvn -q validate
    if [ $? -ne 0 ]; then
        echo "❌ POM inválido, pulando projeto..."
        mv pom.xml.backup pom.xml
        continue
    fi

    echo "➡️ Rodando testes com JaCoCo..."

    mvn clean \
        org.jacoco:jacoco-maven-plugin:0.8.11:prepare-agent \
        test \
        org.jacoco:jacoco-maven-plugin:0.8.11:report \
        -Dtest="**/*Test,**/*Tests,**/*TestCase,**/*_ESTest, **/*_*" \
        -DfailIfNoTests=false \
        -Dmaven.test.failure.ignore=true

    # =========================
    # RESULTADOS
    # =========================

    if [ -f target/site/jacoco/jacoco.csv ]; then

        RESULTS_DIR="$PROJECT_DIR/jacoco-results"
        mkdir -p "$RESULTS_DIR"

        cp target/site/jacoco/jacoco.csv "$RESULTS_DIR/jacoco_testes_totais.csv"
        cp target/site/jacoco/index.html "$RESULTS_DIR/index_testes_totais.html"

        echo "📊 Resultados salvos em: $RESULTS_DIR"
    else
        echo "⚠️ jacoco.csv não encontrado"
    fi

    echo "✅ Finalizado: $PROJECT_NAME"

done

echo ""
echo "🏁 TODOS OS PROJETOS PROCESSADOS"