package com.skyg0d.spring.jwt.model;

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
import static com.skyg0d.spring.jwt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class RefreshToken_getUser_32160616311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6331;

    public RefreshToken_getUser_32160616311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6370 = new HashMap();
        Set<Object> term6502 =  ((Map) term6370).keySet();
        HashSet term6369 = new HashSet((Collection<? extends Object>) term6502);
        term6331 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        Object term6332 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term6375 = newInstance(Class.forName("java.util.UUID"));
        Object term6378 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6379 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6383 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6388 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6389 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6393 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6410 = newInstance(Class.forName("java.time.Instant"));
        Object term6449 = newInstance(Class.forName("java.util.UUID"));
        Object term6452 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6453 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6457 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6462 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6463 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6467 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6332, term6332.getClass(), "username", "OJJtVNPyKZ");
        setField(term6332, term6332.getClass(), "email", "AKNapTAfmD");
        setField(term6332, term6332.getClass(), "password", "xJgPlLxpgC");
        setField(term6332, term6332.getClass(), "roles", term6369);
        setLongField(term6375, term6375.getClass(), "mostSigBits", -5386201758403679145L);
        setLongField(term6375, term6375.getClass(), "leastSigBits", -7268507582722666254L);
        setField(term6332, term6332.getClass(), "id", term6375);
        setIntField(term6379, term6379.getClass(), "year", 2024);
        setShortField(term6379, term6379.getClass(), "month", (short) 9);
        setShortField(term6379, term6379.getClass(), "day", (short) 22);
        setField(term6378, term6378.getClass(), "date", term6379);
        setByteField(term6383, term6383.getClass(), "hour", (byte) 0);
        setByteField(term6383, term6383.getClass(), "minute", (byte) 11);
        setByteField(term6383, term6383.getClass(), "second", (byte) 7);
        setIntField(term6383, term6383.getClass(), "nano", 56643259);
        setField(term6378, term6378.getClass(), "time", term6383);
        setField(term6332, term6332.getClass(), "createdAt", term6378);
        setIntField(term6389, term6389.getClass(), "year", 2021);
        setShortField(term6389, term6389.getClass(), "month", (short) 12);
        setShortField(term6389, term6389.getClass(), "day", (short) 21);
        setField(term6388, term6388.getClass(), "date", term6389);
        setByteField(term6393, term6393.getClass(), "hour", (byte) 12);
        setByteField(term6393, term6393.getClass(), "minute", (byte) 59);
        setByteField(term6393, term6393.getClass(), "second", (byte) 52);
        setIntField(term6393, term6393.getClass(), "nano", 47081639);
        setField(term6388, term6388.getClass(), "time", term6393);
        setField(term6332, term6332.getClass(), "updatedAt", term6388);
        setField(term6331, term6331.getClass(), "user", term6332);
        setField(term6331, term6331.getClass(), "token", "EYtfuJaxiM");
        setLongField(term6410, term6410.getClass(), "seconds", 1745462962L);
        setIntField(term6410, term6410.getClass(), "nanos", 80000000);
        setField(term6331, term6331.getClass(), "expiryDate", term6410);
        setField(term6331, term6331.getClass(), "browser", "gCWtLVKVVe");
        setField(term6331, term6331.getClass(), "operatingSystem", "fWKJoSoCwE");
        setField(term6331, term6331.getClass(), "ipAddress", "wfaXBpWAUH");
        setLongField(term6449, term6449.getClass(), "mostSigBits", 5671808784468963649L);
        setLongField(term6449, term6449.getClass(), "leastSigBits", 2297097306706899827L);
        setField(term6331, term6331.getClass(), "id", term6449);
        setIntField(term6453, term6453.getClass(), "year", 2026);
        setShortField(term6453, term6453.getClass(), "month", (short) 6);
        setShortField(term6453, term6453.getClass(), "day", (short) 13);
        setField(term6452, term6452.getClass(), "date", term6453);
        setByteField(term6457, term6457.getClass(), "hour", (byte) 19);
        setByteField(term6457, term6457.getClass(), "minute", (byte) 23);
        setByteField(term6457, term6457.getClass(), "second", (byte) 46);
        setIntField(term6457, term6457.getClass(), "nano", 67955056);
        setField(term6452, term6452.getClass(), "time", term6457);
        setField(term6331, term6331.getClass(), "createdAt", term6452);
        setIntField(term6463, term6463.getClass(), "year", 2013);
        setShortField(term6463, term6463.getClass(), "month", (short) 12);
        setShortField(term6463, term6463.getClass(), "day", (short) 23);
        setField(term6462, term6462.getClass(), "date", term6463);
        setByteField(term6467, term6467.getClass(), "hour", (byte) 1);
        setByteField(term6467, term6467.getClass(), "minute", (byte) 0);
        setByteField(term6467, term6467.getClass(), "second", (byte) 32);
        setIntField(term6467, term6467.getClass(), "nano", 168525686);
        setField(term6462, term6462.getClass(), "time", term6467);
        setField(term6331, term6331.getClass(), "updatedAt", term6462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term6331, args);
    }

};


