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

public class BridgeDetectionAlgorithm_compute_9384415593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6652;
     Object term6656;

    public BridgeDetectionAlgorithm_compute_9384415593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term6653 = new Boolean(true);
        term6652 = newInstance(Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm"));
        Object term6655 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term6652, term6652.getClass(), "bridgeless", term6653);
        setField(term6655, term6655.getClass(), "graph", null);
        setField(term6655, term6655.getClass(), "map", null);
        setField(term6652, term6652.getClass(), "bridges", term6655);
        setField(term6652, term6652.getClass(), "graph", null);
        term6656 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6656;
        callMethod(klass, "compute", argTypes, term6652, args);
    }

};


