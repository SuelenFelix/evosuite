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
import java.lang.Integer;

public class VertexList_insert_112336522911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66465;
     Object term66480;
     Object term66482;

    public VertexList_insert_112336522911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66465 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term66466 = (int[]) newIntArray(6);
        Object term66475 = newInstance(Class.forName("java.util.BitSet"));
        long[] term66476 = (long[]) newLongArray(1);
        setField(term66465, term66465.getClass(), "graph", null);
        setIntElement(term66466, 0, -991810251);
        setIntElement(term66466, 1, -1006766321);
        setIntElement(term66466, 2, 1271131361);
        setIntElement(term66466, 3, 79901777);
        setIntElement(term66466, 4, 1704390140);
        setIntElement(term66466, 5, 1542577034);
        setField(term66465, term66465.getClass(), "vertices", term66466);
        setIntField(term66465, term66465.getClass(), "numVertices", 1626193513);
        setIntField(term66465, term66465.getClass(), "first", -161988555);
        setField(term66475, term66475.getClass(), "words", term66476);
        setIntField(term66475, term66475.getClass(), "wordsInUse", 43440548);
        setBooleanField(term66475, term66475.getClass(), "sizeIsSticky", true);
        setField(term66465, term66465.getClass(), "bitset", term66475);
        term66480 = new Integer(4471197);
        term66482 = new Integer(1738718362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term66480;
        args[1] = term66482;
        callMethod(klass, "insert", argTypes, term66465, args);
    }

};


