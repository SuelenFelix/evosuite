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

public class VertexSet_addAll_13186285268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150142;
     Object term150163;

    public VertexSet_addAll_13186285268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150142 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150143 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150144 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150148 = (int[]) newIntArray(7);
        Object term150158 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150159 = (long[]) newLongArray(1);
        setField(term150143, term150143.getClass(), "table", term150144);
        setIntField(term150143, term150143.getClass(), "count", 39498641);
        setIntField(term150143, term150143.getClass(), "threshold", 15);
        setFloatField(term150143, term150143.getClass(), "loadFactor", 0.75F);
        setField(term150142, term150142.getClass(), "posMap", term150143);
        setField(term150142, term150142.getClass(), "graph", null);
        setIntElement(term150148, 0, 508724846);
        setIntElement(term150148, 1, -986714224);
        setIntElement(term150148, 2, 724379046);
        setIntElement(term150148, 3, 1656031613);
        setIntElement(term150148, 4, -121264431);
        setIntElement(term150148, 5, 118341366);
        setIntElement(term150148, 6, -1432149694);
        setField(term150142, term150142.getClass(), "vertices", term150148);
        setIntField(term150142, term150142.getClass(), "numVertices", -1550618432);
        setIntField(term150142, term150142.getClass(), "first", -1433466091);
        setField(term150158, term150158.getClass(), "words", term150159);
        setIntField(term150158, term150158.getClass(), "wordsInUse", -20157216);
        setBooleanField(term150158, term150158.getClass(), "sizeIsSticky", false);
        setField(term150142, term150142.getClass(), "bitset", term150158);
        term150163 = (int[]) newIntArray(1);
        setIntElement(term150163, 0, 683618892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term150163;
        callMethod(klass, "addAll", argTypes, term150142, args);
    }

};


