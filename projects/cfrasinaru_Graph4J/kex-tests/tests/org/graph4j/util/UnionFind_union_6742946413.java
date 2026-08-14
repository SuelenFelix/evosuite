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

public class UnionFind_union_6742946413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3388;
     Object term3402;
     Object term3404;

    public UnionFind_union_6742946413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3388 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term3391 = (int[]) newIntArray(9);
        setIntField(term3388, term3388.getClass(), "numVertices", -831921156);
        setBooleanField(term3388, term3388.getClass(), "pathCompression", true);
        setIntElement(term3391, 0, -2085566906);
        setIntElement(term3391, 1, 1773193728);
        setIntElement(term3391, 2, -1341357647);
        setIntElement(term3391, 3, 138447019);
        setIntElement(term3391, 4, 114915275);
        setIntElement(term3391, 5, 338519695);
        setIntElement(term3391, 6, 2025566580);
        setIntElement(term3391, 7, -1231122778);
        setIntElement(term3391, 8, 1923558221);
        setField(term3388, term3388.getClass(), "parent", term3391);
        setIntField(term3388, term3388.getClass(), "numSets", 1762934060);
        term3402 = new Integer(-859828739);
        term3404 = new Integer(1986855642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.UnionFind");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3402;
        args[1] = term3404;
        callMethod(klass, "union", argTypes, term3388, args);
    }

};


