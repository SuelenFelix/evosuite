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

public class CateringJob_getCustomerName_19881548391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term967;

    public CateringJob_getCustomerName_19881548391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term968 = new Long(6375119433582206027L);
        Class<? extends Object> term1073 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term1072 = ((Class) term1073).getDeclaredField((String) "COMPLETED");
        ((Field) term1072).setAccessible(true);
        Object enum3 = ((Field) term1072).get((Object) null);
        term967 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term967, term967.getClass(), "id", term968);
        setField(term967, term967.getClass(), "customerName", "RMFIsYGgne");
        setField(term967, term967.getClass(), "phoneNumber", "NRdvgJlhkX");
        setField(term967, term967.getClass(), "email", "uuaPigETmJ");
        setField(term967, term967.getClass(), "menu", "MxlszYVzRf");
        setIntField(term967, term967.getClass(), "noOfGuests", 1162663216);
        setField(term967, term967.getClass(), "status", enum3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerName", argTypes, term967, args);
    }

};


