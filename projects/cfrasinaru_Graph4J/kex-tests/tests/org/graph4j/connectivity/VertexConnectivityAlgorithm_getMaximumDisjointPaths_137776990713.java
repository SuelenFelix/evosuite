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

public class VertexConnectivityAlgorithm_getMaximumDisjointPaths_137776990713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term685;
     Object term688;
     Object term690;

    public VertexConnectivityAlgorithm_getMaximumDisjointPaths_137776990713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term685 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        setField(term685, term685.getClass(), "network", null);
        setField(term685, term685.getClass(), "globalMinCut", null);
        setField(term685, term685.getClass(), "connectivityNumber", null);
        setBooleanField(term685, term685.getClass(), "computed", false);
        setField(term685, term685.getClass(), "graph", null);
        setBooleanField(term685, term685.getClass(), "directed", false);
        term688 = new Integer(0);
        term690 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term688;
        args[1] = term690;
        callMethod(klass, "getMaximumDisjointPaths", argTypes, term685, args);
    }

};


