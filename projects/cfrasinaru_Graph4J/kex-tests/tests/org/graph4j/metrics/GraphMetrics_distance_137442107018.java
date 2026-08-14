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

public class GraphMetrics_distance_137442107018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6049;
     Object term6051;
     Object term6053;

    public GraphMetrics_distance_137442107018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6049 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        setField(term6049, term6049.getClass(), "extremaCalculator", null);
        setField(term6049, term6049.getClass(), "dist", null);
        setField(term6049, term6049.getClass(), "ecc", null);
        setField(term6049, term6049.getClass(), "girth", null);
        setField(term6049, term6049.getClass(), "diameter", null);
        setField(term6049, term6049.getClass(), "pseudoDiameter", null);
        setField(term6049, term6049.getClass(), "radius", null);
        setField(term6049, term6049.getClass(), "center", null);
        setField(term6049, term6049.getClass(), "periphery", null);
        setField(term6049, term6049.getClass(), "graph", null);
        setBooleanField(term6049, term6049.getClass(), "directed", false);
        term6051 = new Integer(0);
        term6053 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term6051;
        args[1] = term6053;
        callMethod(klass, "distance", argTypes, term6049, args);
    }

};


