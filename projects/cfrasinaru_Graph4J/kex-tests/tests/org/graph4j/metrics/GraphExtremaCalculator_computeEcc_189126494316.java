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
import java.lang.Integer;

public class GraphExtremaCalculator_computeEcc_189126494316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9985;
     Object term9993;

    public GraphExtremaCalculator_computeEcc_189126494316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9985 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        setIntField(term9985, term9985.getClass(), "radiusLB", 0);
        setIntField(term9985, term9985.getClass(), "radiusUB", 0);
        setIntField(term9985, term9985.getClass(), "diamLB", 0);
        setIntField(term9985, term9985.getClass(), "diamUB", 0);
        setField(term9985, term9985.getClass(), "eccLB", null);
        setField(term9985, term9985.getClass(), "eccUB", null);
        setField(term9985, term9985.getClass(), "dist", null);
        setField(term9985, term9985.getClass(), "candidates", null);
        setBooleanField(term9985, term9985.getClass(), "selector", false);
        setBooleanField(term9985, term9985.getClass(), "connected", false);
        setField(term9985, term9985.getClass(), "radius", null);
        setField(term9985, term9985.getClass(), "diameter", null);
        setField(term9985, term9985.getClass(), "center", null);
        setField(term9985, term9985.getClass(), "periphery", null);
        setField(term9985, term9985.getClass(), "extremaType", null);
        setField(term9985, term9985.getClass(), "graph", null);
        setBooleanField(term9985, term9985.getClass(), "directed", false);
        term9993 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9993;
        callMethod(klass, "computeEcc", argTypes, term9985, args);
    }

};


