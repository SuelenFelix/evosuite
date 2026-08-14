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

public class Clique_union_6076082404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7541;
     Object term7555;

    public Clique_union_6076082404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7541 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term7542 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term7543 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term7547 = (int[]) newIntArray(0);
        Object term7550 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7551 = (long[]) newLongArray(1);
        setField(term7542, term7542.getClass(), "table", term7543);
        setIntField(term7542, term7542.getClass(), "count", 629005618);
        setIntField(term7542, term7542.getClass(), "threshold", 15);
        setFloatField(term7542, term7542.getClass(), "loadFactor", 0.75F);
        setField(term7541, term7541.getClass(), "posMap", term7542);
        setField(term7541, term7541.getClass(), "graph", null);
        setField(term7541, term7541.getClass(), "vertices", term7547);
        setIntField(term7541, term7541.getClass(), "numVertices", -2006508013);
        setIntField(term7541, term7541.getClass(), "first", 974951631);
        setField(term7550, term7550.getClass(), "words", term7551);
        setIntField(term7550, term7550.getClass(), "wordsInUse", -942202284);
        setBooleanField(term7550, term7550.getClass(), "sizeIsSticky", true);
        setField(term7541, term7541.getClass(), "bitset", term7550);
        term7555 = (int[]) newIntArray(1);
        setIntElement(term7555, 0, -2083254556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7555;
        callMethod(klass, "union", argTypes, term7541, args);
    }

};


