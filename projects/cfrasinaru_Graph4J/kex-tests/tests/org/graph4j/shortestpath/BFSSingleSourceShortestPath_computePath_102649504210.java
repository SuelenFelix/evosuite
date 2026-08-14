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

public class BFSSingleSourceShortestPath_computePath_102649504210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term603;
     Object term606;

    public BFSSingleSourceShortestPath_computePath_102649504210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term603 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath"));
        setIntField(term603, term603.getClass(), "source", 0);
        setField(term603, term603.getClass(), "dist", null);
        setField(term603, term603.getClass(), "before", null);
        setField(term603, term603.getClass(), "graph", null);
        setBooleanField(term603, term603.getClass(), "directed", false);
        term606 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term606;
        callMethod(klass, "computePath", argTypes, term603, args);
    }

};


