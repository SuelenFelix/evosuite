package com.skyg0d.spring.jwt.controller;

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
import static com.skyg0d.spring.jwt.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserController_init_5714520570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public UserController_init_5714520570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.controller.UserController");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.skyg0d.spring.jwt.service.UserService");
        argTypes[1] = Class.forName("com.skyg0d.spring.jwt.service.AuthService");
        argTypes[2] = Class.forName("com.skyg0d.spring.jwt.service.RefreshTokenService");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


