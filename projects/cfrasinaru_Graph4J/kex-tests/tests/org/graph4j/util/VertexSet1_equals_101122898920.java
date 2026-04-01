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

public class VertexSet1_equals_101122898920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71792;
     Object term71806;

    public VertexSet1_equals_101122898920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71792 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71793 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71794 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71798 = (int[]) newIntArray(0);
        Object term71801 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71802 = (long[]) newLongArray(1);
        setField(term71793, term71793.getClass(), "table", term71794);
        setIntField(term71793, term71793.getClass(), "count", 1527144504);
        setIntField(term71793, term71793.getClass(), "threshold", 15);
        setFloatField(term71793, term71793.getClass(), "loadFactor", 0.75F);
        setField(term71792, term71792.getClass(), "posMap", term71793);
        setField(term71792, term71792.getClass(), "graph", null);
        setField(term71792, term71792.getClass(), "vertices", term71798);
        setIntField(term71792, term71792.getClass(), "numVertices", -305521619);
        setIntField(term71792, term71792.getClass(), "first", 1558553527);
        setField(term71801, term71801.getClass(), "words", term71802);
        setIntField(term71801, term71801.getClass(), "wordsInUse", 1188990535);
        setBooleanField(term71801, term71801.getClass(), "sizeIsSticky", false);
        setField(term71792, term71792.getClass(), "bitset", term71801);
        term71806 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term71806;
        callMethod(klass, "equals", argTypes, term71792, args);
    }

};


