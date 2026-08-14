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

public class UserTokenResponse_UserTokenResponseBuilder_toString_148973570710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1340;

    public UserTokenResponse_UserTokenResponseBuilder_toString_148973570710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1340 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder"));
        Object term1353 = newInstance(Class.forName("java.time.Instant"));
        Object term1404 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1405 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1409 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1419 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1340, term1340.getClass(), "id", "nGKItKLYNC");
        setLongField(term1353, term1353.getClass(), "seconds", 1797203628L);
        setIntField(term1353, term1353.getClass(), "nanos", 25000000);
        setField(term1340, term1340.getClass(), "expiryDate", term1353);
        setField(term1340, term1340.getClass(), "token", "UiUYnPrcCi");
        setField(term1340, term1340.getClass(), "browser", "UoYtihxVaS");
        setField(term1340, term1340.getClass(), "operatingSystem", "JDswTTCZHV");
        setField(term1340, term1340.getClass(), "ipAddress", "onpbIeEKoi");
        setIntField(term1405, term1405.getClass(), "year", 2014);
        setShortField(term1405, term1405.getClass(), "month", (short) 7);
        setShortField(term1405, term1405.getClass(), "day", (short) 13);
        setField(term1404, term1404.getClass(), "date", term1405);
        setByteField(term1409, term1409.getClass(), "hour", (byte) 21);
        setByteField(term1409, term1409.getClass(), "minute", (byte) 46);
        setByteField(term1409, term1409.getClass(), "second", (byte) 0);
        setIntField(term1409, term1409.getClass(), "nano", 887884128);
        setField(term1404, term1404.getClass(), "time", term1409);
        setField(term1340, term1340.getClass(), "createdAt", term1404);
        setIntField(term1415, term1415.getClass(), "year", 2023);
        setShortField(term1415, term1415.getClass(), "month", (short) 3);
        setShortField(term1415, term1415.getClass(), "day", (short) 7);
        setField(term1414, term1414.getClass(), "date", term1415);
        setByteField(term1419, term1419.getClass(), "hour", (byte) 21);
        setByteField(term1419, term1419.getClass(), "minute", (byte) 15);
        setByteField(term1419, term1419.getClass(), "second", (byte) 43);
        setIntField(term1419, term1419.getClass(), "nano", 639721472);
        setField(term1414, term1414.getClass(), "time", term1419);
        setField(term1340, term1340.getClass(), "updatedAt", term1414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1340, args);
    }

};


