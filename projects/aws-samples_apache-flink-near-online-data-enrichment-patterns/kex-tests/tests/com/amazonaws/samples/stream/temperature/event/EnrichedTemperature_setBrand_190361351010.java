package com.amazonaws.samples.stream.temperature.event;

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
import static com.amazonaws.samples.stream.temperature.event.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EnrichedTemperature_setBrand_190361351010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1153;

    public EnrichedTemperature_setBrand_190361351010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1153 = newInstance(Class.forName("com.amazonaws.samples.stream.temperature.event.EnrichedTemperature"));
        setField(term1153, term1153.getClass(), "brand", null);
        setField(term1153, term1153.getClass(), "countryCode", null);
        setField(term1153, term1153.getClass(), "sensorId", null);
        setLongField(term1153, term1153.getClass(), "timestamp", 0L);
        setLongField(term1153, term1153.getClass(), "temperature", 0L);
        setField(term1153, term1153.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.samples.stream.temperature.event.EnrichedTemperature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBrand", argTypes, term1153, args);
    }

};


