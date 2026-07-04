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

public class Meeting2VO_setFaceUrl_50748979910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4562;

    public Meeting2VO_setFaceUrl_50748979910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4563 = new Integer(-655067527);
        Integer term4587 = new Integer(-6029667);
        term4562 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        Object term4577 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4578 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4582 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4562, term4562.getClass(), "id", term4563);
        setField(term4562, term4562.getClass(), "username", "ZlVRdHsBMO");
        setIntField(term4578, term4578.getClass(), "year", 2019);
        setShortField(term4578, term4578.getClass(), "month", (short) 2);
        setShortField(term4578, term4578.getClass(), "day", (short) 21);
        setField(term4577, term4577.getClass(), "date", term4578);
        setByteField(term4582, term4582.getClass(), "hour", (byte) 5);
        setByteField(term4582, term4582.getClass(), "minute", (byte) 41);
        setByteField(term4582, term4582.getClass(), "second", (byte) 11);
        setIntField(term4582, term4582.getClass(), "nano", 859829782);
        setField(term4577, term4577.getClass(), "time", term4582);
        setField(term4562, term4562.getClass(), "startTime", term4577);
        setField(term4562, term4562.getClass(), "state", term4587);
        setField(term4562, term4562.getClass(), "faceUrl", "UMMXkhuqzw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KyGXZcXJwq";
        callMethod(klass, "setFaceUrl", argTypes, term4562, args);
    }

};


