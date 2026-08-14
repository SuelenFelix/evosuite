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

public class UserTokenResponse_getOperatingSystem_21306697536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6818;

    public UserTokenResponse_getOperatingSystem_21306697536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6818 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term6831 = newInstance(Class.forName("java.time.Instant"));
        Object term6882 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6883 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6887 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6892 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6893 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6897 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6818, term6818.getClass(), "id", "OcfNzHYdki");
        setLongField(term6831, term6831.getClass(), "seconds", 1882638884L);
        setIntField(term6831, term6831.getClass(), "nanos", 364000000);
        setField(term6818, term6818.getClass(), "expiryDate", term6831);
        setField(term6818, term6818.getClass(), "token", "uPuCVuZYOI");
        setField(term6818, term6818.getClass(), "browser", "TweMFhxNdj");
        setField(term6818, term6818.getClass(), "operatingSystem", "NBrvVzvQHe");
        setField(term6818, term6818.getClass(), "ipAddress", "FjOiNAfBOc");
        setIntField(term6883, term6883.getClass(), "year", 2010);
        setShortField(term6883, term6883.getClass(), "month", (short) 5);
        setShortField(term6883, term6883.getClass(), "day", (short) 2);
        setField(term6882, term6882.getClass(), "date", term6883);
        setByteField(term6887, term6887.getClass(), "hour", (byte) 2);
        setByteField(term6887, term6887.getClass(), "minute", (byte) 22);
        setByteField(term6887, term6887.getClass(), "second", (byte) 33);
        setIntField(term6887, term6887.getClass(), "nano", 530835039);
        setField(term6882, term6882.getClass(), "time", term6887);
        setField(term6818, term6818.getClass(), "createdAt", term6882);
        setIntField(term6893, term6893.getClass(), "year", 2024);
        setShortField(term6893, term6893.getClass(), "month", (short) 4);
        setShortField(term6893, term6893.getClass(), "day", (short) 24);
        setField(term6892, term6892.getClass(), "date", term6893);
        setByteField(term6897, term6897.getClass(), "hour", (byte) 7);
        setByteField(term6897, term6897.getClass(), "minute", (byte) 2);
        setByteField(term6897, term6897.getClass(), "second", (byte) 51);
        setIntField(term6897, term6897.getClass(), "nano", 635502964);
        setField(term6892, term6892.getClass(), "time", term6897);
        setField(term6818, term6818.getClass(), "updatedAt", term6892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOperatingSystem", argTypes, term6818, args);
    }

};


