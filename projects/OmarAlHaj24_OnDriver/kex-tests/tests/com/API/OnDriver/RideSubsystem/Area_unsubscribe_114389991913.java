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

public class Area_unsubscribe_114389991913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20963;

    public Area_unsubscribe_114389991913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20963 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term20963, term20963.getClass(), "location", null);
        setBooleanField(term20963, term20963.getClass(), "isDiscounted", false);
        setField(term20963, term20963.getClass(), "drivers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Area");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "unsubscribe", argTypes, term20963, args);
    }

};


