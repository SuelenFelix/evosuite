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

public class JwtResponse_setToken_169307669510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4287;

    public JwtResponse_setToken_169307669510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4356 = new ArrayList();
        ((ArrayList) term4356).add("VGizxZnyHX");
        ((ArrayList) term4356).add("kVEZMHmRtR");
        ((ArrayList) term4356).add("ekxGuOYIwi");
        ((ArrayList) term4356).add("RbVQXSpxXy");
        ((ArrayList) term4356).add("YpJbIgJWWv");
        ((ArrayList) term4356).add("JppkknKVOw");
        ((ArrayList) term4356).add("iljANwuEjk");
        term4287 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term4287, term4287.getClass(), "token", "lihXWlGDxk");
        setField(term4287, term4287.getClass(), "type", "Bearer");
        setField(term4287, term4287.getClass(), "refreshToken", "JmcmxoGhIK");
        setField(term4287, term4287.getClass(), "id", "jXzmYyrnnT");
        setField(term4287, term4287.getClass(), "username", "igCAtimmYB");
        setField(term4287, term4287.getClass(), "email", "DyiXbeYIaN");
        setField(term4287, term4287.getClass(), "roles", term4356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kNqaJKIATy";
        callMethod(klass, "setToken", argTypes, term4287, args);
    }

};


