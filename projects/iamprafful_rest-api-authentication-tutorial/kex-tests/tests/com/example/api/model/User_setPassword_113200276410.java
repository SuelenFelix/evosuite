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

public class User_setPassword_113200276410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1419;

    public User_setPassword_113200276410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1419 = newInstance(Class.forName("com.example.api.model.User"));
        setField(term1419, term1419.getClass(), "userName", "fhkbdRViHi");
        setField(term1419, term1419.getClass(), "firstName", "uWHnvSvaPl");
        setField(term1419, term1419.getClass(), "lastName", "kBdSllIBVz");
        setField(term1419, term1419.getClass(), "email", "TJmVBGfTML");
        setField(term1419, term1419.getClass(), "password", "tPlsykYBqO");
        setField(term1419, term1419.getClass(), "role", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.api.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "whBvTVIIlC";
        callMethod(klass, "setPassword", argTypes, term1419, args);
    }

};


