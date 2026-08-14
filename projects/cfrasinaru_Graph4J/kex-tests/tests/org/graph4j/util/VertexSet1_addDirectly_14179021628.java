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

public class VertexSet1_addDirectly_14179021628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71430;
     Object term71445;

    public VertexSet1_addDirectly_14179021628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71430 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71431 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71432 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71436 = (int[]) newIntArray(1);
        Object term71440 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71441 = (long[]) newLongArray(1);
        setField(term71431, term71431.getClass(), "table", term71432);
        setIntField(term71431, term71431.getClass(), "count", 133409083);
        setIntField(term71431, term71431.getClass(), "threshold", 15);
        setFloatField(term71431, term71431.getClass(), "loadFactor", 0.75F);
        setField(term71430, term71430.getClass(), "posMap", term71431);
        setField(term71430, term71430.getClass(), "graph", null);
        setIntElement(term71436, 0, -1711345026);
        setField(term71430, term71430.getClass(), "vertices", term71436);
        setIntField(term71430, term71430.getClass(), "numVertices", -1999181791);
        setIntField(term71430, term71430.getClass(), "first", 617751238);
        setField(term71440, term71440.getClass(), "words", term71441);
        setIntField(term71440, term71440.getClass(), "wordsInUse", -1490789748);
        setBooleanField(term71440, term71440.getClass(), "sizeIsSticky", true);
        setField(term71430, term71430.getClass(), "bitset", term71440);
        term71445 = new Integer(1548901455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71445;
        callMethod(klass, "addDirectly", argTypes, term71430, args);
    }

};


