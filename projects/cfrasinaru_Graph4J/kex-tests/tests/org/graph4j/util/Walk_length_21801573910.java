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

public class Walk_length_21801573910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143935;

    public Walk_length_21801573910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143935 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term143937 = (int[]) newIntArray(2);
        Object term143942 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143943 = (long[]) newLongArray(1);
        setIntField(term143935, term143935.getClass(), "numEdges", 569217342);
        setField(term143935, term143935.getClass(), "graph", null);
        setIntElement(term143937, 0, -1235050535);
        setIntElement(term143937, 1, -1445331129);
        setField(term143935, term143935.getClass(), "vertices", term143937);
        setIntField(term143935, term143935.getClass(), "numVertices", -2060269503);
        setIntField(term143935, term143935.getClass(), "first", -1114074176);
        setField(term143942, term143942.getClass(), "words", term143943);
        setIntField(term143942, term143942.getClass(), "wordsInUse", -497435106);
        setBooleanField(term143942, term143942.getClass(), "sizeIsSticky", false);
        setField(term143935, term143935.getClass(), "bitset", term143942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "length", argTypes, term143935, args);
    }

};


