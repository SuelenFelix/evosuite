package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_getRoles_30371974722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4537;

    public User_getRoles_30371974722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4537 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        setField(term4537, term4537.getClass(), "email", null);
        setField(term4537, term4537.getClass(), "password", null);
        setField(term4537, term4537.getClass(), "devices", null);
        setField(term4537, term4537.getClass(), "roles", null);
        setField(term4537, term4537.getClass(), "id", null);
        setBooleanField(term4537, term4537.getClass(), "enabled", false);
        setField(term4537, term4537.getClass(), "created", null);
        setField(term4537, term4537.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term4537, args);
    }

};


