package com.API.OnDriver.DataSubsystem;

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
import static com.API.OnDriver.DataSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ListManager_addToAdmin_6919494028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4251;

    public ListManager_addToAdmin_6919494028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4251 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term4251, term4251.getClass(), "listOfPassengers", null);
        setField(term4251, term4251.getClass(), "listOfDrivers", null);
        setField(term4251, term4251.getClass(), "listOfAreas", null);
        setField(term4251, term4251.getClass(), "listOfAdmin", null);
        setField(term4251, term4251.getClass(), "listOfRides", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.CustomerSubsystem.Admin");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addToAdmin", argTypes, term4251, args);
    }

};


