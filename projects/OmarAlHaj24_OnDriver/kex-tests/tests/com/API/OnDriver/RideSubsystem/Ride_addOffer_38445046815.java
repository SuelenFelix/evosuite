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

public class Ride_addOffer_38445046815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10745;

    public Ride_addOffer_38445046815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10745 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term10745, term10745.getClass(), "source", null);
        setField(term10745, term10745.getClass(), "destination", null);
        setField(term10745, term10745.getClass(), "passenger", null);
        setField(term10745, term10745.getClass(), "acceptedOffer", null);
        setField(term10745, term10745.getClass(), "offers", null);
        setField(term10745, term10745.getClass(), "isAccepted", null);
        setField(term10745, term10745.getClass(), "events", null);
        setIntField(term10745, term10745.getClass(), "numberOfPassengers", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Ride");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.RideSubsystem.Offer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addOffer", argTypes, term10745, args);
    }

};


