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

public class VertexSet1_add_15698332567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71411;
     Object term71426;

    public VertexSet1_add_15698332567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71411 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71412 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71413 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71417 = (int[]) newIntArray(1);
        Object term71421 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71422 = (long[]) newLongArray(1);
        setField(term71412, term71412.getClass(), "table", term71413);
        setIntField(term71412, term71412.getClass(), "count", -1396568132);
        setIntField(term71412, term71412.getClass(), "threshold", 15);
        setFloatField(term71412, term71412.getClass(), "loadFactor", 0.75F);
        setField(term71411, term71411.getClass(), "posMap", term71412);
        setField(term71411, term71411.getClass(), "graph", null);
        setIntElement(term71417, 0, 1504884095);
        setField(term71411, term71411.getClass(), "vertices", term71417);
        setIntField(term71411, term71411.getClass(), "numVertices", 1296219492);
        setIntField(term71411, term71411.getClass(), "first", -951865069);
        setField(term71421, term71421.getClass(), "words", term71422);
        setIntField(term71421, term71421.getClass(), "wordsInUse", -1273231913);
        setBooleanField(term71421, term71421.getClass(), "sizeIsSticky", false);
        setField(term71411, term71411.getClass(), "bitset", term71421);
        term71426 = new Integer(1882849261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71426;
        callMethod(klass, "add", argTypes, term71411, args);
    }

};


