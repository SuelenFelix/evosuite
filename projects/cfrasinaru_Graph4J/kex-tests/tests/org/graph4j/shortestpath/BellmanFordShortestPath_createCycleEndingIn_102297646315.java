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

public class BellmanFordShortestPath_createCycleEndingIn_102297646315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2237;
     Object term2240;

    public BellmanFordShortestPath_createCycleEndingIn_102297646315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2237 = newInstance(Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath"));
        setIntField(term2237, term2237.getClass(), "source", 0);
        setField(term2237, term2237.getClass(), "cost", null);
        setField(term2237, term2237.getClass(), "before", null);
        setField(term2237, term2237.getClass(), "size", null);
        setField(term2237, term2237.getClass(), "graph", null);
        setBooleanField(term2237, term2237.getClass(), "directed", false);
        term2240 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2240;
        callMethod(klass, "createCycleEndingIn", argTypes, term2237, args);
    }

};


