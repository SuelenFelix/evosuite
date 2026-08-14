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

public class BaseEntity_setCreatedAt_10526587528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;
     Object term251;

    public BaseEntity_setCreatedAt_10526587528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.BaseEntity"));
        Object term228 = newInstance(Class.forName("java.util.UUID"));
        Object term231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term236 = newInstance(Class.forName("java.time.LocalTime"));
        Object term241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term246 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term228, term228.getClass(), "mostSigBits", 2486810210675247493L);
        setLongField(term228, term228.getClass(), "leastSigBits", 7009926388951271268L);
        setField(term227, term227.getClass(), "id", term228);
        setIntField(term232, term232.getClass(), "year", 2015);
        setShortField(term232, term232.getClass(), "month", (short) 3);
        setShortField(term232, term232.getClass(), "day", (short) 10);
        setField(term231, term231.getClass(), "date", term232);
        setByteField(term236, term236.getClass(), "hour", (byte) 23);
        setByteField(term236, term236.getClass(), "minute", (byte) 34);
        setByteField(term236, term236.getClass(), "second", (byte) 44);
        setIntField(term236, term236.getClass(), "nano", 587322824);
        setField(term231, term231.getClass(), "time", term236);
        setField(term227, term227.getClass(), "createdAt", term231);
        setIntField(term242, term242.getClass(), "year", 2027);
        setShortField(term242, term242.getClass(), "month", (short) 8);
        setShortField(term242, term242.getClass(), "day", (short) 26);
        setField(term241, term241.getClass(), "date", term242);
        setByteField(term246, term246.getClass(), "hour", (byte) 5);
        setByteField(term246, term246.getClass(), "minute", (byte) 11);
        setByteField(term246, term246.getClass(), "second", (byte) 9);
        setIntField(term246, term246.getClass(), "nano", 219245092);
        setField(term241, term241.getClass(), "time", term246);
        setField(term227, term227.getClass(), "updatedAt", term241);
        term251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term256 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term252, term252.getClass(), "year", 2025);
        setShortField(term252, term252.getClass(), "month", (short) 3);
        setShortField(term252, term252.getClass(), "day", (short) 9);
        setField(term251, term251.getClass(), "date", term252);
        setByteField(term256, term256.getClass(), "hour", (byte) 5);
        setByteField(term256, term256.getClass(), "minute", (byte) 49);
        setByteField(term256, term256.getClass(), "second", (byte) 12);
        setIntField(term256, term256.getClass(), "nano", 791695028);
        setField(term251, term251.getClass(), "time", term256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term251;
        callMethod(klass, "setCreatedAt", argTypes, term227, args);
    }

};


