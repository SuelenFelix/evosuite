package org.openapijsonschematools.codegen.generatorrunner.ignore;

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
import static org.openapijsonschematools.codegen.generatorrunner.ignore.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CodegenIgnoreProcessor_loadFromFile_197834426511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6121;

    public CodegenIgnoreProcessor_loadFromFile_197834426511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6121 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor"));
        setField(term6121, term6121.getClass(), "LOGGER", null);
        setField(term6121, term6121.getClass(), "ignoreFile", null);
        setField(term6121, term6121.getClass(), "exclusionRules", null);
        setField(term6121, term6121.getClass(), "inclusionRules", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "loadFromFile", argTypes, term6121, args);
    }

};


