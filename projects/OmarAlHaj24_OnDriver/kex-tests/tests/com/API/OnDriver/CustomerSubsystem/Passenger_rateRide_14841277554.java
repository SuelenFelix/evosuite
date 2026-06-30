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

public class Passenger_rateRide_14841277554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11690;
     Object term11691;

    public Passenger_rateRide_14841277554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11690 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        setField(term11690, term11690.getClass(), "pastRides", null);
        setField(term11690, term11690.getClass(), "currentRide", null);
        setField(term11690, term11690.getClass(), "dateOfBirth", null);
        setField(term11690, term11690.getClass(), "username", null);
        setField(term11690, term11690.getClass(), "mobileNumber", null);
        setField(term11690, term11690.getClass(), "email", null);
        setField(term11690, term11690.getClass(), "password", null);
        setField(term11690, term11690.getClass(), "userStatus", null);
        term11691 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.API.OnDriver.RideSubsystem.Ride");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11691;
        callMethod(klass, "rateRide", argTypes, term11690, args);
    }

};


