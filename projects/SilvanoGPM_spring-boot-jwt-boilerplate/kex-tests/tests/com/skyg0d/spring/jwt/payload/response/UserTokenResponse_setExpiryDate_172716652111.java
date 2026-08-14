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

public class UserTokenResponse_setExpiryDate_172716652111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7510;
     Object term7594;

    public UserTokenResponse_setExpiryDate_172716652111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7510 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term7523 = newInstance(Class.forName("java.time.Instant"));
        Object term7574 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7579 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7584 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7585 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7589 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7510, term7510.getClass(), "id", "DzHVBMqWtE");
        setLongField(term7523, term7523.getClass(), "seconds", 1804998087L);
        setIntField(term7523, term7523.getClass(), "nanos", 131000000);
        setField(term7510, term7510.getClass(), "expiryDate", term7523);
        setField(term7510, term7510.getClass(), "token", "THZSpzBRYP");
        setField(term7510, term7510.getClass(), "browser", "ZfBIVGBQOE");
        setField(term7510, term7510.getClass(), "operatingSystem", "QSrDQfEsTR");
        setField(term7510, term7510.getClass(), "ipAddress", "PsqusYmejD");
        setIntField(term7575, term7575.getClass(), "year", 2020);
        setShortField(term7575, term7575.getClass(), "month", (short) 5);
        setShortField(term7575, term7575.getClass(), "day", (short) 18);
        setField(term7574, term7574.getClass(), "date", term7575);
        setByteField(term7579, term7579.getClass(), "hour", (byte) 5);
        setByteField(term7579, term7579.getClass(), "minute", (byte) 46);
        setByteField(term7579, term7579.getClass(), "second", (byte) 13);
        setIntField(term7579, term7579.getClass(), "nano", 45893173);
        setField(term7574, term7574.getClass(), "time", term7579);
        setField(term7510, term7510.getClass(), "createdAt", term7574);
        setIntField(term7585, term7585.getClass(), "year", 2017);
        setShortField(term7585, term7585.getClass(), "month", (short) 4);
        setShortField(term7585, term7585.getClass(), "day", (short) 3);
        setField(term7584, term7584.getClass(), "date", term7585);
        setByteField(term7589, term7589.getClass(), "hour", (byte) 6);
        setByteField(term7589, term7589.getClass(), "minute", (byte) 51);
        setByteField(term7589, term7589.getClass(), "second", (byte) 10);
        setIntField(term7589, term7589.getClass(), "nano", 316377166);
        setField(term7584, term7584.getClass(), "time", term7589);
        setField(term7510, term7510.getClass(), "updatedAt", term7584);
        term7594 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term7594, term7594.getClass(), "seconds", 1538078916L);
        setIntField(term7594, term7594.getClass(), "nanos", 394000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term7594;
        callMethod(klass, "setExpiryDate", argTypes, term7510, args);
    }

};


