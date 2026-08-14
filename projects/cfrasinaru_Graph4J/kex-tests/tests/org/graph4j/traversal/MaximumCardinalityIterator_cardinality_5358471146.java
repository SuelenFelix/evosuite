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

public class MaximumCardinalityIterator_cardinality_5358471146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2588;

    public MaximumCardinalityIterator_cardinality_5358471146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2588 = newInstance(Class.forName("org.graph4j.traversal.MaximumCardinalityIterator"));
        boolean[] term2590 = (boolean[]) newBooleanArray(0);
        Object term2591 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term2592 = (int[]) newIntArray(4);
        int[] term2597 = (int[]) newIntArray(1);
        int[] term2600 = (int[]) newIntArray(0);
        setField(term2588, term2588.getClass(), "graph", null);
        setIntField(term2588, term2588.getClass(), "startVertex", 340500914);
        setField(term2588, term2588.getClass(), "visited", term2590);
        setField(term2591, term2591.getClass(), "graph", null);
        setField(term2591, term2591.getClass(), "comparator", null);
        setIntElement(term2592, 0, -2061712635);
        setIntElement(term2592, 1, 1182911731);
        setIntElement(term2592, 2, 644726932);
        setIntElement(term2592, 3, -1515977761);
        setField(term2591, term2591.getClass(), "keys", term2592);
        setIntElement(term2597, 0, -1476037190);
        setField(term2591, term2591.getClass(), "positions", term2597);
        setIntField(term2591, term2591.getClass(), "size", -718204437);
        setField(term2588, term2588.getClass(), "heap", term2591);
        setField(term2588, term2588.getClass(), "count", term2600);
        setIntField(term2588, term2588.getClass(), "numIterations", 468974358);
        setIntField(term2588, term2588.getClass(), "currentVertex", 346282818);
        setIntField(term2588, term2588.getClass(), "currentVertexId", -857876056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.MaximumCardinalityIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "cardinality", argTypes, term2588, args);
    }

};


