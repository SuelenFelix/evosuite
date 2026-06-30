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

public class BikeRegisteredEvent_getBikeType_8058831782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2775;

    public BikeRegisteredEvent_getBikeType_8058831782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2775 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeRegisteredEvent"));
        setField(term2775, term2775.getClass(), "bikeId", "WzMEhMXkKx");
        setField(term2775, term2775.getClass(), "bikeType", "XOiDvlDhdc");
        setField(term2775, term2775.getClass(), "location", "AdxvLJhNLe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeRegisteredEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBikeType", argTypes, term2775, args);
    }

};


