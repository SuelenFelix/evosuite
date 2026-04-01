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

public class ParallelExtremaCalculator_getDiameter_116376006510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3755;

    public ParallelExtremaCalculator_getDiameter_116376006510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3755 = newInstance(Class.forName("org.graph4j.metrics.ParallelExtremaCalculator"));
        setIntField(term3755, term3755.getClass(), "radiusLB", 0);
        setIntField(term3755, term3755.getClass(), "radiusUB", 0);
        setIntField(term3755, term3755.getClass(), "diamLB", 0);
        setIntField(term3755, term3755.getClass(), "diamUB", 0);
        setField(term3755, term3755.getClass(), "eccLB", null);
        setField(term3755, term3755.getClass(), "eccUB", null);
        setField(term3755, term3755.getClass(), "candidates", null);
        setBooleanField(term3755, term3755.getClass(), "selector", false);
        setBooleanField(term3755, term3755.getClass(), "connected", false);
        setField(term3755, term3755.getClass(), "radius", null);
        setField(term3755, term3755.getClass(), "diameter", null);
        setField(term3755, term3755.getClass(), "center", null);
        setField(term3755, term3755.getClass(), "periphery", null);
        setField(term3755, term3755.getClass(), "extremaType", null);
        setField(term3755, term3755.getClass(), "graph", null);
        setBooleanField(term3755, term3755.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiameter", argTypes, term3755, args);
    }

};


