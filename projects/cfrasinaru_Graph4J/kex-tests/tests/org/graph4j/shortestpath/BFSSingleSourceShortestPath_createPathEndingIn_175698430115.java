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

public class BFSSingleSourceShortestPath_createPathEndingIn_175698430115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626;
     Object term629;

    public BFSSingleSourceShortestPath_createPathEndingIn_175698430115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term626 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath"));
        setIntField(term626, term626.getClass(), "source", 0);
        setField(term626, term626.getClass(), "dist", null);
        setField(term626, term626.getClass(), "before", null);
        setField(term626, term626.getClass(), "graph", null);
        setBooleanField(term626, term626.getClass(), "directed", false);
        term629 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term629;
        callMethod(klass, "createPathEndingIn", argTypes, term626, args);
    }

};


