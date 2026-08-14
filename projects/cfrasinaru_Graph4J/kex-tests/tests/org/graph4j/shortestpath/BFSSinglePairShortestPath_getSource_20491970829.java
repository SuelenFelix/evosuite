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

public class BFSSinglePairShortestPath_getSource_20491970829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2668;

    public BFSSinglePairShortestPath_getSource_20491970829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2668 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        setIntField(term2668, term2668.getClass(), "source", 0);
        setIntField(term2668, term2668.getClass(), "target", 0);
        setField(term2668, term2668.getClass(), "forbiddenVertices", null);
        setField(term2668, term2668.getClass(), "bestPath", null);
        setDoubleField(term2668, term2668.getClass(), "bestWeight", 0.0);
        setField(term2668, term2668.getClass(), "graph", null);
        setBooleanField(term2668, term2668.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term2668, args);
    }

};


