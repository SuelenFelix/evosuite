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

public class EdgeConnectivityAlgorithm_countMaximumDisjointPaths_843826319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term906;
     Object term908;
     Object term910;

    public EdgeConnectivityAlgorithm_countMaximumDisjointPaths_843826319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term906 = newInstance(Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm"));
        setField(term906, term906.getClass(), "network", null);
        setField(term906, term906.getClass(), "globalMinCut", null);
        setField(term906, term906.getClass(), "connectivityNumber", null);
        setField(term906, term906.getClass(), "graph", null);
        setBooleanField(term906, term906.getClass(), "directed", false);
        term908 = new Integer(0);
        term910 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term908;
        args[1] = term910;
        callMethod(klass, "countMaximumDisjointPaths", argTypes, term906, args);
    }

};


