package org.graph4j.metrics;

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
import static org.graph4j.metrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GraphMetrics_pseudoDiameter_87086822022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6061;

    public GraphMetrics_pseudoDiameter_87086822022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6061 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        setField(term6061, term6061.getClass(), "extremaCalculator", null);
        setField(term6061, term6061.getClass(), "dist", null);
        setField(term6061, term6061.getClass(), "ecc", null);
        setField(term6061, term6061.getClass(), "girth", null);
        setField(term6061, term6061.getClass(), "diameter", null);
        setField(term6061, term6061.getClass(), "pseudoDiameter", null);
        setField(term6061, term6061.getClass(), "radius", null);
        setField(term6061, term6061.getClass(), "center", null);
        setField(term6061, term6061.getClass(), "periphery", null);
        setField(term6061, term6061.getClass(), "graph", null);
        setBooleanField(term6061, term6061.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pseudoDiameter", argTypes, term6061, args);
    }

};


