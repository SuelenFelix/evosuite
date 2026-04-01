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
     Object term73907;
     Object term73921;

    public UnionFind_find_3171784552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73907 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term73910 = (int[]) newIntArray(9);
        setIntField(term73907, term73907.getClass(), "numVertices", 1653675136);
        setBooleanField(term73907, term73907.getClass(), "pathCompression", false);
        setIntElement(term73910, 0, 661708296);
        setIntElement(term73910, 1, -238072053);
        setIntElement(term73910, 2, -1590160640);
        setIntElement(term73910, 3, 912288551);
        setIntElement(term73910, 4, 1638500325);
        setIntElement(term73910, 5, 1177380645);
        setIntElement(term73910, 6, -394947882);
        setIntElement(term73910, 7, 84960163);
        setIntElement(term73910, 8, -1576427116);
        setField(term73907, term73907.getClass(), "parent", term73910);
        setIntField(term73907, term73907.getClass(), "numSets", 836315769);
        term73921 = new Integer(-848316647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.UnionFind");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term73921;
        callMethod(klass, "find", argTypes, term73907, args);
    }

};


