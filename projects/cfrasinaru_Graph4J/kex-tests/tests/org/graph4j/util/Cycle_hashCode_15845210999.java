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

public class Cycle_hashCode_15845210999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57056;

    public Cycle_hashCode_15845210999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57056 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term57058 = (int[]) newIntArray(4);
        Object term57065 = newInstance(Class.forName("java.util.BitSet"));
        long[] term57066 = (long[]) newLongArray(1);
        setIntField(term57056, term57056.getClass(), "numEdges", 1849014808);
        setField(term57056, term57056.getClass(), "graph", null);
        setIntElement(term57058, 0, 452254325);
        setIntElement(term57058, 1, 68487577);
        setIntElement(term57058, 2, 225702811);
        setIntElement(term57058, 3, 243703890);
        setField(term57056, term57056.getClass(), "vertices", term57058);
        setIntField(term57056, term57056.getClass(), "numVertices", -2015558089);
        setIntField(term57056, term57056.getClass(), "first", -1965545269);
        setField(term57065, term57065.getClass(), "words", term57066);
        setIntField(term57065, term57065.getClass(), "wordsInUse", -1898898123);
        setBooleanField(term57065, term57065.getClass(), "sizeIsSticky", false);
        setField(term57056, term57056.getClass(), "bitset", term57065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term57056, args);
    }

};


