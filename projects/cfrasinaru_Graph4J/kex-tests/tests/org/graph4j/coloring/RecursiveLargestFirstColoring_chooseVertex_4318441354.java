package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecursiveLargestFirstColoring_chooseVertex_4318441354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3466;
     Object term3467;
     Object term3487;

    public RecursiveLargestFirstColoring_chooseVertex_4318441354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3466 = newInstance(Class.forName("org.graph4j.coloring.RecursiveLargestFirstColoring"));
        setField(term3466, term3466.getClass(), "graph", null);
        term3467 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3468 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3469 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3473 = (int[]) newIntArray(6);
        Object term3482 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3483 = (long[]) newLongArray(1);
        setField(term3468, term3468.getClass(), "table", term3469);
        setIntField(term3468, term3468.getClass(), "count", -1784072578);
        setIntField(term3468, term3468.getClass(), "threshold", 15);
        setFloatField(term3468, term3468.getClass(), "loadFactor", 0.75F);
        setField(term3467, term3467.getClass(), "posMap", term3468);
        setField(term3467, term3467.getClass(), "graph", null);
        setIntElement(term3473, 0, 2011764585);
        setIntElement(term3473, 1, -860680764);
        setIntElement(term3473, 2, -963198667);
        setIntElement(term3473, 3, -1007935918);
        setIntElement(term3473, 4, 1485731037);
        setIntElement(term3473, 5, 1304396087);
        setField(term3467, term3467.getClass(), "vertices", term3473);
        setIntField(term3467, term3467.getClass(), "numVertices", 1782600602);
        setIntField(term3467, term3467.getClass(), "first", -185892708);
        setField(term3482, term3482.getClass(), "words", term3483);
        setIntField(term3482, term3482.getClass(), "wordsInUse", -203163250);
        setBooleanField(term3482, term3482.getClass(), "sizeIsSticky", false);
        setField(term3467, term3467.getClass(), "bitset", term3482);
        term3487 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3488 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3489 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3493 = (int[]) newIntArray(3);
        Object term3499 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3500 = (long[]) newLongArray(1);
        setField(term3488, term3488.getClass(), "table", term3489);
        setIntField(term3488, term3488.getClass(), "count", 498473526);
        setIntField(term3488, term3488.getClass(), "threshold", 15);
        setFloatField(term3488, term3488.getClass(), "loadFactor", 0.75F);
        setField(term3487, term3487.getClass(), "posMap", term3488);
        setField(term3487, term3487.getClass(), "graph", null);
        setIntElement(term3493, 0, 1186917020);
        setIntElement(term3493, 1, 1670041824);
        setIntElement(term3493, 2, 2140388634);
        setField(term3487, term3487.getClass(), "vertices", term3493);
        setIntField(term3487, term3487.getClass(), "numVertices", 21095258);
        setIntField(term3487, term3487.getClass(), "first", -1793997256);
        setField(term3499, term3499.getClass(), "words", term3500);
        setIntField(term3499, term3499.getClass(), "wordsInUse", -1271598018);
        setBooleanField(term3499, term3499.getClass(), "sizeIsSticky", false);
        setField(term3487, term3487.getClass(), "bitset", term3499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.RecursiveLargestFirstColoring");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.util.VertexSet");
        argTypes[2] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3467;
        args[2] = term3487;
        callMethod(klass, "chooseVertex", argTypes, term3466, args);
    }

};


