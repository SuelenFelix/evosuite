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

public class Driver_setDriverLicense_10389900522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38970;

    public Driver_setDriverLicense_10389900522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38970 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        setField(term38970, term38970.getClass(), "driverLicense", null);
        setField(term38970, term38970.getClass(), "nationalID", null);
        setField(term38970, term38970.getClass(), "isVerified", null);
        setField(term38970, term38970.getClass(), "favouriteAreas", null);
        setField(term38970, term38970.getClass(), "rides", null);
        setField(term38970, term38970.getClass(), "rating", null);
        setField(term38970, term38970.getClass(), "currentRide", null);
        setIntField(term38970, term38970.getClass(), "numberOfPassengers", 0);
        setField(term38970, term38970.getClass(), "username", null);
        setField(term38970, term38970.getClass(), "mobileNumber", null);
        setField(term38970, term38970.getClass(), "email", null);
        setField(term38970, term38970.getClass(), "password", null);
        setField(term38970, term38970.getClass(), "userStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDriverLicense", argTypes, term38970, args);
    }

};


