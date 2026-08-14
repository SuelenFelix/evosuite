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

public class VertexList_remove_21133074683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2333;
     Object term2347;

    public VertexList_remove_21133074683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2333 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term2334 = (int[]) newIntArray(5);
        Object term2342 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2343 = (long[]) newLongArray(1);
        setField(term2333, term2333.getClass(), "graph", null);
        setIntElement(term2334, 0, 1865070548);
        setIntElement(term2334, 1, 1904515443);
        setIntElement(term2334, 2, 1361126430);
        setIntElement(term2334, 3, 1728588701);
        setIntElement(term2334, 4, -355769268);
        setField(term2333, term2333.getClass(), "vertices", term2334);
        setIntField(term2333, term2333.getClass(), "numVertices", -114460662);
        setIntField(term2333, term2333.getClass(), "first", -355376034);
        setField(term2342, term2342.getClass(), "words", term2343);
        setIntField(term2342, term2342.getClass(), "wordsInUse", 588390599);
        setBooleanField(term2342, term2342.getClass(), "sizeIsSticky", false);
        setField(term2333, term2333.getClass(), "bitset", term2342);
        term2347 = new Integer(-95969566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2347;
        callMethod(klass, "remove", argTypes, term2333, args);
    }

};


