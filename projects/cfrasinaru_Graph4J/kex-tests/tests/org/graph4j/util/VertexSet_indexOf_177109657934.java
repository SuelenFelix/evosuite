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

public class VertexSet_indexOf_177109657934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150609;
     Object term150612;

    public VertexSet_indexOf_177109657934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150609 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term150609, term150609.getClass(), "posMap", null);
        setField(term150609, term150609.getClass(), "graph", null);
        setField(term150609, term150609.getClass(), "vertices", null);
        setIntField(term150609, term150609.getClass(), "numVertices", 0);
        setIntField(term150609, term150609.getClass(), "first", 0);
        setField(term150609, term150609.getClass(), "bitset", null);
        term150612 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term150612;
        callMethod(klass, "indexOf", argTypes, term150609, args);
    }

};


