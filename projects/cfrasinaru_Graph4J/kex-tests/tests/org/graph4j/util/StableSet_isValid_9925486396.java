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

public class StableSet_isValid_9925486396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8827;

    public StableSet_isValid_9925486396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8827 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        Object term8828 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8829 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8833 = (int[]) newIntArray(9);
        Object term8845 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8846 = (long[]) newLongArray(1);
        setField(term8828, term8828.getClass(), "table", term8829);
        setIntField(term8828, term8828.getClass(), "count", 736842788);
        setIntField(term8828, term8828.getClass(), "threshold", 15);
        setFloatField(term8828, term8828.getClass(), "loadFactor", 0.75F);
        setField(term8827, term8827.getClass(), "posMap", term8828);
        setField(term8827, term8827.getClass(), "graph", null);
        setIntElement(term8833, 0, 416550042);
        setIntElement(term8833, 1, 1745727714);
        setIntElement(term8833, 2, -1577886337);
        setIntElement(term8833, 3, -481394578);
        setIntElement(term8833, 4, 1440683242);
        setIntElement(term8833, 5, -1746192055);
        setIntElement(term8833, 6, -996911099);
        setIntElement(term8833, 7, -610865659);
        setIntElement(term8833, 8, 2044119255);
        setField(term8827, term8827.getClass(), "vertices", term8833);
        setIntField(term8827, term8827.getClass(), "numVertices", -1924668199);
        setIntField(term8827, term8827.getClass(), "first", 903039854);
        setField(term8845, term8845.getClass(), "words", term8846);
        setIntField(term8845, term8845.getClass(), "wordsInUse", -705528573);
        setBooleanField(term8845, term8845.getClass(), "sizeIsSticky", true);
        setField(term8827, term8827.getClass(), "bitset", term8845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.StableSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term8827, args);
    }

};


