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

public class AdminController_verifyDriver_6128871621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23001;

    public AdminController_verifyDriver_6128871621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23004 = new ArrayList();
        ArrayList term23008 = new ArrayList();
        ArrayList term23012 = new ArrayList();
        ArrayList term23016 = new ArrayList();
        ArrayList term23020 = new ArrayList();
        Class<? extends Object> term23155 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term23154 = ((Class) term23155).getDeclaredField((String) "admin");
        ((Field) term23154).setAccessible(true);
        Object enum50 = ((Field) term23154).get((Object) null);
        ArrayList term23082 = new ArrayList();
        ArrayList term23086 = new ArrayList();
        ArrayList term23090 = new ArrayList();
        ArrayList term23094 = new ArrayList();
        ArrayList term23098 = new ArrayList();
        term23001 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.AdminController"));
        Object term23002 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Admin"));
        Object term23003 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        Object term23081 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term23003, term23003.getClass(), "listOfPassengers", term23004);
        setField(term23003, term23003.getClass(), "listOfDrivers", term23008);
        setField(term23003, term23003.getClass(), "listOfAreas", term23012);
        setField(term23003, term23003.getClass(), "listOfAdmin", term23016);
        setField(term23003, term23003.getClass(), "listOfRides", term23020);
        setField(term23002, term23002.getClass(), "manager", term23003);
        setField(term23002, term23002.getClass(), "username", "TapDFGQNLY");
        setField(term23002, term23002.getClass(), "mobileNumber", "vgHeAegSfV");
        setField(term23002, term23002.getClass(), "email", "qShfKMgKGs");
        setField(term23002, term23002.getClass(), "password", "bLCaDnEUyS");
        setField(term23002, term23002.getClass(), "userStatus", enum50);
        setField(term23001, term23001.getClass(), "currentUser", term23002);
        setField(term23081, term23081.getClass(), "listOfPassengers", term23082);
        setField(term23081, term23081.getClass(), "listOfDrivers", term23086);
        setField(term23081, term23081.getClass(), "listOfAreas", term23090);
        setField(term23081, term23081.getClass(), "listOfAdmin", term23094);
        setField(term23081, term23081.getClass(), "listOfRides", term23098);
        setField(term23001, term23001.getClass(), "manager", term23081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.AdminController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yfHcOCDrGy";
        callMethod(klass, "verifyDriver", argTypes, term23001, args);
    }

};


