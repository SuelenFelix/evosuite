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
import java.lang.Integer;

public class CateringJob_setNoOfGuests_121531748831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6931;
     Object term6933;

    public CateringJob_setNoOfGuests_121531748831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6931 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term6931, term6931.getClass(), "id", null);
        setField(term6931, term6931.getClass(), "customerName", null);
        setField(term6931, term6931.getClass(), "phoneNumber", null);
        setField(term6931, term6931.getClass(), "email", null);
        setField(term6931, term6931.getClass(), "menu", null);
        setIntField(term6931, term6931.getClass(), "noOfGuests", 0);
        setField(term6931, term6931.getClass(), "status", null);
        term6933 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6933;
        callMethod(klass, "setNoOfGuests", argTypes, term6931, args);
    }

};


