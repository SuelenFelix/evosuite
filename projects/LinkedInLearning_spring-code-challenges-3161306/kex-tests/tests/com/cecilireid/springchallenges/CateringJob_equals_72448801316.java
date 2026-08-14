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

public class CateringJob_equals_72448801316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5593;
     Object term5660;

    public CateringJob_equals_72448801316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5594 = new Long(-872011222785455006L);
        Class<? extends Object> term5702 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term5701 = ((Class) term5702).getDeclaredField((String) "NOT_STARTED");
        ((Field) term5701).setAccessible(true);
        Object enum17 = ((Field) term5701).get((Object) null);
        term5593 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term5593, term5593.getClass(), "id", term5594);
        setField(term5593, term5593.getClass(), "customerName", "uWHnvSvaPl");
        setField(term5593, term5593.getClass(), "phoneNumber", "kBdSllIBVz");
        setField(term5593, term5593.getClass(), "email", "TJmVBGfTML");
        setField(term5593, term5593.getClass(), "menu", "tPlsykYBqO");
        setIntField(term5593, term5593.getClass(), "noOfGuests", 597278769);
        setField(term5593, term5593.getClass(), "status", enum17);
        term5660 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5660;
        callMethod(klass, "equals", argTypes, term5593, args);
    }

};


