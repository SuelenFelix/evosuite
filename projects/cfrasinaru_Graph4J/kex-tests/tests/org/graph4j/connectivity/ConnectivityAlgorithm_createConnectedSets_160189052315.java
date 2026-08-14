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

public class ConnectivityAlgorithm_createConnectedSets_160189052315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3745;

    public ConnectivityAlgorithm_createConnectedSets_160189052315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3745 = newInstance(Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm"));
        setField(term3745, term3745.getClass(), "connected", null);
        setField(term3745, term3745.getClass(), "connectedSets", null);
        setField(term3745, term3745.getClass(), "vertexSetMap", null);
        setField(term3745, term3745.getClass(), "components", null);
        setField(term3745, term3745.getClass(), "componentMap", null);
        setField(term3745, term3745.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createConnectedSets", argTypes, term3745, args);
    }

};


