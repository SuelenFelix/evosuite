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

public class UserTokenResponse_getId_18592874082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6282;

    public UserTokenResponse_getId_18592874082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6282 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term6295 = newInstance(Class.forName("java.time.Instant"));
        Object term6346 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6347 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6351 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6361 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6282, term6282.getClass(), "id", "CGOpQSZZwI");
        setLongField(term6295, term6295.getClass(), "seconds", 1745462962L);
        setIntField(term6295, term6295.getClass(), "nanos", 80000000);
        setField(term6282, term6282.getClass(), "expiryDate", term6295);
        setField(term6282, term6282.getClass(), "token", "ypEdrstygY");
        setField(term6282, term6282.getClass(), "browser", "sNQFlATEeQ");
        setField(term6282, term6282.getClass(), "operatingSystem", "ZKMLioamsY");
        setField(term6282, term6282.getClass(), "ipAddress", "WVbxuoDBcn");
        setIntField(term6347, term6347.getClass(), "year", 2028);
        setShortField(term6347, term6347.getClass(), "month", (short) 10);
        setShortField(term6347, term6347.getClass(), "day", (short) 1);
        setField(term6346, term6346.getClass(), "date", term6347);
        setByteField(term6351, term6351.getClass(), "hour", (byte) 17);
        setByteField(term6351, term6351.getClass(), "minute", (byte) 29);
        setByteField(term6351, term6351.getClass(), "second", (byte) 30);
        setIntField(term6351, term6351.getClass(), "nano", 845472306);
        setField(term6346, term6346.getClass(), "time", term6351);
        setField(term6282, term6282.getClass(), "createdAt", term6346);
        setIntField(term6357, term6357.getClass(), "year", 2027);
        setShortField(term6357, term6357.getClass(), "month", (short) 2);
        setShortField(term6357, term6357.getClass(), "day", (short) 19);
        setField(term6356, term6356.getClass(), "date", term6357);
        setByteField(term6361, term6361.getClass(), "hour", (byte) 17);
        setByteField(term6361, term6361.getClass(), "minute", (byte) 37);
        setByteField(term6361, term6361.getClass(), "second", (byte) 27);
        setIntField(term6361, term6361.getClass(), "nano", 920380537);
        setField(term6356, term6356.getClass(), "time", term6361);
        setField(term6282, term6282.getClass(), "updatedAt", term6356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term6282, args);
    }

};


