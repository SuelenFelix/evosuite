package com.hamitmizrak.jwt;

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
import static com.hamitmizrak.jwt.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JwtRequest_getUsername_6949106882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319;

    public JwtRequest_getUsername_6949106882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319 = newInstance(Class.forName("com.hamitmizrak.jwt.JwtRequest"));
        setField(term319, term319.getClass(), "username", "oVcInYnLWB");
        setField(term319, term319.getClass(), "password", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.jwt.JwtRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term319, args);
    }

};


