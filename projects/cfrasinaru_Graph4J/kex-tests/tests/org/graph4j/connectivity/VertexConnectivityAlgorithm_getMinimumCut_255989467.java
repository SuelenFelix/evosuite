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

public class VertexConnectivityAlgorithm_getMinimumCut_255989467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602;

    public VertexConnectivityAlgorithm_getMinimumCut_255989467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term623 = new Integer(-1685132342);
        term602 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term603 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term604 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term605 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term609 = (int[]) newIntArray(6);
        Object term618 = newInstance(Class.forName("java.util.BitSet"));
        long[] term619 = (long[]) newLongArray(1);
        setField(term602, term602.getClass(), "network", null);
        setField(term604, term604.getClass(), "table", term605);
        setIntField(term604, term604.getClass(), "count", 1041916673);
        setIntField(term604, term604.getClass(), "threshold", 15);
        setFloatField(term604, term604.getClass(), "loadFactor", 0.75F);
        setField(term603, term603.getClass(), "posMap", term604);
        setField(term603, term603.getClass(), "graph", null);
        setIntElement(term609, 0, -601863069);
        setIntElement(term609, 1, 663292551);
        setIntElement(term609, 2, -1885090354);
        setIntElement(term609, 3, -2066804303);
        setIntElement(term609, 4, -1731761810);
        setIntElement(term609, 5, 197109649);
        setField(term603, term603.getClass(), "vertices", term609);
        setIntField(term603, term603.getClass(), "numVertices", -1239406390);
        setIntField(term603, term603.getClass(), "first", 1557431527);
        setField(term618, term618.getClass(), "words", term619);
        setIntField(term618, term618.getClass(), "wordsInUse", -1504890659);
        setBooleanField(term618, term618.getClass(), "sizeIsSticky", true);
        setField(term603, term603.getClass(), "bitset", term618);
        setField(term602, term602.getClass(), "globalMinCut", term603);
        setField(term602, term602.getClass(), "connectivityNumber", term623);
        setBooleanField(term602, term602.getClass(), "computed", false);
        setField(term602, term602.getClass(), "graph", null);
        setBooleanField(term602, term602.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCut", argTypes, term602, args);
    }

};


