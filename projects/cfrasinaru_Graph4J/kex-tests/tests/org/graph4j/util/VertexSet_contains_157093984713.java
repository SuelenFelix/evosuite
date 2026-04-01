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

public class VertexSet_contains_157093984713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150274;
     Object term150294;

    public VertexSet_contains_157093984713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150274 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150275 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150276 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150280 = (int[]) newIntArray(6);
        Object term150289 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150290 = (long[]) newLongArray(1);
        setField(term150275, term150275.getClass(), "table", term150276);
        setIntField(term150275, term150275.getClass(), "count", 1418339257);
        setIntField(term150275, term150275.getClass(), "threshold", 15);
        setFloatField(term150275, term150275.getClass(), "loadFactor", 0.75F);
        setField(term150274, term150274.getClass(), "posMap", term150275);
        setField(term150274, term150274.getClass(), "graph", null);
        setIntElement(term150280, 0, -1258578613);
        setIntElement(term150280, 1, -1292921063);
        setIntElement(term150280, 2, -1948987196);
        setIntElement(term150280, 3, -1037532351);
        setIntElement(term150280, 4, -1244939317);
        setIntElement(term150280, 5, -2108388262);
        setField(term150274, term150274.getClass(), "vertices", term150280);
        setIntField(term150274, term150274.getClass(), "numVertices", 519883393);
        setIntField(term150274, term150274.getClass(), "first", 2081691976);
        setField(term150289, term150289.getClass(), "words", term150290);
        setIntField(term150289, term150289.getClass(), "wordsInUse", 883247977);
        setBooleanField(term150289, term150289.getClass(), "sizeIsSticky", true);
        setField(term150274, term150274.getClass(), "bitset", term150289);
        term150294 = new Integer(1231040378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term150294;
        callMethod(klass, "contains", argTypes, term150274, args);
    }

};


