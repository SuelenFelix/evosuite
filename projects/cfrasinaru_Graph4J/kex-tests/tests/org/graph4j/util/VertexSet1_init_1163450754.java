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
     Object term71358;

    public VertexSet1_init_1163450754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71358 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71359 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71360 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71364 = (int[]) newIntArray(7);
        Object term71374 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71375 = (long[]) newLongArray(1);
        setField(term71359, term71359.getClass(), "table", term71360);
        setIntField(term71359, term71359.getClass(), "count", -777621571);
        setIntField(term71359, term71359.getClass(), "threshold", 15);
        setFloatField(term71359, term71359.getClass(), "loadFactor", 0.75F);
        setField(term71358, term71358.getClass(), "posMap", term71359);
        setField(term71358, term71358.getClass(), "graph", null);
        setIntElement(term71364, 0, -1228407222);
        setIntElement(term71364, 1, -138743806);
        setIntElement(term71364, 2, 1701079619);
        setIntElement(term71364, 3, -1822505135);
        setIntElement(term71364, 4, 1664287048);
        setIntElement(term71364, 5, 877573537);
        setIntElement(term71364, 6, -785822775);
        setField(term71358, term71358.getClass(), "vertices", term71364);
        setIntField(term71358, term71358.getClass(), "numVertices", -1481927507);
        setIntField(term71358, term71358.getClass(), "first", -1877062491);
        setField(term71374, term71374.getClass(), "words", term71375);
        setIntField(term71374, term71374.getClass(), "wordsInUse", 807661218);
        setBooleanField(term71374, term71374.getClass(), "sizeIsSticky", true);
        setField(term71358, term71358.getClass(), "bitset", term71374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet1");
        Object[] args = new Object[1];
        args[0] = term71358;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


