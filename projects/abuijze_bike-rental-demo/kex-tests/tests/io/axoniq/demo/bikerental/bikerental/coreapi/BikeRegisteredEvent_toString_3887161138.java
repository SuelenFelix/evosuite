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

public class BikeRegisteredEvent_toString_3887161138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3243;

    public BikeRegisteredEvent_toString_3887161138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3243 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeRegisteredEvent"));
        setField(term3243, term3243.getClass(), "bikeId", "pXOkjyeIRb");
        setField(term3243, term3243.getClass(), "bikeType", "GgZWSjxjyE");
        setField(term3243, term3243.getClass(), "location", "EeBVbzjcCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeRegisteredEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3243, args);
    }

};


