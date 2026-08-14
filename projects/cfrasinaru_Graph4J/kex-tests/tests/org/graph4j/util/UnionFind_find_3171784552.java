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
import java.lang.Integer;

public class UnionFind_find_3171784552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373;
     Object term3382;

    public UnionFind_find_3171784552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term3376 = (int[]) newIntArray(4);
        setIntField(term3373, term3373.getClass(), "numVertices", -1631415805);
        setBooleanField(term3373, term3373.getClass(), "pathCompression", false);
        setIntElement(term3376, 0, 1073400519);
        setIntElement(term3376, 1, -2025555268);
        setIntElement(term3376, 2, -746950289);
        setIntElement(term3376, 3, -137577510);
        setField(term3373, term3373.getClass(), "parent", term3376);
        setIntField(term3373, term3373.getClass(), "numSets", 719185716);
        term3382 = new Integer(1624820010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.UnionFind");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3382;
        callMethod(klass, "find", argTypes, term3373, args);
    }

};


