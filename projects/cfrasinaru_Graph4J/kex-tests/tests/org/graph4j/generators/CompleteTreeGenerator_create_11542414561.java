package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CompleteTreeGenerator_create_11542414561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2593;

    public CompleteTreeGenerator_create_11542414561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2593 = newInstance(Class.forName("org.graph4j.generators.CompleteTreeGenerator"));
        int[] term2596 = (int[]) newIntArray(3);
        setIntField(term2593, term2593.getClass(), "numLevels", -1541981599);
        setIntField(term2593, term2593.getClass(), "degree", 1605456363);
        setIntElement(term2596, 0, 2059896693);
        setIntElement(term2596, 1, 2109912812);
        setIntElement(term2596, 2, 1841286431);
        setField(term2593, term2593.getClass(), "vertices", term2596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.CompleteTreeGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "create", argTypes, term2593, args);
    }

};


