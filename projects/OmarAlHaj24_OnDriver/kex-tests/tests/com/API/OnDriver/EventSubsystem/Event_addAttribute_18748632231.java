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

public class Event_addAttribute_18748632231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3833;

    public Event_addAttribute_18748632231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3884 = Class.forName((String) "com.API.OnDriver.EventSubsystem.EventName");
        Field term3883 = ((Class) term3884).getDeclaredField((String) "arrivedToSource");
        ((Field) term3883).setAccessible(true);
        Object enum8 = ((Field) term3883).get((Object) null);
        LinkedHashMap term3853 = new LinkedHashMap();
        term3833 = newInstance(Class.forName("com.API.OnDriver.EventSubsystem.Event"));
        setField(term3833, term3833.getClass(), "name", enum8);
        setField(term3833, term3833.getClass(), "attributes", term3853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.EventSubsystem.Event");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "OzXRsFGTIp";
        args[1] = "TjWpyghUWN";
        callMethod(klass, "addAttribute", argTypes, term3833, args);
    }

};


