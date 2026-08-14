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

public class JohnsonShortestPath_findPath_15102636299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term991;
     Object term993;
     Object term995;

    public JohnsonShortestPath_findPath_15102636299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term991 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        setField(term991, term991.getClass(), "auxGraph", null);
        setField(term991, term991.getClass(), "h", null);
        setField(term991, term991.getClass(), "algs", null);
        setField(term991, term991.getClass(), "weights", null);
        setField(term991, term991.getClass(), "graph", null);
        setBooleanField(term991, term991.getClass(), "directed", false);
        term993 = new Integer(0);
        term995 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term993;
        args[1] = term995;
        callMethod(klass, "findPath", argTypes, term991, args);
    }

};


