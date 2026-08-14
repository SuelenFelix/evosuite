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

public class Temperature_setSensorId_918823923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;

    public Temperature_setSensorId_918823923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96 = newInstance(Class.forName("com.amazonaws.samples.stream.temperature.event.Temperature"));
        setField(term96, term96.getClass(), "sensorId", "jJCZpVmanW");
        setLongField(term96, term96.getClass(), "timestamp", 5270370404989704783L);
        setLongField(term96, term96.getClass(), "temperature", 7411271909051562686L);
        setField(term96, term96.getClass(), "status", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.samples.stream.temperature.event.Temperature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        callMethod(klass, "setSensorId", argTypes, term96, args);
    }

};


