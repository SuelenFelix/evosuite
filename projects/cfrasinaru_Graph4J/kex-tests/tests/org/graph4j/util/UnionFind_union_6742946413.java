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
     Object term73932;
     Object term73943;
     Object term73945;

    public UnionFind_union_6742946413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73932 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term73935 = (int[]) newIntArray(6);
        setIntField(term73932, term73932.getClass(), "numVertices", -1208380119);
        setBooleanField(term73932, term73932.getClass(), "pathCompression", false);
        setIntElement(term73935, 0, -864238024);
        setIntElement(term73935, 1, -1314380245);
        setIntElement(term73935, 2, 1515851499);
        setIntElement(term73935, 3, 1012518296);
        setIntElement(term73935, 4, 1105035324);
        setIntElement(term73935, 5, -1584523024);
        setField(term73932, term73932.getClass(), "parent", term73935);
        setIntField(term73932, term73932.getClass(), "numSets", -480708883);
        term73943 = new Integer(2138621717);
        term73945 = new Integer(-215379633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.UnionFind");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term73943;
        args[1] = term73945;
        callMethod(klass, "union", argTypes, term73932, args);
    }

};


