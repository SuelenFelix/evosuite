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

public class BaseEntity_equals_7057651680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;
     Object term103;

    public BaseEntity_equals_7057651680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.BaseEntity"));
        Object term80 = newInstance(Class.forName("java.util.UUID"));
        Object term83 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88 = newInstance(Class.forName("java.time.LocalTime"));
        Object term93 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term80, term80.getClass(), "mostSigBits", -2813493605142626659L);
        setLongField(term80, term80.getClass(), "leastSigBits", -8885298608300233488L);
        setField(term79, term79.getClass(), "id", term80);
        setIntField(term84, term84.getClass(), "year", 2019);
        setShortField(term84, term84.getClass(), "month", (short) 2);
        setShortField(term84, term84.getClass(), "day", (short) 21);
        setField(term83, term83.getClass(), "date", term84);
        setByteField(term88, term88.getClass(), "hour", (byte) 5);
        setByteField(term88, term88.getClass(), "minute", (byte) 41);
        setByteField(term88, term88.getClass(), "second", (byte) 11);
        setIntField(term88, term88.getClass(), "nano", 859829782);
        setField(term83, term83.getClass(), "time", term88);
        setField(term79, term79.getClass(), "createdAt", term83);
        setIntField(term94, term94.getClass(), "year", 2018);
        setShortField(term94, term94.getClass(), "month", (short) 9);
        setShortField(term94, term94.getClass(), "day", (short) 28);
        setField(term93, term93.getClass(), "date", term94);
        setByteField(term98, term98.getClass(), "hour", (byte) 3);
        setByteField(term98, term98.getClass(), "minute", (byte) 37);
        setByteField(term98, term98.getClass(), "second", (byte) 46);
        setIntField(term98, term98.getClass(), "nano", 763326845);
        setField(term93, term93.getClass(), "time", term98);
        setField(term79, term79.getClass(), "updatedAt", term93);
        term103 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term103;
        callMethod(klass, "equals", argTypes, term79, args);
    }

};


