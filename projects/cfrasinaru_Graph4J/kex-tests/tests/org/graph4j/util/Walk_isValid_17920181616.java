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

public class Walk_isValid_17920181616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7733;

    public Walk_isValid_17920181616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7733 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term7735 = (int[]) newIntArray(8);
        Object term7746 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7747 = (long[]) newLongArray(1);
        setIntField(term7733, term7733.getClass(), "numEdges", -371717995);
        setField(term7733, term7733.getClass(), "graph", null);
        setIntElement(term7735, 0, 1713005479);
        setIntElement(term7735, 1, -1948910444);
        setIntElement(term7735, 2, -1099061955);
        setIntElement(term7735, 3, -1672904007);
        setIntElement(term7735, 4, -217232010);
        setIntElement(term7735, 5, 2053372601);
        setIntElement(term7735, 6, -1828855069);
        setIntElement(term7735, 7, -1213694931);
        setField(term7733, term7733.getClass(), "vertices", term7735);
        setIntField(term7733, term7733.getClass(), "numVertices", -1255656944);
        setIntField(term7733, term7733.getClass(), "first", -377697034);
        setField(term7746, term7746.getClass(), "words", term7747);
        setIntField(term7746, term7746.getClass(), "wordsInUse", 1102778743);
        setBooleanField(term7746, term7746.getClass(), "sizeIsSticky", true);
        setField(term7733, term7733.getClass(), "bitset", term7746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term7733, args);
    }

};


