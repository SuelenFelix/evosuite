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

public class BaseEntity_setUpdatedAt_11325306699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261;
     Object term285;

    public BaseEntity_setUpdatedAt_11325306699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.BaseEntity"));
        Object term262 = newInstance(Class.forName("java.util.UUID"));
        Object term265 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term266 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270 = newInstance(Class.forName("java.time.LocalTime"));
        Object term275 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term276 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term262, term262.getClass(), "mostSigBits", -7672528020740371001L);
        setLongField(term262, term262.getClass(), "leastSigBits", -4502405999831680926L);
        setField(term261, term261.getClass(), "id", term262);
        setIntField(term266, term266.getClass(), "year", 2023);
        setShortField(term266, term266.getClass(), "month", (short) 9);
        setShortField(term266, term266.getClass(), "day", (short) 23);
        setField(term265, term265.getClass(), "date", term266);
        setByteField(term270, term270.getClass(), "hour", (byte) 12);
        setByteField(term270, term270.getClass(), "minute", (byte) 55);
        setByteField(term270, term270.getClass(), "second", (byte) 58);
        setIntField(term270, term270.getClass(), "nano", 159178396);
        setField(term265, term265.getClass(), "time", term270);
        setField(term261, term261.getClass(), "createdAt", term265);
        setIntField(term276, term276.getClass(), "year", 2028);
        setShortField(term276, term276.getClass(), "month", (short) 10);
        setShortField(term276, term276.getClass(), "day", (short) 1);
        setField(term275, term275.getClass(), "date", term276);
        setByteField(term280, term280.getClass(), "hour", (byte) 17);
        setByteField(term280, term280.getClass(), "minute", (byte) 29);
        setByteField(term280, term280.getClass(), "second", (byte) 30);
        setIntField(term280, term280.getClass(), "nano", 845472306);
        setField(term275, term275.getClass(), "time", term280);
        setField(term261, term261.getClass(), "updatedAt", term275);
        term285 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term286 = newInstance(Class.forName("java.time.LocalDate"));
        Object term290 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term286, term286.getClass(), "year", 2027);
        setShortField(term286, term286.getClass(), "month", (short) 2);
        setShortField(term286, term286.getClass(), "day", (short) 19);
        setField(term285, term285.getClass(), "date", term286);
        setByteField(term290, term290.getClass(), "hour", (byte) 17);
        setByteField(term290, term290.getClass(), "minute", (byte) 37);
        setByteField(term290, term290.getClass(), "second", (byte) 27);
        setIntField(term290, term290.getClass(), "nano", 920380537);
        setField(term285, term285.getClass(), "time", term290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term285;
        callMethod(klass, "setUpdatedAt", argTypes, term261, args);
    }

};


