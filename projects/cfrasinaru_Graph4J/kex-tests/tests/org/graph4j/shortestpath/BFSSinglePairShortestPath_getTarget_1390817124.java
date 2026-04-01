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

public class BFSSinglePairShortestPath_getTarget_1390817124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2567;

    public BFSSinglePairShortestPath_getTarget_1390817124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2567 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        setIntField(term2567, term2567.getClass(), "source", 0);
        setIntField(term2567, term2567.getClass(), "target", 0);
        setField(term2567, term2567.getClass(), "forbiddenVertices", null);
        setField(term2567, term2567.getClass(), "bestPath", null);
        setDoubleField(term2567, term2567.getClass(), "bestWeight", 0.0);
        setField(term2567, term2567.getClass(), "graph", null);
        setBooleanField(term2567, term2567.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTarget", argTypes, term2567, args);
    }

};


