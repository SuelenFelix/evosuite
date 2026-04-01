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

public class RadiusCalculator_computeEcc_6777505998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6345;
     Object term6350;

    public RadiusCalculator_computeEcc_6777505998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6345 = newInstance(Class.forName("org.graph4j.metrics.RadiusCalculator"));
        setIntField(term6345, term6345.getClass(), "radiusLB", 0);
        setIntField(term6345, term6345.getClass(), "radiusUB", 0);
        setField(term6345, term6345.getClass(), "vertexSet", null);
        setField(term6345, term6345.getClass(), "eccLB", null);
        setField(term6345, term6345.getClass(), "eccUB", null);
        setField(term6345, term6345.getClass(), "dist", null);
        setBooleanField(term6345, term6345.getClass(), "selector", false);
        setField(term6345, term6345.getClass(), "graph", null);
        setBooleanField(term6345, term6345.getClass(), "directed", false);
        term6350 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.RadiusCalculator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6350;
        callMethod(klass, "computeEcc", argTypes, term6345, args);
    }

};


