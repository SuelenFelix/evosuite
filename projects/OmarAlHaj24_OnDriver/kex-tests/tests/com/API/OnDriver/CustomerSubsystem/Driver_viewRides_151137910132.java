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

public class Driver_viewRides_151137910132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50742;
     Object term50744;

    public Driver_viewRides_151137910132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50742 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        setField(term50742, term50742.getClass(), "driverLicense", null);
        setField(term50742, term50742.getClass(), "nationalID", null);
        setField(term50742, term50742.getClass(), "isVerified", null);
        setField(term50742, term50742.getClass(), "favouriteAreas", null);
        setField(term50742, term50742.getClass(), "rides", null);
        setField(term50742, term50742.getClass(), "rating", null);
        setField(term50742, term50742.getClass(), "currentRide", null);
        setIntField(term50742, term50742.getClass(), "numberOfPassengers", 0);
        setField(term50742, term50742.getClass(), "username", null);
        setField(term50742, term50742.getClass(), "mobileNumber", null);
        setField(term50742, term50742.getClass(), "email", null);
        setField(term50742, term50742.getClass(), "password", null);
        setField(term50742, term50742.getClass(), "userStatus", null);
        term50744 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term50744;
        callMethod(klass, "viewRides", argTypes, term50742, args);
    }

};


