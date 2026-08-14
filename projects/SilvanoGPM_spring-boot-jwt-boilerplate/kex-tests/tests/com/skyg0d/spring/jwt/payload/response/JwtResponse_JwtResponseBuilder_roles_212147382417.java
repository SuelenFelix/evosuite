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

public class JwtResponse_JwtResponseBuilder_roles_212147382417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10809;

    public JwtResponse_JwtResponseBuilder_roles_212147382417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10809 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder"));
        setField(term10809, term10809.getClass(), "token", null);
        setField(term10809, term10809.getClass(), "type", null);
        setField(term10809, term10809.getClass(), "refreshToken", null);
        setField(term10809, term10809.getClass(), "id", null);
        setField(term10809, term10809.getClass(), "username", null);
        setField(term10809, term10809.getClass(), "email", null);
        setField(term10809, term10809.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "roles", argTypes, term10809, args);
    }

};


