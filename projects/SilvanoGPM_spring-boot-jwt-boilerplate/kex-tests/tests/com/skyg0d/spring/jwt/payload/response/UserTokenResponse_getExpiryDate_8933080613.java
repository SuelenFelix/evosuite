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

public class UserTokenResponse_getExpiryDate_8933080613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6416;

    public UserTokenResponse_getExpiryDate_8933080613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6416 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term6429 = newInstance(Class.forName("java.time.Instant"));
        Object term6480 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6481 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6485 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6490 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6491 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6495 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6416, term6416.getClass(), "id", "pvDEABOxLt");
        setLongField(term6429, term6429.getClass(), "seconds", 1349069753L);
        setIntField(term6429, term6429.getClass(), "nanos", 960000000);
        setField(term6416, term6416.getClass(), "expiryDate", term6429);
        setField(term6416, term6416.getClass(), "token", "beAMpkroCQ");
        setField(term6416, term6416.getClass(), "browser", "uSUvKAyuvd");
        setField(term6416, term6416.getClass(), "operatingSystem", "onQLVONGuf");
        setField(term6416, term6416.getClass(), "ipAddress", "SOrEHbcbmn");
        setIntField(term6481, term6481.getClass(), "year", 2021);
        setShortField(term6481, term6481.getClass(), "month", (short) 8);
        setShortField(term6481, term6481.getClass(), "day", (short) 12);
        setField(term6480, term6480.getClass(), "date", term6481);
        setByteField(term6485, term6485.getClass(), "hour", (byte) 2);
        setByteField(term6485, term6485.getClass(), "minute", (byte) 17);
        setByteField(term6485, term6485.getClass(), "second", (byte) 51);
        setIntField(term6485, term6485.getClass(), "nano", 207375141);
        setField(term6480, term6480.getClass(), "time", term6485);
        setField(term6416, term6416.getClass(), "createdAt", term6480);
        setIntField(term6491, term6491.getClass(), "year", 2025);
        setShortField(term6491, term6491.getClass(), "month", (short) 11);
        setShortField(term6491, term6491.getClass(), "day", (short) 3);
        setField(term6490, term6490.getClass(), "date", term6491);
        setByteField(term6495, term6495.getClass(), "hour", (byte) 21);
        setByteField(term6495, term6495.getClass(), "minute", (byte) 24);
        setByteField(term6495, term6495.getClass(), "second", (byte) 23);
        setIntField(term6495, term6495.getClass(), "nano", 210986721);
        setField(term6490, term6490.getClass(), "time", term6495);
        setField(term6416, term6416.getClass(), "updatedAt", term6490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpiryDate", argTypes, term6416, args);
    }

};


