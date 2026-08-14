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

public class VertexHeap_add_15763829297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term515;
     Object term532;

    public VertexHeap_add_15763829297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term515 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term516 = (int[]) newIntArray(9);
        int[] term526 = (int[]) newIntArray(4);
        setField(term515, term515.getClass(), "graph", null);
        setField(term515, term515.getClass(), "comparator", null);
        setIntElement(term516, 0, -2015048153);
        setIntElement(term516, 1, -2063457669);
        setIntElement(term516, 2, -1222006000);
        setIntElement(term516, 3, 2095798786);
        setIntElement(term516, 4, -1565502840);
        setIntElement(term516, 5, 344323424);
        setIntElement(term516, 6, 9726679);
        setIntElement(term516, 7, -25637976);
        setIntElement(term516, 8, 1555897383);
        setField(term515, term515.getClass(), "keys", term516);
        setIntElement(term526, 0, 202001407);
        setIntElement(term526, 1, 158873461);
        setIntElement(term526, 2, -430151637);
        setIntElement(term526, 3, -1697741339);
        setField(term515, term515.getClass(), "positions", term526);
        setIntField(term515, term515.getClass(), "size", 98922530);
        term532 = new Integer(-1388471422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term532;
        callMethod(klass, "add", argTypes, term515, args);
    }

};


