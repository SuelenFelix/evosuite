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

public class Passenger_acceptOffer_211675315414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7262;
     Object term7263;

    public Passenger_acceptOffer_211675315414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7262 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        setField(term7262, term7262.getClass(), "pastRides", null);
        setField(term7262, term7262.getClass(), "currentRide", null);
        setField(term7262, term7262.getClass(), "dateOfBirth", null);
        setField(term7262, term7262.getClass(), "username", null);
        setField(term7262, term7262.getClass(), "mobileNumber", null);
        setField(term7262, term7262.getClass(), "email", null);
        setField(term7262, term7262.getClass(), "password", null);
        setField(term7262, term7262.getClass(), "userStatus", null);
        term7263 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7263;
        callMethod(klass, "acceptOffer", argTypes, term7262, args);
    }

};


