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

public class OrderedDigraph_predecessors_90907178619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2737;
     Object term2740;

    public OrderedDigraph_predecessors_90907178619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2737 = newInstance(Class.forName("org.graph4j.isomorphism.OrderedDigraph"));
        setField(term2737, term2737.getClass(), "dg", null);
        setIntField(term2737, term2737.getClass(), "n", 0);
        setField(term2737, term2737.getClass(), "predecessors", null);
        setField(term2737, term2737.getClass(), "successors", null);
        setField(term2737, term2737.getClass(), "edges", null);
        setField(term2737, term2737.getClass(), "adjMatrix", null);
        setField(term2737, term2737.getClass(), "orderToVertex", null);
        setField(term2737, term2737.getClass(), "vertexToOrder", null);
        setBooleanField(term2737, term2737.getClass(), "cache", false);
        term2740 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.OrderedDigraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2740;
        callMethod(klass, "predecessors", argTypes, term2737, args);
    }

};


