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

public class VertexSet1_createPosMap_149140356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71390;

    public VertexSet1_createPosMap_149140356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71390 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71391 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71392 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71396 = (int[]) newIntArray(3);
        Object term71402 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71403 = (long[]) newLongArray(1);
        setField(term71391, term71391.getClass(), "table", term71392);
        setIntField(term71391, term71391.getClass(), "count", -6550207);
        setIntField(term71391, term71391.getClass(), "threshold", 15);
        setFloatField(term71391, term71391.getClass(), "loadFactor", 0.75F);
        setField(term71390, term71390.getClass(), "posMap", term71391);
        setField(term71390, term71390.getClass(), "graph", null);
        setIntElement(term71396, 0, 2028051965);
        setIntElement(term71396, 1, 1503074692);
        setIntElement(term71396, 2, -1315234681);
        setField(term71390, term71390.getClass(), "vertices", term71396);
        setIntField(term71390, term71390.getClass(), "numVertices", -1162608784);
        setIntField(term71390, term71390.getClass(), "first", 746495371);
        setField(term71402, term71402.getClass(), "words", term71403);
        setIntField(term71402, term71402.getClass(), "wordsInUse", -556744853);
        setBooleanField(term71402, term71402.getClass(), "sizeIsSticky", true);
        setField(term71390, term71390.getClass(), "bitset", term71402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPosMap", argTypes, term71390, args);
    }

};


