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

public class BaseEntity_setId_9110613707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200;
     Object term224;

    public BaseEntity_setId_9110613707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.BaseEntity"));
        Object term201 = newInstance(Class.forName("java.util.UUID"));
        Object term204 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term205 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209 = newInstance(Class.forName("java.time.LocalTime"));
        Object term214 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term215 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term201, term201.getClass(), "mostSigBits", 8428634514691209827L);
        setLongField(term201, term201.getClass(), "leastSigBits", -2585684163342970173L);
        setField(term200, term200.getClass(), "id", term201);
        setIntField(term205, term205.getClass(), "year", 2014);
        setShortField(term205, term205.getClass(), "month", (short) 7);
        setShortField(term205, term205.getClass(), "day", (short) 13);
        setField(term204, term204.getClass(), "date", term205);
        setByteField(term209, term209.getClass(), "hour", (byte) 21);
        setByteField(term209, term209.getClass(), "minute", (byte) 46);
        setByteField(term209, term209.getClass(), "second", (byte) 0);
        setIntField(term209, term209.getClass(), "nano", 887884128);
        setField(term204, term204.getClass(), "time", term209);
        setField(term200, term200.getClass(), "createdAt", term204);
        setIntField(term215, term215.getClass(), "year", 2023);
        setShortField(term215, term215.getClass(), "month", (short) 3);
        setShortField(term215, term215.getClass(), "day", (short) 7);
        setField(term214, term214.getClass(), "date", term215);
        setByteField(term219, term219.getClass(), "hour", (byte) 21);
        setByteField(term219, term219.getClass(), "minute", (byte) 15);
        setByteField(term219, term219.getClass(), "second", (byte) 43);
        setIntField(term219, term219.getClass(), "nano", 639721472);
        setField(term214, term214.getClass(), "time", term219);
        setField(term200, term200.getClass(), "updatedAt", term214);
        term224 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term224, term224.getClass(), "mostSigBits", 8059786003080744426L);
        setLongField(term224, term224.getClass(), "leastSigBits", -4365849114644724155L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.UUID");
        Object[] args = new Object[1];
        args[0] = term224;
        callMethod(klass, "setId", argTypes, term200, args);
    }

};


