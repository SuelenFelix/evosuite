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

public class MaximumCardinalityIterator_init_11455484802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2380;

    public MaximumCardinalityIterator_init_11455484802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2380 = newInstance(Class.forName("org.graph4j.traversal.MaximumCardinalityIterator"));
        boolean[] term2382 = (boolean[]) newBooleanArray(0);
        Object term2383 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term2384 = (int[]) newIntArray(9);
        int[] term2394 = (int[]) newIntArray(6);
        int[] term2402 = (int[]) newIntArray(8);
        setField(term2380, term2380.getClass(), "graph", null);
        setIntField(term2380, term2380.getClass(), "startVertex", 1357632911);
        setField(term2380, term2380.getClass(), "visited", term2382);
        setField(term2383, term2383.getClass(), "graph", null);
        setField(term2383, term2383.getClass(), "comparator", null);
        setIntElement(term2384, 0, 1768195761);
        setIntElement(term2384, 1, -1382661134);
        setIntElement(term2384, 2, -1042022818);
        setIntElement(term2384, 3, 317372051);
        setIntElement(term2384, 4, 892170444);
        setIntElement(term2384, 5, -82417507);
        setIntElement(term2384, 6, -511400358);
        setIntElement(term2384, 7, -742178468);
        setIntElement(term2384, 8, 694989162);
        setField(term2383, term2383.getClass(), "keys", term2384);
        setIntElement(term2394, 0, -65504209);
        setIntElement(term2394, 1, 1745199030);
        setIntElement(term2394, 2, -1440013173);
        setIntElement(term2394, 3, -288126597);
        setIntElement(term2394, 4, -218831961);
        setIntElement(term2394, 5, 826765055);
        setField(term2383, term2383.getClass(), "positions", term2394);
        setIntField(term2383, term2383.getClass(), "size", 1358117317);
        setField(term2380, term2380.getClass(), "heap", term2383);
        setIntElement(term2402, 0, 229989439);
        setIntElement(term2402, 1, -1620126913);
        setIntElement(term2402, 2, -1095121979);
        setIntElement(term2402, 3, -1674851914);
        setIntElement(term2402, 4, -1891353352);
        setIntElement(term2402, 5, 113007640);
        setIntElement(term2402, 6, 1782226794);
        setIntElement(term2402, 7, 1115327577);
        setField(term2380, term2380.getClass(), "count", term2402);
        setIntField(term2380, term2380.getClass(), "numIterations", 840704993);
        setIntField(term2380, term2380.getClass(), "currentVertex", 1297035285);
        setIntField(term2380, term2380.getClass(), "currentVertexId", -826239685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.MaximumCardinalityIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term2380, args);
    }

};


