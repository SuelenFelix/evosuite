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

public class Account_setUsername_209740334311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5803;

    public Account_setUsername_209740334311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5803 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        setField(term5803, term5803.getClass(), "domain", null);
        setField(term5803, term5803.getClass(), "username", null);
        setField(term5803, term5803.getClass(), "password", null);
        setField(term5803, term5803.getClass(), "id", null);
        setBooleanField(term5803, term5803.getClass(), "enabled", false);
        setField(term5803, term5803.getClass(), "created", null);
        setField(term5803, term5803.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUsername", argTypes, term5803, args);
    }

};


