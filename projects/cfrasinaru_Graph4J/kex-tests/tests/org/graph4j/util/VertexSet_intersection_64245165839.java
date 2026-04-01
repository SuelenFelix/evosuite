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

public class VertexSet_intersection_64245165839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150628;

    public VertexSet_intersection_64245165839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150628 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term150628, term150628.getClass(), "posMap", null);
        setField(term150628, term150628.getClass(), "graph", null);
        setField(term150628, term150628.getClass(), "vertices", null);
        setIntField(term150628, term150628.getClass(), "numVertices", 0);
        setIntField(term150628, term150628.getClass(), "first", 0);
        setField(term150628, term150628.getClass(), "bitset", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "intersection", argTypes, term150628, args);
    }

};


