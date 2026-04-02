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

public class PassengerController_rateRide_1941048263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;
     Object term169;
     Object term171;

    public PassengerController_rateRide_1941048263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term137 = new ArrayList();
        ArrayList term141 = new ArrayList();
        ArrayList term145 = new ArrayList();
        ArrayList term149 = new ArrayList();
        ArrayList term153 = new ArrayList();
        term135 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.PassengerController"));
        Object term136 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term136, term136.getClass(), "listOfPassengers", term137);
        setField(term136, term136.getClass(), "listOfDrivers", term141);
        setField(term136, term136.getClass(), "listOfAreas", term145);
        setField(term136, term136.getClass(), "listOfAdmin", term149);
        setField(term136, term136.getClass(), "listOfRides", term153);
        setField(term135, term135.getClass(), "manager", term136);
        term169 = new Integer(1162663216);
        term171 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.PassengerController");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "jJCZpVmanW";
        args[1] = term169;
        args[2] = term171;
        callMethod(klass, "rateRide", argTypes, term135, args);
    }

};


