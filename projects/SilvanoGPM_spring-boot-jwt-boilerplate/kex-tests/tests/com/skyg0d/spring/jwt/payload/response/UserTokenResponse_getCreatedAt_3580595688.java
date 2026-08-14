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

public class UserTokenResponse_getCreatedAt_3580595688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7086;

    public UserTokenResponse_getCreatedAt_3580595688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7086 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term7099 = newInstance(Class.forName("java.time.Instant"));
        Object term7150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7155 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7165 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7086, term7086.getClass(), "id", "GJVkUrCVdD");
        setLongField(term7099, term7099.getClass(), "seconds", 1668569229L);
        setIntField(term7099, term7099.getClass(), "nanos", 825000000);
        setField(term7086, term7086.getClass(), "expiryDate", term7099);
        setField(term7086, term7086.getClass(), "token", "zNdorvdUgu");
        setField(term7086, term7086.getClass(), "browser", "oPxuZbkYio");
        setField(term7086, term7086.getClass(), "operatingSystem", "vKitydDVnM");
        setField(term7086, term7086.getClass(), "ipAddress", "urCiQnUFBM");
        setIntField(term7151, term7151.getClass(), "year", 2023);
        setShortField(term7151, term7151.getClass(), "month", (short) 7);
        setShortField(term7151, term7151.getClass(), "day", (short) 16);
        setField(term7150, term7150.getClass(), "date", term7151);
        setByteField(term7155, term7155.getClass(), "hour", (byte) 3);
        setByteField(term7155, term7155.getClass(), "minute", (byte) 1);
        setByteField(term7155, term7155.getClass(), "second", (byte) 19);
        setIntField(term7155, term7155.getClass(), "nano", 488629554);
        setField(term7150, term7150.getClass(), "time", term7155);
        setField(term7086, term7086.getClass(), "createdAt", term7150);
        setIntField(term7161, term7161.getClass(), "year", 2018);
        setShortField(term7161, term7161.getClass(), "month", (short) 7);
        setShortField(term7161, term7161.getClass(), "day", (short) 12);
        setField(term7160, term7160.getClass(), "date", term7161);
        setByteField(term7165, term7165.getClass(), "hour", (byte) 1);
        setByteField(term7165, term7165.getClass(), "minute", (byte) 3);
        setByteField(term7165, term7165.getClass(), "second", (byte) 47);
        setIntField(term7165, term7165.getClass(), "nano", 2729929);
        setField(term7160, term7160.getClass(), "time", term7165);
        setField(term7086, term7086.getClass(), "updatedAt", term7160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term7086, args);
    }

};


