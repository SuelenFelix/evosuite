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

public class AdminController_suspend_10258447472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23411;

    public AdminController_suspend_10258447472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23414 = new ArrayList();
        ArrayList term23418 = new ArrayList();
        ArrayList term23422 = new ArrayList();
        ArrayList term23426 = new ArrayList();
        ArrayList term23430 = new ArrayList();
        Class<? extends Object> term23569 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term23568 = ((Class) term23569).getDeclaredField((String) "activated");
        ((Field) term23568).setAccessible(true);
        Object enum51 = ((Field) term23568).get((Object) null);
        ArrayList term23496 = new ArrayList();
        ArrayList term23500 = new ArrayList();
        ArrayList term23504 = new ArrayList();
        ArrayList term23508 = new ArrayList();
        ArrayList term23512 = new ArrayList();
        term23411 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.AdminController"));
        Object term23412 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Admin"));
        Object term23413 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        Object term23495 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term23413, term23413.getClass(), "listOfPassengers", term23414);
        setField(term23413, term23413.getClass(), "listOfDrivers", term23418);
        setField(term23413, term23413.getClass(), "listOfAreas", term23422);
        setField(term23413, term23413.getClass(), "listOfAdmin", term23426);
        setField(term23413, term23413.getClass(), "listOfRides", term23430);
        setField(term23412, term23412.getClass(), "manager", term23413);
        setField(term23412, term23412.getClass(), "username", "juKqILstcn");
        setField(term23412, term23412.getClass(), "mobileNumber", "QSCQJRyiPa");
        setField(term23412, term23412.getClass(), "email", "jPPOVoAOLQ");
        setField(term23412, term23412.getClass(), "password", "kZKzEkUFFI");
        setField(term23412, term23412.getClass(), "userStatus", enum51);
        setField(term23411, term23411.getClass(), "currentUser", term23412);
        setField(term23495, term23495.getClass(), "listOfPassengers", term23496);
        setField(term23495, term23495.getClass(), "listOfDrivers", term23500);
        setField(term23495, term23495.getClass(), "listOfAreas", term23504);
        setField(term23495, term23495.getClass(), "listOfAdmin", term23508);
        setField(term23495, term23495.getClass(), "listOfRides", term23512);
        setField(term23411, term23411.getClass(), "manager", term23495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.AdminController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dnYvoLZjCf";
        callMethod(klass, "suspend", argTypes, term23411, args);
    }

};


