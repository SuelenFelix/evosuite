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

public class CateringJob_setPhoneNumber_13378945110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3629;

    public CateringJob_setPhoneNumber_13378945110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3630 = new Long(-2813493605142626659L);
        Class<? extends Object> term3746 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term3745 = ((Class) term3746).getDeclaredField((String) "CANCELED");
        ((Field) term3745).setAccessible(true);
        Object enum11 = ((Field) term3745).get((Object) null);
        term3629 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term3629, term3629.getClass(), "id", term3630);
        setField(term3629, term3629.getClass(), "customerName", "gGSMzuGICf");
        setField(term3629, term3629.getClass(), "phoneNumber", "hxCBltsObl");
        setField(term3629, term3629.getClass(), "email", "BndsHwAFMv");
        setField(term3629, term3629.getClass(), "menu", "GzFkzHGYFt");
        setIntField(term3629, term3629.getClass(), "noOfGuests", -1339778481);
        setField(term3629, term3629.getClass(), "status", enum11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "setPhoneNumber", argTypes, term3629, args);
    }

};


