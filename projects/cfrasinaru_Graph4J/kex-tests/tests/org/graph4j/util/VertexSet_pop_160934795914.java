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

public class VertexSet_pop_160934795914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150303;

    public VertexSet_pop_160934795914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150303 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150304 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150305 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150309 = (int[]) newIntArray(8);
        Object term150320 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150321 = (long[]) newLongArray(1);
        setField(term150304, term150304.getClass(), "table", term150305);
        setIntField(term150304, term150304.getClass(), "count", -2055814185);
        setIntField(term150304, term150304.getClass(), "threshold", 15);
        setFloatField(term150304, term150304.getClass(), "loadFactor", 0.75F);
        setField(term150303, term150303.getClass(), "posMap", term150304);
        setField(term150303, term150303.getClass(), "graph", null);
        setIntElement(term150309, 0, -1406806383);
        setIntElement(term150309, 1, -589504932);
        setIntElement(term150309, 2, 1338137272);
        setIntElement(term150309, 3, -391617548);
        setIntElement(term150309, 4, 47063781);
        setIntElement(term150309, 5, 578245125);
        setIntElement(term150309, 6, 55113824);
        setIntElement(term150309, 7, -710032784);
        setField(term150303, term150303.getClass(), "vertices", term150309);
        setIntField(term150303, term150303.getClass(), "numVertices", 1921687351);
        setIntField(term150303, term150303.getClass(), "first", 283758658);
        setField(term150320, term150320.getClass(), "words", term150321);
        setIntField(term150320, term150320.getClass(), "wordsInUse", -1841165420);
        setBooleanField(term150320, term150320.getClass(), "sizeIsSticky", true);
        setField(term150303, term150303.getClass(), "bitset", term150320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pop", argTypes, term150303, args);
    }

};


