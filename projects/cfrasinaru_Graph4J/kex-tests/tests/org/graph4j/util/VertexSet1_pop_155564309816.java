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

public class VertexSet1_pop_155564309816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71611;

    public VertexSet1_pop_155564309816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71611 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71612 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71613 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71617 = (int[]) newIntArray(8);
        Object term71628 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71629 = (long[]) newLongArray(1);
        setField(term71612, term71612.getClass(), "table", term71613);
        setIntField(term71612, term71612.getClass(), "count", -516149823);
        setIntField(term71612, term71612.getClass(), "threshold", 15);
        setFloatField(term71612, term71612.getClass(), "loadFactor", 0.75F);
        setField(term71611, term71611.getClass(), "posMap", term71612);
        setField(term71611, term71611.getClass(), "graph", null);
        setIntElement(term71617, 0, -1393682683);
        setIntElement(term71617, 1, 556170630);
        setIntElement(term71617, 2, -705500663);
        setIntElement(term71617, 3, 1955702887);
        setIntElement(term71617, 4, -473885637);
        setIntElement(term71617, 5, 1889562581);
        setIntElement(term71617, 6, 812974265);
        setIntElement(term71617, 7, 1042200452);
        setField(term71611, term71611.getClass(), "vertices", term71617);
        setIntField(term71611, term71611.getClass(), "numVertices", -1721345121);
        setIntField(term71611, term71611.getClass(), "first", -639524770);
        setField(term71628, term71628.getClass(), "words", term71629);
        setIntField(term71628, term71628.getClass(), "wordsInUse", -799953558);
        setBooleanField(term71628, term71628.getClass(), "sizeIsSticky", true);
        setField(term71611, term71611.getClass(), "bitset", term71628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pop", argTypes, term71611, args);
    }

};


