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

public class VertexList_union_104576868127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2679;

    public VertexList_union_104576868127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2679 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        setField(term2679, term2679.getClass(), "graph", null);
        setField(term2679, term2679.getClass(), "vertices", null);
        setIntField(term2679, term2679.getClass(), "numVertices", 0);
        setIntField(term2679, term2679.getClass(), "first", 0);
        setField(term2679, term2679.getClass(), "bitset", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "union", argTypes, term2679, args);
    }

};


