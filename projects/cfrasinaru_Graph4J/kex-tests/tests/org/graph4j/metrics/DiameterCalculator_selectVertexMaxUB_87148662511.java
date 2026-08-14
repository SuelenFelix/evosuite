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

public class DiameterCalculator_selectVertexMaxUB_87148662511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10381;

    public DiameterCalculator_selectVertexMaxUB_87148662511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10381 = newInstance(Class.forName("org.graph4j.metrics.DiameterCalculator"));
        setIntField(term10381, term10381.getClass(), "diamUB", 0);
        setIntField(term10381, term10381.getClass(), "diamLB", 0);
        setField(term10381, term10381.getClass(), "eccLB", null);
        setField(term10381, term10381.getClass(), "eccUB", null);
        setField(term10381, term10381.getClass(), "dist", null);
        setField(term10381, term10381.getClass(), "candidates", null);
        setBooleanField(term10381, term10381.getClass(), "selector", false);
        setField(term10381, term10381.getClass(), "graph", null);
        setBooleanField(term10381, term10381.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.DiameterCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertexMaxUB", argTypes, term10381, args);
    }

};


