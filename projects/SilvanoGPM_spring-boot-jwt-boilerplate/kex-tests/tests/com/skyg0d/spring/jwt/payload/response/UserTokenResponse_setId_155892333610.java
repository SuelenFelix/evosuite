package com.skyg0d.spring.jwt.payload.response;

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
import static com.skyg0d.spring.jwt.payload.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UserTokenResponse_setId_155892333610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7354;

    public UserTokenResponse_setId_155892333610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7354 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term7367 = newInstance(Class.forName("java.time.Instant"));
        Object term7418 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7423 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7428 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7429 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7433 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7354, term7354.getClass(), "id", "wBGfLpNNiZ");
        setLongField(term7367, term7367.getClass(), "seconds", 1550698994L);
        setIntField(term7367, term7367.getClass(), "nanos", 689000000);
        setField(term7354, term7354.getClass(), "expiryDate", term7367);
        setField(term7354, term7354.getClass(), "token", "yUGCjlqgJE");
        setField(term7354, term7354.getClass(), "browser", "PXdVZyoJyC");
        setField(term7354, term7354.getClass(), "operatingSystem", "vLerpqavFM");
        setField(term7354, term7354.getClass(), "ipAddress", "qnvxzwuGKX");
        setIntField(term7419, term7419.getClass(), "year", 2020);
        setShortField(term7419, term7419.getClass(), "month", (short) 8);
        setShortField(term7419, term7419.getClass(), "day", (short) 15);
        setField(term7418, term7418.getClass(), "date", term7419);
        setByteField(term7423, term7423.getClass(), "hour", (byte) 2);
        setByteField(term7423, term7423.getClass(), "minute", (byte) 0);
        setByteField(term7423, term7423.getClass(), "second", (byte) 38);
        setIntField(term7423, term7423.getClass(), "nano", 146431486);
        setField(term7418, term7418.getClass(), "time", term7423);
        setField(term7354, term7354.getClass(), "createdAt", term7418);
        setIntField(term7429, term7429.getClass(), "year", 2014);
        setShortField(term7429, term7429.getClass(), "month", (short) 11);
        setShortField(term7429, term7429.getClass(), "day", (short) 8);
        setField(term7428, term7428.getClass(), "date", term7429);
        setByteField(term7433, term7433.getClass(), "hour", (byte) 8);
        setByteField(term7433, term7433.getClass(), "minute", (byte) 43);
        setByteField(term7433, term7433.getClass(), "second", (byte) 32);
        setIntField(term7433, term7433.getClass(), "nano", 154434838);
        setField(term7428, term7428.getClass(), "time", term7433);
        setField(term7354, term7354.getClass(), "updatedAt", term7428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EdPAvpluZg";
        callMethod(klass, "setId", argTypes, term7354, args);
    }

};


