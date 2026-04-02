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

public class ListManager_getAdmin_56117334513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2369;

    public ListManager_getAdmin_56117334513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2370 = new ArrayList();
        ArrayList term2374 = new ArrayList();
        ArrayList term2378 = new ArrayList();
        ArrayList term2382 = new ArrayList();
        ArrayList term2386 = new ArrayList();
        term2369 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term2369, term2369.getClass(), "listOfPassengers", term2370);
        setField(term2369, term2369.getClass(), "listOfDrivers", term2374);
        setField(term2369, term2369.getClass(), "listOfAreas", term2378);
        setField(term2369, term2369.getClass(), "listOfAdmin", term2382);
        setField(term2369, term2369.getClass(), "listOfRides", term2386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rLHAoqXgPh";
        callMethod(klass, "getAdmin", argTypes, term2369, args);
    }

};


