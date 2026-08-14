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

public class StableSet_isMaximal_5802530167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8860;

    public StableSet_isMaximal_5802530167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8860 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        Object term8861 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8862 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8866 = (int[]) newIntArray(8);
        Object term8877 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8878 = (long[]) newLongArray(1);
        setField(term8861, term8861.getClass(), "table", term8862);
        setIntField(term8861, term8861.getClass(), "count", -480070896);
        setIntField(term8861, term8861.getClass(), "threshold", 15);
        setFloatField(term8861, term8861.getClass(), "loadFactor", 0.75F);
        setField(term8860, term8860.getClass(), "posMap", term8861);
        setField(term8860, term8860.getClass(), "graph", null);
        setIntElement(term8866, 0, -1811732249);
        setIntElement(term8866, 1, 1993504802);
        setIntElement(term8866, 2, 526852618);
        setIntElement(term8866, 3, 903788782);
        setIntElement(term8866, 4, -608033702);
        setIntElement(term8866, 5, 1118825073);
        setIntElement(term8866, 6, 751108197);
        setIntElement(term8866, 7, -1810066487);
        setField(term8860, term8860.getClass(), "vertices", term8866);
        setIntField(term8860, term8860.getClass(), "numVertices", 12697707);
        setIntField(term8860, term8860.getClass(), "first", -971143668);
        setField(term8877, term8877.getClass(), "words", term8878);
        setIntField(term8877, term8877.getClass(), "wordsInUse", 127763053);
        setBooleanField(term8877, term8877.getClass(), "sizeIsSticky", true);
        setField(term8860, term8860.getClass(), "bitset", term8877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.StableSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMaximal", argTypes, term8860, args);
    }

};


