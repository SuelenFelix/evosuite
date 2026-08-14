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

public class CateringJob_getPhoneNumber_3073863523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6915;

    public CateringJob_getPhoneNumber_3073863523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6915 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term6915, term6915.getClass(), "id", null);
        setField(term6915, term6915.getClass(), "customerName", null);
        setField(term6915, term6915.getClass(), "phoneNumber", null);
        setField(term6915, term6915.getClass(), "email", null);
        setField(term6915, term6915.getClass(), "menu", null);
        setIntField(term6915, term6915.getClass(), "noOfGuests", 0);
        setField(term6915, term6915.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhoneNumber", argTypes, term6915, args);
    }

};


