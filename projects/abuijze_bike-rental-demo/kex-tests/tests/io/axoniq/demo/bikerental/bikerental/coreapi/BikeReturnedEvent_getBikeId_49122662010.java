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

public class BikeReturnedEvent_getBikeId_49122662010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1821;

    public BikeReturnedEvent_getBikeId_49122662010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1821 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeReturnedEvent"));
        setField(term1821, term1821.getClass(), "bikeId", null);
        setField(term1821, term1821.getClass(), "location", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeReturnedEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBikeId", argTypes, term1821, args);
    }

};


