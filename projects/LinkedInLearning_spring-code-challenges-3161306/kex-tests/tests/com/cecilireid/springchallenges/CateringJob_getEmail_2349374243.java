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

public class CateringJob_getEmail_2349374243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1625;

    public CateringJob_getEmail_2349374243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1626 = new Long(-8400487765614892086L);
        Class<? extends Object> term1733 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term1732 = ((Class) term1733).getDeclaredField((String) "NOT_STARTED");
        ((Field) term1732).setAccessible(true);
        Object enum5 = ((Field) term1732).get((Object) null);
        term1625 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term1625, term1625.getClass(), "id", term1626);
        setField(term1625, term1625.getClass(), "customerName", "tbcdzjIfER");
        setField(term1625, term1625.getClass(), "phoneNumber", "HyxfbSQYBe");
        setField(term1625, term1625.getClass(), "email", "pCTimMblYc");
        setField(term1625, term1625.getClass(), "menu", "hNxWaHcfhY");
        setIntField(term1625, term1625.getClass(), "noOfGuests", 391863371);
        setField(term1625, term1625.getClass(), "status", enum5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1625, args);
    }

};


