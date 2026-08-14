package com.example.api.model;

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
import static com.example.api.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_setEmail_15649438239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1264;

    public User_setEmail_15649438239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1264 = newInstance(Class.forName("com.example.api.model.User"));
        setField(term1264, term1264.getClass(), "userName", "MLqYREekMl");
        setField(term1264, term1264.getClass(), "firstName", "ytSBIKXogI");
        setField(term1264, term1264.getClass(), "lastName", "nHXjMycHlU");
        setField(term1264, term1264.getClass(), "email", "ieCtQFdkii");
        setField(term1264, term1264.getClass(), "password", "dEnhdmILtU");
        setField(term1264, term1264.getClass(), "role", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.api.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eqJfYWRaEL";
        callMethod(klass, "setEmail", argTypes, term1264, args);
    }

};


