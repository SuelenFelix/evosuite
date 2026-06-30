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

public class Ride_addEvent_150051652419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12099;

    public Ride_addEvent_150051652419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12099 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12099, term12099.getClass(), "source", null);
        setField(term12099, term12099.getClass(), "destination", null);
        setField(term12099, term12099.getClass(), "passenger", null);
        setField(term12099, term12099.getClass(), "acceptedOffer", null);
        setField(term12099, term12099.getClass(), "offers", null);
        setField(term12099, term12099.getClass(), "isAccepted", null);
        setField(term12099, term12099.getClass(), "events", null);
        setIntField(term12099, term12099.getClass(), "numberOfPassengers", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Ride");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.EventSubsystem.Event");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addEvent", argTypes, term12099, args);
    }

};


