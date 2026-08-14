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

public class VertexConnectivityAlgorithm_getMinimumCut_2559894611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70746;

    public VertexConnectivityAlgorithm_getMinimumCut_2559894611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term70761 = new Integer(982388293);
        term70746 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term70747 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term70748 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term70749 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term70753 = (int[]) newIntArray(0);
        Object term70756 = newInstance(Class.forName("java.util.BitSet"));
        long[] term70757 = (long[]) newLongArray(1);
        setField(term70746, term70746.getClass(), "network", null);
        setField(term70748, term70748.getClass(), "table", term70749);
        setIntField(term70748, term70748.getClass(), "count", 768914070);
        setIntField(term70748, term70748.getClass(), "threshold", 15);
        setFloatField(term70748, term70748.getClass(), "loadFactor", 0.75F);
        setField(term70747, term70747.getClass(), "posMap", term70748);
        setField(term70747, term70747.getClass(), "graph", null);
        setField(term70747, term70747.getClass(), "vertices", term70753);
        setIntField(term70747, term70747.getClass(), "numVertices", -747888783);
        setIntField(term70747, term70747.getClass(), "first", -1751780426);
        setField(term70756, term70756.getClass(), "words", term70757);
        setIntField(term70756, term70756.getClass(), "wordsInUse", 795866886);
        setBooleanField(term70756, term70756.getClass(), "sizeIsSticky", true);
        setField(term70747, term70747.getClass(), "bitset", term70756);
        setField(term70746, term70746.getClass(), "globalMinCut", term70747);
        setField(term70746, term70746.getClass(), "connectivityNumber", term70761);
        setBooleanField(term70746, term70746.getClass(), "computed", true);
        setField(term70746, term70746.getClass(), "graph", null);
        setBooleanField(term70746, term70746.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCut", argTypes, term70746, args);
    }

};


