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

public class UserTokenResponse_getUpdatedAt_2781876519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7220;

    public UserTokenResponse_getUpdatedAt_2781876519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7220 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term7233 = newInstance(Class.forName("java.time.Instant"));
        Object term7284 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7285 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7289 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7294 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7295 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7299 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7220, term7220.getClass(), "id", "EKjQdtKxAM");
        setLongField(term7233, term7233.getClass(), "seconds", 1725122217L);
        setIntField(term7233, term7233.getClass(), "nanos", 647000000);
        setField(term7220, term7220.getClass(), "expiryDate", term7233);
        setField(term7220, term7220.getClass(), "token", "TXZAIPQJHt");
        setField(term7220, term7220.getClass(), "browser", "DIbeDHICho");
        setField(term7220, term7220.getClass(), "operatingSystem", "dJGPlmSRnz");
        setField(term7220, term7220.getClass(), "ipAddress", "DPskuFUobI");
        setIntField(term7285, term7285.getClass(), "year", 2015);
        setShortField(term7285, term7285.getClass(), "month", (short) 12);
        setShortField(term7285, term7285.getClass(), "day", (short) 23);
        setField(term7284, term7284.getClass(), "date", term7285);
        setByteField(term7289, term7289.getClass(), "hour", (byte) 14);
        setByteField(term7289, term7289.getClass(), "minute", (byte) 17);
        setByteField(term7289, term7289.getClass(), "second", (byte) 50);
        setIntField(term7289, term7289.getClass(), "nano", 325544804);
        setField(term7284, term7284.getClass(), "time", term7289);
        setField(term7220, term7220.getClass(), "createdAt", term7284);
        setIntField(term7295, term7295.getClass(), "year", 2027);
        setShortField(term7295, term7295.getClass(), "month", (short) 11);
        setShortField(term7295, term7295.getClass(), "day", (short) 8);
        setField(term7294, term7294.getClass(), "date", term7295);
        setByteField(term7299, term7299.getClass(), "hour", (byte) 11);
        setByteField(term7299, term7299.getClass(), "minute", (byte) 59);
        setByteField(term7299, term7299.getClass(), "second", (byte) 14);
        setIntField(term7299, term7299.getClass(), "nano", 322375591);
        setField(term7294, term7294.getClass(), "time", term7299);
        setField(term7220, term7220.getClass(), "updatedAt", term7294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term7220, args);
    }

};


