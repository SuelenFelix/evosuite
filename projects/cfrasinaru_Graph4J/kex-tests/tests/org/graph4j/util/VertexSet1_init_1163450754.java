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

public class VertexSet1_init_1163450754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2737;

    public VertexSet1_init_1163450754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2737 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term2738 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2739 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2743 = (int[]) newIntArray(1);
        Object term2747 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2748 = (long[]) newLongArray(1);
        setField(term2738, term2738.getClass(), "table", term2739);
        setIntField(term2738, term2738.getClass(), "count", -33436796);
        setIntField(term2738, term2738.getClass(), "threshold", 15);
        setFloatField(term2738, term2738.getClass(), "loadFactor", 0.75F);
        setField(term2737, term2737.getClass(), "posMap", term2738);
        setField(term2737, term2737.getClass(), "graph", null);
        setIntElement(term2743, 0, -1527326823);
        setField(term2737, term2737.getClass(), "vertices", term2743);
        setIntField(term2737, term2737.getClass(), "numVertices", 469871899);
        setIntField(term2737, term2737.getClass(), "first", -1348703436);
        setField(term2747, term2747.getClass(), "words", term2748);
        setIntField(term2747, term2747.getClass(), "wordsInUse", -2027012650);
        setBooleanField(term2747, term2747.getClass(), "sizeIsSticky", true);
        setField(term2737, term2737.getClass(), "bitset", term2747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet1");
        Object[] args = new Object[1];
        args[0] = term2737;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


