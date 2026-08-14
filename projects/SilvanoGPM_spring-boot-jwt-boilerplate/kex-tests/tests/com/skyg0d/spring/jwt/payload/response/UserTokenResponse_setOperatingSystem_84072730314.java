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

public class UserTokenResponse_setOperatingSystem_84072730314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7959;

    public UserTokenResponse_setOperatingSystem_84072730314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7959 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term7972 = newInstance(Class.forName("java.time.Instant"));
        Object term8023 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8024 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8028 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8033 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8034 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8038 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7959, term7959.getClass(), "id", "nRvKihUSPj");
        setLongField(term7972, term7972.getClass(), "seconds", 1502158153L);
        setIntField(term7972, term7972.getClass(), "nanos", 899000000);
        setField(term7959, term7959.getClass(), "expiryDate", term7972);
        setField(term7959, term7959.getClass(), "token", "BbNeQJpYPr");
        setField(term7959, term7959.getClass(), "browser", "riMtzCoxNj");
        setField(term7959, term7959.getClass(), "operatingSystem", "YAXkVjQZcV");
        setField(term7959, term7959.getClass(), "ipAddress", "pumvwBWvpy");
        setIntField(term8024, term8024.getClass(), "year", 2024);
        setShortField(term8024, term8024.getClass(), "month", (short) 5);
        setShortField(term8024, term8024.getClass(), "day", (short) 6);
        setField(term8023, term8023.getClass(), "date", term8024);
        setByteField(term8028, term8028.getClass(), "hour", (byte) 20);
        setByteField(term8028, term8028.getClass(), "minute", (byte) 14);
        setByteField(term8028, term8028.getClass(), "second", (byte) 27);
        setIntField(term8028, term8028.getClass(), "nano", 900636101);
        setField(term8023, term8023.getClass(), "time", term8028);
        setField(term7959, term7959.getClass(), "createdAt", term8023);
        setIntField(term8034, term8034.getClass(), "year", 2021);
        setShortField(term8034, term8034.getClass(), "month", (short) 4);
        setShortField(term8034, term8034.getClass(), "day", (short) 17);
        setField(term8033, term8033.getClass(), "date", term8034);
        setByteField(term8038, term8038.getClass(), "hour", (byte) 4);
        setByteField(term8038, term8038.getClass(), "minute", (byte) 11);
        setByteField(term8038, term8038.getClass(), "second", (byte) 16);
        setIntField(term8038, term8038.getClass(), "nano", 509895858);
        setField(term8033, term8033.getClass(), "time", term8038);
        setField(term7959, term7959.getClass(), "updatedAt", term8033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HwLHeGLyhe";
        callMethod(klass, "setOperatingSystem", argTypes, term7959, args);
    }

};


