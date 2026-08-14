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

public class Temperature_toString_185596539310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473;

    public Temperature_toString_185596539310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term473 = newInstance(Class.forName("com.amazonaws.samples.stream.temperature.event.Temperature"));
        setField(term473, term473.getClass(), "sensorId", "hNxWaHcfhY");
        setLongField(term473, term473.getClass(), "timestamp", 8428634514691209827L);
        setLongField(term473, term473.getClass(), "temperature", -2585684163342970173L);
        setField(term473, term473.getClass(), "status", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.samples.stream.temperature.event.Temperature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term473, args);
    }

};


