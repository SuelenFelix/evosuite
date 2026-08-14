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

public class GenericSpecimen_populate_6633734845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2769;

    public GenericSpecimen_populate_6633734845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2769 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.GenericSpecimen"));
        setField(term2769, term2769.getClass(), "type", null);
        setField(term2769, term2769.getClass(), "context", null);
        setField(term2769, term2769.getClass(), "specimenFactory", null);
        setField(term2769, term2769.getClass(), "instanceFactory", null);
        setField(term2769, term2769.getClass(), "specimens", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.GenericSpecimen");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "populate", argTypes, term2769, args);
    }

};


