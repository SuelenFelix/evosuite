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

public class Driver_getRating_106967992930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22979;

    public Driver_getRating_106967992930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22979 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        setField(term22979, term22979.getClass(), "driverLicense", null);
        setField(term22979, term22979.getClass(), "nationalID", null);
        setField(term22979, term22979.getClass(), "isVerified", null);
        setField(term22979, term22979.getClass(), "favouriteAreas", null);
        setField(term22979, term22979.getClass(), "rides", null);
        setField(term22979, term22979.getClass(), "rating", null);
        setField(term22979, term22979.getClass(), "currentRide", null);
        setIntField(term22979, term22979.getClass(), "numberOfPassengers", 0);
        setField(term22979, term22979.getClass(), "username", null);
        setField(term22979, term22979.getClass(), "mobileNumber", null);
        setField(term22979, term22979.getClass(), "email", null);
        setField(term22979, term22979.getClass(), "password", null);
        setField(term22979, term22979.getClass(), "userStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRating", argTypes, term22979, args);
    }

};


