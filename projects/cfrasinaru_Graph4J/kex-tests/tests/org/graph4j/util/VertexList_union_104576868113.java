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

public class VertexList_union_104576868113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66512;
     Object term66527;

    public VertexList_union_104576868113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66512 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term66513 = (int[]) newIntArray(6);
        Object term66522 = newInstance(Class.forName("java.util.BitSet"));
        long[] term66523 = (long[]) newLongArray(1);
        setField(term66512, term66512.getClass(), "graph", null);
        setIntElement(term66513, 0, 692299594);
        setIntElement(term66513, 1, 882243847);
        setIntElement(term66513, 2, -2058528763);
        setIntElement(term66513, 3, -1748699477);
        setIntElement(term66513, 4, -1325011408);
        setIntElement(term66513, 5, 50151279);
        setField(term66512, term66512.getClass(), "vertices", term66513);
        setIntField(term66512, term66512.getClass(), "numVertices", -1106846011);
        setIntField(term66512, term66512.getClass(), "first", -1120397462);
        setField(term66522, term66522.getClass(), "words", term66523);
        setIntField(term66522, term66522.getClass(), "wordsInUse", 39917319);
        setBooleanField(term66522, term66522.getClass(), "sizeIsSticky", false);
        setField(term66512, term66512.getClass(), "bitset", term66522);
        term66527 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term66528 = (int[]) newIntArray(1);
        Object term66532 = newInstance(Class.forName("java.util.BitSet"));
        long[] term66533 = (long[]) newLongArray(1);
        setField(term66527, term66527.getClass(), "graph", null);
        setIntElement(term66528, 0, 235259945);
        setField(term66527, term66527.getClass(), "vertices", term66528);
        setIntField(term66527, term66527.getClass(), "numVertices", -209966116);
        setIntField(term66527, term66527.getClass(), "first", -21236200);
        setField(term66532, term66532.getClass(), "words", term66533);
        setIntField(term66532, term66532.getClass(), "wordsInUse", -521770429);
        setBooleanField(term66532, term66532.getClass(), "sizeIsSticky", false);
        setField(term66527, term66527.getClass(), "bitset", term66532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexList");
        Object[] args = new Object[1];
        args[0] = term66527;
        callMethod(klass, "union", argTypes, term66512, args);
    }

};


