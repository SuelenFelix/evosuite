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

public class VertexConnectivityAlgorithm_getMaximumDisjointPaths_13777699078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70638;
     Object term70666;
     Object term70668;

    public VertexConnectivityAlgorithm_getMaximumDisjointPaths_13777699078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term70662 = new Integer(282916351);
        term70638 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term70639 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term70640 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term70641 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term70645 = (int[]) newIntArray(9);
        Object term70657 = newInstance(Class.forName("java.util.BitSet"));
        long[] term70658 = (long[]) newLongArray(1);
        setField(term70638, term70638.getClass(), "network", null);
        setField(term70640, term70640.getClass(), "table", term70641);
        setIntField(term70640, term70640.getClass(), "count", 996710213);
        setIntField(term70640, term70640.getClass(), "threshold", 15);
        setFloatField(term70640, term70640.getClass(), "loadFactor", 0.75F);
        setField(term70639, term70639.getClass(), "posMap", term70640);
        setField(term70639, term70639.getClass(), "graph", null);
        setIntElement(term70645, 0, -1618090161);
        setIntElement(term70645, 1, 1629570081);
        setIntElement(term70645, 2, -2032841320);
        setIntElement(term70645, 3, -402431218);
        setIntElement(term70645, 4, -1895304212);
        setIntElement(term70645, 5, -1451313019);
        setIntElement(term70645, 6, -2084270378);
        setIntElement(term70645, 7, -1060897638);
        setIntElement(term70645, 8, 138174044);
        setField(term70639, term70639.getClass(), "vertices", term70645);
        setIntField(term70639, term70639.getClass(), "numVertices", 2098822004);
        setIntField(term70639, term70639.getClass(), "first", 1036909188);
        setField(term70657, term70657.getClass(), "words", term70658);
        setIntField(term70657, term70657.getClass(), "wordsInUse", -665756018);
        setBooleanField(term70657, term70657.getClass(), "sizeIsSticky", false);
        setField(term70639, term70639.getClass(), "bitset", term70657);
        setField(term70638, term70638.getClass(), "globalMinCut", term70639);
        setField(term70638, term70638.getClass(), "connectivityNumber", term70662);
        setBooleanField(term70638, term70638.getClass(), "computed", false);
        setField(term70638, term70638.getClass(), "graph", null);
        setBooleanField(term70638, term70638.getClass(), "directed", false);
        term70666 = new Integer(-917715223);
        term70668 = new Integer(-1308205647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term70666;
        args[1] = term70668;
        callMethod(klass, "getMaximumDisjointPaths", argTypes, term70638, args);
    }

};


