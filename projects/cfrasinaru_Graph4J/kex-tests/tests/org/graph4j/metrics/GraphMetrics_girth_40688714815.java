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

public class GraphMetrics_girth_40688714815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6037;

    public GraphMetrics_girth_40688714815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6037 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        setField(term6037, term6037.getClass(), "extremaCalculator", null);
        setField(term6037, term6037.getClass(), "dist", null);
        setField(term6037, term6037.getClass(), "ecc", null);
        setField(term6037, term6037.getClass(), "girth", null);
        setField(term6037, term6037.getClass(), "diameter", null);
        setField(term6037, term6037.getClass(), "pseudoDiameter", null);
        setField(term6037, term6037.getClass(), "radius", null);
        setField(term6037, term6037.getClass(), "center", null);
        setField(term6037, term6037.getClass(), "periphery", null);
        setField(term6037, term6037.getClass(), "graph", null);
        setBooleanField(term6037, term6037.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "girth", argTypes, term6037, args);
    }

};


