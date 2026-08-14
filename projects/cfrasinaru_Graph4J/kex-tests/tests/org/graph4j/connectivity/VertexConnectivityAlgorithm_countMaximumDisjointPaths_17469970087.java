package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class VertexConnectivityAlgorithm_countMaximumDisjointPaths_17469970087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70633;
     Object term70636;

    public VertexConnectivityAlgorithm_countMaximumDisjointPaths_17469970087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70633 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        setField(term70633, term70633.getClass(), "network", null);
        setField(term70633, term70633.getClass(), "globalMinCut", null);
        setField(term70633, term70633.getClass(), "connectivityNumber", null);
        setBooleanField(term70633, term70633.getClass(), "computed", false);
        setField(term70633, term70633.getClass(), "graph", null);
        setBooleanField(term70633, term70633.getClass(), "directed", false);
        term70636 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70636;
        callMethod(klass, "countMaximumDisjointPaths", argTypes, term70633, args);
    }

};


