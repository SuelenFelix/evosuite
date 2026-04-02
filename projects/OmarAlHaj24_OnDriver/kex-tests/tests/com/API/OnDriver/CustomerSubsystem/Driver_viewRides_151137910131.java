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

public class Driver_viewRides_151137910131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22981;
     Object term22983;

    public Driver_viewRides_151137910131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22981 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        setField(term22981, term22981.getClass(), "driverLicense", null);
        setField(term22981, term22981.getClass(), "nationalID", null);
        setField(term22981, term22981.getClass(), "isVerified", null);
        setField(term22981, term22981.getClass(), "favouriteAreas", null);
        setField(term22981, term22981.getClass(), "rides", null);
        setField(term22981, term22981.getClass(), "rating", null);
        setField(term22981, term22981.getClass(), "currentRide", null);
        setIntField(term22981, term22981.getClass(), "numberOfPassengers", 0);
        setField(term22981, term22981.getClass(), "username", null);
        setField(term22981, term22981.getClass(), "mobileNumber", null);
        setField(term22981, term22981.getClass(), "email", null);
        setField(term22981, term22981.getClass(), "password", null);
        setField(term22981, term22981.getClass(), "userStatus", null);
        term22983 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22983;
        callMethod(klass, "viewRides", argTypes, term22981, args);
    }

};


