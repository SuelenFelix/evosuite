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

public class GraphExtremaCalculator_getDiameter_102484383611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9945;

    public GraphExtremaCalculator_getDiameter_102484383611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9945 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        setIntField(term9945, term9945.getClass(), "radiusLB", 0);
        setIntField(term9945, term9945.getClass(), "radiusUB", 0);
        setIntField(term9945, term9945.getClass(), "diamLB", 0);
        setIntField(term9945, term9945.getClass(), "diamUB", 0);
        setField(term9945, term9945.getClass(), "eccLB", null);
        setField(term9945, term9945.getClass(), "eccUB", null);
        setField(term9945, term9945.getClass(), "dist", null);
        setField(term9945, term9945.getClass(), "candidates", null);
        setBooleanField(term9945, term9945.getClass(), "selector", false);
        setBooleanField(term9945, term9945.getClass(), "connected", false);
        setField(term9945, term9945.getClass(), "radius", null);
        setField(term9945, term9945.getClass(), "diameter", null);
        setField(term9945, term9945.getClass(), "center", null);
        setField(term9945, term9945.getClass(), "periphery", null);
        setField(term9945, term9945.getClass(), "extremaType", null);
        setField(term9945, term9945.getClass(), "graph", null);
        setBooleanField(term9945, term9945.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiameter", argTypes, term9945, args);
    }

};


