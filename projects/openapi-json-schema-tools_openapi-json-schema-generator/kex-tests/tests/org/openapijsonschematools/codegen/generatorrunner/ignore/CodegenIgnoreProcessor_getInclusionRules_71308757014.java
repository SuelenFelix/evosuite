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

public class CodegenIgnoreProcessor_getInclusionRules_71308757014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6124;

    public CodegenIgnoreProcessor_getInclusionRules_71308757014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6124 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor"));
        setField(term6124, term6124.getClass(), "LOGGER", null);
        setField(term6124, term6124.getClass(), "ignoreFile", null);
        setField(term6124, term6124.getClass(), "exclusionRules", null);
        setField(term6124, term6124.getClass(), "inclusionRules", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInclusionRules", argTypes, term6124, args);
    }

};


