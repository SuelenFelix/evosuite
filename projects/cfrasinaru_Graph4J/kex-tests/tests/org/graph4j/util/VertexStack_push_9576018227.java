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

public class VertexStack_push_9576018227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184212;
     Object term184215;

    public VertexStack_push_9576018227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184212 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        setField(term184212, term184212.getClass(), "graph", null);
        setField(term184212, term184212.getClass(), "vertices", null);
        setIntField(term184212, term184212.getClass(), "numVertices", 0);
        setIntField(term184212, term184212.getClass(), "first", 0);
        setField(term184212, term184212.getClass(), "bitset", null);
        term184215 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexStack");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term184215;
        callMethod(klass, "push", argTypes, term184212, args);
    }

};


