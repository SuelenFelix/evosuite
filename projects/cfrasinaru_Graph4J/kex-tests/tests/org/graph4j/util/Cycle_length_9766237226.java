package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Cycle_length_9766237226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309;

    public Cycle_length_9766237226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term311 = (int[]) newIntArray(5);
        Object term319 = newInstance(Class.forName("java.util.BitSet"));
        long[] term320 = (long[]) newLongArray(1);
        setIntField(term309, term309.getClass(), "numEdges", 287287233);
        setField(term309, term309.getClass(), "graph", null);
        setIntElement(term311, 0, 962840079);
        setIntElement(term311, 1, 1540719661);
        setIntElement(term311, 2, 1265463001);
        setIntElement(term311, 3, 335112684);
        setIntElement(term311, 4, 1551099402);
        setField(term309, term309.getClass(), "vertices", term311);
        setIntField(term309, term309.getClass(), "numVertices", -2027534003);
        setIntField(term309, term309.getClass(), "first", 1063420942);
        setField(term319, term319.getClass(), "words", term320);
        setIntField(term319, term319.getClass(), "wordsInUse", 1375330971);
        setBooleanField(term319, term319.getClass(), "sizeIsSticky", false);
        setField(term309, term309.getClass(), "bitset", term319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "length", argTypes, term309, args);
    }

};


