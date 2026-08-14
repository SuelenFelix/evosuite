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

public class OrderedDigraph_successors_17929168839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68569;
     Object term68572;

    public OrderedDigraph_successors_17929168839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68569 = newInstance(Class.forName("org.graph4j.isomorphism.OrderedDigraph"));
        setField(term68569, term68569.getClass(), "dg", null);
        setIntField(term68569, term68569.getClass(), "n", 0);
        setField(term68569, term68569.getClass(), "predecessors", null);
        setField(term68569, term68569.getClass(), "successors", null);
        setField(term68569, term68569.getClass(), "edges", null);
        setField(term68569, term68569.getClass(), "adjMatrix", null);
        setField(term68569, term68569.getClass(), "orderToVertex", null);
        setField(term68569, term68569.getClass(), "vertexToOrder", null);
        setBooleanField(term68569, term68569.getClass(), "cache", false);
        term68572 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.OrderedDigraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term68572;
        callMethod(klass, "successors", argTypes, term68569, args);
    }

};


