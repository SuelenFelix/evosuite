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

public class EdgeConnectivityAlgorithm_getMinimumCut_57772746912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term924;

    public EdgeConnectivityAlgorithm_getMinimumCut_57772746912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term924 = newInstance(Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm"));
        setField(term924, term924.getClass(), "network", null);
        setField(term924, term924.getClass(), "globalMinCut", null);
        setField(term924, term924.getClass(), "connectivityNumber", null);
        setField(term924, term924.getClass(), "graph", null);
        setBooleanField(term924, term924.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCut", argTypes, term924, args);
    }

};


