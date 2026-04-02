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

public class EnrichedTemperature_getCountryCode_159963927411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156;

    public EnrichedTemperature_getCountryCode_159963927411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1156 = newInstance(Class.forName("com.amazonaws.samples.stream.temperature.event.EnrichedTemperature"));
        setField(term1156, term1156.getClass(), "brand", null);
        setField(term1156, term1156.getClass(), "countryCode", null);
        setField(term1156, term1156.getClass(), "sensorId", null);
        setLongField(term1156, term1156.getClass(), "timestamp", 0L);
        setLongField(term1156, term1156.getClass(), "temperature", 0L);
        setField(term1156, term1156.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.samples.stream.temperature.event.EnrichedTemperature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountryCode", argTypes, term1156, args);
    }

};


