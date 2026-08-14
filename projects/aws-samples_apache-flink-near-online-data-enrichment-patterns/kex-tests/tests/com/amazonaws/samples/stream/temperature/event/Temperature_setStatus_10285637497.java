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

public class Temperature_setStatus_10285637497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308;

    public Temperature_setStatus_10285637497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308 = newInstance(Class.forName("com.amazonaws.samples.stream.temperature.event.Temperature"));
        setField(term308, term308.getClass(), "sensorId", "LQFpaHEwXR");
        setLongField(term308, term308.getClass(), "timestamp", 2535595959091595249L);
        setLongField(term308, term308.getClass(), "temperature", -5476826692763582090L);
        setField(term308, term308.getClass(), "status", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.samples.stream.temperature.event.Temperature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aJlieCFVtF";
        callMethod(klass, "setStatus", argTypes, term308, args);
    }

};


