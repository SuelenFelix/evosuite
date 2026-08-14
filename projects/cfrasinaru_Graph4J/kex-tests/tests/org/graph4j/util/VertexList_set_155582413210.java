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

public class VertexList_set_155582413210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2504;
     Object term2520;
     Object term2522;

    public VertexList_set_155582413210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2504 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term2505 = (int[]) newIntArray(7);
        Object term2515 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2516 = (long[]) newLongArray(1);
        setField(term2504, term2504.getClass(), "graph", null);
        setIntElement(term2505, 0, -1602072035);
        setIntElement(term2505, 1, 1902624392);
        setIntElement(term2505, 2, 904607217);
        setIntElement(term2505, 3, 434914590);
        setIntElement(term2505, 4, 1983756621);
        setIntElement(term2505, 5, -2134711835);
        setIntElement(term2505, 6, -1641244494);
        setField(term2504, term2504.getClass(), "vertices", term2505);
        setIntField(term2504, term2504.getClass(), "numVertices", 1124282188);
        setIntField(term2504, term2504.getClass(), "first", -489441521);
        setField(term2515, term2515.getClass(), "words", term2516);
        setIntField(term2515, term2515.getClass(), "wordsInUse", 225873732);
        setBooleanField(term2515, term2515.getClass(), "sizeIsSticky", false);
        setField(term2504, term2504.getClass(), "bitset", term2515);
        term2520 = new Integer(529879356);
        term2522 = new Integer(18072182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2520;
        args[1] = term2522;
        callMethod(klass, "set", argTypes, term2504, args);
    }

};


