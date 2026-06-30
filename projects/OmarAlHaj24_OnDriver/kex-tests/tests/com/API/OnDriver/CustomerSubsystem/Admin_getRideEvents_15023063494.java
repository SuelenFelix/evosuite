package com.API.OnDriver.CustomerSubsystem;

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
import static com.API.OnDriver.CustomerSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;

public class Admin_getRideEvents_15023063494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8518;
     Object term8601;

    public Admin_getRideEvents_15023063494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8520 = new ArrayList();
        ArrayList term8524 = new ArrayList();
        ArrayList term8528 = new ArrayList();
        ArrayList term8532 = new ArrayList();
        ArrayList term8536 = new ArrayList();
        Class<? extends Object> term8644 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term8643 = ((Class) term8644).getDeclaredField((String) "suspended");
        ((Field) term8643).setAccessible(true);
        Object enum18 = ((Field) term8643).get((Object) null);
        term8518 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Admin"));
        Object term8519 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term8519, term8519.getClass(), "listOfPassengers", term8520);
        setField(term8519, term8519.getClass(), "listOfDrivers", term8524);
        setField(term8519, term8519.getClass(), "listOfAreas", term8528);
        setField(term8519, term8519.getClass(), "listOfAdmin", term8532);
        setField(term8519, term8519.getClass(), "listOfRides", term8536);
        setField(term8518, term8518.getClass(), "manager", term8519);
        setField(term8518, term8518.getClass(), "username", "oYymmLqbfJ");
        setField(term8518, term8518.getClass(), "mobileNumber", "YaDWphDOSz");
        setField(term8518, term8518.getClass(), "email", "nnnmCgFBLw");
        setField(term8518, term8518.getClass(), "password", "hSSCyNEhyH");
        setField(term8518, term8518.getClass(), "userStatus", enum18);
        term8601 = new Integer(-936895502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Admin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8601;
        callMethod(klass, "getRideEvents", argTypes, term8518, args);
    }

};


