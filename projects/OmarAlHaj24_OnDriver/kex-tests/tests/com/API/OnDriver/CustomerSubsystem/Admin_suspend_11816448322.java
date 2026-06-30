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

public class Admin_suspend_11816448322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7764;

    public Admin_suspend_11816448322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7766 = new ArrayList();
        ArrayList term7770 = new ArrayList();
        ArrayList term7774 = new ArrayList();
        ArrayList term7778 = new ArrayList();
        ArrayList term7782 = new ArrayList();
        Class<? extends Object> term7896 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term7895 = ((Class) term7896).getDeclaredField((String) "admin");
        ((Field) term7895).setAccessible(true);
        Object enum16 = ((Field) term7895).get((Object) null);
        term7764 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Admin"));
        Object term7765 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term7765, term7765.getClass(), "listOfPassengers", term7766);
        setField(term7765, term7765.getClass(), "listOfDrivers", term7770);
        setField(term7765, term7765.getClass(), "listOfAreas", term7774);
        setField(term7765, term7765.getClass(), "listOfAdmin", term7778);
        setField(term7765, term7765.getClass(), "listOfRides", term7782);
        setField(term7764, term7764.getClass(), "manager", term7765);
        setField(term7764, term7764.getClass(), "username", "kucsxnvbES");
        setField(term7764, term7764.getClass(), "mobileNumber", "IdGzDFfcZf");
        setField(term7764, term7764.getClass(), "email", "KDdRNhZmnU");
        setField(term7764, term7764.getClass(), "password", "iMsqJaKlDC");
        setField(term7764, term7764.getClass(), "userStatus", enum16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Admin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aPkGHbZyjj";
        callMethod(klass, "suspend", argTypes, term7764, args);
    }

};


