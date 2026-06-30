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

public class Rating_addRating_3178166023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11753;
     Object term11756;

    public Rating_addRating_3178166023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11753 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        setField(term11753, term11753.getClass(), "driverRatings", null);
        setIntField(term11753, term11753.getClass(), "ratingSum", 0);
        setIntField(term11753, term11753.getClass(), "numberOfRatings", 0);
        term11756 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Rating");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.API.OnDriver.RideSubsystem.Ride");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11756;
        callMethod(klass, "addRating", argTypes, term11753, args);
    }

};


