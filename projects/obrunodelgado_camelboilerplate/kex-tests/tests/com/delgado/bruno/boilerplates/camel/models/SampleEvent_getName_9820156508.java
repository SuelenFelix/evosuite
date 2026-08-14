package com.delgado.bruno.boilerplates.camel.models;

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
import static com.delgado.bruno.boilerplates.camel.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SampleEvent_getName_9820156508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336;

    public SampleEvent_getName_9820156508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term336 = newInstance(Class.forName("com.delgado.bruno.boilerplates.camel.models.SampleEvent"));
        setField(term336, term336.getClass(), "name", null);
        setField(term336, term336.getClass(), "quantity", null);
        setField(term336, term336.getClass(), "price", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.delgado.bruno.boilerplates.camel.models.SampleEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term336, args);
    }

};


