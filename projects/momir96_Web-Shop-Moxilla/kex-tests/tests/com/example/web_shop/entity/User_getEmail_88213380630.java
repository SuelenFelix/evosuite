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

public class User_getEmail_88213380630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7213;

    public User_getEmail_88213380630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7213 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        setLongField(term7213, term7213.getClass(), "id", 0L);
        setField(term7213, term7213.getClass(), "username", null);
        setField(term7213, term7213.getClass(), "email", null);
        setField(term7213, term7213.getClass(), "password", null);
        setField(term7213, term7213.getClass(), "confirmPassword", null);
        setField(term7213, term7213.getClass(), "firstName", null);
        setField(term7213, term7213.getClass(), "lastName", null);
        setIntField(term7213, term7213.getClass(), "age", 0);
        setField(term7213, term7213.getClass(), "city", null);
        setField(term7213, term7213.getClass(), "gender", null);
        setField(term7213, term7213.getClass(), "balance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term7213, args);
    }

};


