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
     Object term8070;
     Object term8091;

    public VertexSet_addDirectly_14716070237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8070 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8071 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8072 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8076 = (int[]) newIntArray(7);
        Object term8086 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8087 = (long[]) newLongArray(1);
        setField(term8071, term8071.getClass(), "table", term8072);
        setIntField(term8071, term8071.getClass(), "count", -2052568448);
        setIntField(term8071, term8071.getClass(), "threshold", 15);
        setFloatField(term8071, term8071.getClass(), "loadFactor", 0.75F);
        setField(term8070, term8070.getClass(), "posMap", term8071);
        setField(term8070, term8070.getClass(), "graph", null);
        setIntElement(term8076, 0, 664155196);
        setIntElement(term8076, 1, -1103257588);
        setIntElement(term8076, 2, 1463219831);
        setIntElement(term8076, 3, -1516863216);
        setIntElement(term8076, 4, 1392468004);
        setIntElement(term8076, 5, -1568339070);
        setIntElement(term8076, 6, -1427059961);
        setField(term8070, term8070.getClass(), "vertices", term8076);
        setIntField(term8070, term8070.getClass(), "numVertices", 1120685189);
        setIntField(term8070, term8070.getClass(), "first", 654585209);
        setField(term8086, term8086.getClass(), "words", term8087);
        setIntField(term8086, term8086.getClass(), "wordsInUse", -1661685401);
        setBooleanField(term8086, term8086.getClass(), "sizeIsSticky", false);
        setField(term8070, term8070.getClass(), "bitset", term8086);
        term8091 = new Integer(1427434947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8091;
        callMethod(klass, "addDirectly", argTypes, term8070, args);
    }

};


