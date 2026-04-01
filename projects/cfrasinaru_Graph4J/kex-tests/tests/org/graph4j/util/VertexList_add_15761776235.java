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

public class VertexList_add_15761776235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66348;
     Object term66366;

    public VertexList_add_15761776235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66348 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term66349 = (int[]) newIntArray(9);
        Object term66361 = newInstance(Class.forName("java.util.BitSet"));
        long[] term66362 = (long[]) newLongArray(1);
        setField(term66348, term66348.getClass(), "graph", null);
        setIntElement(term66349, 0, 824141018);
        setIntElement(term66349, 1, 278690523);
        setIntElement(term66349, 2, 272160059);
        setIntElement(term66349, 3, -19247990);
        setIntElement(term66349, 4, 1986476279);
        setIntElement(term66349, 5, -715837772);
        setIntElement(term66349, 6, 1707313333);
        setIntElement(term66349, 7, 789086911);
        setIntElement(term66349, 8, 1249593171);
        setField(term66348, term66348.getClass(), "vertices", term66349);
        setIntField(term66348, term66348.getClass(), "numVertices", -860135164);
        setIntField(term66348, term66348.getClass(), "first", 554710113);
        setField(term66361, term66361.getClass(), "words", term66362);
        setIntField(term66361, term66361.getClass(), "wordsInUse", -1257507313);
        setBooleanField(term66361, term66361.getClass(), "sizeIsSticky", false);
        setField(term66348, term66348.getClass(), "bitset", term66361);
        term66366 = new Integer(-418551323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66366;
        callMethod(klass, "add", argTypes, term66348, args);
    }

};


