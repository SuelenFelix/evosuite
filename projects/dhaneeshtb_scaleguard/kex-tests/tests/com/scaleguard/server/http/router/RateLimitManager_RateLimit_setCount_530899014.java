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

public class RateLimitManager_RateLimit_setCount_530899014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26001;
     Object term26028;

    public RateLimitManager_RateLimit_setCount_530899014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26001 = newInstance(Class.forName("com.scaleguard.server.http.router.RateLimitManager$RateLimit"));
        Object term26014 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term26001, term26001.getClass(), "minuteKey", "gRGZBrxxxv");
        setIntField(term26014, term26014.getClass(), "value", 0);
        setField(term26001, term26001.getClass(), "count", term26014);
        setField(term26001, term26001.getClass(), "api", "YvYPXzCrcU");
        term26028 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term26028, term26028.getClass(), "value", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RateLimitManager$RateLimit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.atomic.AtomicInteger");
        Object[] args = new Object[1];
        args[0] = term26028;
        callMethod(klass, "setCount", argTypes, term26001, args);
    }

};


