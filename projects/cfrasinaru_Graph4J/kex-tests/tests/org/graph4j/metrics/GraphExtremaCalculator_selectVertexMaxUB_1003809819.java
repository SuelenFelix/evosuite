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

public class GraphExtremaCalculator_selectVertexMaxUB_1003809819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10011;

    public GraphExtremaCalculator_selectVertexMaxUB_1003809819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10011 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        setIntField(term10011, term10011.getClass(), "radiusLB", 0);
        setIntField(term10011, term10011.getClass(), "radiusUB", 0);
        setIntField(term10011, term10011.getClass(), "diamLB", 0);
        setIntField(term10011, term10011.getClass(), "diamUB", 0);
        setField(term10011, term10011.getClass(), "eccLB", null);
        setField(term10011, term10011.getClass(), "eccUB", null);
        setField(term10011, term10011.getClass(), "dist", null);
        setField(term10011, term10011.getClass(), "candidates", null);
        setBooleanField(term10011, term10011.getClass(), "selector", false);
        setBooleanField(term10011, term10011.getClass(), "connected", false);
        setField(term10011, term10011.getClass(), "radius", null);
        setField(term10011, term10011.getClass(), "diameter", null);
        setField(term10011, term10011.getClass(), "center", null);
        setField(term10011, term10011.getClass(), "periphery", null);
        setField(term10011, term10011.getClass(), "extremaType", null);
        setField(term10011, term10011.getClass(), "graph", null);
        setBooleanField(term10011, term10011.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertexMaxUB", argTypes, term10011, args);
    }

};


