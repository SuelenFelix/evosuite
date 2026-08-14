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

public class Walk_equals_150315153915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7918;
     Object term7932;

    public Walk_equals_150315153915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7918 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term7920 = (int[]) newIntArray(4);
        Object term7927 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7928 = (long[]) newLongArray(1);
        setIntField(term7918, term7918.getClass(), "numEdges", -972330704);
        setField(term7918, term7918.getClass(), "graph", null);
        setIntElement(term7920, 0, 134173297);
        setIntElement(term7920, 1, 2025698852);
        setIntElement(term7920, 2, 113961338);
        setIntElement(term7920, 3, 1869277085);
        setField(term7918, term7918.getClass(), "vertices", term7920);
        setIntField(term7918, term7918.getClass(), "numVertices", 498801287);
        setIntField(term7918, term7918.getClass(), "first", 969573395);
        setField(term7927, term7927.getClass(), "words", term7928);
        setIntField(term7927, term7927.getClass(), "wordsInUse", -899109027);
        setBooleanField(term7927, term7927.getClass(), "sizeIsSticky", true);
        setField(term7918, term7918.getClass(), "bitset", term7927);
        term7932 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7932;
        callMethod(klass, "equals", argTypes, term7918, args);
    }

};


