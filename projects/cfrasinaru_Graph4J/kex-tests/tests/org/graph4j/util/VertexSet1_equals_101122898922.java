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

public class VertexSet1_equals_101122898922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71800;
     Object term71814;

    public VertexSet1_equals_101122898922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71800 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71801 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71802 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71806 = (int[]) newIntArray(0);
        Object term71809 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71810 = (long[]) newLongArray(1);
        setField(term71801, term71801.getClass(), "table", term71802);
        setIntField(term71801, term71801.getClass(), "count", 1527144504);
        setIntField(term71801, term71801.getClass(), "threshold", 15);
        setFloatField(term71801, term71801.getClass(), "loadFactor", 0.75F);
        setField(term71800, term71800.getClass(), "posMap", term71801);
        setField(term71800, term71800.getClass(), "graph", null);
        setField(term71800, term71800.getClass(), "vertices", term71806);
        setIntField(term71800, term71800.getClass(), "numVertices", -305521619);
        setIntField(term71800, term71800.getClass(), "first", 1558553527);
        setField(term71809, term71809.getClass(), "words", term71810);
        setIntField(term71809, term71809.getClass(), "wordsInUse", 1188990535);
        setBooleanField(term71809, term71809.getClass(), "sizeIsSticky", false);
        setField(term71800, term71800.getClass(), "bitset", term71809);
        term71814 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term71814;
        callMethod(klass, "equals", argTypes, term71800, args);
    }

};


