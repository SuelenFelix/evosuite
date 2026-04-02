package com.API.OnDriver.DataSubsystem;

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
import static com.API.OnDriver.DataSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class ListManager_addToAdmin_6919494012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1966;
     Object term1987;

    public ListManager_addToAdmin_6919494012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1967 = new ArrayList();
        ArrayList term1971 = new ArrayList();
        ArrayList term1975 = new ArrayList();
        ArrayList term1979 = new ArrayList();
        ArrayList term1983 = new ArrayList();
        term1966 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term1966, term1966.getClass(), "listOfPassengers", term1967);
        setField(term1966, term1966.getClass(), "listOfDrivers", term1971);
        setField(term1966, term1966.getClass(), "listOfAreas", term1975);
        setField(term1966, term1966.getClass(), "listOfAdmin", term1979);
        setField(term1966, term1966.getClass(), "listOfRides", term1983);
        ArrayList term1989 = new ArrayList();
        ArrayList term1993 = new ArrayList();
        ArrayList term1997 = new ArrayList();
        ArrayList term2001 = new ArrayList();
        ArrayList term2005 = new ArrayList();
        Class<? extends Object> term2111 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term2110 = ((Class) term2111).getDeclaredField((String) "activated");
        ((Field) term2110).setAccessible(true);
        Object enum4 = ((Field) term2110).get((Object) null);
        term1987 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Admin"));
        Object term1988 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term1988, term1988.getClass(), "listOfPassengers", term1989);
        setField(term1988, term1988.getClass(), "listOfDrivers", term1993);
        setField(term1988, term1988.getClass(), "listOfAreas", term1997);
        setField(term1988, term1988.getClass(), "listOfAdmin", term2001);
        setField(term1988, term1988.getClass(), "listOfRides", term2005);
        setField(term1987, term1987.getClass(), "manager", term1988);
        setField(term1987, term1987.getClass(), "username", "XYtryyobou");
        setField(term1987, term1987.getClass(), "mobileNumber", "OYbzXylRWW");
        setField(term1987, term1987.getClass(), "email", "DSNsTGYXDF");
        setField(term1987, term1987.getClass(), "password", "sQvGcVjdEx");
        setField(term1987, term1987.getClass(), "userStatus", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.CustomerSubsystem.Admin");
        Object[] args = new Object[1];
        args[0] = term1987;
        callMethod(klass, "addToAdmin", argTypes, term1966, args);
    }

};


