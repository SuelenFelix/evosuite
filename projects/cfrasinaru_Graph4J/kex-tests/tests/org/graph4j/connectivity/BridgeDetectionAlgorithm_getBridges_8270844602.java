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

public class BridgeDetectionAlgorithm_getBridges_8270844602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6648;

    public BridgeDetectionAlgorithm_getBridges_8270844602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term6649 = new Boolean(true);
        term6648 = newInstance(Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm"));
        Object term6651 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term6648, term6648.getClass(), "bridgeless", term6649);
        setField(term6651, term6651.getClass(), "graph", null);
        setField(term6651, term6651.getClass(), "map", null);
        setField(term6648, term6648.getClass(), "bridges", term6651);
        setField(term6648, term6648.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBridges", argTypes, term6648, args);
    }

};


