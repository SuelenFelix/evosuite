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

public class JohnsonShortestPath_compute_175175254413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1007;
     Object term1009;

    public JohnsonShortestPath_compute_175175254413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1007 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        setField(term1007, term1007.getClass(), "auxGraph", null);
        setField(term1007, term1007.getClass(), "h", null);
        setField(term1007, term1007.getClass(), "algs", null);
        setField(term1007, term1007.getClass(), "weights", null);
        setField(term1007, term1007.getClass(), "graph", null);
        setBooleanField(term1007, term1007.getClass(), "directed", false);
        term1009 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1009;
        callMethod(klass, "compute", argTypes, term1007, args);
    }

};


