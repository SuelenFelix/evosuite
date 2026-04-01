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

public class VertexQueue_add_521555643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101165;
     Object term101181;

    public VertexQueue_add_521555643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101165 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        int[] term101166 = (int[]) newIntArray(7);
        Object term101176 = newInstance(Class.forName("java.util.BitSet"));
        long[] term101177 = (long[]) newLongArray(1);
        setField(term101165, term101165.getClass(), "graph", null);
        setIntElement(term101166, 0, -576493446);
        setIntElement(term101166, 1, -1572345282);
        setIntElement(term101166, 2, 1765609258);
        setIntElement(term101166, 3, -1945295087);
        setIntElement(term101166, 4, -1903576173);
        setIntElement(term101166, 5, -1319276860);
        setIntElement(term101166, 6, 1890049926);
        setField(term101165, term101165.getClass(), "vertices", term101166);
        setIntField(term101165, term101165.getClass(), "numVertices", -100019307);
        setIntField(term101165, term101165.getClass(), "first", -974141882);
        setField(term101176, term101176.getClass(), "words", term101177);
        setIntField(term101176, term101176.getClass(), "wordsInUse", -1827802290);
        setBooleanField(term101176, term101176.getClass(), "sizeIsSticky", true);
        setField(term101165, term101165.getClass(), "bitset", term101176);
        term101181 = new Integer(1663558379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexQueue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term101181;
        callMethod(klass, "add", argTypes, term101165, args);
    }

};


