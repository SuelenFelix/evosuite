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

public class User_getFirstName_35091246736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7231;

    public User_getFirstName_35091246736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7231 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        setLongField(term7231, term7231.getClass(), "id", 0L);
        setField(term7231, term7231.getClass(), "username", null);
        setField(term7231, term7231.getClass(), "email", null);
        setField(term7231, term7231.getClass(), "password", null);
        setField(term7231, term7231.getClass(), "confirmPassword", null);
        setField(term7231, term7231.getClass(), "firstName", null);
        setField(term7231, term7231.getClass(), "lastName", null);
        setIntField(term7231, term7231.getClass(), "age", 0);
        setField(term7231, term7231.getClass(), "city", null);
        setField(term7231, term7231.getClass(), "gender", null);
        setField(term7231, term7231.getClass(), "balance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term7231, args);
    }

};


