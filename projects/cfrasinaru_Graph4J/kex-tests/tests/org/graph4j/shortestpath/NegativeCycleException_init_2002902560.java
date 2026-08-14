package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NegativeCycleException_init_2002902560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3312;

    public NegativeCycleException_init_2002902560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3312 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term3314 = (int[]) newIntArray(6);
        Object term3323 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3324 = (long[]) newLongArray(1);
        setIntField(term3312, term3312.getClass(), "numEdges", -1398142433);
        setField(term3312, term3312.getClass(), "graph", null);
        setIntElement(term3314, 0, -1112119058);
        setIntElement(term3314, 1, 2073858334);
        setIntElement(term3314, 2, -1693535639);
        setIntElement(term3314, 3, 1344744036);
        setIntElement(term3314, 4, -98060427);
        setIntElement(term3314, 5, -1272268399);
        setField(term3312, term3312.getClass(), "vertices", term3314);
        setIntField(term3312, term3312.getClass(), "numVertices", 1120271104);
        setIntField(term3312, term3312.getClass(), "first", -128435804);
        setField(term3323, term3323.getClass(), "words", term3324);
        setIntField(term3323, term3323.getClass(), "wordsInUse", 2136158480);
        setBooleanField(term3323, term3323.getClass(), "sizeIsSticky", false);
        setField(term3312, term3312.getClass(), "bitset", term3323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.NegativeCycleException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.Cycle");
        Object[] args = new Object[1];
        args[0] = term3312;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


