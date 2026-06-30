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

public class AdminController_applyDiscount_18413036085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24631;

    public AdminController_applyDiscount_18413036085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24634 = new ArrayList();
        ArrayList term24638 = new ArrayList();
        ArrayList term24642 = new ArrayList();
        ArrayList term24646 = new ArrayList();
        ArrayList term24650 = new ArrayList();
        Class<? extends Object> term24789 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term24788 = ((Class) term24789).getDeclaredField((String) "suspended");
        ((Field) term24788).setAccessible(true);
        Object enum54 = ((Field) term24788).get((Object) null);
        ArrayList term24716 = new ArrayList();
        ArrayList term24720 = new ArrayList();
        ArrayList term24724 = new ArrayList();
        ArrayList term24728 = new ArrayList();
        ArrayList term24732 = new ArrayList();
        term24631 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.AdminController"));
        Object term24632 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Admin"));
        Object term24633 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        Object term24715 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term24633, term24633.getClass(), "listOfPassengers", term24634);
        setField(term24633, term24633.getClass(), "listOfDrivers", term24638);
        setField(term24633, term24633.getClass(), "listOfAreas", term24642);
        setField(term24633, term24633.getClass(), "listOfAdmin", term24646);
        setField(term24633, term24633.getClass(), "listOfRides", term24650);
        setField(term24632, term24632.getClass(), "manager", term24633);
        setField(term24632, term24632.getClass(), "username", "MQJTCGewxT");
        setField(term24632, term24632.getClass(), "mobileNumber", "DRdgywxCcP");
        setField(term24632, term24632.getClass(), "email", "uelmUHzwnS");
        setField(term24632, term24632.getClass(), "password", "iKuSKqVzvy");
        setField(term24632, term24632.getClass(), "userStatus", enum54);
        setField(term24631, term24631.getClass(), "currentUser", term24632);
        setField(term24715, term24715.getClass(), "listOfPassengers", term24716);
        setField(term24715, term24715.getClass(), "listOfDrivers", term24720);
        setField(term24715, term24715.getClass(), "listOfAreas", term24724);
        setField(term24715, term24715.getClass(), "listOfAdmin", term24728);
        setField(term24715, term24715.getClass(), "listOfRides", term24732);
        setField(term24631, term24631.getClass(), "manager", term24715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.AdminController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SgyGAlytLF";
        callMethod(klass, "applyDiscount", argTypes, term24631, args);
    }

};


