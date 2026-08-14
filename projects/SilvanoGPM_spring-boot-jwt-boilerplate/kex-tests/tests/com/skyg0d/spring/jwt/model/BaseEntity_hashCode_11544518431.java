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

public class BaseEntity_hashCode_11544518431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;

    public BaseEntity_hashCode_11544518431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.BaseEntity"));
        Object term105 = newInstance(Class.forName("java.util.UUID"));
        Object term108 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term105, term105.getClass(), "mostSigBits", -4325723315152823407L);
        setLongField(term105, term105.getClass(), "leastSigBits", 2535595959091595249L);
        setField(term104, term104.getClass(), "id", term105);
        setIntField(term109, term109.getClass(), "year", 2012);
        setShortField(term109, term109.getClass(), "month", (short) 9);
        setShortField(term109, term109.getClass(), "day", (short) 11);
        setField(term108, term108.getClass(), "date", term109);
        setByteField(term113, term113.getClass(), "hour", (byte) 22);
        setByteField(term113, term113.getClass(), "minute", (byte) 10);
        setByteField(term113, term113.getClass(), "second", (byte) 8);
        setIntField(term113, term113.getClass(), "nano", 380008862);
        setField(term108, term108.getClass(), "time", term113);
        setField(term104, term104.getClass(), "createdAt", term108);
        setIntField(term119, term119.getClass(), "year", 2021);
        setShortField(term119, term119.getClass(), "month", (short) 9);
        setShortField(term119, term119.getClass(), "day", (short) 7);
        setField(term118, term118.getClass(), "date", term119);
        setByteField(term123, term123.getClass(), "hour", (byte) 5);
        setByteField(term123, term123.getClass(), "minute", (byte) 25);
        setByteField(term123, term123.getClass(), "second", (byte) 7);
        setIntField(term123, term123.getClass(), "nano", 755924076);
        setField(term118, term118.getClass(), "time", term123);
        setField(term104, term104.getClass(), "updatedAt", term118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term104, args);
    }

};


