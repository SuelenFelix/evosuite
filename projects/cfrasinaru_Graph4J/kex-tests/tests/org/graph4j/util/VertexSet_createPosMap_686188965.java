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

public class VertexSet_createPosMap_686188965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8018;

    public VertexSet_createPosMap_686188965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8018 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8019 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8020 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8024 = (int[]) newIntArray(6);
        Object term8033 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8034 = (long[]) newLongArray(1);
        setField(term8019, term8019.getClass(), "table", term8020);
        setIntField(term8019, term8019.getClass(), "count", 1496590861);
        setIntField(term8019, term8019.getClass(), "threshold", 15);
        setFloatField(term8019, term8019.getClass(), "loadFactor", 0.75F);
        setField(term8018, term8018.getClass(), "posMap", term8019);
        setField(term8018, term8018.getClass(), "graph", null);
        setIntElement(term8024, 0, 1046957508);
        setIntElement(term8024, 1, -553500478);
        setIntElement(term8024, 2, 841910530);
        setIntElement(term8024, 3, -1415371559);
        setIntElement(term8024, 4, -2083858949);
        setIntElement(term8024, 5, -1878319299);
        setField(term8018, term8018.getClass(), "vertices", term8024);
        setIntField(term8018, term8018.getClass(), "numVertices", -690862846);
        setIntField(term8018, term8018.getClass(), "first", 805027262);
        setField(term8033, term8033.getClass(), "words", term8034);
        setIntField(term8033, term8033.getClass(), "wordsInUse", 717389178);
        setBooleanField(term8033, term8033.getClass(), "sizeIsSticky", true);
        setField(term8018, term8018.getClass(), "bitset", term8033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPosMap", argTypes, term8018, args);
    }

};


