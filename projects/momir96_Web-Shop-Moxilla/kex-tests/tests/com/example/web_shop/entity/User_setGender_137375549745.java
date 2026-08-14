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

public class User_setGender_137375549745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7260;

    public User_setGender_137375549745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7260 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        setLongField(term7260, term7260.getClass(), "id", 0L);
        setField(term7260, term7260.getClass(), "username", null);
        setField(term7260, term7260.getClass(), "email", null);
        setField(term7260, term7260.getClass(), "password", null);
        setField(term7260, term7260.getClass(), "confirmPassword", null);
        setField(term7260, term7260.getClass(), "firstName", null);
        setField(term7260, term7260.getClass(), "lastName", null);
        setIntField(term7260, term7260.getClass(), "age", 0);
        setField(term7260, term7260.getClass(), "city", null);
        setField(term7260, term7260.getClass(), "gender", null);
        setField(term7260, term7260.getClass(), "balance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGender", argTypes, term7260, args);
    }

};


