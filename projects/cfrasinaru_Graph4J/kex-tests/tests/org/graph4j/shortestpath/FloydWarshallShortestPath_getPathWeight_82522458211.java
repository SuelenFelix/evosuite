package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class FloydWarshallShortestPath_getPathWeight_82522458211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1646;
     Object term1648;
     Object term1650;

    public FloydWarshallShortestPath_getPathWeight_82522458211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1646 = newInstance(Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath"));
        setField(term1646, term1646.getClass(), "cost", null);
        setField(term1646, term1646.getClass(), "before", null);
        setField(term1646, term1646.getClass(), "graph", null);
        setBooleanField(term1646, term1646.getClass(), "directed", false);
        term1648 = new Integer(0);
        term1650 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1648;
        args[1] = term1650;
        callMethod(klass, "getPathWeight", argTypes, term1646, args);
    }

};


