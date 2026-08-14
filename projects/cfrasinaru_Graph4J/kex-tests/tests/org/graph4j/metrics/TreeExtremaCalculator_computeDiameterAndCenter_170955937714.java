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

public class TreeExtremaCalculator_computeDiameterAndCenter_170955937714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11808;

    public TreeExtremaCalculator_computeDiameterAndCenter_170955937714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11808 = newInstance(Class.forName("org.graph4j.metrics.TreeExtremaCalculator"));
        setIntField(term11808, term11808.getClass(), "startVertex", 0);
        setField(term11808, term11808.getClass(), "diameter", null);
        setField(term11808, term11808.getClass(), "center", null);
        setField(term11808, term11808.getClass(), "periphery", null);
        setField(term11808, term11808.getClass(), "graph", null);
        setBooleanField(term11808, term11808.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.TreeExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeDiameterAndCenter", argTypes, term11808, args);
    }

};


