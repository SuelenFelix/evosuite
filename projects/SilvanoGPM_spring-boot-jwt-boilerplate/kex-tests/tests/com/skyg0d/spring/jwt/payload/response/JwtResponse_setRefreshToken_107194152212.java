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

public class JwtResponse_setRefreshToken_107194152212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4765;

    public JwtResponse_setRefreshToken_107194152212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4834 = new ArrayList();
        ((ArrayList) term4834).add("nhoHrZfnIN");
        ((ArrayList) term4834).add("ZkMALXpEAZ");
        ((ArrayList) term4834).add("tXfQjSqDzN");
        ((ArrayList) term4834).add("BjugTaMcxJ");
        ((ArrayList) term4834).add("vGiuZVPJNH");
        ((ArrayList) term4834).add("tlzpzIjMib");
        term4765 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term4765, term4765.getClass(), "token", "wzsPSPcRdj");
        setField(term4765, term4765.getClass(), "type", "Bearer");
        setField(term4765, term4765.getClass(), "refreshToken", "kGMQdqJYyB");
        setField(term4765, term4765.getClass(), "id", "XJJNClzHRf");
        setField(term4765, term4765.getClass(), "username", "HDaezxQfQR");
        setField(term4765, term4765.getClass(), "email", "iikZEapDlu");
        setField(term4765, term4765.getClass(), "roles", term4834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AZdLeSugwv";
        callMethod(klass, "setRefreshToken", argTypes, term4765, args);
    }

};


