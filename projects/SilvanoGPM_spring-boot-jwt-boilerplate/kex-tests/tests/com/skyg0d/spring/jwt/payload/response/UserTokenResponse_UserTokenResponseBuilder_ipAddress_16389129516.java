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

public class UserTokenResponse_UserTokenResponseBuilder_ipAddress_16389129516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term762;

    public UserTokenResponse_UserTokenResponseBuilder_ipAddress_16389129516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term762 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder"));
        Object term775 = newInstance(Class.forName("java.time.Instant"));
        Object term826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term831 = newInstance(Class.forName("java.time.LocalTime"));
        Object term836 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term837 = newInstance(Class.forName("java.time.LocalDate"));
        Object term841 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term762, term762.getClass(), "id", "TEParAifyi");
        setLongField(term775, term775.getClass(), "seconds", 1429023851L);
        setIntField(term775, term775.getClass(), "nanos", 389000000);
        setField(term762, term762.getClass(), "expiryDate", term775);
        setField(term762, term762.getClass(), "token", "OWDIEULEFu");
        setField(term762, term762.getClass(), "browser", "dWRymuLBtr");
        setField(term762, term762.getClass(), "operatingSystem", "AijpHYOFuy");
        setField(term762, term762.getClass(), "ipAddress", "SbAoxhfrkn");
        setIntField(term827, term827.getClass(), "year", 2019);
        setShortField(term827, term827.getClass(), "month", (short) 2);
        setShortField(term827, term827.getClass(), "day", (short) 21);
        setField(term826, term826.getClass(), "date", term827);
        setByteField(term831, term831.getClass(), "hour", (byte) 5);
        setByteField(term831, term831.getClass(), "minute", (byte) 41);
        setByteField(term831, term831.getClass(), "second", (byte) 11);
        setIntField(term831, term831.getClass(), "nano", 859829782);
        setField(term826, term826.getClass(), "time", term831);
        setField(term762, term762.getClass(), "createdAt", term826);
        setIntField(term837, term837.getClass(), "year", 2018);
        setShortField(term837, term837.getClass(), "month", (short) 9);
        setShortField(term837, term837.getClass(), "day", (short) 28);
        setField(term836, term836.getClass(), "date", term837);
        setByteField(term841, term841.getClass(), "hour", (byte) 3);
        setByteField(term841, term841.getClass(), "minute", (byte) 37);
        setByteField(term841, term841.getClass(), "second", (byte) 46);
        setIntField(term841, term841.getClass(), "nano", 763326845);
        setField(term836, term836.getClass(), "time", term841);
        setField(term762, term762.getClass(), "updatedAt", term836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kuTXqwMtDB";
        callMethod(klass, "ipAddress", argTypes, term762, args);
    }

};


