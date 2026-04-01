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

public class RadiusCalculator_selectVertex_2257865379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6352;

    public RadiusCalculator_selectVertex_2257865379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6352 = newInstance(Class.forName("org.graph4j.metrics.RadiusCalculator"));
        setIntField(term6352, term6352.getClass(), "radiusLB", 0);
        setIntField(term6352, term6352.getClass(), "radiusUB", 0);
        setField(term6352, term6352.getClass(), "vertexSet", null);
        setField(term6352, term6352.getClass(), "eccLB", null);
        setField(term6352, term6352.getClass(), "eccUB", null);
        setField(term6352, term6352.getClass(), "dist", null);
        setBooleanField(term6352, term6352.getClass(), "selector", false);
        setField(term6352, term6352.getClass(), "graph", null);
        setBooleanField(term6352, term6352.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.RadiusCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertex", argTypes, term6352, args);
    }

};


