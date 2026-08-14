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

public class JwtResponse_getRefreshToken_776006985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3224;

    public JwtResponse_getRefreshToken_776006985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3293 = new ArrayList();
        ((ArrayList) term3293).add("VMeAzAHwZj");
        ((ArrayList) term3293).add("PznxWXsZME");
        ((ArrayList) term3293).add("ZzIujlwVsw");
        ((ArrayList) term3293).add("LWyEaeIyAo");
        term3224 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term3224, term3224.getClass(), "token", "xJgPlLxpgC");
        setField(term3224, term3224.getClass(), "type", "Bearer");
        setField(term3224, term3224.getClass(), "refreshToken", "EYtfuJaxiM");
        setField(term3224, term3224.getClass(), "id", "gCWtLVKVVe");
        setField(term3224, term3224.getClass(), "username", "fWKJoSoCwE");
        setField(term3224, term3224.getClass(), "email", "wfaXBpWAUH");
        setField(term3224, term3224.getClass(), "roles", term3293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefreshToken", argTypes, term3224, args);
    }

};


