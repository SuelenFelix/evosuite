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

public class Clique_union_6076082404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141521;
     Object term141539;

    public Clique_union_6076082404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141521 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term141522 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term141523 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term141527 = (int[]) newIntArray(4);
        Object term141534 = newInstance(Class.forName("java.util.BitSet"));
        long[] term141535 = (long[]) newLongArray(1);
        setField(term141522, term141522.getClass(), "table", term141523);
        setIntField(term141522, term141522.getClass(), "count", 670877035);
        setIntField(term141522, term141522.getClass(), "threshold", 15);
        setFloatField(term141522, term141522.getClass(), "loadFactor", 0.75F);
        setField(term141521, term141521.getClass(), "posMap", term141522);
        setField(term141521, term141521.getClass(), "graph", null);
        setIntElement(term141527, 0, 303556117);
        setIntElement(term141527, 1, -2096518900);
        setIntElement(term141527, 2, 605863601);
        setIntElement(term141527, 3, 291684799);
        setField(term141521, term141521.getClass(), "vertices", term141527);
        setIntField(term141521, term141521.getClass(), "numVertices", 133487758);
        setIntField(term141521, term141521.getClass(), "first", -1203288548);
        setField(term141534, term141534.getClass(), "words", term141535);
        setIntField(term141534, term141534.getClass(), "wordsInUse", -1721741820);
        setBooleanField(term141534, term141534.getClass(), "sizeIsSticky", false);
        setField(term141521, term141521.getClass(), "bitset", term141534);
        term141539 = (int[]) newIntArray(8);
        setIntElement(term141539, 0, -1838993761);
        setIntElement(term141539, 1, -1031059056);
        setIntElement(term141539, 2, 974683425);
        setIntElement(term141539, 3, 641822467);
        setIntElement(term141539, 4, -1872489289);
        setIntElement(term141539, 5, 1184593185);
        setIntElement(term141539, 6, -2146103227);
        setIntElement(term141539, 7, -41981877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term141539;
        callMethod(klass, "union", argTypes, term141521, args);
    }

};


