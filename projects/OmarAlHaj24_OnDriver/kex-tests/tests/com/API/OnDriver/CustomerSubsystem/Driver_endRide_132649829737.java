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

public class Driver_endRide_132649829737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50754;

    public Driver_endRide_132649829737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50754 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        setField(term50754, term50754.getClass(), "driverLicense", null);
        setField(term50754, term50754.getClass(), "nationalID", null);
        setField(term50754, term50754.getClass(), "isVerified", null);
        setField(term50754, term50754.getClass(), "favouriteAreas", null);
        setField(term50754, term50754.getClass(), "rides", null);
        setField(term50754, term50754.getClass(), "rating", null);
        setField(term50754, term50754.getClass(), "currentRide", null);
        setIntField(term50754, term50754.getClass(), "numberOfPassengers", 0);
        setField(term50754, term50754.getClass(), "username", null);
        setField(term50754, term50754.getClass(), "mobileNumber", null);
        setField(term50754, term50754.getClass(), "email", null);
        setField(term50754, term50754.getClass(), "password", null);
        setField(term50754, term50754.getClass(), "userStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endRide", argTypes, term50754, args);
    }

};


