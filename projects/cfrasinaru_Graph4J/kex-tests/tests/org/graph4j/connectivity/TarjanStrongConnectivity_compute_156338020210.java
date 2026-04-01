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

public class TarjanStrongConnectivity_compute_156338020210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6452;
     Object term6453;

    public TarjanStrongConnectivity_compute_156338020210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6452 = newInstance(Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity"));
        setField(term6452, term6452.getClass(), "compSets", null);
        setField(term6452, term6452.getClass(), "vertexComp", null);
        setField(term6452, term6452.getClass(), "graph", null);
        setField(term6452, term6452.getClass(), "stronglyConnected", null);
        term6453 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6453;
        callMethod(klass, "compute", argTypes, term6452, args);
    }

};


