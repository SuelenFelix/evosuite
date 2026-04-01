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

public class UnionFind_getParent_846341605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73974;
     Object term73987;

    public UnionFind_getParent_846341605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73974 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term73977 = (int[]) newIntArray(8);
        setIntField(term73974, term73974.getClass(), "numVertices", 570208042);
        setBooleanField(term73974, term73974.getClass(), "pathCompression", true);
        setIntElement(term73977, 0, -93488030);
        setIntElement(term73977, 1, 926138799);
        setIntElement(term73977, 2, 591313019);
        setIntElement(term73977, 3, -1755672438);
        setIntElement(term73977, 4, -2140257584);
        setIntElement(term73977, 5, -1626490850);
        setIntElement(term73977, 6, 446978027);
        setIntElement(term73977, 7, -384315341);
        setField(term73974, term73974.getClass(), "parent", term73977);
        setIntField(term73974, term73974.getClass(), "numSets", 204740619);
        term73987 = new Integer(107555188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.UnionFind");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term73987;
        callMethod(klass, "getParent", argTypes, term73974, args);
    }

};


