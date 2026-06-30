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

public class ListManager_isAvailable_17043294232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ListManager_isAvailable_17043294232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2 = new ArrayList();
        ArrayList term6 = new ArrayList();
        ArrayList term10 = new ArrayList();
        ArrayList term14 = new ArrayList();
        ArrayList term18 = new ArrayList();
        term1 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term1, term1.getClass(), "listOfPassengers", term2);
        setField(term1, term1.getClass(), "listOfDrivers", term6);
        setField(term1, term1.getClass(), "listOfAreas", term10);
        setField(term1, term1.getClass(), "listOfAdmin", term14);
        setField(term1, term1.getClass(), "listOfRides", term18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        callMethod(klass, "isAvailable", argTypes, term1, args);
    }

};


