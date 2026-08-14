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

public class VertexSet_contains_157093984735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8535;
     Object term8538;

    public VertexSet_contains_157093984735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8535 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term8535, term8535.getClass(), "posMap", null);
        setField(term8535, term8535.getClass(), "graph", null);
        setField(term8535, term8535.getClass(), "vertices", null);
        setIntField(term8535, term8535.getClass(), "numVertices", 0);
        setIntField(term8535, term8535.getClass(), "first", 0);
        setField(term8535, term8535.getClass(), "bitset", null);
        term8538 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8538;
        callMethod(klass, "contains", argTypes, term8535, args);
    }

};


