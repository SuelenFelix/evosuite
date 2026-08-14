package com.example.auth_server.controller;

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
import static com.example.auth_server.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AuthController_getTokenProvidingUsernameAndPassword_15589039812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;
     Object term37;

    public AuthController_getTokenProvidingUsernameAndPassword_15589039812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("com.example.auth_server.controller.AuthController"));
        setField(term24, term24.getClass(), "secret", "sjlJAEtRrb");
        term37 = newInstance(Class.forName("com.example.auth_server.model.Credential"));
        setField(term37, term37.getClass(), "userName", "MuLcgQHgqz");
        setField(term37, term37.getClass(), "role", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.auth_server.controller.AuthController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.auth_server.model.Credential");
        Object[] args = new Object[1];
        args[0] = term37;
        callMethod(klass, "getTokenProvidingUsernameAndPassword", argTypes, term24, args);
    }

};


