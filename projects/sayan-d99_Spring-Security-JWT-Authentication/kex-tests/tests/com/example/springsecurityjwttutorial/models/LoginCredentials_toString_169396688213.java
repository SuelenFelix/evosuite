package com.example.springsecurityjwttutorial.models;

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
import static com.example.springsecurityjwttutorial.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LoginCredentials_toString_169396688213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318;

    public LoginCredentials_toString_169396688213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318 = newInstance(Class.forName("com.example.springsecurityjwttutorial.models.LoginCredentials"));
        setField(term318, term318.getClass(), "email", null);
        setField(term318, term318.getClass(), "password", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.springsecurityjwttutorial.models.LoginCredentials");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term318, args);
    }

};


