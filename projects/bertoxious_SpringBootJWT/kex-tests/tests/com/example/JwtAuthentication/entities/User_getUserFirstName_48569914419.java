package com.example.JwtAuthentication.entities;

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
import static com.example.JwtAuthentication.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_getUserFirstName_48569914419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3444;

    public User_getUserFirstName_48569914419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3444 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term3444, term3444.getClass(), "userName", null);
        setField(term3444, term3444.getClass(), "userFirstName", null);
        setField(term3444, term3444.getClass(), "userLastName", null);
        setField(term3444, term3444.getClass(), "userPassword", null);
        setField(term3444, term3444.getClass(), "confirmPassword", null);
        setField(term3444, term3444.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserFirstName", argTypes, term3444, args);
    }

};


