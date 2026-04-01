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

public class VertexSet_createPosMap_686188965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150053;

    public VertexSet_createPosMap_686188965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150053 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150054 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150055 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150059 = (int[]) newIntArray(9);
        Object term150071 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150072 = (long[]) newLongArray(1);
        setField(term150054, term150054.getClass(), "table", term150055);
        setIntField(term150054, term150054.getClass(), "count", -971148722);
        setIntField(term150054, term150054.getClass(), "threshold", 15);
        setFloatField(term150054, term150054.getClass(), "loadFactor", 0.75F);
        setField(term150053, term150053.getClass(), "posMap", term150054);
        setField(term150053, term150053.getClass(), "graph", null);
        setIntElement(term150059, 0, 1720903344);
        setIntElement(term150059, 1, 1299622391);
        setIntElement(term150059, 2, 369662321);
        setIntElement(term150059, 3, 1323658775);
        setIntElement(term150059, 4, -237274667);
        setIntElement(term150059, 5, -1221341483);
        setIntElement(term150059, 6, 145950176);
        setIntElement(term150059, 7, -566045704);
        setIntElement(term150059, 8, 1614434712);
        setField(term150053, term150053.getClass(), "vertices", term150059);
        setIntField(term150053, term150053.getClass(), "numVertices", -369298098);
        setIntField(term150053, term150053.getClass(), "first", -1320911275);
        setField(term150071, term150071.getClass(), "words", term150072);
        setIntField(term150071, term150071.getClass(), "wordsInUse", -1516680461);
        setBooleanField(term150071, term150071.getClass(), "sizeIsSticky", true);
        setField(term150053, term150053.getClass(), "bitset", term150071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPosMap", argTypes, term150053, args);
    }

};


