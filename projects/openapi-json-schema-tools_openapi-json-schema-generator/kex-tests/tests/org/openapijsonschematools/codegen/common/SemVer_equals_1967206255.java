package org.openapijsonschematools.codegen.common;

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
import static org.openapijsonschematools.codegen.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SemVer_equals_1967206255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3401;
     Object term3405;

    public SemVer_equals_1967206255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3401 = newInstance(Class.forName("org.openapijsonschematools.codegen.common.SemVer"));
        setIntField(term3401, term3401.getClass(), "major", 597278769);
        setIntField(term3401, term3401.getClass(), "minor", -1685132342);
        setIntField(term3401, term3401.getClass(), "revision", -1456670397);
        term3405 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.SemVer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3405;
        callMethod(klass, "equals", argTypes, term3401, args);
    }

};


