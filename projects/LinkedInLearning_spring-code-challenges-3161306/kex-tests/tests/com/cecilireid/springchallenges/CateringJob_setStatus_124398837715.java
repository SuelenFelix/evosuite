package com.cecilireid.springchallenges;

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
import static com.cecilireid.springchallenges.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class CateringJob_setStatus_124398837715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5019;
     Object enum16;

    public CateringJob_setStatus_124398837715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5020 = new Long(-5476826692763582090L);
        Class<? extends Object> term5140 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term5139 = ((Class) term5140).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term5139).setAccessible(true);
        Object enum15 = ((Field) term5139).get((Object) null);
        term5019 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term5019, term5019.getClass(), "id", term5020);
        setField(term5019, term5019.getClass(), "customerName", "dEnhdmILtU");
        setField(term5019, term5019.getClass(), "phoneNumber", "hoicvmsovO");
        setField(term5019, term5019.getClass(), "email", "eqJfYWRaEL");
        setField(term5019, term5019.getClass(), "menu", "fhkbdRViHi");
        setIntField(term5019, term5019.getClass(), "noOfGuests", 1585847225);
        setField(term5019, term5019.getClass(), "status", enum15);
        Class<? extends Object> term5370 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term5369 = ((Class) term5370).getDeclaredField((String) "COMPLETED");
        ((Field) term5369).setAccessible(true);
        enum16 = ((Field) term5369).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cecilireid.springchallenges.Status");
        Object[] args = new Object[1];
        args[0] = enum16;
        callMethod(klass, "setStatus", argTypes, term5019, args);
    }

};


