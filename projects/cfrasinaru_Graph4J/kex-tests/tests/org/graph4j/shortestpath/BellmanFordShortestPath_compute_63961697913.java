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

public class BellmanFordShortestPath_compute_63961697913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2229;

    public BellmanFordShortestPath_compute_63961697913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2229 = newInstance(Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath"));
        setIntField(term2229, term2229.getClass(), "source", 0);
        setField(term2229, term2229.getClass(), "cost", null);
        setField(term2229, term2229.getClass(), "before", null);
        setField(term2229, term2229.getClass(), "size", null);
        setField(term2229, term2229.getClass(), "graph", null);
        setBooleanField(term2229, term2229.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term2229, args);
    }

};


