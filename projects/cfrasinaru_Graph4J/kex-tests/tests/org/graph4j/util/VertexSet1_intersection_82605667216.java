package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class VertexSet1_intersection_82605667216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3026;
     Object term3042;

    public VertexSet1_intersection_82605667216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3026 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term3027 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3028 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3032 = (int[]) newIntArray(2);
        Object term3037 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3038 = (long[]) newLongArray(1);
        setField(term3027, term3027.getClass(), "table", term3028);
        setIntField(term3027, term3027.getClass(), "count", 1498738343);
        setIntField(term3027, term3027.getClass(), "threshold", 15);
        setFloatField(term3027, term3027.getClass(), "loadFactor", 0.75F);
        setField(term3026, term3026.getClass(), "posMap", term3027);
        setField(term3026, term3026.getClass(), "graph", null);
        setIntElement(term3032, 0, -1635571857);
        setIntElement(term3032, 1, 1407309162);
        setField(term3026, term3026.getClass(), "vertices", term3032);
        setIntField(term3026, term3026.getClass(), "numVertices", -534033672);
        setIntField(term3026, term3026.getClass(), "first", -1162790806);
        setField(term3037, term3037.getClass(), "words", term3038);
        setIntField(term3037, term3037.getClass(), "wordsInUse", -1264595049);
        setBooleanField(term3037, term3037.getClass(), "sizeIsSticky", true);
        setField(term3026, term3026.getClass(), "bitset", term3037);
        term3042 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term3043 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3044 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3048 = (int[]) newIntArray(5);
        Object term3056 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3057 = (long[]) newLongArray(1);
        setField(term3043, term3043.getClass(), "table", term3044);
        setIntField(term3043, term3043.getClass(), "count", -2058884635);
        setIntField(term3043, term3043.getClass(), "threshold", 15);
        setFloatField(term3043, term3043.getClass(), "loadFactor", 0.75F);
        setField(term3042, term3042.getClass(), "posMap", term3043);
        setField(term3042, term3042.getClass(), "graph", null);
        setIntElement(term3048, 0, 1064185088);
        setIntElement(term3048, 1, -1249782654);
        setIntElement(term3048, 2, 399302934);
        setIntElement(term3048, 3, -1823255084);
        setIntElement(term3048, 4, 793345010);
        setField(term3042, term3042.getClass(), "vertices", term3048);
        setIntField(term3042, term3042.getClass(), "numVertices", -2092117838);
        setIntField(term3042, term3042.getClass(), "first", 1524590776);
        setField(term3056, term3056.getClass(), "words", term3057);
        setIntField(term3056, term3056.getClass(), "wordsInUse", 1523896653);
        setBooleanField(term3056, term3056.getClass(), "sizeIsSticky", false);
        setField(term3042, term3042.getClass(), "bitset", term3056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet1");
        Object[] args = new Object[1];
        args[0] = term3042;
        callMethod(klass, "intersection", argTypes, term3026, args);
    }

};


