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

public class BFSSinglePairShortestPath_findPath_9636329911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2678;

    public BFSSinglePairShortestPath_findPath_9636329911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2678 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        setIntField(term2678, term2678.getClass(), "source", 0);
        setIntField(term2678, term2678.getClass(), "target", 0);
        setField(term2678, term2678.getClass(), "forbiddenVertices", null);
        setField(term2678, term2678.getClass(), "bestPath", null);
        setDoubleField(term2678, term2678.getClass(), "bestWeight", 0.0);
        setField(term2678, term2678.getClass(), "graph", null);
        setBooleanField(term2678, term2678.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findPath", argTypes, term2678, args);
    }

};


