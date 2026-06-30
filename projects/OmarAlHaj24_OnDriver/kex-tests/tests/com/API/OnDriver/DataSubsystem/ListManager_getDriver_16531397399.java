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

public class ListManager_getDriver_16531397399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1238;

    public ListManager_getDriver_16531397399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1239 = new ArrayList();
        ArrayList term1243 = new ArrayList();
        ArrayList term1247 = new ArrayList();
        ArrayList term1251 = new ArrayList();
        ArrayList term1255 = new ArrayList();
        term1238 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term1238, term1238.getClass(), "listOfPassengers", term1239);
        setField(term1238, term1238.getClass(), "listOfDrivers", term1243);
        setField(term1238, term1238.getClass(), "listOfAreas", term1247);
        setField(term1238, term1238.getClass(), "listOfAdmin", term1251);
        setField(term1238, term1238.getClass(), "listOfRides", term1255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hCWPJQKpdc";
        callMethod(klass, "getDriver", argTypes, term1238, args);
    }

};


