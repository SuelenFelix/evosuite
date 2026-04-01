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

public class StableSet_checkEdges_17036719855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154776;

    public StableSet_checkEdges_17036719855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154776 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        Object term154777 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term154778 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term154782 = (int[]) newIntArray(9);
        Object term154794 = newInstance(Class.forName("java.util.BitSet"));
        long[] term154795 = (long[]) newLongArray(1);
        setField(term154777, term154777.getClass(), "table", term154778);
        setIntField(term154777, term154777.getClass(), "count", -1958796664);
        setIntField(term154777, term154777.getClass(), "threshold", 15);
        setFloatField(term154777, term154777.getClass(), "loadFactor", 0.75F);
        setField(term154776, term154776.getClass(), "posMap", term154777);
        setField(term154776, term154776.getClass(), "graph", null);
        setIntElement(term154782, 0, 1291683216);
        setIntElement(term154782, 1, -1525117773);
        setIntElement(term154782, 2, -1888022895);
        setIntElement(term154782, 3, 925499990);
        setIntElement(term154782, 4, 1529596502);
        setIntElement(term154782, 5, -554756058);
        setIntElement(term154782, 6, -877462479);
        setIntElement(term154782, 7, -38219748);
        setIntElement(term154782, 8, -1564760638);
        setField(term154776, term154776.getClass(), "vertices", term154782);
        setIntField(term154776, term154776.getClass(), "numVertices", -1370483963);
        setIntField(term154776, term154776.getClass(), "first", 273443990);
        setField(term154794, term154794.getClass(), "words", term154795);
        setIntField(term154794, term154794.getClass(), "wordsInUse", 1094013519);
        setBooleanField(term154794, term154794.getClass(), "sizeIsSticky", true);
        setField(term154776, term154776.getClass(), "bitset", term154794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.StableSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkEdges", argTypes, term154776, args);
    }

};


