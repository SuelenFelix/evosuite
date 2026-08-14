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

public class VertexSet_remove_206594697431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8517;
     Object term8520;

    public VertexSet_remove_206594697431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8517 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term8517, term8517.getClass(), "posMap", null);
        setField(term8517, term8517.getClass(), "graph", null);
        setField(term8517, term8517.getClass(), "vertices", null);
        setIntField(term8517, term8517.getClass(), "numVertices", 0);
        setIntField(term8517, term8517.getClass(), "first", 0);
        setField(term8517, term8517.getClass(), "bitset", null);
        term8520 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8520;
        callMethod(klass, "remove", argTypes, term8517, args);
    }

};


