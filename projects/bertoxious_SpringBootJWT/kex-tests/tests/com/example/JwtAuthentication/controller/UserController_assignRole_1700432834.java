package com.example.JwtAuthentication.controller;

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
import static com.example.JwtAuthentication.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserController_assignRole_1700432834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169;
     Object term170;

    public UserController_assignRole_1700432834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169 = newInstance(Class.forName("com.example.JwtAuthentication.controller.UserController"));
        setField(term169, term169.getClass(), "userService", null);
        term170 = newInstance(Class.forName("com.example.JwtAuthentication.dto.AssignRole"));
        setField(term170, term170.getClass(), "username", "MjGYSRKTNF");
        setField(term170, term170.getClass(), "role", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.controller.UserController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.JwtAuthentication.dto.AssignRole");
        Object[] args = new Object[1];
        args[0] = term170;
        callMethod(klass, "assignRole", argTypes, term169, args);
    }

};


