package org.graph4j.metrics;

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
import static org.graph4j.metrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class ParallelExtremaCalculator_calculate_13017599605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2179;

    public ParallelExtremaCalculator_calculate_13017599605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2219 = new Integer(1227103734);
        Integer term2221 = new Integer(-1339778481);
        Class<? extends Object> term2305 = Class.forName((String) "org.graph4j.metrics.ParallelExtremaCalculator$Type");
        Field term2304 = ((Class) term2305).getDeclaredField((String) "CENTER");
        ((Field) term2304).setAccessible(true);
        Object enum6 = ((Field) term2304).get((Object) null);
        term2179 = newInstance(Class.forName("org.graph4j.metrics.ParallelExtremaCalculator"));
        int[] term2184 = (int[]) newIntArray(9);
        int[] term2194 = (int[]) newIntArray(3);
        Object term2198 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2199 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2200 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2204 = (int[]) newIntArray(5);
        Object term2212 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2213 = (long[]) newLongArray(1);
        Object term2223 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2224 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2225 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2229 = (int[]) newIntArray(6);
        Object term2238 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2239 = (long[]) newLongArray(1);
        Object term2243 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2244 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2245 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2249 = (int[]) newIntArray(5);
        Object term2257 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2258 = (long[]) newLongArray(1);
        setIntField(term2179, term2179.getClass(), "radiusLB", -1222006000);
        setIntField(term2179, term2179.getClass(), "radiusUB", 2095798786);
        setIntField(term2179, term2179.getClass(), "diamLB", -1565502840);
        setIntField(term2179, term2179.getClass(), "diamUB", 344323424);
        setIntElement(term2184, 0, 9726679);
        setIntElement(term2184, 1, -25637976);
        setIntElement(term2184, 2, 1555897383);
        setIntElement(term2184, 3, 202001407);
        setIntElement(term2184, 4, 158873461);
        setIntElement(term2184, 5, -430151637);
        setIntElement(term2184, 6, -1697741339);
        setIntElement(term2184, 7, 98922530);
        setIntElement(term2184, 8, -1388471422);
        setField(term2179, term2179.getClass(), "eccLB", term2184);
        setIntElement(term2194, 0, -1498296052);
        setIntElement(term2194, 1, 2098647989);
        setIntElement(term2194, 2, 1598895173);
        setField(term2179, term2179.getClass(), "eccUB", term2194);
        setField(term2199, term2199.getClass(), "table", term2200);
        setIntField(term2199, term2199.getClass(), "count", 1830648570);
        setIntField(term2199, term2199.getClass(), "threshold", 15);
        setFloatField(term2199, term2199.getClass(), "loadFactor", 0.75F);
        setField(term2198, term2198.getClass(), "posMap", term2199);
        setField(term2198, term2198.getClass(), "graph", null);
        setIntElement(term2204, 0, -227365013);
        setIntElement(term2204, 1, 11724947);
        setIntElement(term2204, 2, 1953277050);
        setIntElement(term2204, 3, 1283079251);
        setIntElement(term2204, 4, -523949691);
        setField(term2198, term2198.getClass(), "vertices", term2204);
        setIntField(term2198, term2198.getClass(), "numVertices", 1398204340);
        setIntField(term2198, term2198.getClass(), "first", 229204365);
        setField(term2212, term2212.getClass(), "words", term2213);
        setIntField(term2212, term2212.getClass(), "wordsInUse", -461771056);
        setBooleanField(term2212, term2212.getClass(), "sizeIsSticky", false);
        setField(term2198, term2198.getClass(), "bitset", term2212);
        setField(term2179, term2179.getClass(), "candidates", term2198);
        setBooleanField(term2179, term2179.getClass(), "selector", false);
        setBooleanField(term2179, term2179.getClass(), "connected", false);
        setField(term2179, term2179.getClass(), "radius", term2219);
        setField(term2179, term2179.getClass(), "diameter", term2221);
        setField(term2224, term2224.getClass(), "table", term2225);
        setIntField(term2224, term2224.getClass(), "count", -243422082);
        setIntField(term2224, term2224.getClass(), "threshold", 15);
        setFloatField(term2224, term2224.getClass(), "loadFactor", 0.75F);
        setField(term2223, term2223.getClass(), "posMap", term2224);
        setField(term2223, term2223.getClass(), "graph", null);
        setIntElement(term2229, 0, 1384592638);
        setIntElement(term2229, 1, -1002370457);
        setIntElement(term2229, 2, -2014576105);
        setIntElement(term2229, 3, 1296895584);
        setIntElement(term2229, 4, 628918458);
        setIntElement(term2229, 5, -1274456137);
        setField(term2223, term2223.getClass(), "vertices", term2229);
        setIntField(term2223, term2223.getClass(), "numVertices", 1041916673);
        setIntField(term2223, term2223.getClass(), "first", -601863069);
        setField(term2238, term2238.getClass(), "words", term2239);
        setIntField(term2238, term2238.getClass(), "wordsInUse", 663292551);
        setBooleanField(term2238, term2238.getClass(), "sizeIsSticky", true);
        setField(term2223, term2223.getClass(), "bitset", term2238);
        setField(term2179, term2179.getClass(), "center", term2223);
        setField(term2244, term2244.getClass(), "table", term2245);
        setIntField(term2244, term2244.getClass(), "count", -1885090354);
        setIntField(term2244, term2244.getClass(), "threshold", 15);
        setFloatField(term2244, term2244.getClass(), "loadFactor", 0.75F);
        setField(term2243, term2243.getClass(), "posMap", term2244);
        setField(term2243, term2243.getClass(), "graph", null);
        setIntElement(term2249, 0, -2066804303);
        setIntElement(term2249, 1, -1731761810);
        setIntElement(term2249, 2, 197109649);
        setIntElement(term2249, 3, -1239406390);
        setIntElement(term2249, 4, 1557431527);
        setField(term2243, term2243.getClass(), "vertices", term2249);
        setIntField(term2243, term2243.getClass(), "numVertices", -1504890659);
        setIntField(term2243, term2243.getClass(), "first", 1358829571);
        setField(term2257, term2257.getClass(), "words", term2258);
        setIntField(term2257, term2257.getClass(), "wordsInUse", 991356662);
        setBooleanField(term2257, term2257.getClass(), "sizeIsSticky", true);
        setField(term2243, term2243.getClass(), "bitset", term2257);
        setField(term2179, term2179.getClass(), "periphery", term2243);
        setField(term2179, term2179.getClass(), "extremaType", enum6);
        setField(term2179, term2179.getClass(), "graph", null);
        setBooleanField(term2179, term2179.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculate", argTypes, term2179, args);
    }

};


