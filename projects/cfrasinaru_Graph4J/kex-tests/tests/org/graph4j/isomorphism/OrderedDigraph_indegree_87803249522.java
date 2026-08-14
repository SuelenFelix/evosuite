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

public class OrderedDigraph_indegree_87803249522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2754;
     Object term2757;

    public OrderedDigraph_indegree_87803249522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2754 = newInstance(Class.forName("org.graph4j.isomorphism.OrderedDigraph"));
        setField(term2754, term2754.getClass(), "dg", null);
        setIntField(term2754, term2754.getClass(), "n", 0);
        setField(term2754, term2754.getClass(), "predecessors", null);
        setField(term2754, term2754.getClass(), "successors", null);
        setField(term2754, term2754.getClass(), "edges", null);
        setField(term2754, term2754.getClass(), "adjMatrix", null);
        setField(term2754, term2754.getClass(), "orderToVertex", null);
        setField(term2754, term2754.getClass(), "vertexToOrder", null);
        setBooleanField(term2754, term2754.getClass(), "cache", false);
        term2757 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.OrderedDigraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2757;
        callMethod(klass, "indegree", argTypes, term2754, args);
    }

};


