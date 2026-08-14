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
import java.lang.Integer;

public class VertexSet1_add_15698332566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2787;
     Object term2806;

    public VertexSet1_add_15698332566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2787 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term2788 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2789 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2793 = (int[]) newIntArray(5);
        Object term2801 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2802 = (long[]) newLongArray(1);
        setField(term2788, term2788.getClass(), "table", term2789);
        setIntField(term2788, term2788.getClass(), "count", -1389314671);
        setIntField(term2788, term2788.getClass(), "threshold", 15);
        setFloatField(term2788, term2788.getClass(), "loadFactor", 0.75F);
        setField(term2787, term2787.getClass(), "posMap", term2788);
        setField(term2787, term2787.getClass(), "graph", null);
        setIntElement(term2793, 0, -499699841);
        setIntElement(term2793, 1, 360972386);
        setIntElement(term2793, 2, -2063884849);
        setIntElement(term2793, 3, 1054887169);
        setIntElement(term2793, 4, 692873905);
        setField(term2787, term2787.getClass(), "vertices", term2793);
        setIntField(term2787, term2787.getClass(), "numVertices", 1734759369);
        setIntField(term2787, term2787.getClass(), "first", 1841493736);
        setField(term2801, term2801.getClass(), "words", term2802);
        setIntField(term2801, term2801.getClass(), "wordsInUse", 320739944);
        setBooleanField(term2801, term2801.getClass(), "sizeIsSticky", true);
        setField(term2787, term2787.getClass(), "bitset", term2801);
        term2806 = new Integer(760218111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2806;
        callMethod(klass, "add", argTypes, term2787, args);
    }

};


