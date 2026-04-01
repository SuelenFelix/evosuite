package org.graph4j.isomorphism;

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
import static org.graph4j.isomorphism.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RootedForestIsomorphism_init_18609702800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3322;
     Object term3342;

    public RootedForestIsomorphism_init_18609702800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3322 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3323 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3324 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3328 = (int[]) newIntArray(6);
        Object term3337 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3338 = (long[]) newLongArray(1);
        setField(term3323, term3323.getClass(), "table", term3324);
        setIntField(term3323, term3323.getClass(), "count", -98060427);
        setIntField(term3323, term3323.getClass(), "threshold", 15);
        setFloatField(term3323, term3323.getClass(), "loadFactor", 0.75F);
        setField(term3322, term3322.getClass(), "posMap", term3323);
        setField(term3322, term3322.getClass(), "graph", null);
        setIntElement(term3328, 0, -1272268399);
        setIntElement(term3328, 1, 1120271104);
        setIntElement(term3328, 2, -128435804);
        setIntElement(term3328, 3, 2136158480);
        setIntElement(term3328, 4, 2118747457);
        setIntElement(term3328, 5, 1868344256);
        setField(term3322, term3322.getClass(), "vertices", term3328);
        setIntField(term3322, term3322.getClass(), "numVertices", 1857693976);
        setIntField(term3322, term3322.getClass(), "first", 1631305277);
        setField(term3337, term3337.getClass(), "words", term3338);
        setIntField(term3337, term3337.getClass(), "wordsInUse", 162113491);
        setBooleanField(term3337, term3337.getClass(), "sizeIsSticky", false);
        setField(term3322, term3322.getClass(), "bitset", term3337);
        term3342 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3343 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3344 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3348 = (int[]) newIntArray(2);
        Object term3353 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3354 = (long[]) newLongArray(1);
        setField(term3343, term3343.getClass(), "table", term3344);
        setIntField(term3343, term3343.getClass(), "count", -932147928);
        setIntField(term3343, term3343.getClass(), "threshold", 15);
        setFloatField(term3343, term3343.getClass(), "loadFactor", 0.75F);
        setField(term3342, term3342.getClass(), "posMap", term3343);
        setField(term3342, term3342.getClass(), "graph", null);
        setIntElement(term3348, 0, 487369012);
        setIntElement(term3348, 1, -179238712);
        setField(term3342, term3342.getClass(), "vertices", term3348);
        setIntField(term3342, term3342.getClass(), "numVertices", -2018735535);
        setIntField(term3342, term3342.getClass(), "first", -658524954);
        setField(term3353, term3353.getClass(), "words", term3354);
        setIntField(term3353, term3353.getClass(), "wordsInUse", -2009613557);
        setBooleanField(term3353, term3353.getClass(), "sizeIsSticky", false);
        setField(term3342, term3342.getClass(), "bitset", term3353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.Graph");
        argTypes[2] = Class.forName("org.graph4j.util.VertexSet");
        argTypes[3] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term3322;
        args[3] = term3342;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


