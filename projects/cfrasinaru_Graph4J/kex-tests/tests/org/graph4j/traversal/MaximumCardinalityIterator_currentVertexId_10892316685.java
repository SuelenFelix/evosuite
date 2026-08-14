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

public class MaximumCardinalityIterator_currentVertexId_10892316685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2537;

    public MaximumCardinalityIterator_currentVertexId_10892316685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2537 = newInstance(Class.forName("org.graph4j.traversal.MaximumCardinalityIterator"));
        boolean[] term2539 = (boolean[]) newBooleanArray(5);
        Object term2545 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term2546 = (int[]) newIntArray(3);
        int[] term2550 = (int[]) newIntArray(4);
        int[] term2556 = (int[]) newIntArray(8);
        setField(term2537, term2537.getClass(), "graph", null);
        setIntField(term2537, term2537.getClass(), "startVertex", 1462297654);
        setBooleanElement(term2539, 0, true);
        setBooleanElement(term2539, 2, true);
        setField(term2537, term2537.getClass(), "visited", term2539);
        setField(term2545, term2545.getClass(), "graph", null);
        setField(term2545, term2545.getClass(), "comparator", null);
        setIntElement(term2546, 0, 1009915858);
        setIntElement(term2546, 1, 500127209);
        setIntElement(term2546, 2, -1482530168);
        setField(term2545, term2545.getClass(), "keys", term2546);
        setIntElement(term2550, 0, -432987116);
        setIntElement(term2550, 1, 1483499310);
        setIntElement(term2550, 2, -1516568587);
        setIntElement(term2550, 3, 1537690170);
        setField(term2545, term2545.getClass(), "positions", term2550);
        setIntField(term2545, term2545.getClass(), "size", 1133116994);
        setField(term2537, term2537.getClass(), "heap", term2545);
        setIntElement(term2556, 0, -1195191239);
        setIntElement(term2556, 1, -470798982);
        setIntElement(term2556, 2, 1844345719);
        setIntElement(term2556, 3, 1704024265);
        setIntElement(term2556, 4, 501801161);
        setIntElement(term2556, 5, 2103971768);
        setIntElement(term2556, 6, -939132796);
        setIntElement(term2556, 7, 159279866);
        setField(term2537, term2537.getClass(), "count", term2556);
        setIntField(term2537, term2537.getClass(), "numIterations", 138122227);
        setIntField(term2537, term2537.getClass(), "currentVertex", 1795358995);
        setIntField(term2537, term2537.getClass(), "currentVertexId", -781185864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.MaximumCardinalityIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "currentVertexId", argTypes, term2537, args);
    }

};


