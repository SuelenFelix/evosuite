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

public class BridgeDetectionAlgorithm_isBridgeless_5811389661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6644;

    public BridgeDetectionAlgorithm_isBridgeless_5811389661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term6645 = new Boolean(true);
        term6644 = newInstance(Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm"));
        Object term6647 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term6644, term6644.getClass(), "bridgeless", term6645);
        setField(term6647, term6647.getClass(), "graph", null);
        setField(term6647, term6647.getClass(), "map", null);
        setField(term6644, term6644.getClass(), "bridges", term6647);
        setField(term6644, term6644.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBridgeless", argTypes, term6644, args);
    }

};


