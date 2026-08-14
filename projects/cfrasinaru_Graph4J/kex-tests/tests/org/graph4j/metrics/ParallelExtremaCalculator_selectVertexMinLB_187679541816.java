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

public class ParallelExtremaCalculator_selectVertexMinLB_187679541816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3803;

    public ParallelExtremaCalculator_selectVertexMinLB_187679541816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3803 = newInstance(Class.forName("org.graph4j.metrics.ParallelExtremaCalculator"));
        setIntField(term3803, term3803.getClass(), "radiusLB", 0);
        setIntField(term3803, term3803.getClass(), "radiusUB", 0);
        setIntField(term3803, term3803.getClass(), "diamLB", 0);
        setIntField(term3803, term3803.getClass(), "diamUB", 0);
        setField(term3803, term3803.getClass(), "eccLB", null);
        setField(term3803, term3803.getClass(), "eccUB", null);
        setField(term3803, term3803.getClass(), "candidates", null);
        setBooleanField(term3803, term3803.getClass(), "selector", false);
        setBooleanField(term3803, term3803.getClass(), "connected", false);
        setField(term3803, term3803.getClass(), "radius", null);
        setField(term3803, term3803.getClass(), "diameter", null);
        setField(term3803, term3803.getClass(), "center", null);
        setField(term3803, term3803.getClass(), "periphery", null);
        setField(term3803, term3803.getClass(), "extremaType", null);
        setField(term3803, term3803.getClass(), "graph", null);
        setBooleanField(term3803, term3803.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertexMinLB", argTypes, term3803, args);
    }

};


