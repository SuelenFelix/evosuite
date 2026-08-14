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

public class GeneratorSettings_Builder_withApiNameSuffix_86929422826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6940;

    public GeneratorSettings_Builder_withApiNameSuffix_86929422826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6940 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term6940, term6940.getClass(), "generatorName", null);
        setField(term6940, term6940.getClass(), "apiPackage", null);
        setField(term6940, term6940.getClass(), "invokerPackage", null);
        setField(term6940, term6940.getClass(), "packageName", null);
        setField(term6940, term6940.getClass(), "apiNameSuffix", null);
        setField(term6940, term6940.getClass(), "modelNamePrefix", null);
        setField(term6940, term6940.getClass(), "modelNameSuffix", null);
        setField(term6940, term6940.getClass(), "groupId", null);
        setField(term6940, term6940.getClass(), "artifactId", null);
        setField(term6940, term6940.getClass(), "artifactVersion", null);
        setField(term6940, term6940.getClass(), "additionalProperties", null);
        setField(term6940, term6940.getClass(), "gitHost", null);
        setField(term6940, term6940.getClass(), "gitUserId", null);
        setField(term6940, term6940.getClass(), "gitRepoId", null);
        setField(term6940, term6940.getClass(), "releaseNote", null);
        setField(term6940, term6940.getClass(), "httpUserAgent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withApiNameSuffix", argTypes, term6940, args);
    }

};


