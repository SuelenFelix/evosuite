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
import java.lang.Integer;
import java.lang.Object;

public class RecursiveLargestFirstColoring_isAdjacentTo_16837914866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3545;
     Object term3546;
     Object term3548;

    public RecursiveLargestFirstColoring_isAdjacentTo_16837914866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3545 = newInstance(Class.forName("org.graph4j.coloring.RecursiveLargestFirstColoring"));
        setField(term3545, term3545.getClass(), "graph", null);
        term3546 = new Integer(-299497261);
        term3548 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3549 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3550 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3554 = (int[]) newIntArray(7);
        Object term3564 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3565 = (long[]) newLongArray(1);
        setField(term3549, term3549.getClass(), "table", term3550);
        setIntField(term3549, term3549.getClass(), "count", -23054366);
        setIntField(term3549, term3549.getClass(), "threshold", 15);
        setFloatField(term3549, term3549.getClass(), "loadFactor", 0.75F);
        setField(term3548, term3548.getClass(), "posMap", term3549);
        setField(term3548, term3548.getClass(), "graph", null);
        setIntElement(term3554, 0, 153009426);
        setIntElement(term3554, 1, 185751892);
        setIntElement(term3554, 2, 1068256001);
        setIntElement(term3554, 3, 1139078354);
        setIntElement(term3554, 4, -691164974);
        setIntElement(term3554, 5, -761675396);
        setIntElement(term3554, 6, -1954860951);
        setField(term3548, term3548.getClass(), "vertices", term3554);
        setIntField(term3548, term3548.getClass(), "numVertices", -2078879114);
        setIntField(term3548, term3548.getClass(), "first", -1186882318);
        setField(term3564, term3564.getClass(), "words", term3565);
        setIntField(term3564, term3564.getClass(), "wordsInUse", 1077647088);
        setBooleanField(term3564, term3564.getClass(), "sizeIsSticky", true);
        setField(term3548, term3548.getClass(), "bitset", term3564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.RecursiveLargestFirstColoring");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3546;
        args[2] = term3548;
        callMethod(klass, "isAdjacentTo", argTypes, term3545, args);
    }

};


