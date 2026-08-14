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

public class RecursiveLargestFirstColoring_countNeighborsNotIn_3424158057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3577;
     Object term3578;
     Object term3580;

    public RecursiveLargestFirstColoring_countNeighborsNotIn_3424158057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3577 = newInstance(Class.forName("org.graph4j.coloring.RecursiveLargestFirstColoring"));
        setField(term3577, term3577.getClass(), "graph", null);
        term3578 = new Integer(-705176810);
        term3580 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3581 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3582 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3586 = (int[]) newIntArray(0);
        Object term3589 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3590 = (long[]) newLongArray(1);
        setField(term3581, term3581.getClass(), "table", term3582);
        setIntField(term3581, term3581.getClass(), "count", -1584779593);
        setIntField(term3581, term3581.getClass(), "threshold", 15);
        setFloatField(term3581, term3581.getClass(), "loadFactor", 0.75F);
        setField(term3580, term3580.getClass(), "posMap", term3581);
        setField(term3580, term3580.getClass(), "graph", null);
        setField(term3580, term3580.getClass(), "vertices", term3586);
        setIntField(term3580, term3580.getClass(), "numVertices", 303007547);
        setIntField(term3580, term3580.getClass(), "first", 1498738343);
        setField(term3589, term3589.getClass(), "words", term3590);
        setIntField(term3589, term3589.getClass(), "wordsInUse", -1635571857);
        setBooleanField(term3589, term3589.getClass(), "sizeIsSticky", true);
        setField(term3580, term3580.getClass(), "bitset", term3589);
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
        args[1] = term3578;
        args[2] = term3580;
        callMethod(klass, "countNeighborsNotIn", argTypes, term3577, args);
    }

};


