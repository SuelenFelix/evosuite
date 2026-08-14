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

public class UserTokenResponse_setUpdatedAt_5260322117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8415;
     Object term8499;

    public UserTokenResponse_setUpdatedAt_5260322117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8415 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term8428 = newInstance(Class.forName("java.time.Instant"));
        Object term8479 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8480 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8484 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8494 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8415, term8415.getClass(), "id", "TSyCeEZPaT");
        setLongField(term8428, term8428.getClass(), "seconds", 1329640267L);
        setIntField(term8428, term8428.getClass(), "nanos", 573000000);
        setField(term8415, term8415.getClass(), "expiryDate", term8428);
        setField(term8415, term8415.getClass(), "token", "JeZFtaqkzW");
        setField(term8415, term8415.getClass(), "browser", "vOVuNSCCLe");
        setField(term8415, term8415.getClass(), "operatingSystem", "fzeqPnzpnt");
        setField(term8415, term8415.getClass(), "ipAddress", "RxbhrFBjkO");
        setIntField(term8480, term8480.getClass(), "year", 2023);
        setShortField(term8480, term8480.getClass(), "month", (short) 2);
        setShortField(term8480, term8480.getClass(), "day", (short) 16);
        setField(term8479, term8479.getClass(), "date", term8480);
        setByteField(term8484, term8484.getClass(), "hour", (byte) 3);
        setByteField(term8484, term8484.getClass(), "minute", (byte) 18);
        setByteField(term8484, term8484.getClass(), "second", (byte) 56);
        setIntField(term8484, term8484.getClass(), "nano", 733017887);
        setField(term8479, term8479.getClass(), "time", term8484);
        setField(term8415, term8415.getClass(), "createdAt", term8479);
        setIntField(term8490, term8490.getClass(), "year", 2025);
        setShortField(term8490, term8490.getClass(), "month", (short) 3);
        setShortField(term8490, term8490.getClass(), "day", (short) 28);
        setField(term8489, term8489.getClass(), "date", term8490);
        setByteField(term8494, term8494.getClass(), "hour", (byte) 19);
        setByteField(term8494, term8494.getClass(), "minute", (byte) 56);
        setByteField(term8494, term8494.getClass(), "second", (byte) 52);
        setIntField(term8494, term8494.getClass(), "nano", 738558930);
        setField(term8489, term8489.getClass(), "time", term8494);
        setField(term8415, term8415.getClass(), "updatedAt", term8489);
        term8499 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8500 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8504 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term8500, term8500.getClass(), "year", 2024);
        setShortField(term8500, term8500.getClass(), "month", (short) 2);
        setShortField(term8500, term8500.getClass(), "day", (short) 29);
        setField(term8499, term8499.getClass(), "date", term8500);
        setByteField(term8504, term8504.getClass(), "hour", (byte) 17);
        setByteField(term8504, term8504.getClass(), "minute", (byte) 54);
        setByteField(term8504, term8504.getClass(), "second", (byte) 21);
        setIntField(term8504, term8504.getClass(), "nano", 605973408);
        setField(term8499, term8499.getClass(), "time", term8504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term8499;
        callMethod(klass, "setUpdatedAt", argTypes, term8415, args);
    }

};


