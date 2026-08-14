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

public class BFSSingleSourceShortestPath_compute_161784328514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621;
     Object term624;

    public BFSSingleSourceShortestPath_compute_161784328514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term621 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath"));
        setIntField(term621, term621.getClass(), "source", 0);
        setField(term621, term621.getClass(), "dist", null);
        setField(term621, term621.getClass(), "before", null);
        setField(term621, term621.getClass(), "graph", null);
        setBooleanField(term621, term621.getClass(), "directed", false);
        term624 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term624;
        callMethod(klass, "compute", argTypes, term621, args);
    }

};


