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
import java.util.ArrayList;

public class JwtResponse_getToken_12694082793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2812;

    public JwtResponse_getToken_12694082793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2881 = new ArrayList();
        ((ArrayList) term2881).add("dpNsDgfPso");
        ((ArrayList) term2881).add("hCWPJQKpdc");
        ((ArrayList) term2881).add("WzMEhMXkKx");
        ((ArrayList) term2881).add("XOiDvlDhdc");
        term2812 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term2812, term2812.getClass(), "token", "MvRIxilFMJ");
        setField(term2812, term2812.getClass(), "type", "Bearer");
        setField(term2812, term2812.getClass(), "refreshToken", "iNwOJRBEjp");
        setField(term2812, term2812.getClass(), "id", "XylxrMBraH");
        setField(term2812, term2812.getClass(), "username", "pORebkoRdD");
        setField(term2812, term2812.getClass(), "email", "mXGCWJDOqA");
        setField(term2812, term2812.getClass(), "roles", term2881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term2812, args);
    }

};


