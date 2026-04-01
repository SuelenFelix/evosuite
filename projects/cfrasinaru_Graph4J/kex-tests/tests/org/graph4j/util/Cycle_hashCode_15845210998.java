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

public class Cycle_hashCode_15845210998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57052;

    public Cycle_hashCode_15845210998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57052 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term57054 = (int[]) newIntArray(4);
        Object term57061 = newInstance(Class.forName("java.util.BitSet"));
        long[] term57062 = (long[]) newLongArray(1);
        setIntField(term57052, term57052.getClass(), "numEdges", 1849014808);
        setField(term57052, term57052.getClass(), "graph", null);
        setIntElement(term57054, 0, 452254325);
        setIntElement(term57054, 1, 68487577);
        setIntElement(term57054, 2, 225702811);
        setIntElement(term57054, 3, 243703890);
        setField(term57052, term57052.getClass(), "vertices", term57054);
        setIntField(term57052, term57052.getClass(), "numVertices", -2015558089);
        setIntField(term57052, term57052.getClass(), "first", -1965545269);
        setField(term57061, term57061.getClass(), "words", term57062);
        setIntField(term57061, term57061.getClass(), "wordsInUse", -1898898123);
        setBooleanField(term57061, term57061.getClass(), "sizeIsSticky", false);
        setField(term57052, term57052.getClass(), "bitset", term57061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term57052, args);
    }

};


