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

public class RadiusCalculator_calculate_3230450717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6340;

    public RadiusCalculator_calculate_3230450717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6340 = newInstance(Class.forName("org.graph4j.metrics.RadiusCalculator"));
        setIntField(term6340, term6340.getClass(), "radiusLB", 0);
        setIntField(term6340, term6340.getClass(), "radiusUB", 0);
        setField(term6340, term6340.getClass(), "vertexSet", null);
        setField(term6340, term6340.getClass(), "eccLB", null);
        setField(term6340, term6340.getClass(), "eccUB", null);
        setField(term6340, term6340.getClass(), "dist", null);
        setBooleanField(term6340, term6340.getClass(), "selector", false);
        setField(term6340, term6340.getClass(), "graph", null);
        setBooleanField(term6340, term6340.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.RadiusCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculate", argTypes, term6340, args);
    }

};


