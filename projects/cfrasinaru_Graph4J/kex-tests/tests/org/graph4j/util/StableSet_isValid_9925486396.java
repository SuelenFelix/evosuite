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
     Object term154809;

    public StableSet_isValid_9925486396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154809 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        Object term154810 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term154811 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term154815 = (int[]) newIntArray(0);
        Object term154818 = newInstance(Class.forName("java.util.BitSet"));
        long[] term154819 = (long[]) newLongArray(1);
        setField(term154810, term154810.getClass(), "table", term154811);
        setIntField(term154810, term154810.getClass(), "count", -2137205247);
        setIntField(term154810, term154810.getClass(), "threshold", 15);
        setFloatField(term154810, term154810.getClass(), "loadFactor", 0.75F);
        setField(term154809, term154809.getClass(), "posMap", term154810);
        setField(term154809, term154809.getClass(), "graph", null);
        setField(term154809, term154809.getClass(), "vertices", term154815);
        setIntField(term154809, term154809.getClass(), "numVertices", 1011344188);
        setIntField(term154809, term154809.getClass(), "first", -1861118127);
        setField(term154818, term154818.getClass(), "words", term154819);
        setIntField(term154818, term154818.getClass(), "wordsInUse", 93727955);
        setBooleanField(term154818, term154818.getClass(), "sizeIsSticky", false);
        setField(term154809, term154809.getClass(), "bitset", term154818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.StableSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term154809, args);
    }

};


