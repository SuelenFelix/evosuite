package com.alkemy.ong.infrastructure.rest.request.user;

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
import static com.alkemy.ong.infrastructure.rest.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RegisterUserRequest_setPassword_143962705019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1976;

    public RegisterUserRequest_setPassword_143962705019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1976 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.user.RegisterUserRequest"));
        setField(term1976, term1976.getClass(), "firstName", null);
        setField(term1976, term1976.getClass(), "lastName", null);
        setField(term1976, term1976.getClass(), "email", null);
        setField(term1976, term1976.getClass(), "password", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.user.RegisterUserRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPassword", argTypes, term1976, args);
    }

};


