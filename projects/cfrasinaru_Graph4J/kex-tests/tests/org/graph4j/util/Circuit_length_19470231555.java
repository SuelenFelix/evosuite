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

public class Circuit_length_19470231555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99191;

    public Circuit_length_19470231555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99191 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term99193 = (int[]) newIntArray(3);
        Object term99199 = newInstance(Class.forName("java.util.BitSet"));
        long[] term99200 = (long[]) newLongArray(1);
        setIntField(term99191, term99191.getClass(), "numEdges", -1876169905);
        setField(term99191, term99191.getClass(), "graph", null);
        setIntElement(term99193, 0, -243506348);
        setIntElement(term99193, 1, 76715835);
        setIntElement(term99193, 2, -1207102661);
        setField(term99191, term99191.getClass(), "vertices", term99193);
        setIntField(term99191, term99191.getClass(), "numVertices", -2824097);
        setIntField(term99191, term99191.getClass(), "first", 322011644);
        setField(term99199, term99199.getClass(), "words", term99200);
        setIntField(term99199, term99199.getClass(), "wordsInUse", -1229888447);
        setBooleanField(term99199, term99199.getClass(), "sizeIsSticky", true);
        setField(term99191, term99191.getClass(), "bitset", term99199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "length", argTypes, term99191, args);
    }

};


