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

public class CateringJob_setPhoneNumber_13378945111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3976;

    public CateringJob_setPhoneNumber_13378945111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3976 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term3976, term3976.getClass(), "id", null);
        setField(term3976, term3976.getClass(), "customerName", null);
        setField(term3976, term3976.getClass(), "phoneNumber", null);
        setField(term3976, term3976.getClass(), "email", null);
        setField(term3976, term3976.getClass(), "menu", null);
        setIntField(term3976, term3976.getClass(), "noOfGuests", 0);
        setField(term3976, term3976.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPhoneNumber", argTypes, term3976, args);
    }

};


