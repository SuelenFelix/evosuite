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
     Object term71408;
     Object term71423;

    public VertexSet1_add_15698332566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71408 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71409 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71410 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71414 = (int[]) newIntArray(1);
        Object term71418 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71419 = (long[]) newLongArray(1);
        setField(term71409, term71409.getClass(), "table", term71410);
        setIntField(term71409, term71409.getClass(), "count", -1396568132);
        setIntField(term71409, term71409.getClass(), "threshold", 15);
        setFloatField(term71409, term71409.getClass(), "loadFactor", 0.75F);
        setField(term71408, term71408.getClass(), "posMap", term71409);
        setField(term71408, term71408.getClass(), "graph", null);
        setIntElement(term71414, 0, 1504884095);
        setField(term71408, term71408.getClass(), "vertices", term71414);
        setIntField(term71408, term71408.getClass(), "numVertices", 1296219492);
        setIntField(term71408, term71408.getClass(), "first", -951865069);
        setField(term71418, term71418.getClass(), "words", term71419);
        setIntField(term71418, term71418.getClass(), "wordsInUse", -1273231913);
        setBooleanField(term71418, term71418.getClass(), "sizeIsSticky", false);
        setField(term71408, term71408.getClass(), "bitset", term71418);
        term71423 = new Integer(1882849261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71423;
        callMethod(klass, "add", argTypes, term71408, args);
    }

};


