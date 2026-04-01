package org.openapijsonschematools.codegen.config;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.openapijsonschematools.codegen.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class GeneratorSettings_Builder_withApiPackage_9556226063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term711;

    public GeneratorSettings_Builder_withApiPackage_9556226063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term832 = new HashMap();
        term711 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term711, term711.getClass(), "generatorName", "eZFUvlxvGV");
        setField(term711, term711.getClass(), "apiPackage", "BYqFIqCKAV");
        setField(term711, term711.getClass(), "invokerPackage", "vrQLuWIDJX");
        setField(term711, term711.getClass(), "packageName", "flxyYxBRtu");
        setField(term711, term711.getClass(), "apiNameSuffix", "OclPbYPkcH");
        setField(term711, term711.getClass(), "modelNamePrefix", "IoAlmYsBwc");
        setField(term711, term711.getClass(), "modelNameSuffix", "TEParAifyi");
        setField(term711, term711.getClass(), "groupId", "OWDIEULEFu");
        setField(term711, term711.getClass(), "artifactId", "dWRymuLBtr");
        setField(term711, term711.getClass(), "artifactVersion", "AijpHYOFuy");
        setField(term711, term711.getClass(), "additionalProperties", term832);
        setField(term711, term711.getClass(), "gitHost", "github.com");
        setField(term711, term711.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term711, term711.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term711, term711.getClass(), "releaseNote", "Minor update");
        setField(term711, term711.getClass(), "httpUserAgent", "SbAoxhfrkn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kuTXqwMtDB";
        callMethod(klass, "withApiPackage", argTypes, term711, args);
    }

};


