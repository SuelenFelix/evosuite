package org.graph4j.isomorphism;

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
import static org.graph4j.isomorphism.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class OrderedDigraph_getVertexOrder_112542017218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69416;
     Object term69419;

    public OrderedDigraph_getVertexOrder_112542017218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69416 = newInstance(Class.forName("org.graph4j.isomorphism.OrderedDigraph"));
        setField(term69416, term69416.getClass(), "dg", null);
        setIntField(term69416, term69416.getClass(), "n", 0);
        setField(term69416, term69416.getClass(), "predecessors", null);
        setField(term69416, term69416.getClass(), "successors", null);
        setField(term69416, term69416.getClass(), "edges", null);
        setField(term69416, term69416.getClass(), "adjMatrix", null);
        setField(term69416, term69416.getClass(), "orderToVertex", null);
        setField(term69416, term69416.getClass(), "vertexToOrder", null);
        setBooleanField(term69416, term69416.getClass(), "cache", false);
        term69419 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.OrderedDigraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term69419;
        callMethod(klass, "getVertexOrder", argTypes, term69416, args);
    }

};


