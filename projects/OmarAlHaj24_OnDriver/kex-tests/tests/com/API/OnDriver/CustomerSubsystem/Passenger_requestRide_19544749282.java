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

public class Passenger_requestRide_19544749282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9961;

    public Passenger_requestRide_19544749282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9961 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        setField(term9961, term9961.getClass(), "pastRides", null);
        setField(term9961, term9961.getClass(), "currentRide", null);
        setField(term9961, term9961.getClass(), "dateOfBirth", null);
        setField(term9961, term9961.getClass(), "username", null);
        setField(term9961, term9961.getClass(), "mobileNumber", null);
        setField(term9961, term9961.getClass(), "email", null);
        setField(term9961, term9961.getClass(), "password", null);
        setField(term9961, term9961.getClass(), "userStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.RideSubsystem.Ride");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "requestRide", argTypes, term9961, args);
    }

};


