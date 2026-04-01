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

public class VertexConnectivityAlgorithm_getMaximumDisjointPaths_13777699074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506;
     Object term527;
     Object term529;

    public VertexConnectivityAlgorithm_getMaximumDisjointPaths_13777699074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term523 = new Integer(-883034806);
        term506 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term507 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term508 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term509 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term513 = (int[]) newIntArray(2);
        Object term518 = newInstance(Class.forName("java.util.BitSet"));
        long[] term519 = (long[]) newLongArray(1);
        setField(term506, term506.getClass(), "network", null);
        setField(term508, term508.getClass(), "table", term509);
        setIntField(term508, term508.getClass(), "count", -1565502840);
        setIntField(term508, term508.getClass(), "threshold", 15);
        setFloatField(term508, term508.getClass(), "loadFactor", 0.75F);
        setField(term507, term507.getClass(), "posMap", term508);
        setField(term507, term507.getClass(), "graph", null);
        setIntElement(term513, 0, 344323424);
        setIntElement(term513, 1, 9726679);
        setField(term507, term507.getClass(), "vertices", term513);
        setIntField(term507, term507.getClass(), "numVertices", -25637976);
        setIntField(term507, term507.getClass(), "first", 1555897383);
        setField(term518, term518.getClass(), "words", term519);
        setIntField(term518, term518.getClass(), "wordsInUse", 202001407);
        setBooleanField(term518, term518.getClass(), "sizeIsSticky", true);
        setField(term507, term507.getClass(), "bitset", term518);
        setField(term506, term506.getClass(), "globalMinCut", term507);
        setField(term506, term506.getClass(), "connectivityNumber", term523);
        setBooleanField(term506, term506.getClass(), "computed", true);
        setField(term506, term506.getClass(), "graph", null);
        setBooleanField(term506, term506.getClass(), "directed", true);
        term527 = new Integer(158873461);
        term529 = new Integer(-430151637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term527;
        args[1] = term529;
        callMethod(klass, "getMaximumDisjointPaths", argTypes, term506, args);
    }

};


