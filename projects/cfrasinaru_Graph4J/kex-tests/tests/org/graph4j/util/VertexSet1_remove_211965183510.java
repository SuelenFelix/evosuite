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

public class VertexSet1_remove_211965183510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71477;
     Object term71500;

    public VertexSet1_remove_211965183510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71477 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71478 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71479 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71483 = (int[]) newIntArray(9);
        Object term71495 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71496 = (long[]) newLongArray(1);
        setField(term71478, term71478.getClass(), "table", term71479);
        setIntField(term71478, term71478.getClass(), "count", 1818020627);
        setIntField(term71478, term71478.getClass(), "threshold", 15);
        setFloatField(term71478, term71478.getClass(), "loadFactor", 0.75F);
        setField(term71477, term71477.getClass(), "posMap", term71478);
        setField(term71477, term71477.getClass(), "graph", null);
        setIntElement(term71483, 0, 1189773432);
        setIntElement(term71483, 1, -722813020);
        setIntElement(term71483, 2, -2087572575);
        setIntElement(term71483, 3, -426255380);
        setIntElement(term71483, 4, -1947252510);
        setIntElement(term71483, 5, -2010504521);
        setIntElement(term71483, 6, -2118814470);
        setIntElement(term71483, 7, -813617417);
        setIntElement(term71483, 8, -1373956603);
        setField(term71477, term71477.getClass(), "vertices", term71483);
        setIntField(term71477, term71477.getClass(), "numVertices", 693828474);
        setIntField(term71477, term71477.getClass(), "first", 1534615118);
        setField(term71495, term71495.getClass(), "words", term71496);
        setIntField(term71495, term71495.getClass(), "wordsInUse", -732773020);
        setBooleanField(term71495, term71495.getClass(), "sizeIsSticky", false);
        setField(term71477, term71477.getClass(), "bitset", term71495);
        term71500 = new Integer(1231519765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71500;
        callMethod(klass, "remove", argTypes, term71477, args);
    }

};


