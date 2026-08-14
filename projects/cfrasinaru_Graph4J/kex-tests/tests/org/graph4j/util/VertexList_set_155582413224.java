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

public class VertexList_set_155582413224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2662;
     Object term2665;
     Object term2667;

    public VertexList_set_155582413224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2662 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        setField(term2662, term2662.getClass(), "graph", null);
        setField(term2662, term2662.getClass(), "vertices", null);
        setIntField(term2662, term2662.getClass(), "numVertices", 0);
        setIntField(term2662, term2662.getClass(), "first", 0);
        setField(term2662, term2662.getClass(), "bitset", null);
        term2665 = new Integer(0);
        term2667 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2665;
        args[1] = term2667;
        callMethod(klass, "set", argTypes, term2662, args);
    }

};


