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
import java.lang.Integer;

public class GraphMetrics_eccentricity_157329977316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6039;
     Object term6041;

    public GraphMetrics_eccentricity_157329977316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6039 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        setField(term6039, term6039.getClass(), "extremaCalculator", null);
        setField(term6039, term6039.getClass(), "dist", null);
        setField(term6039, term6039.getClass(), "ecc", null);
        setField(term6039, term6039.getClass(), "girth", null);
        setField(term6039, term6039.getClass(), "diameter", null);
        setField(term6039, term6039.getClass(), "pseudoDiameter", null);
        setField(term6039, term6039.getClass(), "radius", null);
        setField(term6039, term6039.getClass(), "center", null);
        setField(term6039, term6039.getClass(), "periphery", null);
        setField(term6039, term6039.getClass(), "graph", null);
        setBooleanField(term6039, term6039.getClass(), "directed", false);
        term6041 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6041;
        callMethod(klass, "eccentricity", argTypes, term6039, args);
    }

};


