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

public class JwtResponse_getUsername_88738347425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5968;

    public JwtResponse_getUsername_88738347425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5968 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term5968, term5968.getClass(), "token", null);
        setField(term5968, term5968.getClass(), "type", null);
        setField(term5968, term5968.getClass(), "refreshToken", null);
        setField(term5968, term5968.getClass(), "id", null);
        setField(term5968, term5968.getClass(), "username", null);
        setField(term5968, term5968.getClass(), "email", null);
        setField(term5968, term5968.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term5968, args);
    }

};


