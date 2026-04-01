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

public class BidirectionalDijkstra_findPath_17095409189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106346;

    public BidirectionalDijkstra_findPath_17095409189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106346 = newInstance(Class.forName("org.graph4j.shortestpath.BidirectionalDijkstra"));
        setIntField(term106346, term106346.getClass(), "source", 0);
        setIntField(term106346, term106346.getClass(), "target", 0);
        setField(term106346, term106346.getClass(), "vertices", null);
        setField(term106346, term106346.getClass(), "bestPath", null);
        setDoubleField(term106346, term106346.getClass(), "bestWeight", 0.0);
        setField(term106346, term106346.getClass(), "graph", null);
        setBooleanField(term106346, term106346.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BidirectionalDijkstra");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findPath", argTypes, term106346, args);
    }

};


