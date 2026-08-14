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

public class VertexSet1_removeFromPos_51942801731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3206;
     Object term3209;

    public VertexSet1_removeFromPos_51942801731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3206 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        setField(term3206, term3206.getClass(), "posMap", null);
        setField(term3206, term3206.getClass(), "graph", null);
        setField(term3206, term3206.getClass(), "vertices", null);
        setIntField(term3206, term3206.getClass(), "numVertices", 0);
        setIntField(term3206, term3206.getClass(), "first", 0);
        setField(term3206, term3206.getClass(), "bitset", null);
        term3209 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3209;
        callMethod(klass, "removeFromPos", argTypes, term3206, args);
    }

};


