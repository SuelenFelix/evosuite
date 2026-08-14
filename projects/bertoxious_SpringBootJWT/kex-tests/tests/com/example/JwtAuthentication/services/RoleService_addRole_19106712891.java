package com.example.JwtAuthentication.services;

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
import static com.example.JwtAuthentication.services.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RoleService_addRole_19106712891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public RoleService_addRole_19106712891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.example.JwtAuthentication.entities.Role"));
        setField(term1, term1.getClass(), "roleName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "roleDescription", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.services.RoleService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.JwtAuthentication.entities.Role");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "addRole", argTypes, null, args);
    }

};


