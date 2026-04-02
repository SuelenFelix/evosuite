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
import java.lang.Integer;

public class PassengerController_acceptOffer_12009341665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;
     Object term261;

    public PassengerController_acceptOffer_12009341665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term229 = new ArrayList();
        ArrayList term233 = new ArrayList();
        ArrayList term237 = new ArrayList();
        ArrayList term241 = new ArrayList();
        ArrayList term245 = new ArrayList();
        term227 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.PassengerController"));
        Object term228 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term228, term228.getClass(), "listOfPassengers", term229);
        setField(term228, term228.getClass(), "listOfDrivers", term233);
        setField(term228, term228.getClass(), "listOfAreas", term237);
        setField(term228, term228.getClass(), "listOfAdmin", term241);
        setField(term228, term228.getClass(), "listOfRides", term245);
        setField(term227, term227.getClass(), "manager", term228);
        term261 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.PassengerController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "SzjVpOQTyS";
        args[1] = term261;
        callMethod(klass, "acceptOffer", argTypes, term227, args);
    }

};


