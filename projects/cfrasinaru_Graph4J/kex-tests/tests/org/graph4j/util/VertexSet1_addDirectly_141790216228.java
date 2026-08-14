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

public class VertexSet1_addDirectly_141790216228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3193;
     Object term3196;

    public VertexSet1_addDirectly_141790216228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3193 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        setField(term3193, term3193.getClass(), "posMap", null);
        setField(term3193, term3193.getClass(), "graph", null);
        setField(term3193, term3193.getClass(), "vertices", null);
        setIntField(term3193, term3193.getClass(), "numVertices", 0);
        setIntField(term3193, term3193.getClass(), "first", 0);
        setField(term3193, term3193.getClass(), "bitset", null);
        term3196 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3196;
        callMethod(klass, "addDirectly", argTypes, term3193, args);
    }

};


