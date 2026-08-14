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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserController_createUser_20008418391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term49;

    public UserController_createUser_20008418391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("com.example.JwtAuthentication.controller.UserController"));
        setField(term48, term48.getClass(), "userService", null);
        HashMap term111 = new HashMap();
        Set<Object> term166 =  ((Map) term111).keySet();
        HashSet term110 = new HashSet((Collection<? extends Object>) term166);
        term49 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term49, term49.getClass(), "userName", "MuLcgQHgqz");
        setField(term49, term49.getClass(), "userFirstName", "xxtlPwDYFs");
        setField(term49, term49.getClass(), "userLastName", "jJCZpVmanW");
        setField(term49, term49.getClass(), "userPassword", "EGtDIRbSSb");
        setField(term49, term49.getClass(), "confirmPassword", "SzjVpOQTyS");
        setField(term49, term49.getClass(), "roles", term110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.controller.UserController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.JwtAuthentication.entities.User");
        Object[] args = new Object[1];
        args[0] = term49;
        callMethod(klass, "createUser", argTypes, term48, args);
    }

};


