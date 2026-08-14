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

public class VertexSet_addAll_13186285268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8101;
     Object term8117;

    public VertexSet_addAll_13186285268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8101 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8102 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8103 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8107 = (int[]) newIntArray(2);
        Object term8112 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8113 = (long[]) newLongArray(1);
        setField(term8102, term8102.getClass(), "table", term8103);
        setIntField(term8102, term8102.getClass(), "count", 2130990985);
        setIntField(term8102, term8102.getClass(), "threshold", 15);
        setFloatField(term8102, term8102.getClass(), "loadFactor", 0.75F);
        setField(term8101, term8101.getClass(), "posMap", term8102);
        setField(term8101, term8101.getClass(), "graph", null);
        setIntElement(term8107, 0, 523197189);
        setIntElement(term8107, 1, 658684460);
        setField(term8101, term8101.getClass(), "vertices", term8107);
        setIntField(term8101, term8101.getClass(), "numVertices", 2073367039);
        setIntField(term8101, term8101.getClass(), "first", -365877126);
        setField(term8112, term8112.getClass(), "words", term8113);
        setIntField(term8112, term8112.getClass(), "wordsInUse", 251018856);
        setBooleanField(term8112, term8112.getClass(), "sizeIsSticky", false);
        setField(term8101, term8101.getClass(), "bitset", term8112);
        term8117 = (int[]) newIntArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8117;
        callMethod(klass, "addAll", argTypes, term8101, args);
    }

};


