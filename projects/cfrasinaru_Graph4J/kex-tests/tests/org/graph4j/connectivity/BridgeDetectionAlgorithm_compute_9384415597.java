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

public class BridgeDetectionAlgorithm_compute_9384415597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6660;
     Object term6661;

    public BridgeDetectionAlgorithm_compute_9384415597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6660 = newInstance(Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm"));
        setField(term6660, term6660.getClass(), "bridgeless", null);
        setField(term6660, term6660.getClass(), "bridges", null);
        setField(term6660, term6660.getClass(), "graph", null);
        term6661 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6661;
        callMethod(klass, "compute", argTypes, term6660, args);
    }

};


