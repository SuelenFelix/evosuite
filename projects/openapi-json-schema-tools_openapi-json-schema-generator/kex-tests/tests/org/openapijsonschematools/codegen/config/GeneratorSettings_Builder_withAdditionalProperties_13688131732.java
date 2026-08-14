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

public class GeneratorSettings_Builder_withAdditionalProperties_13688131732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6946;

    public GeneratorSettings_Builder_withAdditionalProperties_13688131732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6946 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term6946, term6946.getClass(), "generatorName", null);
        setField(term6946, term6946.getClass(), "apiPackage", null);
        setField(term6946, term6946.getClass(), "invokerPackage", null);
        setField(term6946, term6946.getClass(), "packageName", null);
        setField(term6946, term6946.getClass(), "apiNameSuffix", null);
        setField(term6946, term6946.getClass(), "modelNamePrefix", null);
        setField(term6946, term6946.getClass(), "modelNameSuffix", null);
        setField(term6946, term6946.getClass(), "groupId", null);
        setField(term6946, term6946.getClass(), "artifactId", null);
        setField(term6946, term6946.getClass(), "artifactVersion", null);
        setField(term6946, term6946.getClass(), "additionalProperties", null);
        setField(term6946, term6946.getClass(), "gitHost", null);
        setField(term6946, term6946.getClass(), "gitUserId", null);
        setField(term6946, term6946.getClass(), "gitRepoId", null);
        setField(term6946, term6946.getClass(), "releaseNote", null);
        setField(term6946, term6946.getClass(), "httpUserAgent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withAdditionalProperties", argTypes, term6946, args);
    }

};


