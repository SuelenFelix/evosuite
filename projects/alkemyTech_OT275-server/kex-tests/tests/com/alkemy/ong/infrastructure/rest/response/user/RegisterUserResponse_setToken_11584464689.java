package com.alkemy.ong.infrastructure.rest.response.user;

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
import static com.alkemy.ong.infrastructure.rest.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RegisterUserResponse_setToken_11584464689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3488;

    public RegisterUserResponse_setToken_11584464689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3488 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.RegisterUserResponse"));
        setField(term3488, term3488.getClass(), "firstName", "aNWLJdrZMq");
        setField(term3488, term3488.getClass(), "lastName", "HHmNoYxIGj");
        setField(term3488, term3488.getClass(), "email", "PtirvZmsGt");
        setField(term3488, term3488.getClass(), "token", "HWkpTmtlrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.RegisterUserResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hMmaoREuCK";
        callMethod(klass, "setToken", argTypes, term3488, args);
    }

};


