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

public class CateringJob_toString_168393437819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6582;

    public CateringJob_toString_168393437819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6583 = new Long(-6573104506744284592L);
        Class<? extends Object> term6688 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term6687 = ((Class) term6688).getDeclaredField((String) "COMPLETED");
        ((Field) term6687).setAccessible(true);
        Object enum20 = ((Field) term6687).get((Object) null);
        term6582 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term6582, term6582.getClass(), "id", term6583);
        setField(term6582, term6582.getClass(), "customerName", "vQVyKLdtaz");
        setField(term6582, term6582.getClass(), "phoneNumber", "OWKQODBLzb");
        setField(term6582, term6582.getClass(), "email", "wGmYcqUkgE");
        setField(term6582, term6582.getClass(), "menu", "idgaQsnJpQ");
        setIntField(term6582, term6582.getClass(), "noOfGuests", 1622346318);
        setField(term6582, term6582.getClass(), "status", enum20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6582, args);
    }

};


