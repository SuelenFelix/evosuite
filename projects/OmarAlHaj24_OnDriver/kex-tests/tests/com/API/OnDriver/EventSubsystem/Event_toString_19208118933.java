package com.API.OnDriver.EventSubsystem;

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
import static com.API.OnDriver.EventSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedHashMap;

public class Event_toString_19208118933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4711;

    public Event_toString_19208118933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4733 = Class.forName((String) "com.API.OnDriver.EventSubsystem.EventName");
        Field term4732 = ((Class) term4733).getDeclaredField((String) "addedPrice");
        ((Field) term4732).setAccessible(true);
        Object enum11 = ((Field) term4732).get((Object) null);
        LinkedHashMap term4726 = new LinkedHashMap();
        term4711 = newInstance(Class.forName("com.API.OnDriver.EventSubsystem.Event"));
        setField(term4711, term4711.getClass(), "name", enum11);
        setField(term4711, term4711.getClass(), "attributes", term4726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.EventSubsystem.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4711, args);
    }

};


