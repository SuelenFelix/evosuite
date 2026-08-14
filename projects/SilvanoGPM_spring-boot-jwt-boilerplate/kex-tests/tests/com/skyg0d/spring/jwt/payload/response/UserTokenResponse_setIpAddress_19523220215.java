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

public class UserTokenResponse_setIpAddress_19523220215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8115;

    public UserTokenResponse_setIpAddress_19523220215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8115 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term8128 = newInstance(Class.forName("java.time.Instant"));
        Object term8179 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8180 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8184 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8189 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8190 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8194 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8115, term8115.getClass(), "id", "RDnkgWkcbz");
        setLongField(term8128, term8128.getClass(), "seconds", 1630952644L);
        setIntField(term8128, term8128.getClass(), "nanos", 759000000);
        setField(term8115, term8115.getClass(), "expiryDate", term8128);
        setField(term8115, term8115.getClass(), "token", "IBpaxltauX");
        setField(term8115, term8115.getClass(), "browser", "hePqROaplw");
        setField(term8115, term8115.getClass(), "operatingSystem", "PJcSNDruWd");
        setField(term8115, term8115.getClass(), "ipAddress", "VVNNlAePXF");
        setIntField(term8180, term8180.getClass(), "year", 2011);
        setShortField(term8180, term8180.getClass(), "month", (short) 6);
        setShortField(term8180, term8180.getClass(), "day", (short) 26);
        setField(term8179, term8179.getClass(), "date", term8180);
        setByteField(term8184, term8184.getClass(), "hour", (byte) 22);
        setByteField(term8184, term8184.getClass(), "minute", (byte) 39);
        setByteField(term8184, term8184.getClass(), "second", (byte) 11);
        setIntField(term8184, term8184.getClass(), "nano", 686293604);
        setField(term8179, term8179.getClass(), "time", term8184);
        setField(term8115, term8115.getClass(), "createdAt", term8179);
        setIntField(term8190, term8190.getClass(), "year", 2012);
        setShortField(term8190, term8190.getClass(), "month", (short) 7);
        setShortField(term8190, term8190.getClass(), "day", (short) 21);
        setField(term8189, term8189.getClass(), "date", term8190);
        setByteField(term8194, term8194.getClass(), "hour", (byte) 13);
        setByteField(term8194, term8194.getClass(), "minute", (byte) 41);
        setByteField(term8194, term8194.getClass(), "second", (byte) 44);
        setIntField(term8194, term8194.getClass(), "nano", 394467282);
        setField(term8189, term8189.getClass(), "time", term8194);
        setField(term8115, term8115.getClass(), "updatedAt", term8189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jnwVnmKAFv";
        callMethod(klass, "setIpAddress", argTypes, term8115, args);
    }

};


