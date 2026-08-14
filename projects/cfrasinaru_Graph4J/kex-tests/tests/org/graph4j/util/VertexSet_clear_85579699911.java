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

public class VertexSet_clear_85579699911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8179;

    public VertexSet_clear_85579699911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8179 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8180 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8181 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8185 = (int[]) newIntArray(0);
        Object term8188 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8189 = (long[]) newLongArray(1);
        setField(term8180, term8180.getClass(), "table", term8181);
        setIntField(term8180, term8180.getClass(), "count", 1377148923);
        setIntField(term8180, term8180.getClass(), "threshold", 15);
        setFloatField(term8180, term8180.getClass(), "loadFactor", 0.75F);
        setField(term8179, term8179.getClass(), "posMap", term8180);
        setField(term8179, term8179.getClass(), "graph", null);
        setField(term8179, term8179.getClass(), "vertices", term8185);
        setIntField(term8179, term8179.getClass(), "numVertices", 540775467);
        setIntField(term8179, term8179.getClass(), "first", -2083028527);
        setField(term8188, term8188.getClass(), "words", term8189);
        setIntField(term8188, term8188.getClass(), "wordsInUse", 1631605263);
        setBooleanField(term8188, term8188.getClass(), "sizeIsSticky", true);
        setField(term8179, term8179.getClass(), "bitset", term8188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term8179, args);
    }

};


