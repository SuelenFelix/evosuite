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

public class BaseEntity_BaseEntityBuilderImpl_self_16468192211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3788;

    public BaseEntity_BaseEntityBuilderImpl_self_16468192211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3788 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.BaseEntity$BaseEntityBuilderImpl"));
        Object term3789 = newInstance(Class.forName("java.util.UUID"));
        Object term3792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3797 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3802 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3803 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3807 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3789, term3789.getClass(), "mostSigBits", 682356318767179819L);
        setLongField(term3789, term3789.getClass(), "leastSigBits", -7291743527973326814L);
        setField(term3788, term3788.getClass(), "id", term3789);
        setIntField(term3793, term3793.getClass(), "year", 2010);
        setShortField(term3793, term3793.getClass(), "month", (short) 2);
        setShortField(term3793, term3793.getClass(), "day", (short) 24);
        setField(term3792, term3792.getClass(), "date", term3793);
        setByteField(term3797, term3797.getClass(), "hour", (byte) 17);
        setByteField(term3797, term3797.getClass(), "minute", (byte) 58);
        setByteField(term3797, term3797.getClass(), "second", (byte) 56);
        setIntField(term3797, term3797.getClass(), "nano", 291725532);
        setField(term3792, term3792.getClass(), "time", term3797);
        setField(term3788, term3788.getClass(), "createdAt", term3792);
        setIntField(term3803, term3803.getClass(), "year", 2028);
        setShortField(term3803, term3803.getClass(), "month", (short) 7);
        setShortField(term3803, term3803.getClass(), "day", (short) 22);
        setField(term3802, term3802.getClass(), "date", term3803);
        setByteField(term3807, term3807.getClass(), "hour", (byte) 18);
        setByteField(term3807, term3807.getClass(), "minute", (byte) 33);
        setByteField(term3807, term3807.getClass(), "second", (byte) 7);
        setIntField(term3807, term3807.getClass(), "nano", 763613074);
        setField(term3802, term3802.getClass(), "time", term3807);
        setField(term3788, term3788.getClass(), "updatedAt", term3802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity$BaseEntityBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term3788, args);
    }

};


