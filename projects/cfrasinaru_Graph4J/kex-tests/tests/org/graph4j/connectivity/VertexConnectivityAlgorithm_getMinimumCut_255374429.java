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

public class VertexConnectivityAlgorithm_getMinimumCut_255374429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70680;
     Object term70701;
     Object term70703;

    public VertexConnectivityAlgorithm_getMinimumCut_255374429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term70697 = new Integer(880977281);
        term70680 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term70681 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term70682 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term70683 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term70687 = (int[]) newIntArray(2);
        Object term70692 = newInstance(Class.forName("java.util.BitSet"));
        long[] term70693 = (long[]) newLongArray(1);
        setField(term70680, term70680.getClass(), "network", null);
        setField(term70682, term70682.getClass(), "table", term70683);
        setIntField(term70682, term70682.getClass(), "count", -293681660);
        setIntField(term70682, term70682.getClass(), "threshold", 15);
        setFloatField(term70682, term70682.getClass(), "loadFactor", 0.75F);
        setField(term70681, term70681.getClass(), "posMap", term70682);
        setField(term70681, term70681.getClass(), "graph", null);
        setIntElement(term70687, 0, 2040935639);
        setIntElement(term70687, 1, 1434805834);
        setField(term70681, term70681.getClass(), "vertices", term70687);
        setIntField(term70681, term70681.getClass(), "numVertices", 1559405645);
        setIntField(term70681, term70681.getClass(), "first", -2142714269);
        setField(term70692, term70692.getClass(), "words", term70693);
        setIntField(term70692, term70692.getClass(), "wordsInUse", -1679293747);
        setBooleanField(term70692, term70692.getClass(), "sizeIsSticky", false);
        setField(term70681, term70681.getClass(), "bitset", term70692);
        setField(term70680, term70680.getClass(), "globalMinCut", term70681);
        setField(term70680, term70680.getClass(), "connectivityNumber", term70697);
        setBooleanField(term70680, term70680.getClass(), "computed", false);
        setField(term70680, term70680.getClass(), "graph", null);
        setBooleanField(term70680, term70680.getClass(), "directed", true);
        term70701 = new Integer(-177429775);
        term70703 = new Integer(1499469166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term70701;
        args[1] = term70703;
        callMethod(klass, "getMinimumCut", argTypes, term70680, args);
    }

};


