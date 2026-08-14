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

public class VertexList_add_157617762319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2637;
     Object term2640;

    public VertexList_add_157617762319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2637 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        setField(term2637, term2637.getClass(), "graph", null);
        setField(term2637, term2637.getClass(), "vertices", null);
        setIntField(term2637, term2637.getClass(), "numVertices", 0);
        setIntField(term2637, term2637.getClass(), "first", 0);
        setField(term2637, term2637.getClass(), "bitset", null);
        term2640 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2640;
        callMethod(klass, "add", argTypes, term2637, args);
    }

};


