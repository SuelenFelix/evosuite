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

public class VertexList_removeFromPos_51308365018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66553;
     Object term66556;

    public VertexList_removeFromPos_51308365018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66553 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        setField(term66553, term66553.getClass(), "graph", null);
        setField(term66553, term66553.getClass(), "vertices", null);
        setIntField(term66553, term66553.getClass(), "numVertices", 0);
        setIntField(term66553, term66553.getClass(), "first", 0);
        setField(term66553, term66553.getClass(), "bitset", null);
        term66556 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66556;
        callMethod(klass, "removeFromPos", argTypes, term66553, args);
    }

};


