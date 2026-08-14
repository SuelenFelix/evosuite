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

public class EdgeConnectivityAlgorithm_getConnectivityNumber_76665626013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term926;

    public EdgeConnectivityAlgorithm_getConnectivityNumber_76665626013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term926 = newInstance(Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm"));
        setField(term926, term926.getClass(), "network", null);
        setField(term926, term926.getClass(), "globalMinCut", null);
        setField(term926, term926.getClass(), "connectivityNumber", null);
        setField(term926, term926.getClass(), "graph", null);
        setBooleanField(term926, term926.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConnectivityNumber", argTypes, term926, args);
    }

};


