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

public class ListManager_getAllRides_57075453414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2412;

    public ListManager_getAllRides_57075453414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2413 = new ArrayList();
        ArrayList term2417 = new ArrayList();
        ArrayList term2421 = new ArrayList();
        ArrayList term2425 = new ArrayList();
        ArrayList term2429 = new ArrayList();
        term2412 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term2412, term2412.getClass(), "listOfPassengers", term2413);
        setField(term2412, term2412.getClass(), "listOfDrivers", term2417);
        setField(term2412, term2412.getClass(), "listOfAreas", term2421);
        setField(term2412, term2412.getClass(), "listOfAdmin", term2425);
        setField(term2412, term2412.getClass(), "listOfRides", term2429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllRides", argTypes, term2412, args);
    }

};


