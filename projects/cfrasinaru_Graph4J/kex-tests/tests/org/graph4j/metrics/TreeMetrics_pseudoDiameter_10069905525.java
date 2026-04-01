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

public class TreeMetrics_pseudoDiameter_10069905525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4045;

    public TreeMetrics_pseudoDiameter_10069905525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4045 = newInstance(Class.forName("org.graph4j.metrics.TreeMetrics"));
        setField(term4045, term4045.getClass(), "extremaCalculator", null);
        setField(term4045, term4045.getClass(), "dist", null);
        setField(term4045, term4045.getClass(), "ecc", null);
        setField(term4045, term4045.getClass(), "girth", null);
        setField(term4045, term4045.getClass(), "diameter", null);
        setField(term4045, term4045.getClass(), "pseudoDiameter", null);
        setField(term4045, term4045.getClass(), "radius", null);
        setField(term4045, term4045.getClass(), "center", null);
        setField(term4045, term4045.getClass(), "periphery", null);
        setField(term4045, term4045.getClass(), "graph", null);
        setBooleanField(term4045, term4045.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.TreeMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pseudoDiameter", argTypes, term4045, args);
    }

};


