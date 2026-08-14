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
import java.lang.Integer;

public class VertexHeap_contains_15274100236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495;
     Object term506;

    public VertexHeap_contains_15274100236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term496 = (int[]) newIntArray(3);
        int[] term500 = (int[]) newIntArray(4);
        setField(term495, term495.getClass(), "graph", null);
        setField(term495, term495.getClass(), "comparator", null);
        setIntElement(term496, 0, -341152642);
        setIntElement(term496, 1, -2015854073);
        setIntElement(term496, 2, 538259104);
        setField(term495, term495.getClass(), "keys", term496);
        setIntElement(term500, 0, 96566506);
        setIntElement(term500, 1, -343325701);
        setIntElement(term500, 2, 107945604);
        setIntElement(term500, 3, -1963464809);
        setField(term495, term495.getClass(), "positions", term500);
        setIntField(term495, term495.getClass(), "size", 71190297);
        term506 = new Integer(1202361360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term506;
        callMethod(klass, "contains", argTypes, term495, args);
    }

};


