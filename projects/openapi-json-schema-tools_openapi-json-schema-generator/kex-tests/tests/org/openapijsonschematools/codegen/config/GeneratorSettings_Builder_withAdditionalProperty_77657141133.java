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

public class GeneratorSettings_Builder_withAdditionalProperty_77657141133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6947;

    public GeneratorSettings_Builder_withAdditionalProperty_77657141133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6947 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term6947, term6947.getClass(), "generatorName", null);
        setField(term6947, term6947.getClass(), "apiPackage", null);
        setField(term6947, term6947.getClass(), "invokerPackage", null);
        setField(term6947, term6947.getClass(), "packageName", null);
        setField(term6947, term6947.getClass(), "apiNameSuffix", null);
        setField(term6947, term6947.getClass(), "modelNamePrefix", null);
        setField(term6947, term6947.getClass(), "modelNameSuffix", null);
        setField(term6947, term6947.getClass(), "groupId", null);
        setField(term6947, term6947.getClass(), "artifactId", null);
        setField(term6947, term6947.getClass(), "artifactVersion", null);
        setField(term6947, term6947.getClass(), "additionalProperties", null);
        setField(term6947, term6947.getClass(), "gitHost", null);
        setField(term6947, term6947.getClass(), "gitUserId", null);
        setField(term6947, term6947.getClass(), "gitRepoId", null);
        setField(term6947, term6947.getClass(), "releaseNote", null);
        setField(term6947, term6947.getClass(), "httpUserAgent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "withAdditionalProperty", argTypes, term6947, args);
    }

};


