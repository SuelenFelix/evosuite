package com.skyg0d.spring.jwt.model;

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
import static com.skyg0d.spring.jwt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class User_UserBuilderImpl_self_3049440211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4282;

    public User_UserBuilderImpl_self_3049440211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4282 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User$UserBuilderImpl"));
        Object term4319 = newInstance(Class.forName("java.util.UUID"));
        Object term4322 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4323 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4327 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4337 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4282, term4282.getClass(), "username", "dEnhdmILtU");
        setField(term4282, term4282.getClass(), "email", "hoicvmsovO");
        setField(term4282, term4282.getClass(), "password", "eqJfYWRaEL");
        setField(term4282, term4282.getClass(), "roles", null);
        setLongField(term4319, term4319.getClass(), "mostSigBits", -1983291584002806658L);
        setLongField(term4319, term4319.getClass(), "leastSigBits", 5946780097489996391L);
        setField(term4282, term4282.getClass(), "id", term4319);
        setIntField(term4323, term4323.getClass(), "year", 2021);
        setShortField(term4323, term4323.getClass(), "month", (short) 3);
        setShortField(term4323, term4323.getClass(), "day", (short) 13);
        setField(term4322, term4322.getClass(), "date", term4323);
        setByteField(term4327, term4327.getClass(), "hour", (byte) 6);
        setByteField(term4327, term4327.getClass(), "minute", (byte) 25);
        setByteField(term4327, term4327.getClass(), "second", (byte) 42);
        setIntField(term4327, term4327.getClass(), "nano", 282924199);
        setField(term4322, term4322.getClass(), "time", term4327);
        setField(term4282, term4282.getClass(), "createdAt", term4322);
        setIntField(term4333, term4333.getClass(), "year", 2020);
        setShortField(term4333, term4333.getClass(), "month", (short) 10);
        setShortField(term4333, term4333.getClass(), "day", (short) 25);
        setField(term4332, term4332.getClass(), "date", term4333);
        setByteField(term4337, term4337.getClass(), "hour", (byte) 18);
        setByteField(term4337, term4337.getClass(), "minute", (byte) 22);
        setByteField(term4337, term4337.getClass(), "second", (byte) 30);
        setIntField(term4337, term4337.getClass(), "nano", 948592965);
        setField(term4332, term4332.getClass(), "time", term4337);
        setField(term4282, term4282.getClass(), "updatedAt", term4332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.User$UserBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term4282, args);
    }

};


