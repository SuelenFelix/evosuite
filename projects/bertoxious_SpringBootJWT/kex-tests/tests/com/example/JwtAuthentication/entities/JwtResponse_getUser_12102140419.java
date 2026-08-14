package com.example.JwtAuthentication.entities;

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
import static com.example.JwtAuthentication.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JwtResponse_getUser_12102140419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1411;

    public JwtResponse_getUser_12102140419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1411 = newInstance(Class.forName("com.example.JwtAuthentication.entities.JwtResponse"));
        setField(term1411, term1411.getClass(), "user", null);
        setField(term1411, term1411.getClass(), "jwtToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term1411, args);
    }

};


