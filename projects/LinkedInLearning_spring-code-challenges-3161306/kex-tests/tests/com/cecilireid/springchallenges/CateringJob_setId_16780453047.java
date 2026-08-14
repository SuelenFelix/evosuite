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

public class CateringJob_setId_16780453047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2949;
     Object term3013;

    public CateringJob_setId_16780453047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2950 = new Long(6811161968424632369L);
        Class<? extends Object> term3056 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term3055 = ((Class) term3056).getDeclaredField((String) "CANCELED");
        ((Field) term3055).setAccessible(true);
        Object enum9 = ((Field) term3055).get((Object) null);
        term2949 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term2949, term2949.getClass(), "id", term2950);
        setField(term2949, term2949.getClass(), "customerName", "SbAoxhfrkn");
        setField(term2949, term2949.getClass(), "phoneNumber", "kuTXqwMtDB");
        setField(term2949, term2949.getClass(), "email", "Ghbwtircqb");
        setField(term2949, term2949.getClass(), "menu", "xrwlQZdwCp");
        setIntField(term2949, term2949.getClass(), "noOfGuests", -2038273078);
        setField(term2949, term2949.getClass(), "status", enum9);
        term3013 = new Long(-7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3013;
        callMethod(klass, "setId", argTypes, term2949, args);
    }

};


