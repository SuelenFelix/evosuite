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

public class VertexHeap_remove_210947679810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601;
     Object term609;

    public VertexHeap_remove_210947679810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term601 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term602 = (int[]) newIntArray(2);
        int[] term605 = (int[]) newIntArray(2);
        setField(term601, term601.getClass(), "graph", null);
        setField(term601, term601.getClass(), "comparator", null);
        setIntElement(term602, 0, 197109649);
        setIntElement(term602, 1, -1239406390);
        setField(term601, term601.getClass(), "keys", term602);
        setIntElement(term605, 0, 1557431527);
        setIntElement(term605, 1, -1504890659);
        setField(term601, term601.getClass(), "positions", term605);
        setIntField(term601, term601.getClass(), "size", 1358829571);
        term609 = new Integer(991356662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term609;
        callMethod(klass, "remove", argTypes, term601, args);
    }

};


