package com.example.demo.jwt;

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
import static com.example.demo.jwt.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UsernameAndPasswordAuthenticationRequest_setUsername_3585094842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;

    public UsernameAndPasswordAuthenticationRequest_setUsername_3585094842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = newInstance(Class.forName("com.example.demo.jwt.UsernameAndPasswordAuthenticationRequest"));
        setField(term91, term91.getClass(), "username", "jJCZpVmanW");
        setField(term91, term91.getClass(), "password", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.demo.jwt.UsernameAndPasswordAuthenticationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        callMethod(klass, "setUsername", argTypes, term91, args);
    }

};


