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

public class CateringJob_toString_168393437836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6943;

    public CateringJob_toString_168393437836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6943 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term6943, term6943.getClass(), "id", null);
        setField(term6943, term6943.getClass(), "customerName", null);
        setField(term6943, term6943.getClass(), "phoneNumber", null);
        setField(term6943, term6943.getClass(), "email", null);
        setField(term6943, term6943.getClass(), "menu", null);
        setIntField(term6943, term6943.getClass(), "noOfGuests", 0);
        setField(term6943, term6943.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6943, args);
    }

};


