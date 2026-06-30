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

public class Admin_verifyDriver_13371298071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7360;

    public Admin_verifyDriver_13371298071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7362 = new ArrayList();
        ArrayList term7366 = new ArrayList();
        ArrayList term7370 = new ArrayList();
        ArrayList term7374 = new ArrayList();
        ArrayList term7378 = new ArrayList();
        Class<? extends Object> term7496 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term7495 = ((Class) term7496).getDeclaredField((String) "activated");
        ((Field) term7495).setAccessible(true);
        Object enum15 = ((Field) term7495).get((Object) null);
        term7360 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Admin"));
        Object term7361 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term7361, term7361.getClass(), "listOfPassengers", term7362);
        setField(term7361, term7361.getClass(), "listOfDrivers", term7366);
        setField(term7361, term7361.getClass(), "listOfAreas", term7370);
        setField(term7361, term7361.getClass(), "listOfAdmin", term7374);
        setField(term7361, term7361.getClass(), "listOfRides", term7378);
        setField(term7360, term7360.getClass(), "manager", term7361);
        setField(term7360, term7360.getClass(), "username", "MAnhIPOtHL");
        setField(term7360, term7360.getClass(), "mobileNumber", "dikKjYjmRO");
        setField(term7360, term7360.getClass(), "email", "GJnnMDVnEP");
        setField(term7360, term7360.getClass(), "password", "zSMVllDpfk");
        setField(term7360, term7360.getClass(), "userStatus", enum15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Admin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iptRXVDoYE";
        callMethod(klass, "verifyDriver", argTypes, term7360, args);
    }

};


