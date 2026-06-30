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

public class BikeRentedEvent_copy_170636674014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454;

    public BikeRentedEvent_copy_170636674014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term454 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeRentedEvent"));
        setField(term454, term454.getClass(), "bikeId", null);
        setField(term454, term454.getClass(), "renter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeRentedEvent");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "copy", argTypes, term454, args);
    }

};


