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

public class Trail_isValid_15135788503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4158;

    public Trail_isValid_15135788503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4158 = newInstance(Class.forName("org.graph4j.util.Trail"));
        int[] term4160 = (int[]) newIntArray(1);
        Object term4164 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4165 = (long[]) newLongArray(1);
        setIntField(term4158, term4158.getClass(), "numEdges", 1968287557);
        setField(term4158, term4158.getClass(), "graph", null);
        setIntElement(term4160, 0, 1101385603);
        setField(term4158, term4158.getClass(), "vertices", term4160);
        setIntField(term4158, term4158.getClass(), "numVertices", 1980267589);
        setIntField(term4158, term4158.getClass(), "first", -2009434910);
        setField(term4164, term4164.getClass(), "words", term4165);
        setIntField(term4164, term4164.getClass(), "wordsInUse", -374887532);
        setBooleanField(term4164, term4164.getClass(), "sizeIsSticky", true);
        setField(term4158, term4158.getClass(), "bitset", term4164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Trail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term4158, args);
    }

};


