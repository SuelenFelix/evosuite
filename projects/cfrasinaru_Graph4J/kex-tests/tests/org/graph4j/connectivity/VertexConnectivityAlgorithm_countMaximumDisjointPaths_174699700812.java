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

public class VertexConnectivityAlgorithm_countMaximumDisjointPaths_174699700812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term680;
     Object term683;

    public VertexConnectivityAlgorithm_countMaximumDisjointPaths_174699700812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term680 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        setField(term680, term680.getClass(), "network", null);
        setField(term680, term680.getClass(), "globalMinCut", null);
        setField(term680, term680.getClass(), "connectivityNumber", null);
        setBooleanField(term680, term680.getClass(), "computed", false);
        setField(term680, term680.getClass(), "graph", null);
        setBooleanField(term680, term680.getClass(), "directed", false);
        term683 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term683;
        callMethod(klass, "countMaximumDisjointPaths", argTypes, term680, args);
    }

};


