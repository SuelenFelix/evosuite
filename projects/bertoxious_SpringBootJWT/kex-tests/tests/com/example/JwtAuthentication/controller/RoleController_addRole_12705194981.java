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

public class RoleController_addRole_12705194981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public RoleController_addRole_12705194981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.example.JwtAuthentication.controller.RoleController"));
        setField(term1, term1.getClass(), "roleService", null);
        term2 = newInstance(Class.forName("com.example.JwtAuthentication.entities.Role"));
        setField(term2, term2.getClass(), "roleName", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "roleDescription", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.controller.RoleController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.JwtAuthentication.entities.Role");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "addRole", argTypes, term1, args);
    }

};


