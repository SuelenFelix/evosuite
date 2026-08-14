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

public class GraphExtremaCalculator_selectVertex_98772780717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9995;

    public GraphExtremaCalculator_selectVertex_98772780717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9995 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        setIntField(term9995, term9995.getClass(), "radiusLB", 0);
        setIntField(term9995, term9995.getClass(), "radiusUB", 0);
        setIntField(term9995, term9995.getClass(), "diamLB", 0);
        setIntField(term9995, term9995.getClass(), "diamUB", 0);
        setField(term9995, term9995.getClass(), "eccLB", null);
        setField(term9995, term9995.getClass(), "eccUB", null);
        setField(term9995, term9995.getClass(), "dist", null);
        setField(term9995, term9995.getClass(), "candidates", null);
        setBooleanField(term9995, term9995.getClass(), "selector", false);
        setBooleanField(term9995, term9995.getClass(), "connected", false);
        setField(term9995, term9995.getClass(), "radius", null);
        setField(term9995, term9995.getClass(), "diameter", null);
        setField(term9995, term9995.getClass(), "center", null);
        setField(term9995, term9995.getClass(), "periphery", null);
        setField(term9995, term9995.getClass(), "extremaType", null);
        setField(term9995, term9995.getClass(), "graph", null);
        setBooleanField(term9995, term9995.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertex", argTypes, term9995, args);
    }

};


