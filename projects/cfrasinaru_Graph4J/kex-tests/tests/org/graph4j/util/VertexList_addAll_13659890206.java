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
import java.lang.Object;

public class VertexList_addAll_13659890206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66378;
     Object term66387;

    public VertexList_addAll_13659890206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66378 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term66379 = (int[]) newIntArray(0);
        Object term66382 = newInstance(Class.forName("java.util.BitSet"));
        long[] term66383 = (long[]) newLongArray(1);
        setField(term66378, term66378.getClass(), "graph", null);
        setField(term66378, term66378.getClass(), "vertices", term66379);
        setIntField(term66378, term66378.getClass(), "numVertices", -1138154515);
        setIntField(term66378, term66378.getClass(), "first", -1149872871);
        setField(term66382, term66382.getClass(), "words", term66383);
        setIntField(term66382, term66382.getClass(), "wordsInUse", -1399922144);
        setBooleanField(term66382, term66382.getClass(), "sizeIsSticky", true);
        setField(term66378, term66378.getClass(), "bitset", term66382);
        term66387 = (int[]) newIntArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term66387;
        callMethod(klass, "addAll", argTypes, term66378, args);
    }

};


