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

public class BaseEntity_getUpdatedAt_8017397976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;

    public BaseEntity_getUpdatedAt_8017397976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.BaseEntity"));
        Object term177 = newInstance(Class.forName("java.util.UUID"));
        Object term180 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185 = newInstance(Class.forName("java.time.LocalTime"));
        Object term190 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term191 = newInstance(Class.forName("java.time.LocalDate"));
        Object term195 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term177, term177.getClass(), "mostSigBits", -6573104506744284592L);
        setLongField(term177, term177.getClass(), "leastSigBits", -4920224193275732920L);
        setField(term176, term176.getClass(), "id", term177);
        setIntField(term181, term181.getClass(), "year", 2017);
        setShortField(term181, term181.getClass(), "month", (short) 3);
        setShortField(term181, term181.getClass(), "day", (short) 5);
        setField(term180, term180.getClass(), "date", term181);
        setByteField(term185, term185.getClass(), "hour", (byte) 20);
        setByteField(term185, term185.getClass(), "minute", (byte) 34);
        setByteField(term185, term185.getClass(), "second", (byte) 55);
        setIntField(term185, term185.getClass(), "nano", 78024496);
        setField(term180, term180.getClass(), "time", term185);
        setField(term176, term176.getClass(), "createdAt", term180);
        setIntField(term191, term191.getClass(), "year", 2020);
        setShortField(term191, term191.getClass(), "month", (short) 7);
        setShortField(term191, term191.getClass(), "day", (short) 24);
        setField(term190, term190.getClass(), "date", term191);
        setByteField(term195, term195.getClass(), "hour", (byte) 0);
        setByteField(term195, term195.getClass(), "minute", (byte) 59);
        setByteField(term195, term195.getClass(), "second", (byte) 56);
        setIntField(term195, term195.getClass(), "nano", 320219201);
        setField(term190, term190.getClass(), "time", term195);
        setField(term176, term176.getClass(), "updatedAt", term190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term176, args);
    }

};


