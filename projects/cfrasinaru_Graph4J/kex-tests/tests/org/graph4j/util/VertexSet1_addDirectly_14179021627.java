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

public class VertexSet1_addDirectly_14179021627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71427;
     Object term71442;

    public VertexSet1_addDirectly_14179021627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71427 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71428 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71429 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71433 = (int[]) newIntArray(1);
        Object term71437 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71438 = (long[]) newLongArray(1);
        setField(term71428, term71428.getClass(), "table", term71429);
        setIntField(term71428, term71428.getClass(), "count", 133409083);
        setIntField(term71428, term71428.getClass(), "threshold", 15);
        setFloatField(term71428, term71428.getClass(), "loadFactor", 0.75F);
        setField(term71427, term71427.getClass(), "posMap", term71428);
        setField(term71427, term71427.getClass(), "graph", null);
        setIntElement(term71433, 0, -1711345026);
        setField(term71427, term71427.getClass(), "vertices", term71433);
        setIntField(term71427, term71427.getClass(), "numVertices", -1999181791);
        setIntField(term71427, term71427.getClass(), "first", 617751238);
        setField(term71437, term71437.getClass(), "words", term71438);
        setIntField(term71437, term71437.getClass(), "wordsInUse", -1490789748);
        setBooleanField(term71437, term71437.getClass(), "sizeIsSticky", true);
        setField(term71427, term71427.getClass(), "bitset", term71437);
        term71442 = new Integer(1548901455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71442;
        callMethod(klass, "addDirectly", argTypes, term71427, args);
    }

};


