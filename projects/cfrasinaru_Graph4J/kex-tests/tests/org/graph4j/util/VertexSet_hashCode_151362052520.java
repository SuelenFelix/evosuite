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

public class VertexSet_hashCode_151362052520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150527;

    public VertexSet_hashCode_151362052520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150527 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150528 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150529 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150533 = (int[]) newIntArray(4);
        Object term150540 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150541 = (long[]) newLongArray(1);
        setField(term150528, term150528.getClass(), "table", term150529);
        setIntField(term150528, term150528.getClass(), "count", -378451635);
        setIntField(term150528, term150528.getClass(), "threshold", 15);
        setFloatField(term150528, term150528.getClass(), "loadFactor", 0.75F);
        setField(term150527, term150527.getClass(), "posMap", term150528);
        setField(term150527, term150527.getClass(), "graph", null);
        setIntElement(term150533, 0, -46024914);
        setIntElement(term150533, 1, 1870381148);
        setIntElement(term150533, 2, -892136470);
        setIntElement(term150533, 3, 870699133);
        setField(term150527, term150527.getClass(), "vertices", term150533);
        setIntField(term150527, term150527.getClass(), "numVertices", -77954389);
        setIntField(term150527, term150527.getClass(), "first", -1057148061);
        setField(term150540, term150540.getClass(), "words", term150541);
        setIntField(term150540, term150540.getClass(), "wordsInUse", -1343313377);
        setBooleanField(term150540, term150540.getClass(), "sizeIsSticky", true);
        setField(term150527, term150527.getClass(), "bitset", term150540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term150527, args);
    }

};


