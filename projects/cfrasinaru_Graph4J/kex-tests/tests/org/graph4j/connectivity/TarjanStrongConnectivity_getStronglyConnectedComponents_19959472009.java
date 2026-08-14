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

public class TarjanStrongConnectivity_getStronglyConnectedComponents_19959472009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6451;

    public TarjanStrongConnectivity_getStronglyConnectedComponents_19959472009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6451 = newInstance(Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity"));
        setField(term6451, term6451.getClass(), "compSets", null);
        setField(term6451, term6451.getClass(), "vertexComp", null);
        setField(term6451, term6451.getClass(), "graph", null);
        setField(term6451, term6451.getClass(), "stronglyConnected", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStronglyConnectedComponents", argTypes, term6451, args);
    }

};


