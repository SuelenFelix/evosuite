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

public class VertexConnectivityAlgorithm_getMinimumCut_2559702410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70708;
     Object term70735;

    public VertexConnectivityAlgorithm_getMinimumCut_2559702410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term70731 = new Integer(371943306);
        term70708 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term70709 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term70710 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term70711 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term70715 = (int[]) newIntArray(8);
        Object term70726 = newInstance(Class.forName("java.util.BitSet"));
        long[] term70727 = (long[]) newLongArray(1);
        setField(term70708, term70708.getClass(), "network", null);
        setField(term70710, term70710.getClass(), "table", term70711);
        setIntField(term70710, term70710.getClass(), "count", 1077671885);
        setIntField(term70710, term70710.getClass(), "threshold", 15);
        setFloatField(term70710, term70710.getClass(), "loadFactor", 0.75F);
        setField(term70709, term70709.getClass(), "posMap", term70710);
        setField(term70709, term70709.getClass(), "graph", null);
        setIntElement(term70715, 0, -1257764971);
        setIntElement(term70715, 1, 916858785);
        setIntElement(term70715, 2, -334590639);
        setIntElement(term70715, 3, -1198749630);
        setIntElement(term70715, 4, 677610694);
        setIntElement(term70715, 5, 1557679938);
        setIntElement(term70715, 6, 855334801);
        setIntElement(term70715, 7, 1952602505);
        setField(term70709, term70709.getClass(), "vertices", term70715);
        setIntField(term70709, term70709.getClass(), "numVertices", 2043628366);
        setIntField(term70709, term70709.getClass(), "first", 408680952);
        setField(term70726, term70726.getClass(), "words", term70727);
        setIntField(term70726, term70726.getClass(), "wordsInUse", -1373697880);
        setBooleanField(term70726, term70726.getClass(), "sizeIsSticky", false);
        setField(term70709, term70709.getClass(), "bitset", term70726);
        setField(term70708, term70708.getClass(), "globalMinCut", term70709);
        setField(term70708, term70708.getClass(), "connectivityNumber", term70731);
        setBooleanField(term70708, term70708.getClass(), "computed", false);
        setField(term70708, term70708.getClass(), "graph", null);
        setBooleanField(term70708, term70708.getClass(), "directed", false);
        term70735 = new Integer(-1010160027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70735;
        callMethod(klass, "getMinimumCut", argTypes, term70708, args);
    }

};


