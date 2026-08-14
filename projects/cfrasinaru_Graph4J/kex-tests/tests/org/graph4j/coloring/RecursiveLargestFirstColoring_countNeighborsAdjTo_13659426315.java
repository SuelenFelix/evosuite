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

public class RecursiveLargestFirstColoring_countNeighborsAdjTo_13659426315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3515;
     Object term3516;
     Object term3518;

    public RecursiveLargestFirstColoring_countNeighborsAdjTo_13659426315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3515 = newInstance(Class.forName("org.graph4j.coloring.RecursiveLargestFirstColoring"));
        setField(term3515, term3515.getClass(), "graph", null);
        term3516 = new Integer(157967613);
        term3518 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3519 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3520 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3524 = (int[]) newIntArray(6);
        Object term3533 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3534 = (long[]) newLongArray(1);
        setField(term3519, term3519.getClass(), "table", term3520);
        setIntField(term3519, term3519.getClass(), "count", 811839399);
        setIntField(term3519, term3519.getClass(), "threshold", 15);
        setFloatField(term3519, term3519.getClass(), "loadFactor", 0.75F);
        setField(term3518, term3518.getClass(), "posMap", term3519);
        setField(term3518, term3518.getClass(), "graph", null);
        setIntElement(term3524, 0, 593962063);
        setIntElement(term3524, 1, -1485826786);
        setIntElement(term3524, 2, -1549952664);
        setIntElement(term3524, 3, 148394188);
        setIntElement(term3524, 4, 504525721);
        setIntElement(term3524, 5, 1835568392);
        setField(term3518, term3518.getClass(), "vertices", term3524);
        setIntField(term3518, term3518.getClass(), "numVertices", 457470807);
        setIntField(term3518, term3518.getClass(), "first", -994742871);
        setField(term3533, term3533.getClass(), "words", term3534);
        setIntField(term3533, term3533.getClass(), "wordsInUse", -222412326);
        setBooleanField(term3533, term3533.getClass(), "sizeIsSticky", true);
        setField(term3518, term3518.getClass(), "bitset", term3533);
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
        args[1] = term3516;
        args[2] = term3518;
        callMethod(klass, "countNeighborsAdjTo", argTypes, term3515, args);
    }

};


