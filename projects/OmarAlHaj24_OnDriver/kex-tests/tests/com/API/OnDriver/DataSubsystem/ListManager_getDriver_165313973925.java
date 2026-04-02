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

public class ListManager_getDriver_165313973925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4248;

    public ListManager_getDriver_165313973925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4248 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term4248, term4248.getClass(), "listOfPassengers", null);
        setField(term4248, term4248.getClass(), "listOfDrivers", null);
        setField(term4248, term4248.getClass(), "listOfAreas", null);
        setField(term4248, term4248.getClass(), "listOfAdmin", null);
        setField(term4248, term4248.getClass(), "listOfRides", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getDriver", argTypes, term4248, args);
    }

};


