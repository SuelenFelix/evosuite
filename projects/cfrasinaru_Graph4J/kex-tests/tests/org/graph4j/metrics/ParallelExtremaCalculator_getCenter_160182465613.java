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

public class ParallelExtremaCalculator_getCenter_160182465613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3779;

    public ParallelExtremaCalculator_getCenter_160182465613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3779 = newInstance(Class.forName("org.graph4j.metrics.ParallelExtremaCalculator"));
        setIntField(term3779, term3779.getClass(), "radiusLB", 0);
        setIntField(term3779, term3779.getClass(), "radiusUB", 0);
        setIntField(term3779, term3779.getClass(), "diamLB", 0);
        setIntField(term3779, term3779.getClass(), "diamUB", 0);
        setField(term3779, term3779.getClass(), "eccLB", null);
        setField(term3779, term3779.getClass(), "eccUB", null);
        setField(term3779, term3779.getClass(), "candidates", null);
        setBooleanField(term3779, term3779.getClass(), "selector", false);
        setBooleanField(term3779, term3779.getClass(), "connected", false);
        setField(term3779, term3779.getClass(), "radius", null);
        setField(term3779, term3779.getClass(), "diameter", null);
        setField(term3779, term3779.getClass(), "center", null);
        setField(term3779, term3779.getClass(), "periphery", null);
        setField(term3779, term3779.getClass(), "extremaType", null);
        setField(term3779, term3779.getClass(), "graph", null);
        setBooleanField(term3779, term3779.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCenter", argTypes, term3779, args);
    }

};


