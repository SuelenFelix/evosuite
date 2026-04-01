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

public class GeneratorSettings_toString_121857232749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48801;

    public GeneratorSettings_toString_121857232749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48801 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        setField(term48801, term48801.getClass(), "generatorName", null);
        setField(term48801, term48801.getClass(), "apiPackage", null);
        setField(term48801, term48801.getClass(), "modelPackage", null);
        setField(term48801, term48801.getClass(), "invokerPackage", null);
        setField(term48801, term48801.getClass(), "packageName", null);
        setField(term48801, term48801.getClass(), "apiNameSuffix", null);
        setField(term48801, term48801.getClass(), "modelNamePrefix", null);
        setField(term48801, term48801.getClass(), "modelNameSuffix", null);
        setField(term48801, term48801.getClass(), "groupId", null);
        setField(term48801, term48801.getClass(), "artifactId", null);
        setField(term48801, term48801.getClass(), "artifactVersion", null);
        setField(term48801, term48801.getClass(), "additionalProperties", null);
        setField(term48801, term48801.getClass(), "gitHost", null);
        setField(term48801, term48801.getClass(), "gitUserId", null);
        setField(term48801, term48801.getClass(), "gitRepoId", null);
        setField(term48801, term48801.getClass(), "releaseNote", null);
        setField(term48801, term48801.getClass(), "httpUserAgent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term48801, args);
    }

};


