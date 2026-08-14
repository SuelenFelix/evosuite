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

public class BaseEntity_init_17521716912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319;
     Object term322;
     Object term332;

    public BaseEntity_init_17521716912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term319, term319.getClass(), "mostSigBits", 6855071767938501807L);
        setLongField(term319, term319.getClass(), "leastSigBits", -5892135042702373494L);
        term322 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term323, term323.getClass(), "year", 2016);
        setShortField(term323, term323.getClass(), "month", (short) 6);
        setShortField(term323, term323.getClass(), "day", (short) 15);
        setField(term322, term322.getClass(), "date", term323);
        setByteField(term327, term327.getClass(), "hour", (byte) 21);
        setByteField(term327, term327.getClass(), "minute", (byte) 23);
        setByteField(term327, term327.getClass(), "second", (byte) 23);
        setIntField(term327, term327.getClass(), "nano", 433372070);
        setField(term322, term322.getClass(), "time", term327);
        term332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term337 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term333, term333.getClass(), "year", 2012);
        setShortField(term333, term333.getClass(), "month", (short) 8);
        setShortField(term333, term333.getClass(), "day", (short) 25);
        setField(term332, term332.getClass(), "date", term333);
        setByteField(term337, term337.getClass(), "hour", (byte) 19);
        setByteField(term337, term337.getClass(), "minute", (byte) 49);
        setByteField(term337, term337.getClass(), "second", (byte) 8);
        setIntField(term337, term337.getClass(), "nano", 912685024);
        setField(term332, term332.getClass(), "time", term337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.UUID");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        argTypes[2] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[3];
        args[0] = term319;
        args[1] = term322;
        args[2] = term332;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


