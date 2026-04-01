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

public class EdgeConnectivityAlgorithm_getMinimumCut_57766596510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term912;
     Object term914;
     Object term916;

    public EdgeConnectivityAlgorithm_getMinimumCut_57766596510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term912 = newInstance(Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm"));
        setField(term912, term912.getClass(), "network", null);
        setField(term912, term912.getClass(), "globalMinCut", null);
        setField(term912, term912.getClass(), "connectivityNumber", null);
        setField(term912, term912.getClass(), "graph", null);
        setBooleanField(term912, term912.getClass(), "directed", false);
        term914 = new Integer(0);
        term916 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term914;
        args[1] = term916;
        callMethod(klass, "getMinimumCut", argTypes, term912, args);
    }

};


