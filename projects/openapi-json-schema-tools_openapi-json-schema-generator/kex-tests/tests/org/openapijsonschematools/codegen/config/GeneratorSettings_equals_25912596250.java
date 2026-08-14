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

public class GeneratorSettings_equals_25912596250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48802;

    public GeneratorSettings_equals_25912596250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48802 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        setField(term48802, term48802.getClass(), "generatorName", null);
        setField(term48802, term48802.getClass(), "apiPackage", null);
        setField(term48802, term48802.getClass(), "modelPackage", null);
        setField(term48802, term48802.getClass(), "invokerPackage", null);
        setField(term48802, term48802.getClass(), "packageName", null);
        setField(term48802, term48802.getClass(), "apiNameSuffix", null);
        setField(term48802, term48802.getClass(), "modelNamePrefix", null);
        setField(term48802, term48802.getClass(), "modelNameSuffix", null);
        setField(term48802, term48802.getClass(), "groupId", null);
        setField(term48802, term48802.getClass(), "artifactId", null);
        setField(term48802, term48802.getClass(), "artifactVersion", null);
        setField(term48802, term48802.getClass(), "additionalProperties", null);
        setField(term48802, term48802.getClass(), "gitHost", null);
        setField(term48802, term48802.getClass(), "gitUserId", null);
        setField(term48802, term48802.getClass(), "gitRepoId", null);
        setField(term48802, term48802.getClass(), "releaseNote", null);
        setField(term48802, term48802.getClass(), "httpUserAgent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term48802, args);
    }

};


