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

public class VertexConnectivityAlgorithm_createNetwork_3698996932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70541;

    public VertexConnectivityAlgorithm_createNetwork_3698996932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term70564 = new Integer(937859191);
        term70541 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term70542 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term70543 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term70544 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term70548 = (int[]) newIntArray(8);
        Object term70559 = newInstance(Class.forName("java.util.BitSet"));
        long[] term70560 = (long[]) newLongArray(1);
        setField(term70541, term70541.getClass(), "network", null);
        setField(term70543, term70543.getClass(), "table", term70544);
        setIntField(term70543, term70543.getClass(), "count", 710697959);
        setIntField(term70543, term70543.getClass(), "threshold", 15);
        setFloatField(term70543, term70543.getClass(), "loadFactor", 0.75F);
        setField(term70542, term70542.getClass(), "posMap", term70543);
        setField(term70542, term70542.getClass(), "graph", null);
        setIntElement(term70548, 0, -647347437);
        setIntElement(term70548, 1, 658084221);
        setIntElement(term70548, 2, -1984593436);
        setIntElement(term70548, 3, -1366169312);
        setIntElement(term70548, 4, 917532658);
        setIntElement(term70548, 5, -906225721);
        setIntElement(term70548, 6, 1029803622);
        setIntElement(term70548, 7, 1547718184);
        setField(term70542, term70542.getClass(), "vertices", term70548);
        setIntField(term70542, term70542.getClass(), "numVertices", 1882154507);
        setIntField(term70542, term70542.getClass(), "first", -1930761887);
        setField(term70559, term70559.getClass(), "words", term70560);
        setIntField(term70559, term70559.getClass(), "wordsInUse", 1426685210);
        setBooleanField(term70559, term70559.getClass(), "sizeIsSticky", true);
        setField(term70542, term70542.getClass(), "bitset", term70559);
        setField(term70541, term70541.getClass(), "globalMinCut", term70542);
        setField(term70541, term70541.getClass(), "connectivityNumber", term70564);
        setBooleanField(term70541, term70541.getClass(), "computed", false);
        setField(term70541, term70541.getClass(), "graph", null);
        setBooleanField(term70541, term70541.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createNetwork", argTypes, term70541, args);
    }

};


