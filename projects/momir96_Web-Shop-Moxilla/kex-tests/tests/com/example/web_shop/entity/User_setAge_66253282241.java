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
import java.lang.Integer;

public class User_setAge_66253282241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7246;
     Object term7249;

    public User_setAge_66253282241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7246 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        setLongField(term7246, term7246.getClass(), "id", 0L);
        setField(term7246, term7246.getClass(), "username", null);
        setField(term7246, term7246.getClass(), "email", null);
        setField(term7246, term7246.getClass(), "password", null);
        setField(term7246, term7246.getClass(), "confirmPassword", null);
        setField(term7246, term7246.getClass(), "firstName", null);
        setField(term7246, term7246.getClass(), "lastName", null);
        setIntField(term7246, term7246.getClass(), "age", 0);
        setField(term7246, term7246.getClass(), "city", null);
        setField(term7246, term7246.getClass(), "gender", null);
        setField(term7246, term7246.getClass(), "balance", null);
        term7249 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7249;
        callMethod(klass, "setAge", argTypes, term7246, args);
    }

};


