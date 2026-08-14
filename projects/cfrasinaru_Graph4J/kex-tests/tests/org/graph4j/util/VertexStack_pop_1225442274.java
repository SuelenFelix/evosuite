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

public class VertexStack_pop_1225442274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10597;

    public VertexStack_pop_1225442274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10597 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term10598 = (int[]) newIntArray(3);
        Object term10604 = newInstance(Class.forName("java.util.BitSet"));
        long[] term10605 = (long[]) newLongArray(1);
        setField(term10597, term10597.getClass(), "graph", null);
        setIntElement(term10598, 0, 657195865);
        setIntElement(term10598, 1, 1397647176);
        setIntElement(term10598, 2, -1375675721);
        setField(term10597, term10597.getClass(), "vertices", term10598);
        setIntField(term10597, term10597.getClass(), "numVertices", 456313553);
        setIntField(term10597, term10597.getClass(), "first", 1636460194);
        setField(term10604, term10604.getClass(), "words", term10605);
        setIntField(term10604, term10604.getClass(), "wordsInUse", -1926178417);
        setBooleanField(term10604, term10604.getClass(), "sizeIsSticky", true);
        setField(term10597, term10597.getClass(), "bitset", term10604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pop", argTypes, term10597, args);
    }

};


