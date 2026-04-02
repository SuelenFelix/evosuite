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

public class Driver_update_199351555421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22434;

    public Driver_update_199351555421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22434 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        setField(term22434, term22434.getClass(), "driverLicense", null);
        setField(term22434, term22434.getClass(), "nationalID", null);
        setField(term22434, term22434.getClass(), "isVerified", null);
        setField(term22434, term22434.getClass(), "favouriteAreas", null);
        setField(term22434, term22434.getClass(), "rides", null);
        setField(term22434, term22434.getClass(), "rating", null);
        setField(term22434, term22434.getClass(), "currentRide", null);
        setIntField(term22434, term22434.getClass(), "numberOfPassengers", 0);
        setField(term22434, term22434.getClass(), "username", null);
        setField(term22434, term22434.getClass(), "mobileNumber", null);
        setField(term22434, term22434.getClass(), "email", null);
        setField(term22434, term22434.getClass(), "password", null);
        setField(term22434, term22434.getClass(), "userStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.RideSubsystem.Ride");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "update", argTypes, term22434, args);
    }

};


