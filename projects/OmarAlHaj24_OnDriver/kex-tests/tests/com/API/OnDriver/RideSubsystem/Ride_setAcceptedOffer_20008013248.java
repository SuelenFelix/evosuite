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

public class Ride_setAcceptedOffer_20008013248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21824;

    public Ride_setAcceptedOffer_20008013248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21824 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term21824, term21824.getClass(), "source", null);
        setField(term21824, term21824.getClass(), "destination", null);
        setField(term21824, term21824.getClass(), "passenger", null);
        setField(term21824, term21824.getClass(), "acceptedOffer", null);
        setField(term21824, term21824.getClass(), "offers", null);
        setField(term21824, term21824.getClass(), "isAccepted", null);
        setField(term21824, term21824.getClass(), "events", null);
        setIntField(term21824, term21824.getClass(), "numberOfPassengers", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Ride");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.RideSubsystem.Offer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAcceptedOffer", argTypes, term21824, args);
    }

};


