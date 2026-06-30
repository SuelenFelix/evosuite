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

public class AdminController_getSystemRides_8820089643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23837;

    public AdminController_getSystemRides_8820089643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23840 = new ArrayList();
        ArrayList term23844 = new ArrayList();
        ArrayList term23848 = new ArrayList();
        ArrayList term23852 = new ArrayList();
        ArrayList term23856 = new ArrayList();
        Class<? extends Object> term23979 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term23978 = ((Class) term23979).getDeclaredField((String) "admin");
        ((Field) term23978).setAccessible(true);
        Object enum52 = ((Field) term23978).get((Object) null);
        ArrayList term23918 = new ArrayList();
        ArrayList term23922 = new ArrayList();
        ArrayList term23926 = new ArrayList();
        ArrayList term23930 = new ArrayList();
        ArrayList term23934 = new ArrayList();
        term23837 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.AdminController"));
        Object term23838 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Admin"));
        Object term23839 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        Object term23917 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term23839, term23839.getClass(), "listOfPassengers", term23840);
        setField(term23839, term23839.getClass(), "listOfDrivers", term23844);
        setField(term23839, term23839.getClass(), "listOfAreas", term23848);
        setField(term23839, term23839.getClass(), "listOfAdmin", term23852);
        setField(term23839, term23839.getClass(), "listOfRides", term23856);
        setField(term23838, term23838.getClass(), "manager", term23839);
        setField(term23838, term23838.getClass(), "username", "ZsvLlzqETk");
        setField(term23838, term23838.getClass(), "mobileNumber", "DqrZwuHriF");
        setField(term23838, term23838.getClass(), "email", "daaMmTkwOR");
        setField(term23838, term23838.getClass(), "password", "WfJKDOFrUv");
        setField(term23838, term23838.getClass(), "userStatus", enum52);
        setField(term23837, term23837.getClass(), "currentUser", term23838);
        setField(term23917, term23917.getClass(), "listOfPassengers", term23918);
        setField(term23917, term23917.getClass(), "listOfDrivers", term23922);
        setField(term23917, term23917.getClass(), "listOfAreas", term23926);
        setField(term23917, term23917.getClass(), "listOfAdmin", term23930);
        setField(term23917, term23917.getClass(), "listOfRides", term23934);
        setField(term23837, term23837.getClass(), "manager", term23917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.AdminController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSystemRides", argTypes, term23837, args);
    }

};


