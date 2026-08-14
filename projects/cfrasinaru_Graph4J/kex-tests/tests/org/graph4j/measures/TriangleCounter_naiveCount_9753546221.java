package org.graph4j.measures;

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
import static org.graph4j.measures.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TriangleCounter_naiveCount_9753546221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;
     Object term25;

    public TriangleCounter_naiveCount_9753546221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("org.graph4j.measures.TriangleCounter"));
        setField(term24, term24.getClass(), "graph", null);
        term25 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term26 = (int[]) newIntArray(5);
        Object term34 = newInstance(Class.forName("java.util.BitSet"));
        long[] term35 = (long[]) newLongArray(1);
        setField(term25, term25.getClass(), "graph", null);
        setIntElement(term26, 0, 568599855);
        setIntElement(term26, 1, 1162663216);
        setIntElement(term26, 2, 1484323161);
        setIntElement(term26, 3, 391863371);
        setIntElement(term26, 4, -1922583790);
        setField(term25, term25.getClass(), "vertices", term26);
        setIntField(term25, term25.getClass(), "numVertices", -616727354);
        setIntField(term25, term25.getClass(), "first", -1955890973);
        setField(term34, term34.getClass(), "words", term35);
        setIntField(term34, term34.getClass(), "wordsInUse", -2038273078);
        setBooleanField(term34, term34.getClass(), "sizeIsSticky", false);
        setField(term25, term25.getClass(), "bitset", term34);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.measures.TriangleCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexList");
        Object[] args = new Object[1];
        args[0] = term25;
        callMethod(klass, "naiveCount", argTypes, term24, args);
    }

};


