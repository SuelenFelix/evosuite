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

public class EdgeConnectivityAlgorithm_getMaximumDisjointPaths_28490405211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term918;
     Object term920;
     Object term922;

    public EdgeConnectivityAlgorithm_getMaximumDisjointPaths_28490405211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term918 = newInstance(Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm"));
        setField(term918, term918.getClass(), "network", null);
        setField(term918, term918.getClass(), "globalMinCut", null);
        setField(term918, term918.getClass(), "connectivityNumber", null);
        setField(term918, term918.getClass(), "graph", null);
        setBooleanField(term918, term918.getClass(), "directed", false);
        term920 = new Integer(0);
        term922 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term920;
        args[1] = term922;
        callMethod(klass, "getMaximumDisjointPaths", argTypes, term918, args);
    }

};


