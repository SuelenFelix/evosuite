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

public class GraphExtremaCalculator_selectVertexMinLB_22956797718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10003;

    public GraphExtremaCalculator_selectVertexMinLB_22956797718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10003 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        setIntField(term10003, term10003.getClass(), "radiusLB", 0);
        setIntField(term10003, term10003.getClass(), "radiusUB", 0);
        setIntField(term10003, term10003.getClass(), "diamLB", 0);
        setIntField(term10003, term10003.getClass(), "diamUB", 0);
        setField(term10003, term10003.getClass(), "eccLB", null);
        setField(term10003, term10003.getClass(), "eccUB", null);
        setField(term10003, term10003.getClass(), "dist", null);
        setField(term10003, term10003.getClass(), "candidates", null);
        setBooleanField(term10003, term10003.getClass(), "selector", false);
        setBooleanField(term10003, term10003.getClass(), "connected", false);
        setField(term10003, term10003.getClass(), "radius", null);
        setField(term10003, term10003.getClass(), "diameter", null);
        setField(term10003, term10003.getClass(), "center", null);
        setField(term10003, term10003.getClass(), "periphery", null);
        setField(term10003, term10003.getClass(), "extremaType", null);
        setField(term10003, term10003.getClass(), "graph", null);
        setBooleanField(term10003, term10003.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertexMinLB", argTypes, term10003, args);
    }

};


