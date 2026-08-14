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

public class UserTokenResponse_setCreatedAt_2726869616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8271;
     Object term8355;

    public UserTokenResponse_setCreatedAt_2726869616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8271 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term8284 = newInstance(Class.forName("java.time.Instant"));
        Object term8335 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8336 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8340 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8346 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8350 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8271, term8271.getClass(), "id", "TXyHhqeCjR");
        setLongField(term8284, term8284.getClass(), "seconds", 1739417792L);
        setIntField(term8284, term8284.getClass(), "nanos", 956000000);
        setField(term8271, term8271.getClass(), "expiryDate", term8284);
        setField(term8271, term8271.getClass(), "token", "lZIgPZPgTu");
        setField(term8271, term8271.getClass(), "browser", "iuCxnHGMoW");
        setField(term8271, term8271.getClass(), "operatingSystem", "GPSEWEDSTo");
        setField(term8271, term8271.getClass(), "ipAddress", "RCOqfVsRHt");
        setIntField(term8336, term8336.getClass(), "year", 2025);
        setShortField(term8336, term8336.getClass(), "month", (short) 9);
        setShortField(term8336, term8336.getClass(), "day", (short) 25);
        setField(term8335, term8335.getClass(), "date", term8336);
        setByteField(term8340, term8340.getClass(), "hour", (byte) 20);
        setByteField(term8340, term8340.getClass(), "minute", (byte) 0);
        setByteField(term8340, term8340.getClass(), "second", (byte) 25);
        setIntField(term8340, term8340.getClass(), "nano", 65871584);
        setField(term8335, term8335.getClass(), "time", term8340);
        setField(term8271, term8271.getClass(), "createdAt", term8335);
        setIntField(term8346, term8346.getClass(), "year", 2011);
        setShortField(term8346, term8346.getClass(), "month", (short) 9);
        setShortField(term8346, term8346.getClass(), "day", (short) 25);
        setField(term8345, term8345.getClass(), "date", term8346);
        setByteField(term8350, term8350.getClass(), "hour", (byte) 16);
        setByteField(term8350, term8350.getClass(), "minute", (byte) 45);
        setByteField(term8350, term8350.getClass(), "second", (byte) 19);
        setIntField(term8350, term8350.getClass(), "nano", 962864785);
        setField(term8345, term8345.getClass(), "time", term8350);
        setField(term8271, term8271.getClass(), "updatedAt", term8345);
        term8355 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8356 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8360 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term8356, term8356.getClass(), "year", 2022);
        setShortField(term8356, term8356.getClass(), "month", (short) 6);
        setShortField(term8356, term8356.getClass(), "day", (short) 20);
        setField(term8355, term8355.getClass(), "date", term8356);
        setByteField(term8360, term8360.getClass(), "hour", (byte) 7);
        setByteField(term8360, term8360.getClass(), "minute", (byte) 57);
        setByteField(term8360, term8360.getClass(), "second", (byte) 37);
        setIntField(term8360, term8360.getClass(), "nano", 90374877);
        setField(term8355, term8355.getClass(), "time", term8360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term8355;
        callMethod(klass, "setCreatedAt", argTypes, term8271, args);
    }

};


