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

public class PassengerController_viewOffers_8816701804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183;

    public PassengerController_viewOffers_8816701804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term185 = new ArrayList();
        ArrayList term189 = new ArrayList();
        ArrayList term193 = new ArrayList();
        ArrayList term197 = new ArrayList();
        ArrayList term201 = new ArrayList();
        term183 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.PassengerController"));
        Object term184 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term184, term184.getClass(), "listOfPassengers", term185);
        setField(term184, term184.getClass(), "listOfDrivers", term189);
        setField(term184, term184.getClass(), "listOfAreas", term193);
        setField(term184, term184.getClass(), "listOfAdmin", term197);
        setField(term184, term184.getClass(), "listOfRides", term201);
        setField(term183, term183.getClass(), "manager", term184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.PassengerController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        callMethod(klass, "viewOffers", argTypes, term183, args);
    }

};


