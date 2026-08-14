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

public class GraphExtremaCalculator_compute_134634434015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9977;

    public GraphExtremaCalculator_compute_134634434015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9977 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        setIntField(term9977, term9977.getClass(), "radiusLB", 0);
        setIntField(term9977, term9977.getClass(), "radiusUB", 0);
        setIntField(term9977, term9977.getClass(), "diamLB", 0);
        setIntField(term9977, term9977.getClass(), "diamUB", 0);
        setField(term9977, term9977.getClass(), "eccLB", null);
        setField(term9977, term9977.getClass(), "eccUB", null);
        setField(term9977, term9977.getClass(), "dist", null);
        setField(term9977, term9977.getClass(), "candidates", null);
        setBooleanField(term9977, term9977.getClass(), "selector", false);
        setBooleanField(term9977, term9977.getClass(), "connected", false);
        setField(term9977, term9977.getClass(), "radius", null);
        setField(term9977, term9977.getClass(), "diameter", null);
        setField(term9977, term9977.getClass(), "center", null);
        setField(term9977, term9977.getClass(), "periphery", null);
        setField(term9977, term9977.getClass(), "extremaType", null);
        setField(term9977, term9977.getClass(), "graph", null);
        setBooleanField(term9977, term9977.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term9977, args);
    }

};


