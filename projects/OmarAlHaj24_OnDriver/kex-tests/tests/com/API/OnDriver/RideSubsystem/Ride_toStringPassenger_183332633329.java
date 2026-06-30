package com.API.OnDriver.RideSubsystem;

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
import static com.API.OnDriver.RideSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Ride_toStringPassenger_183332633329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15404;

    public Ride_toStringPassenger_183332633329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15404 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term15404, term15404.getClass(), "source", null);
        setField(term15404, term15404.getClass(), "destination", null);
        setField(term15404, term15404.getClass(), "passenger", null);
        setField(term15404, term15404.getClass(), "acceptedOffer", null);
        setField(term15404, term15404.getClass(), "offers", null);
        setField(term15404, term15404.getClass(), "isAccepted", null);
        setField(term15404, term15404.getClass(), "events", null);
        setIntField(term15404, term15404.getClass(), "numberOfPassengers", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Ride");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toStringPassenger", argTypes, term15404, args);
    }

};


