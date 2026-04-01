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

public class Walk_equals_150315153915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144020;
     Object term144030;

    public Walk_equals_150315153915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144020 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term144022 = (int[]) newIntArray(0);
        Object term144025 = newInstance(Class.forName("java.util.BitSet"));
        long[] term144026 = (long[]) newLongArray(1);
        setIntField(term144020, term144020.getClass(), "numEdges", 44979767);
        setField(term144020, term144020.getClass(), "graph", null);
        setField(term144020, term144020.getClass(), "vertices", term144022);
        setIntField(term144020, term144020.getClass(), "numVertices", 471892968);
        setIntField(term144020, term144020.getClass(), "first", -596303534);
        setField(term144025, term144025.getClass(), "words", term144026);
        setIntField(term144025, term144025.getClass(), "wordsInUse", -1855330594);
        setBooleanField(term144025, term144025.getClass(), "sizeIsSticky", false);
        setField(term144020, term144020.getClass(), "bitset", term144025);
        term144030 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term144030;
        callMethod(klass, "equals", argTypes, term144020, args);
    }

};


