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

public class VertexConnectivityAlgorithm_countMaximumDisjointPaths_17470565905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70604;
     Object term70607;
     Object term70609;

    public VertexConnectivityAlgorithm_countMaximumDisjointPaths_17470565905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70604 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        setField(term70604, term70604.getClass(), "network", null);
        setField(term70604, term70604.getClass(), "globalMinCut", null);
        setField(term70604, term70604.getClass(), "connectivityNumber", null);
        setBooleanField(term70604, term70604.getClass(), "computed", false);
        setField(term70604, term70604.getClass(), "graph", null);
        setBooleanField(term70604, term70604.getClass(), "directed", false);
        term70607 = new Integer(0);
        term70609 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term70607;
        args[1] = term70609;
        callMethod(klass, "countMaximumDisjointPaths", argTypes, term70604, args);
    }

};


