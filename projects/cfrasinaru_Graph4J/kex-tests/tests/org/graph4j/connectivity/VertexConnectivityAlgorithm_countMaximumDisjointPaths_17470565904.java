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

public class VertexConnectivityAlgorithm_countMaximumDisjointPaths_17470565904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70580;
     Object term70599;
     Object term70601;

    public VertexConnectivityAlgorithm_countMaximumDisjointPaths_17470565904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term70595 = new Integer(-916584829);
        term70580 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term70581 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term70582 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term70583 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term70587 = (int[]) newIntArray(0);
        Object term70590 = newInstance(Class.forName("java.util.BitSet"));
        long[] term70591 = (long[]) newLongArray(1);
        setField(term70580, term70580.getClass(), "network", null);
        setField(term70582, term70582.getClass(), "table", term70583);
        setIntField(term70582, term70582.getClass(), "count", -581569867);
        setIntField(term70582, term70582.getClass(), "threshold", 15);
        setFloatField(term70582, term70582.getClass(), "loadFactor", 0.75F);
        setField(term70581, term70581.getClass(), "posMap", term70582);
        setField(term70581, term70581.getClass(), "graph", null);
        setField(term70581, term70581.getClass(), "vertices", term70587);
        setIntField(term70581, term70581.getClass(), "numVertices", -987041198);
        setIntField(term70581, term70581.getClass(), "first", 1924660270);
        setField(term70590, term70590.getClass(), "words", term70591);
        setIntField(term70590, term70590.getClass(), "wordsInUse", 716661667);
        setBooleanField(term70590, term70590.getClass(), "sizeIsSticky", true);
        setField(term70581, term70581.getClass(), "bitset", term70590);
        setField(term70580, term70580.getClass(), "globalMinCut", term70581);
        setField(term70580, term70580.getClass(), "connectivityNumber", term70595);
        setBooleanField(term70580, term70580.getClass(), "computed", true);
        setField(term70580, term70580.getClass(), "graph", null);
        setBooleanField(term70580, term70580.getClass(), "directed", true);
        term70599 = new Integer(786893106);
        term70601 = new Integer(137615027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term70599;
        args[1] = term70601;
        callMethod(klass, "countMaximumDisjointPaths", argTypes, term70580, args);
    }

};


