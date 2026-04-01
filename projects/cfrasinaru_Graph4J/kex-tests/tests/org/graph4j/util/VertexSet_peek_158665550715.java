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

public class VertexSet_peek_158665550715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150334;

    public VertexSet_peek_158665550715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150334 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150335 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150336 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150340 = (int[]) newIntArray(3);
        Object term150346 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150347 = (long[]) newLongArray(1);
        setField(term150335, term150335.getClass(), "table", term150336);
        setIntField(term150335, term150335.getClass(), "count", 430389956);
        setIntField(term150335, term150335.getClass(), "threshold", 15);
        setFloatField(term150335, term150335.getClass(), "loadFactor", 0.75F);
        setField(term150334, term150334.getClass(), "posMap", term150335);
        setField(term150334, term150334.getClass(), "graph", null);
        setIntElement(term150340, 0, 1878222345);
        setIntElement(term150340, 1, -1933045246);
        setIntElement(term150340, 2, 720306511);
        setField(term150334, term150334.getClass(), "vertices", term150340);
        setIntField(term150334, term150334.getClass(), "numVertices", -2008251652);
        setIntField(term150334, term150334.getClass(), "first", -1431212529);
        setField(term150346, term150346.getClass(), "words", term150347);
        setIntField(term150346, term150346.getClass(), "wordsInUse", -1736722660);
        setBooleanField(term150346, term150346.getClass(), "sizeIsSticky", false);
        setField(term150334, term150334.getClass(), "bitset", term150346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term150334, args);
    }

};


