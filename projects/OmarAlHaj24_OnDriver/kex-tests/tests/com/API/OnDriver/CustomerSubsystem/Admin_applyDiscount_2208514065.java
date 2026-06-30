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

public class Admin_applyDiscount_2208514065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8902;
     Object term8985;

    public Admin_applyDiscount_2208514065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8904 = new ArrayList();
        ArrayList term8908 = new ArrayList();
        ArrayList term8912 = new ArrayList();
        ArrayList term8916 = new ArrayList();
        ArrayList term8920 = new ArrayList();
        Class<? extends Object> term9044 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term9043 = ((Class) term9044).getDeclaredField((String) "suspended");
        ((Field) term9043).setAccessible(true);
        Object enum19 = ((Field) term9043).get((Object) null);
        term8902 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Admin"));
        Object term8903 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term8903, term8903.getClass(), "listOfPassengers", term8904);
        setField(term8903, term8903.getClass(), "listOfDrivers", term8908);
        setField(term8903, term8903.getClass(), "listOfAreas", term8912);
        setField(term8903, term8903.getClass(), "listOfAdmin", term8916);
        setField(term8903, term8903.getClass(), "listOfRides", term8920);
        setField(term8902, term8902.getClass(), "manager", term8903);
        setField(term8902, term8902.getClass(), "username", "jDFNSuvZqm");
        setField(term8902, term8902.getClass(), "mobileNumber", "pLvkKHqNYX");
        setField(term8902, term8902.getClass(), "email", "PwqnuJJwjR");
        setField(term8902, term8902.getClass(), "password", "NFkbBiPeiw");
        setField(term8902, term8902.getClass(), "userStatus", enum19);
        ArrayList term8999 = new ArrayList();
        term8985 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term8985, term8985.getClass(), "location", "tlRvilQyjJ");
        setBooleanField(term8985, term8985.getClass(), "isDiscounted", false);
        setField(term8985, term8985.getClass(), "drivers", term8999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Admin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.RideSubsystem.Area");
        Object[] args = new Object[1];
        args[0] = term8985;
        callMethod(klass, "applyDiscount", argTypes, term8902, args);
    }

};


