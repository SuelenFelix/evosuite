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

public class ListManager_getArea_207429355911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1923;

    public ListManager_getArea_207429355911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1924 = new ArrayList();
        ArrayList term1928 = new ArrayList();
        ArrayList term1932 = new ArrayList();
        ArrayList term1936 = new ArrayList();
        ArrayList term1940 = new ArrayList();
        term1923 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term1923, term1923.getClass(), "listOfPassengers", term1924);
        setField(term1923, term1923.getClass(), "listOfDrivers", term1928);
        setField(term1923, term1923.getClass(), "listOfAreas", term1932);
        setField(term1923, term1923.getClass(), "listOfAdmin", term1936);
        setField(term1923, term1923.getClass(), "listOfRides", term1940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "smnHEqRFRx";
        callMethod(klass, "getArea", argTypes, term1923, args);
    }

};


