package com.todense.viewmodel.canvas.displayrule;

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
import static com.todense.viewmodel.canvas.displayrule.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AntColonyDisplayRule_getEdgeWidth_20270974650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public AntColonyDisplayRule_getEdgeWidth_20270974650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.canvas.displayrule.AntColonyDisplayRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.todense.model.graph.Edge");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getEdgeWidth", argTypes, null, args);
    }

};


