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

public class BidirectionalDijkstra_getTarget_19449859298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106341;

    public BidirectionalDijkstra_getTarget_19449859298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106341 = newInstance(Class.forName("org.graph4j.shortestpath.BidirectionalDijkstra"));
        setIntField(term106341, term106341.getClass(), "source", 0);
        setIntField(term106341, term106341.getClass(), "target", 0);
        setField(term106341, term106341.getClass(), "vertices", null);
        setField(term106341, term106341.getClass(), "bestPath", null);
        setDoubleField(term106341, term106341.getClass(), "bestWeight", 0.0);
        setField(term106341, term106341.getClass(), "graph", null);
        setBooleanField(term106341, term106341.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BidirectionalDijkstra");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTarget", argTypes, term106341, args);
    }

};


