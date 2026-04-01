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

public class GeneratorSettings_Builder_withArtifactId_30995396930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6944;

    public GeneratorSettings_Builder_withArtifactId_30995396930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6944 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term6944, term6944.getClass(), "generatorName", null);
        setField(term6944, term6944.getClass(), "apiPackage", null);
        setField(term6944, term6944.getClass(), "invokerPackage", null);
        setField(term6944, term6944.getClass(), "packageName", null);
        setField(term6944, term6944.getClass(), "apiNameSuffix", null);
        setField(term6944, term6944.getClass(), "modelNamePrefix", null);
        setField(term6944, term6944.getClass(), "modelNameSuffix", null);
        setField(term6944, term6944.getClass(), "groupId", null);
        setField(term6944, term6944.getClass(), "artifactId", null);
        setField(term6944, term6944.getClass(), "artifactVersion", null);
        setField(term6944, term6944.getClass(), "additionalProperties", null);
        setField(term6944, term6944.getClass(), "gitHost", null);
        setField(term6944, term6944.getClass(), "gitUserId", null);
        setField(term6944, term6944.getClass(), "gitRepoId", null);
        setField(term6944, term6944.getClass(), "releaseNote", null);
        setField(term6944, term6944.getClass(), "httpUserAgent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withArtifactId", argTypes, term6944, args);
    }

};


