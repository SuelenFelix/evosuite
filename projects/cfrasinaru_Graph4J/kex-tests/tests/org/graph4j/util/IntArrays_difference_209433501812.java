package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IntArrays_difference_209433501812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9080;
     Object term9081;

    public IntArrays_difference_209433501812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9080 = (int[]) newIntArray(0);
        term9081 = (int[]) newIntArray(9);
        setIntElement(term9081, 0, 2027049805);
        setIntElement(term9081, 1, 1777210338);
        setIntElement(term9081, 2, 1406833110);
        setIntElement(term9081, 3, 971309393);
        setIntElement(term9081, 4, 1506905403);
        setIntElement(term9081, 5, 1022586170);
        setIntElement(term9081, 6, -175612916);
        setIntElement(term9081, 7, -1966814722);
        setIntElement(term9081, 8, -2040048430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term9080;
        args[1] = term9081;
        callMethod(klass, "difference", argTypes, null, args);
    }

};


