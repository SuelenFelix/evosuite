package org.codefx.demo.effective_java._01_static_factory_methods.not_factory_pattern;

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
import static org.codefx.demo.effective_java._01_static_factory_methods.not_factory_pattern.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GrowingRectangleFactory_createShape_21434025331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GrowingRectangleFactory_createShape_21434025331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.codefx.demo.effective_java._01_static_factory_methods.not_factory_pattern.GrowingRectangleFactory"));
        setField(term1, term1.getClass(), "lowerLeft", null);
        setField(term1, term1.getClass(), "upperRight", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._01_static_factory_methods.not_factory_pattern.GrowingRectangleFactory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createShape", argTypes, term1, args);
    }

};


