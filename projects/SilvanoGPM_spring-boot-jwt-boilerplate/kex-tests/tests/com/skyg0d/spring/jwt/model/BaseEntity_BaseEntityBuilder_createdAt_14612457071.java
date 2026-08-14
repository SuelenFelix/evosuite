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

public class BaseEntity_BaseEntityBuilder_createdAt_14612457071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3368;

    public BaseEntity_BaseEntityBuilder_createdAt_14612457071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3373 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3369, term3369.getClass(), "year", 2022);
        setShortField(term3369, term3369.getClass(), "month", (short) 4);
        setShortField(term3369, term3369.getClass(), "day", (short) 15);
        setField(term3368, term3368.getClass(), "date", term3369);
        setByteField(term3373, term3373.getClass(), "hour", (byte) 20);
        setByteField(term3373, term3373.getClass(), "minute", (byte) 58);
        setByteField(term3373, term3373.getClass(), "second", (byte) 46);
        setIntField(term3373, term3373.getClass(), "nano", 435562727);
        setField(term3368, term3368.getClass(), "time", term3373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity$BaseEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term3368;
        callMethod(klass, "createdAt", argTypes, null, args);
    }

};


