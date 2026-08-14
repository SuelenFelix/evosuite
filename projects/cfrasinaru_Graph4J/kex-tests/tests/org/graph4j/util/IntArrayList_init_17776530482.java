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

public class IntArrayList_init_17776530482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9358;

    public IntArrayList_init_17776530482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9358 = (int[]) newIntArray(8);
        setIntElement(term9358, 0, 878906837);
        setIntElement(term9358, 1, -1578163757);
        setIntElement(term9358, 2, -1361859122);
        setIntElement(term9358, 3, -1130681822);
        setIntElement(term9358, 4, 1224219518);
        setIntElement(term9358, 5, 1466055196);
        setIntElement(term9358, 6, -1310910895);
        setIntElement(term9358, 7, -1504228047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrayList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9358;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


