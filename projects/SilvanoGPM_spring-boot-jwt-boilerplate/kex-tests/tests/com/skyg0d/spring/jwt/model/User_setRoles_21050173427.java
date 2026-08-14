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

public class User_setRoles_21050173427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2444;

    public User_setRoles_21050173427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2444 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        setField(term2444, term2444.getClass(), "username", null);
        setField(term2444, term2444.getClass(), "email", null);
        setField(term2444, term2444.getClass(), "password", null);
        setField(term2444, term2444.getClass(), "roles", null);
        setField(term2444, term2444.getClass(), "id", null);
        setField(term2444, term2444.getClass(), "createdAt", null);
        setField(term2444, term2444.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRoles", argTypes, term2444, args);
    }

};


