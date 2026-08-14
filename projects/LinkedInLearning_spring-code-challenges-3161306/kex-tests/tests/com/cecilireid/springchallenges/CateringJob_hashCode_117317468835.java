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

public class CateringJob_hashCode_117317468835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6941;

    public CateringJob_hashCode_117317468835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6941 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term6941, term6941.getClass(), "id", null);
        setField(term6941, term6941.getClass(), "customerName", null);
        setField(term6941, term6941.getClass(), "phoneNumber", null);
        setField(term6941, term6941.getClass(), "email", null);
        setField(term6941, term6941.getClass(), "menu", null);
        setIntField(term6941, term6941.getClass(), "noOfGuests", 0);
        setField(term6941, term6941.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6941, args);
    }

};


