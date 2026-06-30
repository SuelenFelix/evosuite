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

public class ListManager_listAllPendingDrivers_203683358021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4244;

    public ListManager_listAllPendingDrivers_203683358021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4244 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term4244, term4244.getClass(), "listOfPassengers", null);
        setField(term4244, term4244.getClass(), "listOfDrivers", null);
        setField(term4244, term4244.getClass(), "listOfAreas", null);
        setField(term4244, term4244.getClass(), "listOfAdmin", null);
        setField(term4244, term4244.getClass(), "listOfRides", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listAllPendingDrivers", argTypes, term4244, args);
    }

};


