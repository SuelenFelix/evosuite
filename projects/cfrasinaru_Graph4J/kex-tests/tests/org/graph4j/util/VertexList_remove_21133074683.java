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
import java.lang.Integer;

public class VertexList_remove_21133074683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66318;
     Object term66327;

    public VertexList_remove_21133074683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66318 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term66319 = (int[]) newIntArray(0);
        Object term66322 = newInstance(Class.forName("java.util.BitSet"));
        long[] term66323 = (long[]) newLongArray(1);
        setField(term66318, term66318.getClass(), "graph", null);
        setField(term66318, term66318.getClass(), "vertices", term66319);
        setIntField(term66318, term66318.getClass(), "numVertices", 170817693);
        setIntField(term66318, term66318.getClass(), "first", -923853879);
        setField(term66322, term66322.getClass(), "words", term66323);
        setIntField(term66322, term66322.getClass(), "wordsInUse", 419328039);
        setBooleanField(term66322, term66322.getClass(), "sizeIsSticky", false);
        setField(term66318, term66318.getClass(), "bitset", term66322);
        term66327 = new Integer(76790742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66327;
        callMethod(klass, "remove", argTypes, term66318, args);
    }

};


