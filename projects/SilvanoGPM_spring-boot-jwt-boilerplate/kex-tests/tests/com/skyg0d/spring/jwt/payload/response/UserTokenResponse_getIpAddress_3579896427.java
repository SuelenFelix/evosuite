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

public class UserTokenResponse_getIpAddress_3579896427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6952;

    public UserTokenResponse_getIpAddress_3579896427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6952 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term6965 = newInstance(Class.forName("java.time.Instant"));
        Object term7016 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7017 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7021 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7026 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7027 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7031 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6952, term6952.getClass(), "id", "iCCsaLHohG");
        setLongField(term6965, term6965.getClass(), "seconds", 1437757323L);
        setIntField(term6965, term6965.getClass(), "nanos", 580000000);
        setField(term6952, term6952.getClass(), "expiryDate", term6965);
        setField(term6952, term6952.getClass(), "token", "NJhGgctbdj");
        setField(term6952, term6952.getClass(), "browser", "MYWYUeLGOp");
        setField(term6952, term6952.getClass(), "operatingSystem", "tsTGdgQYUL");
        setField(term6952, term6952.getClass(), "ipAddress", "TtGbVmKcnX");
        setIntField(term7017, term7017.getClass(), "year", 2010);
        setShortField(term7017, term7017.getClass(), "month", (short) 1);
        setShortField(term7017, term7017.getClass(), "day", (short) 17);
        setField(term7016, term7016.getClass(), "date", term7017);
        setByteField(term7021, term7021.getClass(), "hour", (byte) 13);
        setByteField(term7021, term7021.getClass(), "minute", (byte) 5);
        setByteField(term7021, term7021.getClass(), "second", (byte) 51);
        setIntField(term7021, term7021.getClass(), "nano", 362260580);
        setField(term7016, term7016.getClass(), "time", term7021);
        setField(term6952, term6952.getClass(), "createdAt", term7016);
        setIntField(term7027, term7027.getClass(), "year", 2010);
        setShortField(term7027, term7027.getClass(), "month", (short) 9);
        setShortField(term7027, term7027.getClass(), "day", (short) 28);
        setField(term7026, term7026.getClass(), "date", term7027);
        setByteField(term7031, term7031.getClass(), "hour", (byte) 6);
        setByteField(term7031, term7031.getClass(), "minute", (byte) 4);
        setByteField(term7031, term7031.getClass(), "second", (byte) 54);
        setIntField(term7031, term7031.getClass(), "nano", 604713782);
        setField(term7026, term7026.getClass(), "time", term7031);
        setField(term6952, term6952.getClass(), "updatedAt", term7026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIpAddress", argTypes, term6952, args);
    }

};


