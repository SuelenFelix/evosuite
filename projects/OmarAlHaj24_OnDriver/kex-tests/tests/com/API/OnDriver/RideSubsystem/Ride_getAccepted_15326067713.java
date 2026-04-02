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

public class Ride_getAccepted_15326067713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9804;

    public Ride_getAccepted_15326067713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9804 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term9804, term9804.getClass(), "source", null);
        setField(term9804, term9804.getClass(), "destination", null);
        setField(term9804, term9804.getClass(), "passenger", null);
        setField(term9804, term9804.getClass(), "acceptedOffer", null);
        setField(term9804, term9804.getClass(), "offers", null);
        setField(term9804, term9804.getClass(), "isAccepted", null);
        setField(term9804, term9804.getClass(), "events", null);
        setIntField(term9804, term9804.getClass(), "numberOfPassengers", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Ride");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccepted", argTypes, term9804, args);
    }

};


