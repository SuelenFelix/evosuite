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

public class GeneratorSettings_newBuilder_91519335947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48799;

    public GeneratorSettings_newBuilder_91519335947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48799 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        setField(term48799, term48799.getClass(), "generatorName", null);
        setField(term48799, term48799.getClass(), "apiPackage", null);
        setField(term48799, term48799.getClass(), "modelPackage", null);
        setField(term48799, term48799.getClass(), "invokerPackage", null);
        setField(term48799, term48799.getClass(), "packageName", null);
        setField(term48799, term48799.getClass(), "apiNameSuffix", null);
        setField(term48799, term48799.getClass(), "modelNamePrefix", null);
        setField(term48799, term48799.getClass(), "modelNameSuffix", null);
        setField(term48799, term48799.getClass(), "groupId", null);
        setField(term48799, term48799.getClass(), "artifactId", null);
        setField(term48799, term48799.getClass(), "artifactVersion", null);
        setField(term48799, term48799.getClass(), "additionalProperties", null);
        setField(term48799, term48799.getClass(), "gitHost", null);
        setField(term48799, term48799.getClass(), "gitUserId", null);
        setField(term48799, term48799.getClass(), "gitRepoId", null);
        setField(term48799, term48799.getClass(), "releaseNote", null);
        setField(term48799, term48799.getClass(), "httpUserAgent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newBuilder", argTypes, term48799, args);
    }

};


