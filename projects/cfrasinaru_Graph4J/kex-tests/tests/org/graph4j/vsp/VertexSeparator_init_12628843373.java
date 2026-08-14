package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class VertexSeparator_init_12628843373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3061;
     Object term3082;
     Object term3104;

    public VertexSeparator_init_12628843373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3061 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3062 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3063 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3067 = (int[]) newIntArray(7);
        Object term3077 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3078 = (long[]) newLongArray(1);
        setField(term3062, term3062.getClass(), "table", term3063);
        setIntField(term3062, term3062.getClass(), "count", -1161206731);
        setIntField(term3062, term3062.getClass(), "threshold", 15);
        setFloatField(term3062, term3062.getClass(), "loadFactor", 0.75F);
        setField(term3061, term3061.getClass(), "posMap", term3062);
        setField(term3061, term3061.getClass(), "graph", null);
        setIntElement(term3067, 0, -992847709);
        setIntElement(term3067, 1, 1125156671);
        setIntElement(term3067, 2, 1203107925);
        setIntElement(term3067, 3, 1825448944);
        setIntElement(term3067, 4, 1769496642);
        setIntElement(term3067, 5, -947460705);
        setIntElement(term3067, 6, -1435758764);
        setField(term3061, term3061.getClass(), "vertices", term3067);
        setIntField(term3061, term3061.getClass(), "numVertices", 752858379);
        setIntField(term3061, term3061.getClass(), "first", -370819357);
        setField(term3077, term3077.getClass(), "words", term3078);
        setIntField(term3077, term3077.getClass(), "wordsInUse", -71819242);
        setBooleanField(term3077, term3077.getClass(), "sizeIsSticky", true);
        setField(term3061, term3061.getClass(), "bitset", term3077);
        term3082 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3083 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3084 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3088 = (int[]) newIntArray(8);
        Object term3099 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3100 = (long[]) newLongArray(1);
        setField(term3083, term3083.getClass(), "table", term3084);
        setIntField(term3083, term3083.getClass(), "count", 1268893136);
        setIntField(term3083, term3083.getClass(), "threshold", 15);
        setFloatField(term3083, term3083.getClass(), "loadFactor", 0.75F);
        setField(term3082, term3082.getClass(), "posMap", term3083);
        setField(term3082, term3082.getClass(), "graph", null);
        setIntElement(term3088, 0, -1472700822);
        setIntElement(term3088, 1, 1626670889);
        setIntElement(term3088, 2, -2117361140);
        setIntElement(term3088, 3, 407708341);
        setIntElement(term3088, 4, -287519200);
        setIntElement(term3088, 5, -1490696181);
        setIntElement(term3088, 6, 623717232);
        setIntElement(term3088, 7, -1413291732);
        setField(term3082, term3082.getClass(), "vertices", term3088);
        setIntField(term3082, term3082.getClass(), "numVertices", 203264365);
        setIntField(term3082, term3082.getClass(), "first", -1066281036);
        setField(term3099, term3099.getClass(), "words", term3100);
        setIntField(term3099, term3099.getClass(), "wordsInUse", 30837706);
        setBooleanField(term3099, term3099.getClass(), "sizeIsSticky", true);
        setField(term3082, term3082.getClass(), "bitset", term3099);
        term3104 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3105 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3106 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3110 = (int[]) newIntArray(4);
        Object term3117 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3118 = (long[]) newLongArray(1);
        setField(term3105, term3105.getClass(), "table", term3106);
        setIntField(term3105, term3105.getClass(), "count", 379523101);
        setIntField(term3105, term3105.getClass(), "threshold", 15);
        setFloatField(term3105, term3105.getClass(), "loadFactor", 0.75F);
        setField(term3104, term3104.getClass(), "posMap", term3105);
        setField(term3104, term3104.getClass(), "graph", null);
        setIntElement(term3110, 0, 1017354215);
        setIntElement(term3110, 1, 695330987);
        setIntElement(term3110, 2, -267289967);
        setIntElement(term3110, 3, 773432822);
        setField(term3104, term3104.getClass(), "vertices", term3110);
        setIntField(term3104, term3104.getClass(), "numVertices", -488294922);
        setIntField(term3104, term3104.getClass(), "first", -397161164);
        setField(term3117, term3117.getClass(), "words", term3118);
        setIntField(term3117, term3117.getClass(), "wordsInUse", -703717191);
        setBooleanField(term3117, term3117.getClass(), "sizeIsSticky", true);
        setField(term3104, term3104.getClass(), "bitset", term3117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        argTypes[1] = Class.forName("org.graph4j.util.VertexSet");
        argTypes[2] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[3];
        args[0] = term3061;
        args[1] = term3082;
        args[2] = term3104;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


