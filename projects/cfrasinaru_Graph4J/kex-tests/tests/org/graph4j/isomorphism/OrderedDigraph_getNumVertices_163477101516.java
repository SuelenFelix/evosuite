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

public class OrderedDigraph_getNumVertices_163477101516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69408;

    public OrderedDigraph_getNumVertices_163477101516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69408 = newInstance(Class.forName("org.graph4j.isomorphism.OrderedDigraph"));
        setField(term69408, term69408.getClass(), "dg", null);
        setIntField(term69408, term69408.getClass(), "n", 0);
        setField(term69408, term69408.getClass(), "predecessors", null);
        setField(term69408, term69408.getClass(), "successors", null);
        setField(term69408, term69408.getClass(), "edges", null);
        setField(term69408, term69408.getClass(), "adjMatrix", null);
        setField(term69408, term69408.getClass(), "orderToVertex", null);
        setField(term69408, term69408.getClass(), "vertexToOrder", null);
        setBooleanField(term69408, term69408.getClass(), "cache", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.OrderedDigraph");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumVertices", argTypes, term69408, args);
    }

};


