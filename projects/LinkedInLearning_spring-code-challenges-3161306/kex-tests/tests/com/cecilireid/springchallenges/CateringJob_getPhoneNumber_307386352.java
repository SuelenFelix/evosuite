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

public class CateringJob_getPhoneNumber_307386352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1296;

    public CateringJob_getPhoneNumber_307386352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1297 = new Long(-8257434502486459194L);
        Class<? extends Object> term1402 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term1401 = ((Class) term1402).getDeclaredField((String) "COMPLETED");
        ((Field) term1401).setAccessible(true);
        Object enum4 = ((Field) term1401).get((Object) null);
        term1296 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term1296, term1296.getClass(), "id", term1297);
        setField(term1296, term1296.getClass(), "customerName", "LQFpaHEwXR");
        setField(term1296, term1296.getClass(), "phoneNumber", "oVcInYnLWB");
        setField(term1296, term1296.getClass(), "email", "aJlieCFVtF");
        setField(term1296, term1296.getClass(), "menu", "ZiaGIbnzTs");
        setIntField(term1296, term1296.getClass(), "noOfGuests", 1484323161);
        setField(term1296, term1296.getClass(), "status", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhoneNumber", argTypes, term1296, args);
    }

};


