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

public class VertexSet_addDirectly_14716070237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150121;
     Object term150137;

    public VertexSet_addDirectly_14716070237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150121 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150122 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150123 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150127 = (int[]) newIntArray(2);
        Object term150132 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150133 = (long[]) newLongArray(1);
        setField(term150122, term150122.getClass(), "table", term150123);
        setIntField(term150122, term150122.getClass(), "count", 478775340);
        setIntField(term150122, term150122.getClass(), "threshold", 15);
        setFloatField(term150122, term150122.getClass(), "loadFactor", 0.75F);
        setField(term150121, term150121.getClass(), "posMap", term150122);
        setField(term150121, term150121.getClass(), "graph", null);
        setIntElement(term150127, 0, 1937813136);
        setIntElement(term150127, 1, -695398609);
        setField(term150121, term150121.getClass(), "vertices", term150127);
        setIntField(term150121, term150121.getClass(), "numVertices", 1327168127);
        setIntField(term150121, term150121.getClass(), "first", 1683372207);
        setField(term150132, term150132.getClass(), "words", term150133);
        setIntField(term150132, term150132.getClass(), "wordsInUse", -1425026728);
        setBooleanField(term150132, term150132.getClass(), "sizeIsSticky", false);
        setField(term150121, term150121.getClass(), "bitset", term150132);
        term150137 = new Integer(333707841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term150137;
        callMethod(klass, "addDirectly", argTypes, term150121, args);
    }

};


