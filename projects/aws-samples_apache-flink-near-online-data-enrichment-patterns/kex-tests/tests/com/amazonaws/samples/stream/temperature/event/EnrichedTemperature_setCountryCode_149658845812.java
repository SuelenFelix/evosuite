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

public class EnrichedTemperature_setCountryCode_149658845812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1159;

    public EnrichedTemperature_setCountryCode_149658845812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1159 = newInstance(Class.forName("com.amazonaws.samples.stream.temperature.event.EnrichedTemperature"));
        setField(term1159, term1159.getClass(), "brand", null);
        setField(term1159, term1159.getClass(), "countryCode", null);
        setField(term1159, term1159.getClass(), "sensorId", null);
        setLongField(term1159, term1159.getClass(), "timestamp", 0L);
        setLongField(term1159, term1159.getClass(), "temperature", 0L);
        setField(term1159, term1159.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.samples.stream.temperature.event.EnrichedTemperature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCountryCode", argTypes, term1159, args);
    }

};


