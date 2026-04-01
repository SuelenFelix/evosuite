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

public class BFSAllPairsShortestPath_getPathWeight_11257992878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316;
     Object term318;
     Object term320;

    public BFSAllPairsShortestPath_getPathWeight_11257992878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316 = newInstance(Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath"));
        setField(term316, term316.getClass(), "dist", null);
        setField(term316, term316.getClass(), "before", null);
        setField(term316, term316.getClass(), "graph", null);
        setBooleanField(term316, term316.getClass(), "directed", false);
        term318 = new Integer(0);
        term320 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term318;
        args[1] = term320;
        callMethod(klass, "getPathWeight", argTypes, term316, args);
    }

};


