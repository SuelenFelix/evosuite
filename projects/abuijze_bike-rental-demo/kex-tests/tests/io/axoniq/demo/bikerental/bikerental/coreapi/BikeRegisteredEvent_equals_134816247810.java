package io.axoniq.demo.bikerental.bikerental.coreapi;

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
import static io.axoniq.demo.bikerental.bikerental.coreapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BikeRegisteredEvent_equals_134816247810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3377;
     Object term3414;

    public BikeRegisteredEvent_equals_134816247810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3377 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeRegisteredEvent"));
        setField(term3377, term3377.getClass(), "bikeId", "HzqpegHiRq");
        setField(term3377, term3377.getClass(), "bikeType", "jwsfVjMoJT");
        setField(term3377, term3377.getClass(), "location", "ZfdXfCCFDf");
        term3414 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeRegisteredEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3414;
        callMethod(klass, "equals", argTypes, term3377, args);
    }

};


