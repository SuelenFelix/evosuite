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

public class Driver_setDriverLicense_103899005224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22967;

    public Driver_setDriverLicense_103899005224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22967 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        setField(term22967, term22967.getClass(), "driverLicense", null);
        setField(term22967, term22967.getClass(), "nationalID", null);
        setField(term22967, term22967.getClass(), "isVerified", null);
        setField(term22967, term22967.getClass(), "favouriteAreas", null);
        setField(term22967, term22967.getClass(), "rides", null);
        setField(term22967, term22967.getClass(), "rating", null);
        setField(term22967, term22967.getClass(), "currentRide", null);
        setIntField(term22967, term22967.getClass(), "numberOfPassengers", 0);
        setField(term22967, term22967.getClass(), "username", null);
        setField(term22967, term22967.getClass(), "mobileNumber", null);
        setField(term22967, term22967.getClass(), "email", null);
        setField(term22967, term22967.getClass(), "password", null);
        setField(term22967, term22967.getClass(), "userStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDriverLicense", argTypes, term22967, args);
    }

};


