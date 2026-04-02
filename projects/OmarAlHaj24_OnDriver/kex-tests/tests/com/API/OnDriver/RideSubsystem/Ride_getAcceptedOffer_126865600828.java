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

public class Ride_getAcceptedOffer_126865600828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31111;

    public Ride_getAcceptedOffer_126865600828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31111 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term31111, term31111.getClass(), "source", null);
        setField(term31111, term31111.getClass(), "destination", null);
        setField(term31111, term31111.getClass(), "passenger", null);
        setField(term31111, term31111.getClass(), "acceptedOffer", null);
        setField(term31111, term31111.getClass(), "offers", null);
        setField(term31111, term31111.getClass(), "isAccepted", null);
        setField(term31111, term31111.getClass(), "events", null);
        setIntField(term31111, term31111.getClass(), "numberOfPassengers", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Ride");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAcceptedOffer", argTypes, term31111, args);
    }

};


