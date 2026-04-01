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

public class VertexSet_init_89353534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150032;

    public VertexSet_init_89353534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150032 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150033 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150034 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150038 = (int[]) newIntArray(3);
        Object term150044 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150045 = (long[]) newLongArray(1);
        setField(term150033, term150033.getClass(), "table", term150034);
        setIntField(term150033, term150033.getClass(), "count", 1624480215);
        setIntField(term150033, term150033.getClass(), "threshold", 15);
        setFloatField(term150033, term150033.getClass(), "loadFactor", 0.75F);
        setField(term150032, term150032.getClass(), "posMap", term150033);
        setField(term150032, term150032.getClass(), "graph", null);
        setIntElement(term150038, 0, -430713266);
        setIntElement(term150038, 1, -850232491);
        setIntElement(term150038, 2, -593637360);
        setField(term150032, term150032.getClass(), "vertices", term150038);
        setIntField(term150032, term150032.getClass(), "numVertices", 1021463183);
        setIntField(term150032, term150032.getClass(), "first", 1363855289);
        setField(term150044, term150044.getClass(), "words", term150045);
        setIntField(term150044, term150044.getClass(), "wordsInUse", -1712071640);
        setBooleanField(term150044, term150044.getClass(), "sizeIsSticky", false);
        setField(term150032, term150032.getClass(), "bitset", term150044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = term150032;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


