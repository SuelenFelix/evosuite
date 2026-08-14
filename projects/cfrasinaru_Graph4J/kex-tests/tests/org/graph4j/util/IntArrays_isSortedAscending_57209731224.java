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

public class IntArrays_isSortedAscending_57209731224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9248;

    public IntArrays_isSortedAscending_57209731224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9248 = (int[]) newIntArray(9);
        setIntElement(term9248, 0, 498271385);
        setIntElement(term9248, 1, 1418222767);
        setIntElement(term9248, 2, 1862441057);
        setIntElement(term9248, 3, 1889814117);
        setIntElement(term9248, 4, -1336297368);
        setIntElement(term9248, 5, 1535507114);
        setIntElement(term9248, 6, -1174141307);
        setIntElement(term9248, 7, -1603957392);
        setIntElement(term9248, 8, -287005602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9248;
        callMethod(klass, "isSortedAscending", argTypes, null, args);
    }

};


