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

public class BaseEntity_getCreatedAt_7218678805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152;

    public BaseEntity_getCreatedAt_7218678805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.BaseEntity"));
        Object term153 = newInstance(Class.forName("java.util.UUID"));
        Object term156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term153, term153.getClass(), "mostSigBits", -316468845751588286L);
        setLongField(term153, term153.getClass(), "leastSigBits", 5127676408959197577L);
        setField(term152, term152.getClass(), "id", term153);
        setIntField(term157, term157.getClass(), "year", 2015);
        setShortField(term157, term157.getClass(), "month", (short) 9);
        setShortField(term157, term157.getClass(), "day", (short) 16);
        setField(term156, term156.getClass(), "date", term157);
        setByteField(term161, term161.getClass(), "hour", (byte) 6);
        setByteField(term161, term161.getClass(), "minute", (byte) 19);
        setByteField(term161, term161.getClass(), "second", (byte) 42);
        setIntField(term161, term161.getClass(), "nano", 630084975);
        setField(term156, term156.getClass(), "time", term161);
        setField(term152, term152.getClass(), "createdAt", term156);
        setIntField(term167, term167.getClass(), "year", 2029);
        setShortField(term167, term167.getClass(), "month", (short) 6);
        setShortField(term167, term167.getClass(), "day", (short) 23);
        setField(term166, term166.getClass(), "date", term167);
        setByteField(term171, term171.getClass(), "hour", (byte) 21);
        setByteField(term171, term171.getClass(), "minute", (byte) 55);
        setByteField(term171, term171.getClass(), "second", (byte) 27);
        setIntField(term171, term171.getClass(), "nano", 66889274);
        setField(term166, term166.getClass(), "time", term171);
        setField(term152, term152.getClass(), "updatedAt", term166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term152, args);
    }

};


