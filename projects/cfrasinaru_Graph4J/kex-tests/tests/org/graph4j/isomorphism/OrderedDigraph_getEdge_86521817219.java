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

public class OrderedDigraph_getEdge_86521817219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69421;
     Object term69424;
     Object term69426;

    public OrderedDigraph_getEdge_86521817219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69421 = newInstance(Class.forName("org.graph4j.isomorphism.OrderedDigraph"));
        setField(term69421, term69421.getClass(), "dg", null);
        setIntField(term69421, term69421.getClass(), "n", 0);
        setField(term69421, term69421.getClass(), "predecessors", null);
        setField(term69421, term69421.getClass(), "successors", null);
        setField(term69421, term69421.getClass(), "edges", null);
        setField(term69421, term69421.getClass(), "adjMatrix", null);
        setField(term69421, term69421.getClass(), "orderToVertex", null);
        setField(term69421, term69421.getClass(), "vertexToOrder", null);
        setBooleanField(term69421, term69421.getClass(), "cache", false);
        term69424 = new Integer(0);
        term69426 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.OrderedDigraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term69424;
        args[1] = term69426;
        callMethod(klass, "getEdge", argTypes, term69421, args);
    }

};


