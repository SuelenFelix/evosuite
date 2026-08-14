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

public class VertexSet_equals_106493385021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8473;
     Object term8492;

    public VertexSet_equals_106493385021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8473 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8474 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8475 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8479 = (int[]) newIntArray(5);
        Object term8487 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8488 = (long[]) newLongArray(1);
        setField(term8474, term8474.getClass(), "table", term8475);
        setIntField(term8474, term8474.getClass(), "count", -1144608643);
        setIntField(term8474, term8474.getClass(), "threshold", 15);
        setFloatField(term8474, term8474.getClass(), "loadFactor", 0.75F);
        setField(term8473, term8473.getClass(), "posMap", term8474);
        setField(term8473, term8473.getClass(), "graph", null);
        setIntElement(term8479, 0, -2020428308);
        setIntElement(term8479, 1, -226298436);
        setIntElement(term8479, 2, -1570350431);
        setIntElement(term8479, 3, -1378803474);
        setIntElement(term8479, 4, 699225584);
        setField(term8473, term8473.getClass(), "vertices", term8479);
        setIntField(term8473, term8473.getClass(), "numVertices", -577432675);
        setIntField(term8473, term8473.getClass(), "first", -953072528);
        setField(term8487, term8487.getClass(), "words", term8488);
        setIntField(term8487, term8487.getClass(), "wordsInUse", 2011046892);
        setBooleanField(term8487, term8487.getClass(), "sizeIsSticky", true);
        setField(term8473, term8473.getClass(), "bitset", term8487);
        term8492 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8492;
        callMethod(klass, "equals", argTypes, term8473, args);
    }

};


