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

public class Event_setName_2867452672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4160;
     Object enum10;

    public Event_setName_2867452672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4204 = Class.forName((String) "com.API.OnDriver.EventSubsystem.EventName");
        Field term4203 = ((Class) term4204).getDeclaredField((String) "arrivedToSource");
        ((Field) term4203).setAccessible(true);
        Object enum9 = ((Field) term4203).get((Object) null);
        LinkedHashMap term4180 = new LinkedHashMap();
        term4160 = newInstance(Class.forName("com.API.OnDriver.EventSubsystem.Event"));
        setField(term4160, term4160.getClass(), "name", enum9);
        setField(term4160, term4160.getClass(), "attributes", term4180);
        Class<? extends Object> term4461 = Class.forName((String) "com.API.OnDriver.EventSubsystem.EventName");
        Field term4460 = ((Class) term4461).getDeclaredField((String) "acceptedOffer");
        ((Field) term4460).setAccessible(true);
        enum10 = ((Field) term4460).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.EventSubsystem.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.EventSubsystem.EventName");
        Object[] args = new Object[1];
        args[0] = enum10;
        callMethod(klass, "setName", argTypes, term4160, args);
    }

};


