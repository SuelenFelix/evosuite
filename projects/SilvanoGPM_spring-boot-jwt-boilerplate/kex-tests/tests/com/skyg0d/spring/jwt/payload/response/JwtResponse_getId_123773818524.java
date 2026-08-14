package com.skyg0d.spring.jwt.payload.response;

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
import static com.skyg0d.spring.jwt.payload.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JwtResponse_getId_123773818524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5967;

    public JwtResponse_getId_123773818524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5967 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term5967, term5967.getClass(), "token", null);
        setField(term5967, term5967.getClass(), "type", null);
        setField(term5967, term5967.getClass(), "refreshToken", null);
        setField(term5967, term5967.getClass(), "id", null);
        setField(term5967, term5967.getClass(), "username", null);
        setField(term5967, term5967.getClass(), "email", null);
        setField(term5967, term5967.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term5967, args);
    }

};


