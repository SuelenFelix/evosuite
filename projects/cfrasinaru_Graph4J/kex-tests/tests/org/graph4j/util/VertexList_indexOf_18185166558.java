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

public class VertexList_indexOf_18185166558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2452;
     Object term2466;
     Object term2468;

    public VertexList_indexOf_18185166558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2452 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term2453 = (int[]) newIntArray(5);
        Object term2461 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2462 = (long[]) newLongArray(1);
        setField(term2452, term2452.getClass(), "graph", null);
        setIntElement(term2453, 0, 1178214545);
        setIntElement(term2453, 1, -985334541);
        setIntElement(term2453, 2, -1870004228);
        setIntElement(term2453, 3, 380484139);
        setIntElement(term2453, 4, 1822317628);
        setField(term2452, term2452.getClass(), "vertices", term2453);
        setIntField(term2452, term2452.getClass(), "numVertices", -608830309);
        setIntField(term2452, term2452.getClass(), "first", -537786484);
        setField(term2461, term2461.getClass(), "words", term2462);
        setIntField(term2461, term2461.getClass(), "wordsInUse", 263859424);
        setBooleanField(term2461, term2461.getClass(), "sizeIsSticky", true);
        setField(term2452, term2452.getClass(), "bitset", term2461);
        term2466 = new Integer(1436978289);
        term2468 = new Integer(696225243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2466;
        args[1] = term2468;
        callMethod(klass, "indexOf", argTypes, term2452, args);
    }

};


