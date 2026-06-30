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

public class Driver_update_199351555423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50276;

    public Driver_update_199351555423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50276 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        setField(term50276, term50276.getClass(), "driverLicense", null);
        setField(term50276, term50276.getClass(), "nationalID", null);
        setField(term50276, term50276.getClass(), "isVerified", null);
        setField(term50276, term50276.getClass(), "favouriteAreas", null);
        setField(term50276, term50276.getClass(), "rides", null);
        setField(term50276, term50276.getClass(), "rating", null);
        setField(term50276, term50276.getClass(), "currentRide", null);
        setIntField(term50276, term50276.getClass(), "numberOfPassengers", 0);
        setField(term50276, term50276.getClass(), "username", null);
        setField(term50276, term50276.getClass(), "mobileNumber", null);
        setField(term50276, term50276.getClass(), "email", null);
        setField(term50276, term50276.getClass(), "password", null);
        setField(term50276, term50276.getClass(), "userStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.RideSubsystem.Ride");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "update", argTypes, term50276, args);
    }

};


