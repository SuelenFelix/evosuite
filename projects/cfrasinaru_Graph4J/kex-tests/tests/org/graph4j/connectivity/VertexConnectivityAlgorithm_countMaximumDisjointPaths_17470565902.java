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

public class VertexConnectivityAlgorithm_countMaximumDisjointPaths_17470565902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432;
     Object term459;
     Object term461;

    public VertexConnectivityAlgorithm_countMaximumDisjointPaths_17470565902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term455 = new Integer(-522618178);
        term432 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term433 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term434 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term435 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term439 = (int[]) newIntArray(8);
        Object term450 = newInstance(Class.forName("java.util.BitSet"));
        long[] term451 = (long[]) newLongArray(1);
        setField(term432, term432.getClass(), "network", null);
        setField(term434, term434.getClass(), "table", term435);
        setIntField(term434, term434.getClass(), "count", -1963434938);
        setIntField(term434, term434.getClass(), "threshold", 15);
        setFloatField(term434, term434.getClass(), "loadFactor", 0.75F);
        setField(term433, term433.getClass(), "posMap", term434);
        setField(term433, term433.getClass(), "graph", null);
        setIntElement(term439, 0, 906181092);
        setIntElement(term439, 1, 1045657203);
        setIntElement(term439, 2, 1386130016);
        setIntElement(term439, 3, 1072005683);
        setIntElement(term439, 4, 1861318859);
        setIntElement(term439, 5, 1474524152);
        setIntElement(term439, 6, 568954359);
        setIntElement(term439, 7, 53410913);
        setField(term433, term433.getClass(), "vertices", term439);
        setIntField(term433, term433.getClass(), "numVertices", -375014958);
        setIntField(term433, term433.getClass(), "first", 1107176718);
        setField(term450, term450.getClass(), "words", term451);
        setIntField(term450, term450.getClass(), "wordsInUse", 480137250);
        setBooleanField(term450, term450.getClass(), "sizeIsSticky", false);
        setField(term433, term433.getClass(), "bitset", term450);
        setField(term432, term432.getClass(), "globalMinCut", term433);
        setField(term432, term432.getClass(), "connectivityNumber", term455);
        setBooleanField(term432, term432.getClass(), "computed", false);
        setField(term432, term432.getClass(), "graph", null);
        setBooleanField(term432, term432.getClass(), "directed", false);
        term459 = new Integer(-341152642);
        term461 = new Integer(-2015854073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term459;
        args[1] = term461;
        callMethod(klass, "countMaximumDisjointPaths", argTypes, term432, args);
    }

};


