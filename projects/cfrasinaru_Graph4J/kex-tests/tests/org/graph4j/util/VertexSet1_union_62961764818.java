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

public class VertexSet1_union_62961764818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3090;
     Object term3111;

    public VertexSet1_union_62961764818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3090 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term3091 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3092 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3096 = (int[]) newIntArray(7);
        Object term3106 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3107 = (long[]) newLongArray(1);
        setField(term3091, term3091.getClass(), "table", term3092);
        setIntField(term3091, term3091.getClass(), "count", -1549603566);
        setIntField(term3091, term3091.getClass(), "threshold", 15);
        setFloatField(term3091, term3091.getClass(), "loadFactor", 0.75F);
        setField(term3090, term3090.getClass(), "posMap", term3091);
        setField(term3090, term3090.getClass(), "graph", null);
        setIntElement(term3096, 0, 1077223540);
        setIntElement(term3096, 1, -1823813592);
        setIntElement(term3096, 2, -1644358555);
        setIntElement(term3096, 3, -388591034);
        setIntElement(term3096, 4, -1270258033);
        setIntElement(term3096, 5, 1677994069);
        setIntElement(term3096, 6, -439999692);
        setField(term3090, term3090.getClass(), "vertices", term3096);
        setIntField(term3090, term3090.getClass(), "numVertices", 924095007);
        setIntField(term3090, term3090.getClass(), "first", 1302110708);
        setField(term3106, term3106.getClass(), "words", term3107);
        setIntField(term3106, term3106.getClass(), "wordsInUse", 594705497);
        setBooleanField(term3106, term3106.getClass(), "sizeIsSticky", true);
        setField(term3090, term3090.getClass(), "bitset", term3106);
        term3111 = (int[]) newIntArray(6);
        setIntElement(term3111, 0, -600102466);
        setIntElement(term3111, 1, -899986714);
        setIntElement(term3111, 2, 1307244466);
        setIntElement(term3111, 3, -252262096);
        setIntElement(term3111, 4, -37129068);
        setIntElement(term3111, 5, -861014847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3111;
        callMethod(klass, "union", argTypes, term3090, args);
    }

};


