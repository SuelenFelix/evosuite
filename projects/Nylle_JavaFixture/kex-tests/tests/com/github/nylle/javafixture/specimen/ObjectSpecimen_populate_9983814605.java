package com.github.nylle.javafixture.specimen;

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
import static com.github.nylle.javafixture.specimen.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ObjectSpecimen_populate_9983814605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term851;

    public ObjectSpecimen_populate_9983814605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term851 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.ObjectSpecimen"));
        setField(term851, term851.getClass(), "type", null);
        setField(term851, term851.getClass(), "context", null);
        setField(term851, term851.getClass(), "specimenFactory", null);
        setField(term851, term851.getClass(), "instanceFactory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.ObjectSpecimen");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "populate", argTypes, term851, args);
    }

};


