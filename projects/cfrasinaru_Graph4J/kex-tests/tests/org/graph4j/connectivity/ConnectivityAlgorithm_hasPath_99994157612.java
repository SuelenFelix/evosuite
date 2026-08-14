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

public class ConnectivityAlgorithm_hasPath_99994157612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3736;
     Object term3737;
     Object term3739;

    public ConnectivityAlgorithm_hasPath_99994157612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3736 = newInstance(Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm"));
        setField(term3736, term3736.getClass(), "connected", null);
        setField(term3736, term3736.getClass(), "connectedSets", null);
        setField(term3736, term3736.getClass(), "vertexSetMap", null);
        setField(term3736, term3736.getClass(), "components", null);
        setField(term3736, term3736.getClass(), "componentMap", null);
        setField(term3736, term3736.getClass(), "graph", null);
        term3737 = new Integer(0);
        term3739 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3737;
        args[1] = term3739;
        callMethod(klass, "hasPath", argTypes, term3736, args);
    }

};


