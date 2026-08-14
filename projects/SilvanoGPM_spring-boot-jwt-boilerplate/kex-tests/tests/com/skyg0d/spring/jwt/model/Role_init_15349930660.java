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
import java.lang.String;
import java.lang.Object;

public class Role_init_15349930660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public Role_init_15349930660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term416 = Class.forName((String) "com.skyg0d.spring.jwt.model.ERole");
        Field term415 = ((Class) term416).getDeclaredField((String) "ROLE_MODERATOR");
        ((Field) term415).setAccessible(true);
        enum0 = ((Field) term415).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.skyg0d.spring.jwt.model.ERole");
        Object[] args = new Object[1];
        args[0] = enum0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


