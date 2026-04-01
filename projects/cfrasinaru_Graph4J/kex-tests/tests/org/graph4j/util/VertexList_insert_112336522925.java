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

public class VertexList_insert_112336522925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66590;
     Object term66593;
     Object term66595;

    public VertexList_insert_112336522925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66590 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        setField(term66590, term66590.getClass(), "graph", null);
        setField(term66590, term66590.getClass(), "vertices", null);
        setIntField(term66590, term66590.getClass(), "numVertices", 0);
        setIntField(term66590, term66590.getClass(), "first", 0);
        setField(term66590, term66590.getClass(), "bitset", null);
        term66593 = new Integer(0);
        term66595 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term66593;
        args[1] = term66595;
        callMethod(klass, "insert", argTypes, term66590, args);
    }

};


