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

public class EnrichedTemperature_toString_8795928756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1055;

    public EnrichedTemperature_toString_8795928756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1055 = newInstance(Class.forName("com.amazonaws.samples.stream.temperature.event.EnrichedTemperature"));
        setField(term1055, term1055.getClass(), "brand", "BndsHwAFMv");
        setField(term1055, term1055.getClass(), "countryCode", "GzFkzHGYFt");
        setField(term1055, term1055.getClass(), "sensorId", "tShwQLRGNe");
        setLongField(term1055, term1055.getClass(), "timestamp", 5262507301787091109L);
        setLongField(term1055, term1055.getClass(), "temperature", -6823727938421990489L);
        setField(term1055, term1055.getClass(), "status", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.samples.stream.temperature.event.EnrichedTemperature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1055, args);
    }

};


