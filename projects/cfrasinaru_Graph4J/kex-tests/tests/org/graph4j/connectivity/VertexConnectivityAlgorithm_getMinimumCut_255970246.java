package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class VertexConnectivityAlgorithm_getMinimumCut_255970246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574;
     Object term596;

    public VertexConnectivityAlgorithm_getMinimumCut_255970246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term592 = new Integer(597278769);
        term574 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term575 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term576 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term577 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term581 = (int[]) newIntArray(3);
        Object term587 = newInstance(Class.forName("java.util.BitSet"));
        long[] term588 = (long[]) newLongArray(1);
        setField(term574, term574.getClass(), "network", null);
        setField(term576, term576.getClass(), "table", term577);
        setIntField(term576, term576.getClass(), "count", -461771056);
        setIntField(term576, term576.getClass(), "threshold", 15);
        setFloatField(term576, term576.getClass(), "loadFactor", 0.75F);
        setField(term575, term575.getClass(), "posMap", term576);
        setField(term575, term575.getClass(), "graph", null);
        setIntElement(term581, 0, -243422082);
        setIntElement(term581, 1, 1384592638);
        setIntElement(term581, 2, -1002370457);
        setField(term575, term575.getClass(), "vertices", term581);
        setIntField(term575, term575.getClass(), "numVertices", -2014576105);
        setIntField(term575, term575.getClass(), "first", 1296895584);
        setField(term587, term587.getClass(), "words", term588);
        setIntField(term587, term587.getClass(), "wordsInUse", 628918458);
        setBooleanField(term587, term587.getClass(), "sizeIsSticky", false);
        setField(term575, term575.getClass(), "bitset", term587);
        setField(term574, term574.getClass(), "globalMinCut", term575);
        setField(term574, term574.getClass(), "connectivityNumber", term592);
        setBooleanField(term574, term574.getClass(), "computed", true);
        setField(term574, term574.getClass(), "graph", null);
        setBooleanField(term574, term574.getClass(), "directed", false);
        term596 = new Integer(-1274456137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term596;
        callMethod(klass, "getMinimumCut", argTypes, term574, args);
    }

};


