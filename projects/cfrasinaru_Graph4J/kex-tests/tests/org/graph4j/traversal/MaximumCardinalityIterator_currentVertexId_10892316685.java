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
     Object term142085;

    public MaximumCardinalityIterator_currentVertexId_10892316685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142085 = newInstance(Class.forName("org.graph4j.traversal.MaximumCardinalityIterator"));
        boolean[] term142087 = (boolean[]) newBooleanArray(4);
        Object term142092 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term142093 = (int[]) newIntArray(7);
        int[] term142101 = (int[]) newIntArray(0);
        int[] term142103 = (int[]) newIntArray(9);
        setField(term142085, term142085.getClass(), "graph", null);
        setIntField(term142085, term142085.getClass(), "startVertex", 723948852);
        setBooleanElement(term142087, 0, true);
        setBooleanElement(term142087, 1, true);
        setBooleanElement(term142087, 2, true);
        setField(term142085, term142085.getClass(), "visited", term142087);
        setField(term142092, term142092.getClass(), "graph", null);
        setField(term142092, term142092.getClass(), "comparator", null);
        setIntElement(term142093, 0, -1328618435);
        setIntElement(term142093, 1, -1301713427);
        setIntElement(term142093, 2, -1749274405);
        setIntElement(term142093, 3, -20108875);
        setIntElement(term142093, 4, 1118600949);
        setIntElement(term142093, 5, -1022014368);
        setIntElement(term142093, 6, 1909727828);
        setField(term142092, term142092.getClass(), "keys", term142093);
        setField(term142092, term142092.getClass(), "positions", term142101);
        setIntField(term142092, term142092.getClass(), "size", -476939376);
        setField(term142085, term142085.getClass(), "heap", term142092);
        setIntElement(term142103, 0, -416759875);
        setIntElement(term142103, 1, -337275123);
        setIntElement(term142103, 2, 1741268025);
        setIntElement(term142103, 3, 19164941);
        setIntElement(term142103, 4, -1947200307);
        setIntElement(term142103, 5, -502059166);
        setIntElement(term142103, 6, 2025428267);
        setIntElement(term142103, 7, -103988764);
        setIntElement(term142103, 8, 1935511020);
        setField(term142085, term142085.getClass(), "count", term142103);
        setIntField(term142085, term142085.getClass(), "numIterations", 1420699538);
        setIntField(term142085, term142085.getClass(), "currentVertex", -1651978426);
        setIntField(term142085, term142085.getClass(), "currentVertexId", 1274668856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.MaximumCardinalityIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "currentVertexId", argTypes, term142085, args);
    }

};


