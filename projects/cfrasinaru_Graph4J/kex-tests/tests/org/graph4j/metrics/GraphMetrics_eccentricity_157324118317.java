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
import java.lang.Boolean;

public class GraphMetrics_eccentricity_157324118317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6043;
     Object term6045;
     Object term6047;

    public GraphMetrics_eccentricity_157324118317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6043 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        setField(term6043, term6043.getClass(), "extremaCalculator", null);
        setField(term6043, term6043.getClass(), "dist", null);
        setField(term6043, term6043.getClass(), "ecc", null);
        setField(term6043, term6043.getClass(), "girth", null);
        setField(term6043, term6043.getClass(), "diameter", null);
        setField(term6043, term6043.getClass(), "pseudoDiameter", null);
        setField(term6043, term6043.getClass(), "radius", null);
        setField(term6043, term6043.getClass(), "center", null);
        setField(term6043, term6043.getClass(), "periphery", null);
        setField(term6043, term6043.getClass(), "graph", null);
        setBooleanField(term6043, term6043.getClass(), "directed", false);
        term6045 = new Integer(0);
        term6047 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term6045;
        args[1] = term6047;
        callMethod(klass, "eccentricity", argTypes, term6043, args);
    }

};


