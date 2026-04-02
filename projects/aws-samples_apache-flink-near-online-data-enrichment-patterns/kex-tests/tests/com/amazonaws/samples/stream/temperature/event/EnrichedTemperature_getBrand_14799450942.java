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

public class EnrichedTemperature_getBrand_14799450942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647;

    public EnrichedTemperature_getBrand_14799450942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term647 = newInstance(Class.forName("com.amazonaws.samples.stream.temperature.event.EnrichedTemperature"));
        setField(term647, term647.getClass(), "brand", "flxyYxBRtu");
        setField(term647, term647.getClass(), "countryCode", "OclPbYPkcH");
        setField(term647, term647.getClass(), "sensorId", "IoAlmYsBwc");
        setLongField(term647, term647.getClass(), "timestamp", 2486810210675247493L);
        setLongField(term647, term647.getClass(), "temperature", 7009926388951271268L);
        setField(term647, term647.getClass(), "status", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.samples.stream.temperature.event.EnrichedTemperature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBrand", argTypes, term647, args);
    }

};


