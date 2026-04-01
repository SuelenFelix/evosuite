package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class EdgeWeightsGenerator_fill_12372735199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1606;
     Object term1607;

    public EdgeWeightsGenerator_fill_12372735199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1606 = newInstance(Class.forName("org.graph4j.generators.EdgeWeightsGenerator"));
        term1607 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.EdgeWeightsGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1607;
        callMethod(klass, "fill", argTypes, term1606, args);
    }

};


