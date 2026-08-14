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
import java.lang.Boolean;
import java.lang.Object;

public class BridgeDetectionAlgorithm_Visitor_init_6511319410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1484;
     Object term1488;

    public BridgeDetectionAlgorithm_Visitor_init_6511319410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1485 = new Boolean(false);
        term1484 = newInstance(Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm"));
        Object term1487 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term1484, term1484.getClass(), "bridgeless", term1485);
        setField(term1487, term1487.getClass(), "graph", null);
        setField(term1487, term1487.getClass(), "map", null);
        setField(term1484, term1484.getClass(), "bridges", term1487);
        setField(term1484, term1484.getClass(), "graph", null);
        term1488 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm$Visitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1484;
        args[1] = term1488;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


