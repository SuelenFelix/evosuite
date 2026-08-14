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

public class UserTokenResponse_init_181130701519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8571;
     Object term8622;
     Object term8632;

    public UserTokenResponse_init_181130701519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8571 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term8571, term8571.getClass(), "seconds", 1334853104L);
        setIntField(term8571, term8571.getClass(), "nanos", 718000000);
        term8622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8627 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term8623, term8623.getClass(), "year", 2016);
        setShortField(term8623, term8623.getClass(), "month", (short) 2);
        setShortField(term8623, term8623.getClass(), "day", (short) 25);
        setField(term8622, term8622.getClass(), "date", term8623);
        setByteField(term8627, term8627.getClass(), "hour", (byte) 8);
        setByteField(term8627, term8627.getClass(), "minute", (byte) 54);
        setByteField(term8627, term8627.getClass(), "second", (byte) 40);
        setIntField(term8627, term8627.getClass(), "nano", 124525896);
        setField(term8622, term8622.getClass(), "time", term8627);
        term8632 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8633 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8637 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term8633, term8633.getClass(), "year", 2029);
        setShortField(term8633, term8633.getClass(), "month", (short) 1);
        setShortField(term8633, term8633.getClass(), "day", (short) 10);
        setField(term8632, term8632.getClass(), "date", term8633);
        setByteField(term8637, term8637.getClass(), "hour", (byte) 8);
        setByteField(term8637, term8637.getClass(), "minute", (byte) 46);
        setByteField(term8637, term8637.getClass(), "second", (byte) 35);
        setIntField(term8637, term8637.getClass(), "nano", 58807194);
        setField(term8632, term8632.getClass(), "time", term8637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.time.Instant");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[8];
        args[0] = "aanyiAOJCl";
        args[1] = term8571;
        args[2] = "VDokbsCuqq";
        args[3] = "xClUIcPECX";
        args[4] = "avhRaGZaBF";
        args[5] = "JkgoRtImdE";
        args[6] = term8622;
        args[7] = term8632;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


