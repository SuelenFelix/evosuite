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

public class UserTokenResponse_UserTokenResponseBuilder_token_11304349553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294;

    public UserTokenResponse_UserTokenResponseBuilder_token_11304349553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder"));
        Object term307 = newInstance(Class.forName("java.time.Instant"));
        Object term358 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term359 = newInstance(Class.forName("java.time.LocalDate"));
        Object term363 = newInstance(Class.forName("java.time.LocalTime"));
        Object term368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term373 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term294, term294.getClass(), "id", "uuaPigETmJ");
        setLongField(term307, term307.getClass(), "seconds", 1606045635L);
        setIntField(term307, term307.getClass(), "nanos", 837000000);
        setField(term294, term294.getClass(), "expiryDate", term307);
        setField(term294, term294.getClass(), "token", "MxlszYVzRf");
        setField(term294, term294.getClass(), "browser", "LQFpaHEwXR");
        setField(term294, term294.getClass(), "operatingSystem", "oVcInYnLWB");
        setField(term294, term294.getClass(), "ipAddress", "aJlieCFVtF");
        setIntField(term359, term359.getClass(), "year", 2022);
        setShortField(term359, term359.getClass(), "month", (short) 2);
        setShortField(term359, term359.getClass(), "day", (short) 26);
        setField(term358, term358.getClass(), "date", term359);
        setByteField(term363, term363.getClass(), "hour", (byte) 11);
        setByteField(term363, term363.getClass(), "minute", (byte) 42);
        setByteField(term363, term363.getClass(), "second", (byte) 15);
        setIntField(term363, term363.getClass(), "nano", 377731937);
        setField(term358, term358.getClass(), "time", term363);
        setField(term294, term294.getClass(), "createdAt", term358);
        setIntField(term369, term369.getClass(), "year", 2026);
        setShortField(term369, term369.getClass(), "month", (short) 12);
        setShortField(term369, term369.getClass(), "day", (short) 14);
        setField(term368, term368.getClass(), "date", term369);
        setByteField(term373, term373.getClass(), "hour", (byte) 16);
        setByteField(term373, term373.getClass(), "minute", (byte) 34);
        setByteField(term373, term373.getClass(), "second", (byte) 9);
        setIntField(term373, term373.getClass(), "nano", 518326996);
        setField(term368, term368.getClass(), "time", term373);
        setField(term294, term294.getClass(), "updatedAt", term368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZiaGIbnzTs";
        callMethod(klass, "token", argTypes, term294, args);
    }

};


