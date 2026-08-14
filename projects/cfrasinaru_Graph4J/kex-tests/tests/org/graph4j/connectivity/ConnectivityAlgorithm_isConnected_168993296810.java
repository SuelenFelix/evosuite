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

public class ConnectivityAlgorithm_isConnected_168993296810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3734;

    public ConnectivityAlgorithm_isConnected_168993296810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3734 = newInstance(Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm"));
        setField(term3734, term3734.getClass(), "connected", null);
        setField(term3734, term3734.getClass(), "connectedSets", null);
        setField(term3734, term3734.getClass(), "vertexSetMap", null);
        setField(term3734, term3734.getClass(), "components", null);
        setField(term3734, term3734.getClass(), "componentMap", null);
        setField(term3734, term3734.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isConnected", argTypes, term3734, args);
    }

};


