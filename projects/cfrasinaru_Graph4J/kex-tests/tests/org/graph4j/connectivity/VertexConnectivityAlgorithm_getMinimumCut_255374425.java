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

public class VertexConnectivityAlgorithm_getMinimumCut_255374425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534;
     Object term561;
     Object term563;

    public VertexConnectivityAlgorithm_getMinimumCut_255374425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term557 = new Integer(1585847225);
        term534 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term535 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term536 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term537 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term541 = (int[]) newIntArray(8);
        Object term552 = newInstance(Class.forName("java.util.BitSet"));
        long[] term553 = (long[]) newLongArray(1);
        setField(term534, term534.getClass(), "network", null);
        setField(term536, term536.getClass(), "table", term537);
        setIntField(term536, term536.getClass(), "count", -1697741339);
        setIntField(term536, term536.getClass(), "threshold", 15);
        setFloatField(term536, term536.getClass(), "loadFactor", 0.75F);
        setField(term535, term535.getClass(), "posMap", term536);
        setField(term535, term535.getClass(), "graph", null);
        setIntElement(term541, 0, 98922530);
        setIntElement(term541, 1, -1388471422);
        setIntElement(term541, 2, -1498296052);
        setIntElement(term541, 3, 2098647989);
        setIntElement(term541, 4, 1598895173);
        setIntElement(term541, 5, 1830648570);
        setIntElement(term541, 6, -227365013);
        setIntElement(term541, 7, 11724947);
        setField(term535, term535.getClass(), "vertices", term541);
        setIntField(term535, term535.getClass(), "numVertices", 1953277050);
        setIntField(term535, term535.getClass(), "first", 1283079251);
        setField(term552, term552.getClass(), "words", term553);
        setIntField(term552, term552.getClass(), "wordsInUse", -523949691);
        setBooleanField(term552, term552.getClass(), "sizeIsSticky", false);
        setField(term535, term535.getClass(), "bitset", term552);
        setField(term534, term534.getClass(), "globalMinCut", term535);
        setField(term534, term534.getClass(), "connectivityNumber", term557);
        setBooleanField(term534, term534.getClass(), "computed", true);
        setField(term534, term534.getClass(), "graph", null);
        setBooleanField(term534, term534.getClass(), "directed", false);
        term561 = new Integer(1398204340);
        term563 = new Integer(229204365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term561;
        args[1] = term563;
        callMethod(klass, "getMinimumCut", argTypes, term534, args);
    }

};


