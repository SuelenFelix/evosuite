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

public class RefreshToken_getIpAddress_68170702816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7391;

    public RefreshToken_getIpAddress_68170702816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7430 = new HashMap();
        Set<Object> term7562 =  ((Map) term7430).keySet();
        HashSet term7429 = new HashSet((Collection<? extends Object>) term7562);
        term7391 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        Object term7392 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term7435 = newInstance(Class.forName("java.util.UUID"));
        Object term7438 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7439 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7443 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7448 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7449 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7453 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7470 = newInstance(Class.forName("java.time.Instant"));
        Object term7509 = newInstance(Class.forName("java.util.UUID"));
        Object term7512 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7513 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7517 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7523 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7527 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7392, term7392.getClass(), "username", "PapWxkhEWe");
        setField(term7392, term7392.getClass(), "email", "smnHEqRFRx");
        setField(term7392, term7392.getClass(), "password", "XYtryyobou");
        setField(term7392, term7392.getClass(), "roles", term7429);
        setLongField(term7435, term7435.getClass(), "mostSigBits", 8802866251294305945L);
        setLongField(term7435, term7435.getClass(), "leastSigBits", 4513004407927379358L);
        setField(term7392, term7392.getClass(), "id", term7435);
        setIntField(term7439, term7439.getClass(), "year", 2010);
        setShortField(term7439, term7439.getClass(), "month", (short) 3);
        setShortField(term7439, term7439.getClass(), "day", (short) 11);
        setField(term7438, term7438.getClass(), "date", term7439);
        setByteField(term7443, term7443.getClass(), "hour", (byte) 0);
        setByteField(term7443, term7443.getClass(), "minute", (byte) 21);
        setByteField(term7443, term7443.getClass(), "second", (byte) 25);
        setIntField(term7443, term7443.getClass(), "nano", 201315999);
        setField(term7438, term7438.getClass(), "time", term7443);
        setField(term7392, term7392.getClass(), "createdAt", term7438);
        setIntField(term7449, term7449.getClass(), "year", 2016);
        setShortField(term7449, term7449.getClass(), "month", (short) 8);
        setShortField(term7449, term7449.getClass(), "day", (short) 24);
        setField(term7448, term7448.getClass(), "date", term7449);
        setByteField(term7453, term7453.getClass(), "hour", (byte) 22);
        setByteField(term7453, term7453.getClass(), "minute", (byte) 25);
        setByteField(term7453, term7453.getClass(), "second", (byte) 3);
        setIntField(term7453, term7453.getClass(), "nano", 185613519);
        setField(term7448, term7448.getClass(), "time", term7453);
        setField(term7392, term7392.getClass(), "updatedAt", term7448);
        setField(term7391, term7391.getClass(), "user", term7392);
        setField(term7391, term7391.getClass(), "token", "OYbzXylRWW");
        setLongField(term7470, term7470.getClass(), "seconds", 1437757323L);
        setIntField(term7470, term7470.getClass(), "nanos", 580000000);
        setField(term7391, term7391.getClass(), "expiryDate", term7470);
        setField(term7391, term7391.getClass(), "browser", "DSNsTGYXDF");
        setField(term7391, term7391.getClass(), "operatingSystem", "sQvGcVjdEx");
        setField(term7391, term7391.getClass(), "ipAddress", "rLHAoqXgPh");
        setLongField(term7509, term7509.getClass(), "mostSigBits", -7115418542247301000L);
        setLongField(term7509, term7509.getClass(), "leastSigBits", 8034714140377562739L);
        setField(term7391, term7391.getClass(), "id", term7509);
        setIntField(term7513, term7513.getClass(), "year", 2029);
        setShortField(term7513, term7513.getClass(), "month", (short) 5);
        setShortField(term7513, term7513.getClass(), "day", (short) 11);
        setField(term7512, term7512.getClass(), "date", term7513);
        setByteField(term7517, term7517.getClass(), "hour", (byte) 20);
        setByteField(term7517, term7517.getClass(), "minute", (byte) 17);
        setByteField(term7517, term7517.getClass(), "second", (byte) 32);
        setIntField(term7517, term7517.getClass(), "nano", 327503582);
        setField(term7512, term7512.getClass(), "time", term7517);
        setField(term7391, term7391.getClass(), "createdAt", term7512);
        setIntField(term7523, term7523.getClass(), "year", 2012);
        setShortField(term7523, term7523.getClass(), "month", (short) 10);
        setShortField(term7523, term7523.getClass(), "day", (short) 1);
        setField(term7522, term7522.getClass(), "date", term7523);
        setByteField(term7527, term7527.getClass(), "hour", (byte) 9);
        setByteField(term7527, term7527.getClass(), "minute", (byte) 27);
        setByteField(term7527, term7527.getClass(), "second", (byte) 33);
        setIntField(term7527, term7527.getClass(), "nano", 714912000);
        setField(term7522, term7522.getClass(), "time", term7527);
        setField(term7391, term7391.getClass(), "updatedAt", term7522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIpAddress", argTypes, term7391, args);
    }

};


