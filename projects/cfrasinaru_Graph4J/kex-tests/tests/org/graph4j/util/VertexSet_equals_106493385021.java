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

public class VertexSet_equals_106493385021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150550;
     Object term150570;

    public VertexSet_equals_106493385021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150550 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150551 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150552 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150556 = (int[]) newIntArray(6);
        Object term150565 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150566 = (long[]) newLongArray(1);
        setField(term150551, term150551.getClass(), "table", term150552);
        setIntField(term150551, term150551.getClass(), "count", -2064185655);
        setIntField(term150551, term150551.getClass(), "threshold", 15);
        setFloatField(term150551, term150551.getClass(), "loadFactor", 0.75F);
        setField(term150550, term150550.getClass(), "posMap", term150551);
        setField(term150550, term150550.getClass(), "graph", null);
        setIntElement(term150556, 0, 2014109467);
        setIntElement(term150556, 1, -1360385273);
        setIntElement(term150556, 2, -409931323);
        setIntElement(term150556, 3, 390991960);
        setIntElement(term150556, 4, -1589121357);
        setIntElement(term150556, 5, 1635615087);
        setField(term150550, term150550.getClass(), "vertices", term150556);
        setIntField(term150550, term150550.getClass(), "numVertices", 41451908);
        setIntField(term150550, term150550.getClass(), "first", -1709081026);
        setField(term150565, term150565.getClass(), "words", term150566);
        setIntField(term150565, term150565.getClass(), "wordsInUse", -564562495);
        setBooleanField(term150565, term150565.getClass(), "sizeIsSticky", true);
        setField(term150550, term150550.getClass(), "bitset", term150565);
        term150570 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term150570;
        callMethod(klass, "equals", argTypes, term150550, args);
    }

};


