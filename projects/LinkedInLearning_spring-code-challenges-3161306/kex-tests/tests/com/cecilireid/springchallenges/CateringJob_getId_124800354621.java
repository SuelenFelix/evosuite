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

public class CateringJob_getId_124800354621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6911;

    public CateringJob_getId_124800354621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6911 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term6911, term6911.getClass(), "id", null);
        setField(term6911, term6911.getClass(), "customerName", null);
        setField(term6911, term6911.getClass(), "phoneNumber", null);
        setField(term6911, term6911.getClass(), "email", null);
        setField(term6911, term6911.getClass(), "menu", null);
        setIntField(term6911, term6911.getClass(), "noOfGuests", 0);
        setField(term6911, term6911.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term6911, args);
    }

};


