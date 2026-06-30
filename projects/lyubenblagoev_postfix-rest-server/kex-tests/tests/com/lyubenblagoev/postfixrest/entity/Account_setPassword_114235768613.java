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

public class Account_setPassword_114235768613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5807;

    public Account_setPassword_114235768613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5807 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        setField(term5807, term5807.getClass(), "domain", null);
        setField(term5807, term5807.getClass(), "username", null);
        setField(term5807, term5807.getClass(), "password", null);
        setField(term5807, term5807.getClass(), "id", null);
        setBooleanField(term5807, term5807.getClass(), "enabled", false);
        setField(term5807, term5807.getClass(), "created", null);
        setField(term5807, term5807.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPassword", argTypes, term5807, args);
    }

};


