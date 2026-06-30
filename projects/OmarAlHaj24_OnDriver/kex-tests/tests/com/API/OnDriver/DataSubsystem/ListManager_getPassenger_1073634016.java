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

public class ListManager_getPassenger_1073634016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579;

    public ListManager_getPassenger_1073634016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term580 = new ArrayList();
        ArrayList term584 = new ArrayList();
        ArrayList term588 = new ArrayList();
        ArrayList term592 = new ArrayList();
        ArrayList term596 = new ArrayList();
        term579 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term579, term579.getClass(), "listOfPassengers", term580);
        setField(term579, term579.getClass(), "listOfDrivers", term584);
        setField(term579, term579.getClass(), "listOfAreas", term588);
        setField(term579, term579.getClass(), "listOfAdmin", term592);
        setField(term579, term579.getClass(), "listOfRides", term596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVgzLbrsFr";
        callMethod(klass, "getPassenger", argTypes, term579, args);
    }

};


