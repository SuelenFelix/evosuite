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

public class AdminController_getRideEvents_17641352734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24225;
     Object term24330;

    public AdminController_getRideEvents_17641352734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24228 = new ArrayList();
        ArrayList term24232 = new ArrayList();
        ArrayList term24236 = new ArrayList();
        ArrayList term24240 = new ArrayList();
        ArrayList term24244 = new ArrayList();
        Class<? extends Object> term24373 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term24372 = ((Class) term24373).getDeclaredField((String) "activated");
        ((Field) term24372).setAccessible(true);
        Object enum53 = ((Field) term24372).get((Object) null);
        ArrayList term24310 = new ArrayList();
        ArrayList term24314 = new ArrayList();
        ArrayList term24318 = new ArrayList();
        ArrayList term24322 = new ArrayList();
        ArrayList term24326 = new ArrayList();
        term24225 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.AdminController"));
        Object term24226 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Admin"));
        Object term24227 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        Object term24309 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term24227, term24227.getClass(), "listOfPassengers", term24228);
        setField(term24227, term24227.getClass(), "listOfDrivers", term24232);
        setField(term24227, term24227.getClass(), "listOfAreas", term24236);
        setField(term24227, term24227.getClass(), "listOfAdmin", term24240);
        setField(term24227, term24227.getClass(), "listOfRides", term24244);
        setField(term24226, term24226.getClass(), "manager", term24227);
        setField(term24226, term24226.getClass(), "username", "CbwfWaINrF");
        setField(term24226, term24226.getClass(), "mobileNumber", "AVCzSfXhGU");
        setField(term24226, term24226.getClass(), "email", "nTUCmQGFDE");
        setField(term24226, term24226.getClass(), "password", "rfFTBanxEx");
        setField(term24226, term24226.getClass(), "userStatus", enum53);
        setField(term24225, term24225.getClass(), "currentUser", term24226);
        setField(term24309, term24309.getClass(), "listOfPassengers", term24310);
        setField(term24309, term24309.getClass(), "listOfDrivers", term24314);
        setField(term24309, term24309.getClass(), "listOfAreas", term24318);
        setField(term24309, term24309.getClass(), "listOfAdmin", term24322);
        setField(term24309, term24309.getClass(), "listOfRides", term24326);
        setField(term24225, term24225.getClass(), "manager", term24309);
        term24330 = new Integer(797015478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.AdminController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24330;
        callMethod(klass, "getRideEvents", argTypes, term24225, args);
    }

};


