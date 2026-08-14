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

public class ConnectivityAlgorithm_getConnectedComponent_204752427517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3747;
     Object term3748;

    public ConnectivityAlgorithm_getConnectedComponent_204752427517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3747 = newInstance(Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm"));
        setField(term3747, term3747.getClass(), "connected", null);
        setField(term3747, term3747.getClass(), "connectedSets", null);
        setField(term3747, term3747.getClass(), "vertexSetMap", null);
        setField(term3747, term3747.getClass(), "components", null);
        setField(term3747, term3747.getClass(), "componentMap", null);
        setField(term3747, term3747.getClass(), "graph", null);
        term3748 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3748;
        callMethod(klass, "getConnectedComponent", argTypes, term3747, args);
    }

};


