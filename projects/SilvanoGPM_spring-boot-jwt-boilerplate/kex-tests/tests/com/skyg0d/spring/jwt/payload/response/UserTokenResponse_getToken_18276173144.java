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

public class UserTokenResponse_getToken_18276173144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6550;

    public UserTokenResponse_getToken_18276173144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6550 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term6563 = newInstance(Class.forName("java.time.Instant"));
        Object term6614 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6615 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6619 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6624 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6625 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6629 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6550, term6550.getClass(), "id", "bnsyeQXFdu");
        setLongField(term6563, term6563.getClass(), "seconds", 1706078172L);
        setIntField(term6563, term6563.getClass(), "nanos", 457000000);
        setField(term6550, term6550.getClass(), "expiryDate", term6563);
        setField(term6550, term6550.getClass(), "token", "BwtdjiefJn");
        setField(term6550, term6550.getClass(), "browser", "jDmhBrIoDa");
        setField(term6550, term6550.getClass(), "operatingSystem", "SPtPatHeOm");
        setField(term6550, term6550.getClass(), "ipAddress", "ywmcuThdfL");
        setIntField(term6615, term6615.getClass(), "year", 2016);
        setShortField(term6615, term6615.getClass(), "month", (short) 6);
        setShortField(term6615, term6615.getClass(), "day", (short) 15);
        setField(term6614, term6614.getClass(), "date", term6615);
        setByteField(term6619, term6619.getClass(), "hour", (byte) 21);
        setByteField(term6619, term6619.getClass(), "minute", (byte) 23);
        setByteField(term6619, term6619.getClass(), "second", (byte) 23);
        setIntField(term6619, term6619.getClass(), "nano", 433372070);
        setField(term6614, term6614.getClass(), "time", term6619);
        setField(term6550, term6550.getClass(), "createdAt", term6614);
        setIntField(term6625, term6625.getClass(), "year", 2012);
        setShortField(term6625, term6625.getClass(), "month", (short) 8);
        setShortField(term6625, term6625.getClass(), "day", (short) 25);
        setField(term6624, term6624.getClass(), "date", term6625);
        setByteField(term6629, term6629.getClass(), "hour", (byte) 19);
        setByteField(term6629, term6629.getClass(), "minute", (byte) 49);
        setByteField(term6629, term6629.getClass(), "second", (byte) 8);
        setIntField(term6629, term6629.getClass(), "nano", 912685024);
        setField(term6624, term6624.getClass(), "time", term6629);
        setField(term6550, term6550.getClass(), "updatedAt", term6624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term6550, args);
    }

};


