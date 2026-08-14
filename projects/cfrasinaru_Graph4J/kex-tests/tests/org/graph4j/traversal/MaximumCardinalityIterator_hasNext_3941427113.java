package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MaximumCardinalityIterator_hasNext_3941427113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2437;

    public MaximumCardinalityIterator_hasNext_3941427113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2437 = newInstance(Class.forName("org.graph4j.traversal.MaximumCardinalityIterator"));
        boolean[] term2439 = (boolean[]) newBooleanArray(6);
        Object term2446 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term2447 = (int[]) newIntArray(2);
        int[] term2450 = (int[]) newIntArray(1);
        int[] term2453 = (int[]) newIntArray(5);
        setField(term2437, term2437.getClass(), "graph", null);
        setIntField(term2437, term2437.getClass(), "startVertex", -845551243);
        setBooleanElement(term2439, 2, true);
        setBooleanElement(term2439, 4, true);
        setField(term2437, term2437.getClass(), "visited", term2439);
        setField(term2446, term2446.getClass(), "graph", null);
        setField(term2446, term2446.getClass(), "comparator", null);
        setIntElement(term2447, 0, 370671198);
        setIntElement(term2447, 1, 1426800646);
        setField(term2446, term2446.getClass(), "keys", term2447);
        setIntElement(term2450, 0, 954234820);
        setField(term2446, term2446.getClass(), "positions", term2450);
        setIntField(term2446, term2446.getClass(), "size", 1047346538);
        setField(term2437, term2437.getClass(), "heap", term2446);
        setIntElement(term2453, 0, 728436340);
        setIntElement(term2453, 1, 1841731593);
        setIntElement(term2453, 2, -1854929057);
        setIntElement(term2453, 3, 1703814701);
        setIntElement(term2453, 4, 1370246522);
        setField(term2437, term2437.getClass(), "count", term2453);
        setIntField(term2437, term2437.getClass(), "numIterations", -574611924);
        setIntField(term2437, term2437.getClass(), "currentVertex", 512521742);
        setIntField(term2437, term2437.getClass(), "currentVertexId", 1291000976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.MaximumCardinalityIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term2437, args);
    }

};


