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

public class MaximumCardinalityIterator_next_10138928814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142046;

    public MaximumCardinalityIterator_next_10138928814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142046 = newInstance(Class.forName("org.graph4j.traversal.MaximumCardinalityIterator"));
        boolean[] term142048 = (boolean[]) newBooleanArray(5);
        Object term142054 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term142055 = (int[]) newIntArray(7);
        int[] term142063 = (int[]) newIntArray(0);
        int[] term142065 = (int[]) newIntArray(2);
        setField(term142046, term142046.getClass(), "graph", null);
        setIntField(term142046, term142046.getClass(), "startVertex", -1625953936);
        setBooleanElement(term142048, 0, true);
        setBooleanElement(term142048, 2, true);
        setBooleanElement(term142048, 4, true);
        setField(term142046, term142046.getClass(), "visited", term142048);
        setField(term142054, term142054.getClass(), "graph", null);
        setField(term142054, term142054.getClass(), "comparator", null);
        setIntElement(term142055, 0, 2085375189);
        setIntElement(term142055, 1, 1294613197);
        setIntElement(term142055, 2, -484595676);
        setIntElement(term142055, 3, 1015340949);
        setIntElement(term142055, 4, 811783730);
        setIntElement(term142055, 5, 84171120);
        setIntElement(term142055, 6, 413777504);
        setField(term142054, term142054.getClass(), "keys", term142055);
        setField(term142054, term142054.getClass(), "positions", term142063);
        setIntField(term142054, term142054.getClass(), "size", 1854215714);
        setField(term142046, term142046.getClass(), "heap", term142054);
        setIntElement(term142065, 0, 1501759174);
        setIntElement(term142065, 1, 1235873414);
        setField(term142046, term142046.getClass(), "count", term142065);
        setIntField(term142046, term142046.getClass(), "numIterations", 2099522122);
        setIntField(term142046, term142046.getClass(), "currentVertex", 337253688);
        setIntField(term142046, term142046.getClass(), "currentVertexId", -1160017560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.MaximumCardinalityIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term142046, args);
    }

};


