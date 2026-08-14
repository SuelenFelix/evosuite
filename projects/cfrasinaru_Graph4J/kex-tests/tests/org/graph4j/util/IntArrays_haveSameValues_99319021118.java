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

public class IntArrays_haveSameValues_99319021118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9186;
     Object term9191;

    public IntArrays_haveSameValues_99319021118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9186 = (int[]) newIntArray(4);
        setIntElement(term9186, 0, -630727180);
        setIntElement(term9186, 1, -1234361060);
        setIntElement(term9186, 2, -267520884);
        setIntElement(term9186, 3, 1431716083);
        term9191 = (int[]) newIntArray(4);
        setIntElement(term9191, 0, 1540004680);
        setIntElement(term9191, 1, -594861500);
        setIntElement(term9191, 2, 1731562923);
        setIntElement(term9191, 3, 33467458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term9186;
        args[1] = term9191;
        callMethod(klass, "haveSameValues", argTypes, null, args);
    }

};


