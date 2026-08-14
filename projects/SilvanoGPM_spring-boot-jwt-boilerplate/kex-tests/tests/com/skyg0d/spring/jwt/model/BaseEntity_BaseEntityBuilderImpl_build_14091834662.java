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

public class BaseEntity_BaseEntityBuilderImpl_build_14091834662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3812;

    public BaseEntity_BaseEntityBuilderImpl_build_14091834662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3812 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.BaseEntity$BaseEntityBuilderImpl"));
        Object term3813 = newInstance(Class.forName("java.util.UUID"));
        Object term3816 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3821 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3831 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3813, term3813.getClass(), "mostSigBits", -5963439350418910964L);
        setLongField(term3813, term3813.getClass(), "leastSigBits", 9013624480170062917L);
        setField(term3812, term3812.getClass(), "id", term3813);
        setIntField(term3817, term3817.getClass(), "year", 2011);
        setShortField(term3817, term3817.getClass(), "month", (short) 8);
        setShortField(term3817, term3817.getClass(), "day", (short) 1);
        setField(term3816, term3816.getClass(), "date", term3817);
        setByteField(term3821, term3821.getClass(), "hour", (byte) 7);
        setByteField(term3821, term3821.getClass(), "minute", (byte) 2);
        setByteField(term3821, term3821.getClass(), "second", (byte) 46);
        setIntField(term3821, term3821.getClass(), "nano", 187178462);
        setField(term3816, term3816.getClass(), "time", term3821);
        setField(term3812, term3812.getClass(), "createdAt", term3816);
        setIntField(term3827, term3827.getClass(), "year", 2020);
        setShortField(term3827, term3827.getClass(), "month", (short) 9);
        setShortField(term3827, term3827.getClass(), "day", (short) 3);
        setField(term3826, term3826.getClass(), "date", term3827);
        setByteField(term3831, term3831.getClass(), "hour", (byte) 10);
        setByteField(term3831, term3831.getClass(), "minute", (byte) 44);
        setByteField(term3831, term3831.getClass(), "second", (byte) 5);
        setIntField(term3831, term3831.getClass(), "nano", 572560230);
        setField(term3826, term3826.getClass(), "time", term3831);
        setField(term3812, term3812.getClass(), "updatedAt", term3826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity$BaseEntityBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3812, args);
    }

};


