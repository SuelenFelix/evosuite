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

public class BFSSinglePairShortestPath_getTarget_13908171210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119969;

    public BFSSinglePairShortestPath_getTarget_13908171210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119969 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        setIntField(term119969, term119969.getClass(), "source", 0);
        setIntField(term119969, term119969.getClass(), "target", 0);
        setField(term119969, term119969.getClass(), "forbiddenVertices", null);
        setField(term119969, term119969.getClass(), "bestPath", null);
        setDoubleField(term119969, term119969.getClass(), "bestWeight", 0.0);
        setField(term119969, term119969.getClass(), "graph", null);
        setBooleanField(term119969, term119969.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTarget", argTypes, term119969, args);
    }

};


