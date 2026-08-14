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

public class CollectionSpecimen_createEnumSet_18344592483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3164;

    public CollectionSpecimen_createEnumSet_18344592483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3164 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.CollectionSpecimen"));
        setField(term3164, term3164.getClass(), "type", null);
        setField(term3164, term3164.getClass(), "context", null);
        setField(term3164, term3164.getClass(), "specimen", null);
        setField(term3164, term3164.getClass(), "instanceFactory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.CollectionSpecimen");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createEnumSet", argTypes, term3164, args);
    }

};


