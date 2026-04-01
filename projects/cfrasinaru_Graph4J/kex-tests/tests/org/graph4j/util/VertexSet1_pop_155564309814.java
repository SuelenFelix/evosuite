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

public class VertexSet1_pop_155564309814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71603;

    public VertexSet1_pop_155564309814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71603 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71604 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71605 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71609 = (int[]) newIntArray(8);
        Object term71620 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71621 = (long[]) newLongArray(1);
        setField(term71604, term71604.getClass(), "table", term71605);
        setIntField(term71604, term71604.getClass(), "count", -516149823);
        setIntField(term71604, term71604.getClass(), "threshold", 15);
        setFloatField(term71604, term71604.getClass(), "loadFactor", 0.75F);
        setField(term71603, term71603.getClass(), "posMap", term71604);
        setField(term71603, term71603.getClass(), "graph", null);
        setIntElement(term71609, 0, -1393682683);
        setIntElement(term71609, 1, 556170630);
        setIntElement(term71609, 2, -705500663);
        setIntElement(term71609, 3, 1955702887);
        setIntElement(term71609, 4, -473885637);
        setIntElement(term71609, 5, 1889562581);
        setIntElement(term71609, 6, 812974265);
        setIntElement(term71609, 7, 1042200452);
        setField(term71603, term71603.getClass(), "vertices", term71609);
        setIntField(term71603, term71603.getClass(), "numVertices", -1721345121);
        setIntField(term71603, term71603.getClass(), "first", -639524770);
        setField(term71620, term71620.getClass(), "words", term71621);
        setIntField(term71620, term71620.getClass(), "wordsInUse", -799953558);
        setBooleanField(term71620, term71620.getClass(), "sizeIsSticky", true);
        setField(term71603, term71603.getClass(), "bitset", term71620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pop", argTypes, term71603, args);
    }

};


