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

public class CateringJob_setCustomerName_9938140158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3276;

    public CateringJob_setCustomerName_9938140158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3277 = new Long(6967924379644551255L);
        Class<? extends Object> term3394 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term3393 = ((Class) term3394).getDeclaredField((String) "COMPLETED");
        ((Field) term3393).setAccessible(true);
        Object enum10 = ((Field) term3393).get((Object) null);
        term3276 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term3276, term3276.getClass(), "id", term3277);
        setField(term3276, term3276.getClass(), "customerName", "IDCWpPLRkE");
        setField(term3276, term3276.getClass(), "phoneNumber", "nyiiPDVjAc");
        setField(term3276, term3276.getClass(), "email", "aKnKipADSo");
        setField(term3276, term3276.getClass(), "menu", "wSQxaModmm");
        setIntField(term3276, term3276.getClass(), "noOfGuests", 1227103734);
        setField(term3276, term3276.getClass(), "status", enum10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UlajhuVLaP";
        callMethod(klass, "setCustomerName", argTypes, term3276, args);
    }

};


