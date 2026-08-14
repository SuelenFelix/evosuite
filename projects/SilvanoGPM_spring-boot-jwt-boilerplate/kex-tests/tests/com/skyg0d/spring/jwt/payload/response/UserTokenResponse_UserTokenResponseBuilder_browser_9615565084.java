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

public class UserTokenResponse_UserTokenResponseBuilder_browser_9615565084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450;

    public UserTokenResponse_UserTokenResponseBuilder_browser_9615565084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term450 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder"));
        Object term463 = newInstance(Class.forName("java.time.Instant"));
        Object term514 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term515 = newInstance(Class.forName("java.time.LocalDate"));
        Object term519 = newInstance(Class.forName("java.time.LocalTime"));
        Object term524 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term525 = newInstance(Class.forName("java.time.LocalDate"));
        Object term529 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term450, term450.getClass(), "id", "tbcdzjIfER");
        setLongField(term463, term463.getClass(), "seconds", 1442639565L);
        setIntField(term463, term463.getClass(), "nanos", 302000000);
        setField(term450, term450.getClass(), "expiryDate", term463);
        setField(term450, term450.getClass(), "token", "HyxfbSQYBe");
        setField(term450, term450.getClass(), "browser", "pCTimMblYc");
        setField(term450, term450.getClass(), "operatingSystem", "hNxWaHcfhY");
        setField(term450, term450.getClass(), "ipAddress", "RkybSrpybU");
        setIntField(term515, term515.getClass(), "year", 2025);
        setShortField(term515, term515.getClass(), "month", (short) 4);
        setShortField(term515, term515.getClass(), "day", (short) 24);
        setField(term514, term514.getClass(), "date", term515);
        setByteField(term519, term519.getClass(), "hour", (byte) 18);
        setByteField(term519, term519.getClass(), "minute", (byte) 11);
        setByteField(term519, term519.getClass(), "second", (byte) 40);
        setIntField(term519, term519.getClass(), "nano", 137454929);
        setField(term514, term514.getClass(), "time", term519);
        setField(term450, term450.getClass(), "createdAt", term514);
        setIntField(term525, term525.getClass(), "year", 2024);
        setShortField(term525, term525.getClass(), "month", (short) 1);
        setShortField(term525, term525.getClass(), "day", (short) 24);
        setField(term524, term524.getClass(), "date", term525);
        setByteField(term529, term529.getClass(), "hour", (byte) 20);
        setByteField(term529, term529.getClass(), "minute", (byte) 28);
        setByteField(term529, term529.getClass(), "second", (byte) 39);
        setIntField(term529, term529.getClass(), "nano", 952728177);
        setField(term524, term524.getClass(), "time", term529);
        setField(term450, term450.getClass(), "updatedAt", term524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "browser", argTypes, term450, args);
    }

};


