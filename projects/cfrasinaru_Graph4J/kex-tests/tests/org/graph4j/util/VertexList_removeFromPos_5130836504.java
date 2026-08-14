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

public class VertexList_removeFromPos_5130836504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2355;
     Object term2366;

    public VertexList_removeFromPos_5130836504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2355 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term2356 = (int[]) newIntArray(2);
        Object term2361 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2362 = (long[]) newLongArray(1);
        setField(term2355, term2355.getClass(), "graph", null);
        setIntElement(term2356, 0, -68615285);
        setIntElement(term2356, 1, -337504086);
        setField(term2355, term2355.getClass(), "vertices", term2356);
        setIntField(term2355, term2355.getClass(), "numVertices", 2074130991);
        setIntField(term2355, term2355.getClass(), "first", 532588266);
        setField(term2361, term2361.getClass(), "words", term2362);
        setIntField(term2361, term2361.getClass(), "wordsInUse", -1286686332);
        setBooleanField(term2361, term2361.getClass(), "sizeIsSticky", true);
        setField(term2355, term2355.getClass(), "bitset", term2361);
        term2366 = new Integer(-284885486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2366;
        callMethod(klass, "removeFromPos", argTypes, term2355, args);
    }

};


