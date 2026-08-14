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

public class TreeExtremaCalculator_getRadius_78478109112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11802;

    public TreeExtremaCalculator_getRadius_78478109112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11802 = newInstance(Class.forName("org.graph4j.metrics.TreeExtremaCalculator"));
        setIntField(term11802, term11802.getClass(), "startVertex", 0);
        setField(term11802, term11802.getClass(), "diameter", null);
        setField(term11802, term11802.getClass(), "center", null);
        setField(term11802, term11802.getClass(), "periphery", null);
        setField(term11802, term11802.getClass(), "graph", null);
        setBooleanField(term11802, term11802.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.TreeExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRadius", argTypes, term11802, args);
    }

};


