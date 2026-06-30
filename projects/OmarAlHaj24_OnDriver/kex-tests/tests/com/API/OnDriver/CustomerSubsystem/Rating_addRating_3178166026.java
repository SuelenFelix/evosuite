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

public class Rating_addRating_3178166026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38285;
     Object term38288;

    public Rating_addRating_3178166026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38285 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        setField(term38285, term38285.getClass(), "driverRatings", null);
        setIntField(term38285, term38285.getClass(), "ratingSum", 0);
        setIntField(term38285, term38285.getClass(), "numberOfRatings", 0);
        term38288 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Rating");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.API.OnDriver.RideSubsystem.Ride");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term38288;
        callMethod(klass, "addRating", argTypes, term38285, args);
    }

};


