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

public class VertexConnectivityAlgorithm_getConnectivityNumber_89601769917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term707;

    public VertexConnectivityAlgorithm_getConnectivityNumber_89601769917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term707 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        setField(term707, term707.getClass(), "network", null);
        setField(term707, term707.getClass(), "globalMinCut", null);
        setField(term707, term707.getClass(), "connectivityNumber", null);
        setBooleanField(term707, term707.getClass(), "computed", false);
        setField(term707, term707.getClass(), "graph", null);
        setBooleanField(term707, term707.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConnectivityNumber", argTypes, term707, args);
    }

};


