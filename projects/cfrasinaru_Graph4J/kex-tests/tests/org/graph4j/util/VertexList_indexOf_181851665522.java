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

public class VertexList_indexOf_181851665522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66571;
     Object term66574;
     Object term66576;

    public VertexList_indexOf_181851665522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66571 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        setField(term66571, term66571.getClass(), "graph", null);
        setField(term66571, term66571.getClass(), "vertices", null);
        setIntField(term66571, term66571.getClass(), "numVertices", 0);
        setIntField(term66571, term66571.getClass(), "first", 0);
        setField(term66571, term66571.getClass(), "bitset", null);
        term66574 = new Integer(0);
        term66576 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term66574;
        args[1] = term66576;
        callMethod(klass, "indexOf", argTypes, term66571, args);
    }

};


