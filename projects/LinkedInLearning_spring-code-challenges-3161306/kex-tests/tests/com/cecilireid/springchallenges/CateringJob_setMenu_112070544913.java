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

public class CateringJob_setMenu_112070544913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4329;

    public CateringJob_setMenu_112070544913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4330 = new Long(-4325723315152823407L);
        Class<? extends Object> term4449 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term4448 = ((Class) term4449).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term4448).setAccessible(true);
        Object enum13 = ((Field) term4448).get((Object) null);
        term4329 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term4329, term4329.getClass(), "id", term4330);
        setField(term4329, term4329.getClass(), "customerName", "UoYtihxVaS");
        setField(term4329, term4329.getClass(), "phoneNumber", "JDswTTCZHV");
        setField(term4329, term4329.getClass(), "email", "onpbIeEKoi");
        setField(term4329, term4329.getClass(), "menu", "YRHGsAkhxb");
        setIntField(term4329, term4329.getClass(), "noOfGuests", -522618178);
        setField(term4329, term4329.getClass(), "status", enum13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ffYhPOzlUs";
        callMethod(klass, "setMenu", argTypes, term4329, args);
    }

};


