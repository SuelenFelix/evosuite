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

public class GeneratorSettings_Builder_additionalProperties_202488055120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6935;

    public GeneratorSettings_Builder_additionalProperties_202488055120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6935 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term6935, term6935.getClass(), "generatorName", null);
        setField(term6935, term6935.getClass(), "apiPackage", null);
        setField(term6935, term6935.getClass(), "invokerPackage", null);
        setField(term6935, term6935.getClass(), "packageName", null);
        setField(term6935, term6935.getClass(), "apiNameSuffix", null);
        setField(term6935, term6935.getClass(), "modelNamePrefix", null);
        setField(term6935, term6935.getClass(), "modelNameSuffix", null);
        setField(term6935, term6935.getClass(), "groupId", null);
        setField(term6935, term6935.getClass(), "artifactId", null);
        setField(term6935, term6935.getClass(), "artifactVersion", null);
        setField(term6935, term6935.getClass(), "additionalProperties", null);
        setField(term6935, term6935.getClass(), "gitHost", null);
        setField(term6935, term6935.getClass(), "gitUserId", null);
        setField(term6935, term6935.getClass(), "gitRepoId", null);
        setField(term6935, term6935.getClass(), "releaseNote", null);
        setField(term6935, term6935.getClass(), "httpUserAgent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "additionalProperties", argTypes, term6935, args);
    }

};


