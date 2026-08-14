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

public class BaseEntity_BaseEntityBuilder_updatedAt_13813737902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3378;

    public BaseEntity_BaseEntityBuilder_updatedAt_13813737902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3378 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3379 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3383 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3379, term3379.getClass(), "year", 2026);
        setShortField(term3379, term3379.getClass(), "month", (short) 10);
        setShortField(term3379, term3379.getClass(), "day", (short) 31);
        setField(term3378, term3378.getClass(), "date", term3379);
        setByteField(term3383, term3383.getClass(), "hour", (byte) 17);
        setByteField(term3383, term3383.getClass(), "minute", (byte) 6);
        setByteField(term3383, term3383.getClass(), "second", (byte) 30);
        setIntField(term3383, term3383.getClass(), "nano", 785931660);
        setField(term3378, term3378.getClass(), "time", term3383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity$BaseEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term3378;
        callMethod(klass, "updatedAt", argTypes, null, args);
    }

};


