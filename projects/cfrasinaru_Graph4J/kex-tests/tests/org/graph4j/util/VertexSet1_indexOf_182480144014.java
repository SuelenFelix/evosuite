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

public class VertexSet1_indexOf_182480144014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71579;
     Object term71582;

    public VertexSet1_indexOf_182480144014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71579 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        setField(term71579, term71579.getClass(), "posMap", null);
        setField(term71579, term71579.getClass(), "graph", null);
        setField(term71579, term71579.getClass(), "vertices", null);
        setIntField(term71579, term71579.getClass(), "numVertices", 0);
        setIntField(term71579, term71579.getClass(), "first", 0);
        setField(term71579, term71579.getClass(), "bitset", null);
        term71582 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71582;
        callMethod(klass, "indexOf", argTypes, term71579, args);
    }

};


