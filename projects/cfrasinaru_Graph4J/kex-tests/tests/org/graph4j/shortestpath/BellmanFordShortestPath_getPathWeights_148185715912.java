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

public class BellmanFordShortestPath_getPathWeights_148185715912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2226;

    public BellmanFordShortestPath_getPathWeights_148185715912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2226 = newInstance(Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath"));
        setIntField(term2226, term2226.getClass(), "source", 0);
        setField(term2226, term2226.getClass(), "cost", null);
        setField(term2226, term2226.getClass(), "before", null);
        setField(term2226, term2226.getClass(), "size", null);
        setField(term2226, term2226.getClass(), "graph", null);
        setBooleanField(term2226, term2226.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeights", argTypes, term2226, args);
    }

};


