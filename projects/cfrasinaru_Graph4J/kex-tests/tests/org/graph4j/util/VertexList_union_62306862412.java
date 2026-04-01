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

public class VertexList_union_62306862412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66491;
     Object term66502;

    public VertexList_union_62306862412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66491 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term66492 = (int[]) newIntArray(2);
        Object term66497 = newInstance(Class.forName("java.util.BitSet"));
        long[] term66498 = (long[]) newLongArray(1);
        setField(term66491, term66491.getClass(), "graph", null);
        setIntElement(term66492, 0, 581835806);
        setIntElement(term66492, 1, -421243361);
        setField(term66491, term66491.getClass(), "vertices", term66492);
        setIntField(term66491, term66491.getClass(), "numVertices", -1188968198);
        setIntField(term66491, term66491.getClass(), "first", 1939849063);
        setField(term66497, term66497.getClass(), "words", term66498);
        setIntField(term66497, term66497.getClass(), "wordsInUse", -748650486);
        setBooleanField(term66497, term66497.getClass(), "sizeIsSticky", false);
        setField(term66491, term66491.getClass(), "bitset", term66497);
        term66502 = (int[]) newIntArray(3);
        setIntElement(term66502, 0, 577034812);
        setIntElement(term66502, 1, 1899791293);
        setIntElement(term66502, 2, -12316989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term66502;
        callMethod(klass, "union", argTypes, term66491, args);
    }

};


