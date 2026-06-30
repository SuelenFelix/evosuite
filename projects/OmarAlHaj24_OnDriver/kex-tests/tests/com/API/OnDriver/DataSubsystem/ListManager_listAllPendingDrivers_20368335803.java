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

public class ListManager_listAllPendingDrivers_20368335803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;

    public ListManager_listAllPendingDrivers_20368335803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term45 = new ArrayList();
        ArrayList term49 = new ArrayList();
        ArrayList term53 = new ArrayList();
        ArrayList term57 = new ArrayList();
        ArrayList term61 = new ArrayList();
        term44 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term44, term44.getClass(), "listOfPassengers", term45);
        setField(term44, term44.getClass(), "listOfDrivers", term49);
        setField(term44, term44.getClass(), "listOfAreas", term53);
        setField(term44, term44.getClass(), "listOfAdmin", term57);
        setField(term44, term44.getClass(), "listOfRides", term61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listAllPendingDrivers", argTypes, term44, args);
    }

};


