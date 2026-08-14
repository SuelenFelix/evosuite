package com.sigma.auth.models;

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
import static com.sigma.auth.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Role_init_7820266781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public Role_init_7820266781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1419 = Class.forName((String) "com.sigma.auth.models.ERole");
        Field term1418 = ((Class) term1419).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term1418).setAccessible(true);
        enum0 = ((Field) term1418).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.models.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sigma.auth.models.ERole");
        Object[] args = new Object[1];
        args[0] = enum0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


