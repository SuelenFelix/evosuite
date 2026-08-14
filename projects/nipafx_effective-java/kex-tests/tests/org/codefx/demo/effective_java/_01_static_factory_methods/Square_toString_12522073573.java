package org.codefx.demo.effective_java._01_static_factory_methods;

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
import static org.codefx.demo.effective_java._01_static_factory_methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Square_toString_12522073573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;

    public Square_toString_12522073573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = newInstance(Class.forName("org.codefx.demo.effective_java._01_static_factory_methods.Square"));
        setIntField(term15, term15.getClass(), "edgeLength", -616727354);
        setField(term15, term15.getClass(), "lowerLeft", null);
        setField(term15, term15.getClass(), "upperRight", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._01_static_factory_methods.Square");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term15, args);
    }

};


