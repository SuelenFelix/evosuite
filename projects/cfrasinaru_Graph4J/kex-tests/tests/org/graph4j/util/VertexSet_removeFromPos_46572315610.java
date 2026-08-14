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

public class VertexSet_removeFromPos_46572315610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8146;
     Object term8168;

    public VertexSet_removeFromPos_46572315610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8146 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8147 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8148 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8152 = (int[]) newIntArray(8);
        Object term8163 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8164 = (long[]) newLongArray(1);
        setField(term8147, term8147.getClass(), "table", term8148);
        setIntField(term8147, term8147.getClass(), "count", -816430246);
        setIntField(term8147, term8147.getClass(), "threshold", 15);
        setFloatField(term8147, term8147.getClass(), "loadFactor", 0.75F);
        setField(term8146, term8146.getClass(), "posMap", term8147);
        setField(term8146, term8146.getClass(), "graph", null);
        setIntElement(term8152, 0, 1754193865);
        setIntElement(term8152, 1, 25277058);
        setIntElement(term8152, 2, -949634053);
        setIntElement(term8152, 3, 1495471055);
        setIntElement(term8152, 4, -583415628);
        setIntElement(term8152, 5, -1488660931);
        setIntElement(term8152, 6, 1899095931);
        setIntElement(term8152, 7, 145571200);
        setField(term8146, term8146.getClass(), "vertices", term8152);
        setIntField(term8146, term8146.getClass(), "numVertices", -81919234);
        setIntField(term8146, term8146.getClass(), "first", 41779745);
        setField(term8163, term8163.getClass(), "words", term8164);
        setIntField(term8163, term8163.getClass(), "wordsInUse", 908188015);
        setBooleanField(term8163, term8163.getClass(), "sizeIsSticky", false);
        setField(term8146, term8146.getClass(), "bitset", term8163);
        term8168 = new Integer(1448289766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8168;
        callMethod(klass, "removeFromPos", argTypes, term8146, args);
    }

};


