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

public class UserTokenResponse_UserTokenResponseBuilder_expiryDate_4698200542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;
     Object term241;

    public UserTokenResponse_UserTokenResponseBuilder_expiryDate_4698200542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder"));
        Object term170 = newInstance(Class.forName("java.time.Instant"));
        Object term221 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term222 = newInstance(Class.forName("java.time.LocalDate"));
        Object term226 = newInstance(Class.forName("java.time.LocalTime"));
        Object term231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term236 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term157, term157.getClass(), "id", "SzjVpOQTyS");
        setLongField(term170, term170.getClass(), "seconds", 1480438351L);
        setIntField(term170, term170.getClass(), "nanos", 369000000);
        setField(term157, term157.getClass(), "expiryDate", term170);
        setField(term157, term157.getClass(), "token", "MjGYSRKTNF");
        setField(term157, term157.getClass(), "browser", "hRNSzYYIrc");
        setField(term157, term157.getClass(), "operatingSystem", "RMFIsYGgne");
        setField(term157, term157.getClass(), "ipAddress", "NRdvgJlhkX");
        setIntField(term222, term222.getClass(), "year", 2015);
        setShortField(term222, term222.getClass(), "month", (short) 9);
        setShortField(term222, term222.getClass(), "day", (short) 19);
        setField(term221, term221.getClass(), "date", term222);
        setByteField(term226, term226.getClass(), "hour", (byte) 9);
        setByteField(term226, term226.getClass(), "minute", (byte) 4);
        setByteField(term226, term226.getClass(), "second", (byte) 10);
        setIntField(term226, term226.getClass(), "nano", 401765865);
        setField(term221, term221.getClass(), "time", term226);
        setField(term157, term157.getClass(), "createdAt", term221);
        setIntField(term232, term232.getClass(), "year", 2015);
        setShortField(term232, term232.getClass(), "month", (short) 4);
        setShortField(term232, term232.getClass(), "day", (short) 14);
        setField(term231, term231.getClass(), "date", term232);
        setByteField(term236, term236.getClass(), "hour", (byte) 18);
        setByteField(term236, term236.getClass(), "minute", (byte) 24);
        setByteField(term236, term236.getClass(), "second", (byte) 32);
        setIntField(term236, term236.getClass(), "nano", 369233818);
        setField(term231, term231.getClass(), "time", term236);
        setField(term157, term157.getClass(), "updatedAt", term231);
        term241 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term241, term241.getClass(), "seconds", 1610940182L);
        setIntField(term241, term241.getClass(), "nanos", 830000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term241;
        callMethod(klass, "expiryDate", argTypes, term157, args);
    }

};


