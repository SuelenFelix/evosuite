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
import java.util.ArrayList;
import java.lang.Integer;

public class ListManager_getRide_144318281215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2433;
     Object term2454;

    public ListManager_getRide_144318281215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2434 = new ArrayList();
        ArrayList term2438 = new ArrayList();
        ArrayList term2442 = new ArrayList();
        ArrayList term2446 = new ArrayList();
        ArrayList term2450 = new ArrayList();
        term2433 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term2433, term2433.getClass(), "listOfPassengers", term2434);
        setField(term2433, term2433.getClass(), "listOfDrivers", term2438);
        setField(term2433, term2433.getClass(), "listOfAreas", term2442);
        setField(term2433, term2433.getClass(), "listOfAdmin", term2446);
        setField(term2433, term2433.getClass(), "listOfRides", term2450);
        term2454 = new Integer(-1588772968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2454;
        callMethod(klass, "getRide", argTypes, term2433, args);
    }

};


