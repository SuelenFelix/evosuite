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

public class UserTokenResponse_UserTokenResponseBuilder_createdAt_14164120537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term918;
     Object term1002;

    public UserTokenResponse_UserTokenResponseBuilder_createdAt_14164120537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term918 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder"));
        Object term931 = newInstance(Class.forName("java.time.Instant"));
        Object term982 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term983 = newInstance(Class.forName("java.time.LocalDate"));
        Object term987 = newInstance(Class.forName("java.time.LocalTime"));
        Object term992 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term993 = newInstance(Class.forName("java.time.LocalDate"));
        Object term997 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term918, term918.getClass(), "id", "Ghbwtircqb");
        setLongField(term931, term931.getClass(), "seconds", 1495357463L);
        setIntField(term931, term931.getClass(), "nanos", 288000000);
        setField(term918, term918.getClass(), "expiryDate", term931);
        setField(term918, term918.getClass(), "token", "xrwlQZdwCp");
        setField(term918, term918.getClass(), "browser", "IDCWpPLRkE");
        setField(term918, term918.getClass(), "operatingSystem", "nyiiPDVjAc");
        setField(term918, term918.getClass(), "ipAddress", "aKnKipADSo");
        setIntField(term983, term983.getClass(), "year", 2012);
        setShortField(term983, term983.getClass(), "month", (short) 9);
        setShortField(term983, term983.getClass(), "day", (short) 11);
        setField(term982, term982.getClass(), "date", term983);
        setByteField(term987, term987.getClass(), "hour", (byte) 22);
        setByteField(term987, term987.getClass(), "minute", (byte) 10);
        setByteField(term987, term987.getClass(), "second", (byte) 8);
        setIntField(term987, term987.getClass(), "nano", 380008862);
        setField(term982, term982.getClass(), "time", term987);
        setField(term918, term918.getClass(), "createdAt", term982);
        setIntField(term993, term993.getClass(), "year", 2021);
        setShortField(term993, term993.getClass(), "month", (short) 9);
        setShortField(term993, term993.getClass(), "day", (short) 7);
        setField(term992, term992.getClass(), "date", term993);
        setByteField(term997, term997.getClass(), "hour", (byte) 5);
        setByteField(term997, term997.getClass(), "minute", (byte) 25);
        setByteField(term997, term997.getClass(), "second", (byte) 7);
        setIntField(term997, term997.getClass(), "nano", 755924076);
        setField(term992, term992.getClass(), "time", term997);
        setField(term918, term918.getClass(), "updatedAt", term992);
        term1002 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1003 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1007 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1003, term1003.getClass(), "year", 2012);
        setShortField(term1003, term1003.getClass(), "month", (short) 2);
        setShortField(term1003, term1003.getClass(), "day", (short) 19);
        setField(term1002, term1002.getClass(), "date", term1003);
        setByteField(term1007, term1007.getClass(), "hour", (byte) 8);
        setByteField(term1007, term1007.getClass(), "minute", (byte) 4);
        setByteField(term1007, term1007.getClass(), "second", (byte) 43);
        setIntField(term1007, term1007.getClass(), "nano", 114930008);
        setField(term1002, term1002.getClass(), "time", term1007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1002;
        callMethod(klass, "createdAt", argTypes, term918, args);
    }

};


