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

public class ListManager_getUser_16502076594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;

    public ListManager_getUser_16502076594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term66 = new ArrayList();
        ArrayList term70 = new ArrayList();
        ArrayList term74 = new ArrayList();
        ArrayList term78 = new ArrayList();
        ArrayList term82 = new ArrayList();
        term65 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term65, term65.getClass(), "listOfPassengers", term66);
        setField(term65, term65.getClass(), "listOfDrivers", term70);
        setField(term65, term65.getClass(), "listOfAreas", term74);
        setField(term65, term65.getClass(), "listOfAdmin", term78);
        setField(term65, term65.getClass(), "listOfRides", term82);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        callMethod(klass, "getUser", argTypes, term65, args);
    }

};


