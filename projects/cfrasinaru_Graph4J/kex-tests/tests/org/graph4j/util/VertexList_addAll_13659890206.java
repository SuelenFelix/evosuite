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
     Object term2393;
     Object term2406;

    public VertexList_addAll_13659890206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2393 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term2394 = (int[]) newIntArray(4);
        Object term2401 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2402 = (long[]) newLongArray(1);
        setField(term2393, term2393.getClass(), "graph", null);
        setIntElement(term2394, 0, 1235045850);
        setIntElement(term2394, 1, -75143033);
        setIntElement(term2394, 2, 797015478);
        setIntElement(term2394, 3, 717574276);
        setField(term2393, term2393.getClass(), "vertices", term2394);
        setIntField(term2393, term2393.getClass(), "numVertices", 1795369860);
        setIntField(term2393, term2393.getClass(), "first", -570164389);
        setField(term2401, term2401.getClass(), "words", term2402);
        setIntField(term2401, term2401.getClass(), "wordsInUse", 43200329);
        setBooleanField(term2401, term2401.getClass(), "sizeIsSticky", true);
        setField(term2393, term2393.getClass(), "bitset", term2401);
        term2406 = (int[]) newIntArray(7);
        setIntElement(term2406, 0, 998679955);
        setIntElement(term2406, 1, 953741504);
        setIntElement(term2406, 2, 1389452261);
        setIntElement(term2406, 3, 1615957955);
        setIntElement(term2406, 4, 1779370220);
        setIntElement(term2406, 5, -1716046610);
        setIntElement(term2406, 6, 65264024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2406;
        callMethod(klass, "addAll", argTypes, term2393, args);
    }

};


