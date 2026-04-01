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

public class Walk_isDirected_2411795378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143895;

    public Walk_isDirected_2411795378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143895 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term143897 = (int[]) newIntArray(5);
        Object term143905 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143906 = (long[]) newLongArray(1);
        setIntField(term143895, term143895.getClass(), "numEdges", 545754695);
        setField(term143895, term143895.getClass(), "graph", null);
        setIntElement(term143897, 0, -847514286);
        setIntElement(term143897, 1, -470758296);
        setIntElement(term143897, 2, 1891053417);
        setIntElement(term143897, 3, -216494106);
        setIntElement(term143897, 4, 1918715906);
        setField(term143895, term143895.getClass(), "vertices", term143897);
        setIntField(term143895, term143895.getClass(), "numVertices", 655888624);
        setIntField(term143895, term143895.getClass(), "first", 999435102);
        setField(term143905, term143905.getClass(), "words", term143906);
        setIntField(term143905, term143905.getClass(), "wordsInUse", -1335452458);
        setBooleanField(term143905, term143905.getClass(), "sizeIsSticky", true);
        setField(term143895, term143895.getClass(), "bitset", term143905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDirected", argTypes, term143895, args);
    }

};


