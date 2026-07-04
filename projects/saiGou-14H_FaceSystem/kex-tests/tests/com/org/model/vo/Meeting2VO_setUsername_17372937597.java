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

public class Meeting2VO_setUsername_17372937597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4351;

    public Meeting2VO_setUsername_17372937597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4352 = new Integer(-883034806);
        Integer term4376 = new Integer(1585847225);
        term4351 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        Object term4366 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4367 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4371 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4351, term4351.getClass(), "id", term4352);
        setField(term4351, term4351.getClass(), "username", "cHqLMqZSmc");
        setIntField(term4367, term4367.getClass(), "year", 2025);
        setShortField(term4367, term4367.getClass(), "month", (short) 4);
        setShortField(term4367, term4367.getClass(), "day", (short) 24);
        setField(term4366, term4366.getClass(), "date", term4367);
        setByteField(term4371, term4371.getClass(), "hour", (byte) 18);
        setByteField(term4371, term4371.getClass(), "minute", (byte) 11);
        setByteField(term4371, term4371.getClass(), "second", (byte) 40);
        setIntField(term4371, term4371.getClass(), "nano", 137454929);
        setField(term4366, term4366.getClass(), "time", term4371);
        setField(term4351, term4351.getClass(), "startTime", term4366);
        setField(term4351, term4351.getClass(), "state", term4376);
        setField(term4351, term4351.getClass(), "faceUrl", "hkWmAkXSOW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DwQmZEKeOp";
        callMethod(klass, "setUsername", argTypes, term4351, args);
    }

};


