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

public class BikeReturnedEvent_copy_56404485214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1825;

    public BikeReturnedEvent_copy_56404485214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1825 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeReturnedEvent"));
        setField(term1825, term1825.getClass(), "bikeId", null);
        setField(term1825, term1825.getClass(), "location", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeReturnedEvent");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "copy", argTypes, term1825, args);
    }

};


