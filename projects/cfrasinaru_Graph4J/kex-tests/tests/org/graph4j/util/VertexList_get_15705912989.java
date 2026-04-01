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

public class VertexList_get_15705912989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66427;
     Object term66440;

    public VertexList_get_15705912989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66427 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term66428 = (int[]) newIntArray(4);
        Object term66435 = newInstance(Class.forName("java.util.BitSet"));
        long[] term66436 = (long[]) newLongArray(1);
        setField(term66427, term66427.getClass(), "graph", null);
        setIntElement(term66428, 0, 193503465);
        setIntElement(term66428, 1, 581278549);
        setIntElement(term66428, 2, 2019752538);
        setIntElement(term66428, 3, -340054739);
        setField(term66427, term66427.getClass(), "vertices", term66428);
        setIntField(term66427, term66427.getClass(), "numVertices", -1827976043);
        setIntField(term66427, term66427.getClass(), "first", 1643366352);
        setField(term66435, term66435.getClass(), "words", term66436);
        setIntField(term66435, term66435.getClass(), "wordsInUse", 1649851803);
        setBooleanField(term66435, term66435.getClass(), "sizeIsSticky", true);
        setField(term66427, term66427.getClass(), "bitset", term66435);
        term66440 = new Integer(234521633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66440;
        callMethod(klass, "get", argTypes, term66427, args);
    }

};


