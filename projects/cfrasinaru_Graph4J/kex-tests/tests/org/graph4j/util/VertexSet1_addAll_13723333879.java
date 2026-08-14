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

public class VertexSet1_addAll_13723333879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71449;
     Object term71465;

    public VertexSet1_addAll_13723333879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71449 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71450 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71451 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71455 = (int[]) newIntArray(2);
        Object term71460 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71461 = (long[]) newLongArray(1);
        setField(term71450, term71450.getClass(), "table", term71451);
        setIntField(term71450, term71450.getClass(), "count", -1959301548);
        setIntField(term71450, term71450.getClass(), "threshold", 15);
        setFloatField(term71450, term71450.getClass(), "loadFactor", 0.75F);
        setField(term71449, term71449.getClass(), "posMap", term71450);
        setField(term71449, term71449.getClass(), "graph", null);
        setIntElement(term71455, 0, 987806484);
        setIntElement(term71455, 1, -1033174268);
        setField(term71449, term71449.getClass(), "vertices", term71455);
        setIntField(term71449, term71449.getClass(), "numVertices", -393658283);
        setIntField(term71449, term71449.getClass(), "first", 1751001510);
        setField(term71460, term71460.getClass(), "words", term71461);
        setIntField(term71460, term71460.getClass(), "wordsInUse", -1222375530);
        setBooleanField(term71460, term71460.getClass(), "sizeIsSticky", true);
        setField(term71449, term71449.getClass(), "bitset", term71460);
        term71465 = (int[]) newIntArray(4);
        setIntElement(term71465, 0, 673233183);
        setIntElement(term71465, 1, 147997544);
        setIntElement(term71465, 2, -2078032890);
        setIntElement(term71465, 3, -1228044113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term71465;
        callMethod(klass, "addAll", argTypes, term71449, args);
    }

};


