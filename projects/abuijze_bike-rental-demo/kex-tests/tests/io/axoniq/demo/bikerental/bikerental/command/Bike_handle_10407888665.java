package io.axoniq.demo.bikerental.bikerental.command;

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
import static io.axoniq.demo.bikerental.bikerental.command.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Bike_handle_10407888665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297;
     Object term311;

    public Bike_handle_10407888665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.command.Bike"));
        setField(term297, term297.getClass(), "bikeId", "LQFpaHEwXR");
        setBooleanField(term297, term297.getClass(), "isAvailable", false);
        term311 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeReturnedEvent"));
        setField(term311, term311.getClass(), "bikeId", "oVcInYnLWB");
        setField(term311, term311.getClass(), "location", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.command.Bike");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeReturnedEvent");
        Object[] args = new Object[1];
        args[0] = term311;
        callMethod(klass, "handle", argTypes, term297, args);
    }

};


