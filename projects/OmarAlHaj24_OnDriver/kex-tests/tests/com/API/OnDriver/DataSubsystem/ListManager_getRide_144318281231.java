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
import java.lang.Integer;

public class ListManager_getRide_144318281231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4254;
     Object term4255;

    public ListManager_getRide_144318281231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4254 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term4254, term4254.getClass(), "listOfPassengers", null);
        setField(term4254, term4254.getClass(), "listOfDrivers", null);
        setField(term4254, term4254.getClass(), "listOfAreas", null);
        setField(term4254, term4254.getClass(), "listOfAdmin", null);
        setField(term4254, term4254.getClass(), "listOfRides", null);
        term4255 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4255;
        callMethod(klass, "getRide", argTypes, term4254, args);
    }

};


