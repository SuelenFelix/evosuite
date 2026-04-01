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

public class VertexSet1_createPosMap_149140355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71387;

    public VertexSet1_createPosMap_149140355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71387 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71388 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71389 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71393 = (int[]) newIntArray(3);
        Object term71399 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71400 = (long[]) newLongArray(1);
        setField(term71388, term71388.getClass(), "table", term71389);
        setIntField(term71388, term71388.getClass(), "count", -6550207);
        setIntField(term71388, term71388.getClass(), "threshold", 15);
        setFloatField(term71388, term71388.getClass(), "loadFactor", 0.75F);
        setField(term71387, term71387.getClass(), "posMap", term71388);
        setField(term71387, term71387.getClass(), "graph", null);
        setIntElement(term71393, 0, 2028051965);
        setIntElement(term71393, 1, 1503074692);
        setIntElement(term71393, 2, -1315234681);
        setField(term71387, term71387.getClass(), "vertices", term71393);
        setIntField(term71387, term71387.getClass(), "numVertices", -1162608784);
        setIntField(term71387, term71387.getClass(), "first", 746495371);
        setField(term71399, term71399.getClass(), "words", term71400);
        setIntField(term71399, term71399.getClass(), "wordsInUse", -556744853);
        setBooleanField(term71399, term71399.getClass(), "sizeIsSticky", true);
        setField(term71387, term71387.getClass(), "bitset", term71399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPosMap", argTypes, term71387, args);
    }

};


