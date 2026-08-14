package com.example.web_shop.entity;

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
import static com.example.web_shop.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_getAge_122001802840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7243;

    public User_getAge_122001802840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7243 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        setLongField(term7243, term7243.getClass(), "id", 0L);
        setField(term7243, term7243.getClass(), "username", null);
        setField(term7243, term7243.getClass(), "email", null);
        setField(term7243, term7243.getClass(), "password", null);
        setField(term7243, term7243.getClass(), "confirmPassword", null);
        setField(term7243, term7243.getClass(), "firstName", null);
        setField(term7243, term7243.getClass(), "lastName", null);
        setIntField(term7243, term7243.getClass(), "age", 0);
        setField(term7243, term7243.getClass(), "city", null);
        setField(term7243, term7243.getClass(), "gender", null);
        setField(term7243, term7243.getClass(), "balance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAge", argTypes, term7243, args);
    }

};


