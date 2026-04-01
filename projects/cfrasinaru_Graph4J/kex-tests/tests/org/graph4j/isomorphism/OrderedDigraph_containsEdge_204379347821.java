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

public class OrderedDigraph_containsEdge_204379347821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2747;
     Object term2750;
     Object term2752;

    public OrderedDigraph_containsEdge_204379347821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2747 = newInstance(Class.forName("org.graph4j.isomorphism.OrderedDigraph"));
        setField(term2747, term2747.getClass(), "dg", null);
        setIntField(term2747, term2747.getClass(), "n", 0);
        setField(term2747, term2747.getClass(), "predecessors", null);
        setField(term2747, term2747.getClass(), "successors", null);
        setField(term2747, term2747.getClass(), "edges", null);
        setField(term2747, term2747.getClass(), "adjMatrix", null);
        setField(term2747, term2747.getClass(), "orderToVertex", null);
        setField(term2747, term2747.getClass(), "vertexToOrder", null);
        setBooleanField(term2747, term2747.getClass(), "cache", false);
        term2750 = new Integer(0);
        term2752 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.OrderedDigraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2750;
        args[1] = term2752;
        callMethod(klass, "containsEdge", argTypes, term2747, args);
    }

};


