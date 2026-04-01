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

public class BFSSinglePairShortestPath_getSource_204919708210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2673;

    public BFSSinglePairShortestPath_getSource_204919708210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2673 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        setIntField(term2673, term2673.getClass(), "source", 0);
        setIntField(term2673, term2673.getClass(), "target", 0);
        setField(term2673, term2673.getClass(), "forbiddenVertices", null);
        setField(term2673, term2673.getClass(), "bestPath", null);
        setDoubleField(term2673, term2673.getClass(), "bestWeight", 0.0);
        setField(term2673, term2673.getClass(), "graph", null);
        setBooleanField(term2673, term2673.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term2673, args);
    }

};


