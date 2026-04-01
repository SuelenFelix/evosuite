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

public class DiameterCalculator_calculate_17719939967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10359;

    public DiameterCalculator_calculate_17719939967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10359 = newInstance(Class.forName("org.graph4j.metrics.DiameterCalculator"));
        setIntField(term10359, term10359.getClass(), "diamUB", 0);
        setIntField(term10359, term10359.getClass(), "diamLB", 0);
        setField(term10359, term10359.getClass(), "eccLB", null);
        setField(term10359, term10359.getClass(), "eccUB", null);
        setField(term10359, term10359.getClass(), "dist", null);
        setField(term10359, term10359.getClass(), "candidates", null);
        setBooleanField(term10359, term10359.getClass(), "selector", false);
        setField(term10359, term10359.getClass(), "graph", null);
        setBooleanField(term10359, term10359.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.DiameterCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculate", argTypes, term10359, args);
    }

};


