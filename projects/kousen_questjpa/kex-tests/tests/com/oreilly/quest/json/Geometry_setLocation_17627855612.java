package com.oreilly.quest.json;

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
import static com.oreilly.quest.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Geometry_setLocation_17627855612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345;
     Object term349;

    public Geometry_setLocation_17627855612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        Object term346 = newInstance(Class.forName("com.oreilly.quest.json.Location"));
        setDoubleField(term346, term346.getClass(), "lat", 0.016575281023182953);
        setDoubleField(term346, term346.getClass(), "lng", 0.5308350402051779);
        setField(term345, term345.getClass(), "location", term346);
        term349 = newInstance(Class.forName("com.oreilly.quest.json.Location"));
        setDoubleField(term349, term349.getClass(), "lat", 0.7154795600170818);
        setDoubleField(term349, term349.getClass(), "lng", 0.6355029654528058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.json.Geometry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.json.Location");
        Object[] args = new Object[1];
        args[0] = term349;
        callMethod(klass, "setLocation", argTypes, term345, args);
    }

};


