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

public class VertexSet1_addDirectly_14179021627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2814;
     Object term2828;

    public VertexSet1_addDirectly_14179021627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2814 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term2815 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2816 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2820 = (int[]) newIntArray(0);
        Object term2823 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2824 = (long[]) newLongArray(1);
        setField(term2815, term2815.getClass(), "table", term2816);
        setIntField(term2815, term2815.getClass(), "count", -1986366126);
        setIntField(term2815, term2815.getClass(), "threshold", 15);
        setFloatField(term2815, term2815.getClass(), "loadFactor", 0.75F);
        setField(term2814, term2814.getClass(), "posMap", term2815);
        setField(term2814, term2814.getClass(), "graph", null);
        setField(term2814, term2814.getClass(), "vertices", term2820);
        setIntField(term2814, term2814.getClass(), "numVertices", -1963228619);
        setIntField(term2814, term2814.getClass(), "first", -709868952);
        setField(term2823, term2823.getClass(), "words", term2824);
        setIntField(term2823, term2823.getClass(), "wordsInUse", 847207929);
        setBooleanField(term2823, term2823.getClass(), "sizeIsSticky", false);
        setField(term2814, term2814.getClass(), "bitset", term2823);
        term2828 = new Integer(-1665928103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2828;
        callMethod(klass, "addDirectly", argTypes, term2814, args);
    }

};


