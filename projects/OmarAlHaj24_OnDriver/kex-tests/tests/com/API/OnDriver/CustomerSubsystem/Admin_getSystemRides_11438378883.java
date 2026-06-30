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

public class Admin_getSystemRides_11438378883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8152;

    public Admin_getSystemRides_11438378883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8154 = new ArrayList();
        ArrayList term8158 = new ArrayList();
        ArrayList term8162 = new ArrayList();
        ArrayList term8166 = new ArrayList();
        ArrayList term8170 = new ArrayList();
        Class<? extends Object> term8272 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term8271 = ((Class) term8272).getDeclaredField((String) "admin");
        ((Field) term8271).setAccessible(true);
        Object enum17 = ((Field) term8271).get((Object) null);
        term8152 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Admin"));
        Object term8153 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term8153, term8153.getClass(), "listOfPassengers", term8154);
        setField(term8153, term8153.getClass(), "listOfDrivers", term8158);
        setField(term8153, term8153.getClass(), "listOfAreas", term8162);
        setField(term8153, term8153.getClass(), "listOfAdmin", term8166);
        setField(term8153, term8153.getClass(), "listOfRides", term8170);
        setField(term8152, term8152.getClass(), "manager", term8153);
        setField(term8152, term8152.getClass(), "username", "nSWdsVyJRI");
        setField(term8152, term8152.getClass(), "mobileNumber", "JBOPGgGKnc");
        setField(term8152, term8152.getClass(), "email", "GlPTiCMCGP");
        setField(term8152, term8152.getClass(), "password", "jlcBpLoWfd");
        setField(term8152, term8152.getClass(), "userStatus", enum17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Admin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSystemRides", argTypes, term8152, args);
    }

};


