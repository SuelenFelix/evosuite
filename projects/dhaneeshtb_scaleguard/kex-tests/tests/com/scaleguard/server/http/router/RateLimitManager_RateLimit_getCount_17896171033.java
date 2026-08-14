package com.scaleguard.server.http.router;

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
import static com.scaleguard.server.http.router.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RateLimitManager_RateLimit_getCount_17896171033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25954;

    public RateLimitManager_RateLimit_getCount_17896171033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25954 = newInstance(Class.forName("com.scaleguard.server.http.router.RateLimitManager$RateLimit"));
        Object term25967 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term25954, term25954.getClass(), "minuteKey", "eRcAzhxOsA");
        setIntField(term25967, term25967.getClass(), "value", 0);
        setField(term25954, term25954.getClass(), "count", term25967);
        setField(term25954, term25954.getClass(), "api", "uyydsCcltT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RateLimitManager$RateLimit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCount", argTypes, term25954, args);
    }

};


