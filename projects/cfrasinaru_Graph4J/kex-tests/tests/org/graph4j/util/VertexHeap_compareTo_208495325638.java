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

public class VertexHeap_compareTo_208495325638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60430;
     Object term60432;
     Object term60434;

    public VertexHeap_compareTo_208495325638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60430 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        setField(term60430, term60430.getClass(), "graph", null);
        setField(term60430, term60430.getClass(), "comparator", null);
        setField(term60430, term60430.getClass(), "keys", null);
        setField(term60430, term60430.getClass(), "positions", null);
        setIntField(term60430, term60430.getClass(), "size", 0);
        term60432 = new Integer(0);
        term60434 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term60432;
        args[1] = term60434;
        callMethod(klass, "compareTo", argTypes, term60430, args);
    }

};


