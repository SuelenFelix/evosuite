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

public class Driver_getDriverLicense_40144994825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22969;

    public Driver_getDriverLicense_40144994825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22969 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        setField(term22969, term22969.getClass(), "driverLicense", null);
        setField(term22969, term22969.getClass(), "nationalID", null);
        setField(term22969, term22969.getClass(), "isVerified", null);
        setField(term22969, term22969.getClass(), "favouriteAreas", null);
        setField(term22969, term22969.getClass(), "rides", null);
        setField(term22969, term22969.getClass(), "rating", null);
        setField(term22969, term22969.getClass(), "currentRide", null);
        setIntField(term22969, term22969.getClass(), "numberOfPassengers", 0);
        setField(term22969, term22969.getClass(), "username", null);
        setField(term22969, term22969.getClass(), "mobileNumber", null);
        setField(term22969, term22969.getClass(), "email", null);
        setField(term22969, term22969.getClass(), "password", null);
        setField(term22969, term22969.getClass(), "userStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDriverLicense", argTypes, term22969, args);
    }

};


