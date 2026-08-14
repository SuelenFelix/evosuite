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

public class CateringJob_setEmail_18873099212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3978;

    public CateringJob_setEmail_18873099212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3979 = new Long(-8885298608300233488L);
        Class<? extends Object> term4096 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term4095 = ((Class) term4096).getDeclaredField((String) "COMPLETED");
        ((Field) term4095).setAccessible(true);
        Object enum12 = ((Field) term4095).get((Object) null);
        term3978 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term3978, term3978.getClass(), "id", term3979);
        setField(term3978, term3978.getClass(), "customerName", "LvtrsXUliU");
        setField(term3978, term3978.getClass(), "phoneNumber", "xLbjWUgOIL");
        setField(term3978, term3978.getClass(), "email", "jDtqGUpnZN");
        setField(term3978, term3978.getClass(), "menu", "nGKItKLYNC");
        setIntField(term3978, term3978.getClass(), "noOfGuests", 1725571209);
        setField(term3978, term3978.getClass(), "status", enum12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UiUYnPrcCi";
        callMethod(klass, "setEmail", argTypes, term3978, args);
    }

};


