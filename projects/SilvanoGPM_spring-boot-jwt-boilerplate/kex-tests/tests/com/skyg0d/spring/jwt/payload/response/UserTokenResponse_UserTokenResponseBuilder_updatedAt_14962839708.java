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

public class UserTokenResponse_UserTokenResponseBuilder_updatedAt_14962839708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1062;
     Object term1146;

    public UserTokenResponse_UserTokenResponseBuilder_updatedAt_14962839708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1062 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder"));
        Object term1075 = newInstance(Class.forName("java.time.Instant"));
        Object term1126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1131 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1136 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1137 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1141 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1062, term1062.getClass(), "id", "wSQxaModmm");
        setLongField(term1075, term1075.getClass(), "seconds", 1645834034L);
        setIntField(term1075, term1075.getClass(), "nanos", 896000000);
        setField(term1062, term1062.getClass(), "expiryDate", term1075);
        setField(term1062, term1062.getClass(), "token", "UlajhuVLaP");
        setField(term1062, term1062.getClass(), "browser", "gGSMzuGICf");
        setField(term1062, term1062.getClass(), "operatingSystem", "hxCBltsObl");
        setField(term1062, term1062.getClass(), "ipAddress", "BndsHwAFMv");
        setIntField(term1127, term1127.getClass(), "year", 2017);
        setShortField(term1127, term1127.getClass(), "month", (short) 6);
        setShortField(term1127, term1127.getClass(), "day", (short) 8);
        setField(term1126, term1126.getClass(), "date", term1127);
        setByteField(term1131, term1131.getClass(), "hour", (byte) 0);
        setByteField(term1131, term1131.getClass(), "minute", (byte) 18);
        setByteField(term1131, term1131.getClass(), "second", (byte) 55);
        setIntField(term1131, term1131.getClass(), "nano", 680586717);
        setField(term1126, term1126.getClass(), "time", term1131);
        setField(term1062, term1062.getClass(), "createdAt", term1126);
        setIntField(term1137, term1137.getClass(), "year", 2015);
        setShortField(term1137, term1137.getClass(), "month", (short) 9);
        setShortField(term1137, term1137.getClass(), "day", (short) 16);
        setField(term1136, term1136.getClass(), "date", term1137);
        setByteField(term1141, term1141.getClass(), "hour", (byte) 6);
        setByteField(term1141, term1141.getClass(), "minute", (byte) 19);
        setByteField(term1141, term1141.getClass(), "second", (byte) 42);
        setIntField(term1141, term1141.getClass(), "nano", 630084975);
        setField(term1136, term1136.getClass(), "time", term1141);
        setField(term1062, term1062.getClass(), "updatedAt", term1136);
        term1146 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1147 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1151 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1147, term1147.getClass(), "year", 2029);
        setShortField(term1147, term1147.getClass(), "month", (short) 6);
        setShortField(term1147, term1147.getClass(), "day", (short) 23);
        setField(term1146, term1146.getClass(), "date", term1147);
        setByteField(term1151, term1151.getClass(), "hour", (byte) 21);
        setByteField(term1151, term1151.getClass(), "minute", (byte) 55);
        setByteField(term1151, term1151.getClass(), "second", (byte) 27);
        setIntField(term1151, term1151.getClass(), "nano", 66889274);
        setField(term1146, term1146.getClass(), "time", term1151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1146;
        callMethod(klass, "updatedAt", argTypes, term1062, args);
    }

};


