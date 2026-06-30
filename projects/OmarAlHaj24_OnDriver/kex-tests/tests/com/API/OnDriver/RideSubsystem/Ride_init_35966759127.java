package com.API.OnDriver.RideSubsystem;

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
import static com.API.OnDriver.RideSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Ride_init_35966759127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15400;

    public Ride_init_35966759127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15400 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Ride");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.API.OnDriver.RideSubsystem.Area");
        argTypes[1] = Class.forName("com.API.OnDriver.RideSubsystem.Area");
        argTypes[2] = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term15400;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


