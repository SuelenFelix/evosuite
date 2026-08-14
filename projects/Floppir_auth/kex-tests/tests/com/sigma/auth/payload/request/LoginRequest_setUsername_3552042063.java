package com.sigma.auth.payload.request;

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
import static com.sigma.auth.payload.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LoginRequest_setUsername_3552042063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term887;

    public LoginRequest_setUsername_3552042063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term887 = newInstance(Class.forName("com.sigma.auth.payload.request.LoginRequest"));
        setField(term887, term887.getClass(), "username", "aKnKipADSo");
        setField(term887, term887.getClass(), "password", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.payload.request.LoginRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UlajhuVLaP";
        callMethod(klass, "setUsername", argTypes, term887, args);
    }

};


