package com.API.OnDriver.CustomerSubsystem;

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
import static com.API.OnDriver.CustomerSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Driver_suggestOffer_8404348799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16442;
     Object term16444;

    public Driver_suggestOffer_8404348799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16442 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        setField(term16442, term16442.getClass(), "driverLicense", null);
        setField(term16442, term16442.getClass(), "nationalID", null);
        setField(term16442, term16442.getClass(), "isVerified", null);
        setField(term16442, term16442.getClass(), "favouriteAreas", null);
        setField(term16442, term16442.getClass(), "rides", null);
        setField(term16442, term16442.getClass(), "rating", null);
        setField(term16442, term16442.getClass(), "currentRide", null);
        setIntField(term16442, term16442.getClass(), "numberOfPassengers", 0);
        setField(term16442, term16442.getClass(), "username", null);
        setField(term16442, term16442.getClass(), "mobileNumber", null);
        setField(term16442, term16442.getClass(), "email", null);
        setField(term16442, term16442.getClass(), "password", null);
        setField(term16442, term16442.getClass(), "userStatus", null);
        term16444 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.API.OnDriver.RideSubsystem.Offer");
        Object[] args = new Object[2];
        args[0] = term16444;
        args[1] = null;
        callMethod(klass, "suggestOffer", argTypes, term16442, args);
    }

};


