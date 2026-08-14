package com.skyg0d.spring.jwt.model;

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
import static com.skyg0d.spring.jwt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_UserBuilderImpl_self_3049440214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4469;

    public User_UserBuilderImpl_self_3049440214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4469 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User$UserBuilderImpl"));
        setField(term4469, term4469.getClass(), "username", null);
        setField(term4469, term4469.getClass(), "email", null);
        setField(term4469, term4469.getClass(), "password", null);
        setField(term4469, term4469.getClass(), "roles", null);
        setField(term4469, term4469.getClass(), "id", null);
        setField(term4469, term4469.getClass(), "createdAt", null);
        setField(term4469, term4469.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.User$UserBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term4469, args);
    }

};


