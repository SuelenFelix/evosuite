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

public class PassengerController_requestRide_15787397791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term59;

    public PassengerController_requestRide_15787397791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3 = new ArrayList();
        ArrayList term7 = new ArrayList();
        ArrayList term11 = new ArrayList();
        ArrayList term15 = new ArrayList();
        ArrayList term19 = new ArrayList();
        term1 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.PassengerController"));
        Object term2 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term2, term2.getClass(), "listOfPassengers", term3);
        setField(term2, term2.getClass(), "listOfDrivers", term7);
        setField(term2, term2.getClass(), "listOfAreas", term11);
        setField(term2, term2.getClass(), "listOfAdmin", term15);
        setField(term2, term2.getClass(), "listOfRides", term19);
        setField(term1, term1.getClass(), "manager", term2);
        term59 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.PassengerController");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = "MuLcgQHgqz";
        args[3] = term59;
        callMethod(klass, "requestRide", argTypes, term1, args);
    }

};


