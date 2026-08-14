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

public class UserTokenResponse_UserTokenResponseBuilder_build_4053602499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1206;

    public UserTokenResponse_UserTokenResponseBuilder_build_4053602499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1206 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder"));
        Object term1219 = newInstance(Class.forName("java.time.Instant"));
        Object term1270 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1271 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1275 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1280 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1281 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1285 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1206, term1206.getClass(), "id", "GzFkzHGYFt");
        setLongField(term1219, term1219.getClass(), "seconds", 1500721068L);
        setIntField(term1219, term1219.getClass(), "nanos", 23000000);
        setField(term1206, term1206.getClass(), "expiryDate", term1219);
        setField(term1206, term1206.getClass(), "token", "tShwQLRGNe");
        setField(term1206, term1206.getClass(), "browser", "LvtrsXUliU");
        setField(term1206, term1206.getClass(), "operatingSystem", "xLbjWUgOIL");
        setField(term1206, term1206.getClass(), "ipAddress", "jDtqGUpnZN");
        setIntField(term1271, term1271.getClass(), "year", 2017);
        setShortField(term1271, term1271.getClass(), "month", (short) 3);
        setShortField(term1271, term1271.getClass(), "day", (short) 5);
        setField(term1270, term1270.getClass(), "date", term1271);
        setByteField(term1275, term1275.getClass(), "hour", (byte) 20);
        setByteField(term1275, term1275.getClass(), "minute", (byte) 34);
        setByteField(term1275, term1275.getClass(), "second", (byte) 55);
        setIntField(term1275, term1275.getClass(), "nano", 78024496);
        setField(term1270, term1270.getClass(), "time", term1275);
        setField(term1206, term1206.getClass(), "createdAt", term1270);
        setIntField(term1281, term1281.getClass(), "year", 2020);
        setShortField(term1281, term1281.getClass(), "month", (short) 7);
        setShortField(term1281, term1281.getClass(), "day", (short) 24);
        setField(term1280, term1280.getClass(), "date", term1281);
        setByteField(term1285, term1285.getClass(), "hour", (byte) 0);
        setByteField(term1285, term1285.getClass(), "minute", (byte) 59);
        setByteField(term1285, term1285.getClass(), "second", (byte) 56);
        setIntField(term1285, term1285.getClass(), "nano", 320219201);
        setField(term1280, term1280.getClass(), "time", term1285);
        setField(term1206, term1206.getClass(), "updatedAt", term1280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1206, args);
    }

};


