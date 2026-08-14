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

public class VertexConnectivityAlgorithm_getMinimumCut_2553744214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692;
     Object term695;
     Object term697;

    public VertexConnectivityAlgorithm_getMinimumCut_2553744214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term692 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        setField(term692, term692.getClass(), "network", null);
        setField(term692, term692.getClass(), "globalMinCut", null);
        setField(term692, term692.getClass(), "connectivityNumber", null);
        setBooleanField(term692, term692.getClass(), "computed", false);
        setField(term692, term692.getClass(), "graph", null);
        setBooleanField(term692, term692.getClass(), "directed", false);
        term695 = new Integer(0);
        term697 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term695;
        args[1] = term697;
        callMethod(klass, "getMinimumCut", argTypes, term692, args);
    }

};


