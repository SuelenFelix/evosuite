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

public class VertexConnectivityAlgorithm_countMaximumDisjointPaths_17469970083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472;
     Object term497;

    public VertexConnectivityAlgorithm_countMaximumDisjointPaths_17469970083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term493 = new Integer(1134449235);
        term472 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term473 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term474 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term475 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term479 = (int[]) newIntArray(6);
        Object term488 = newInstance(Class.forName("java.util.BitSet"));
        long[] term489 = (long[]) newLongArray(1);
        setField(term472, term472.getClass(), "network", null);
        setField(term474, term474.getClass(), "table", term475);
        setIntField(term474, term474.getClass(), "count", 538259104);
        setIntField(term474, term474.getClass(), "threshold", 15);
        setFloatField(term474, term474.getClass(), "loadFactor", 0.75F);
        setField(term473, term473.getClass(), "posMap", term474);
        setField(term473, term473.getClass(), "graph", null);
        setIntElement(term479, 0, 96566506);
        setIntElement(term479, 1, -343325701);
        setIntElement(term479, 2, 107945604);
        setIntElement(term479, 3, -1963464809);
        setIntElement(term479, 4, 71190297);
        setIntElement(term479, 5, 1202361360);
        setField(term473, term473.getClass(), "vertices", term479);
        setIntField(term473, term473.getClass(), "numVertices", -2015048153);
        setIntField(term473, term473.getClass(), "first", -2063457669);
        setField(term488, term488.getClass(), "words", term489);
        setIntField(term488, term488.getClass(), "wordsInUse", -1222006000);
        setBooleanField(term488, term488.getClass(), "sizeIsSticky", true);
        setField(term473, term473.getClass(), "bitset", term488);
        setField(term472, term472.getClass(), "globalMinCut", term473);
        setField(term472, term472.getClass(), "connectivityNumber", term493);
        setBooleanField(term472, term472.getClass(), "computed", true);
        setField(term472, term472.getClass(), "graph", null);
        setBooleanField(term472, term472.getClass(), "directed", false);
        term497 = new Integer(2095798786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term497;
        callMethod(klass, "countMaximumDisjointPaths", argTypes, term472, args);
    }

};


