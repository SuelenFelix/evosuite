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

public class DiameterCalculator_computeEcc_15221776308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10364;
     Object term10369;

    public DiameterCalculator_computeEcc_15221776308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10364 = newInstance(Class.forName("org.graph4j.metrics.DiameterCalculator"));
        setIntField(term10364, term10364.getClass(), "diamUB", 0);
        setIntField(term10364, term10364.getClass(), "diamLB", 0);
        setField(term10364, term10364.getClass(), "eccLB", null);
        setField(term10364, term10364.getClass(), "eccUB", null);
        setField(term10364, term10364.getClass(), "dist", null);
        setField(term10364, term10364.getClass(), "candidates", null);
        setBooleanField(term10364, term10364.getClass(), "selector", false);
        setField(term10364, term10364.getClass(), "graph", null);
        setBooleanField(term10364, term10364.getClass(), "directed", false);
        term10369 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.DiameterCalculator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10369;
        callMethod(klass, "computeEcc", argTypes, term10364, args);
    }

};


