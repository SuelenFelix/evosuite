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

public class BaseEntity_toString_166521153310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295;

    public BaseEntity_toString_166521153310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.BaseEntity"));
        Object term296 = newInstance(Class.forName("java.util.UUID"));
        Object term299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304 = newInstance(Class.forName("java.time.LocalTime"));
        Object term309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term296, term296.getClass(), "mostSigBits", 1967728129628047933L);
        setLongField(term296, term296.getClass(), "leastSigBits", 2120084523938730454L);
        setField(term295, term295.getClass(), "id", term296);
        setIntField(term300, term300.getClass(), "year", 2021);
        setShortField(term300, term300.getClass(), "month", (short) 8);
        setShortField(term300, term300.getClass(), "day", (short) 12);
        setField(term299, term299.getClass(), "date", term300);
        setByteField(term304, term304.getClass(), "hour", (byte) 2);
        setByteField(term304, term304.getClass(), "minute", (byte) 17);
        setByteField(term304, term304.getClass(), "second", (byte) 51);
        setIntField(term304, term304.getClass(), "nano", 207375141);
        setField(term299, term299.getClass(), "time", term304);
        setField(term295, term295.getClass(), "createdAt", term299);
        setIntField(term310, term310.getClass(), "year", 2025);
        setShortField(term310, term310.getClass(), "month", (short) 11);
        setShortField(term310, term310.getClass(), "day", (short) 3);
        setField(term309, term309.getClass(), "date", term310);
        setByteField(term314, term314.getClass(), "hour", (byte) 21);
        setByteField(term314, term314.getClass(), "minute", (byte) 24);
        setByteField(term314, term314.getClass(), "second", (byte) 23);
        setIntField(term314, term314.getClass(), "nano", 210986721);
        setField(term309, term309.getClass(), "time", term314);
        setField(term295, term295.getClass(), "updatedAt", term309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term295, args);
    }

};


