package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meeting2VO_getUsername_1509513192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4054;

    public Meeting2VO_getUsername_1509513192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4055 = new Integer(1484323161);
        Integer term4079 = new Integer(391863371);
        term4054 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        Object term4069 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4070 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4074 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4054, term4054.getClass(), "id", term4055);
        setField(term4054, term4054.getClass(), "username", "dUTYEKtTfQ");
        setIntField(term4070, term4070.getClass(), "year", 2021);
        setShortField(term4070, term4070.getClass(), "month", (short) 1);
        setShortField(term4070, term4070.getClass(), "day", (short) 18);
        setField(term4069, term4069.getClass(), "date", term4070);
        setByteField(term4074, term4074.getClass(), "hour", (byte) 13);
        setByteField(term4074, term4074.getClass(), "minute", (byte) 38);
        setByteField(term4074, term4074.getClass(), "second", (byte) 26);
        setIntField(term4074, term4074.getClass(), "nano", 544608644);
        setField(term4069, term4069.getClass(), "time", term4074);
        setField(term4054, term4054.getClass(), "startTime", term4069);
        setField(term4054, term4054.getClass(), "state", term4079);
        setField(term4054, term4054.getClass(), "faceUrl", "HUtbHklGel");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term4054, args);
    }

};


