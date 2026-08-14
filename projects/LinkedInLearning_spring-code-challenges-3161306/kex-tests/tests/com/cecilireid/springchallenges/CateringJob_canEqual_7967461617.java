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

public class CateringJob_canEqual_7967461617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5931;
     Object term5995;

    public CateringJob_canEqual_7967461617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5932 = new Long(-316468845751588286L);
        Class<? extends Object> term6037 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term6036 = ((Class) term6037).getDeclaredField((String) "CANCELED");
        ((Field) term6036).setAccessible(true);
        Object enum18 = ((Field) term6036).get((Object) null);
        term5931 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term5931, term5931.getClass(), "id", term5932);
        setField(term5931, term5931.getClass(), "customerName", "bLPjGVBhlX");
        setField(term5931, term5931.getClass(), "phoneNumber", "whBvTVIIlC");
        setField(term5931, term5931.getClass(), "email", "IgRJUzaCwW");
        setField(term5931, term5931.getClass(), "menu", "JUmudUmaaV");
        setIntField(term5931, term5931.getClass(), "noOfGuests", -1685132342);
        setField(term5931, term5931.getClass(), "status", enum18);
        term5995 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5995;
        callMethod(klass, "canEqual", argTypes, term5931, args);
    }

};


