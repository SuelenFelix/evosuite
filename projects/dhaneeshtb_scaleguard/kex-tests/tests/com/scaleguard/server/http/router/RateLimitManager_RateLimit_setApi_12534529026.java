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

public class RateLimitManager_RateLimit_setApi_12534529026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26097;

    public RateLimitManager_RateLimit_setApi_12534529026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26097 = newInstance(Class.forName("com.scaleguard.server.http.router.RateLimitManager$RateLimit"));
        Object term26110 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term26097, term26097.getClass(), "minuteKey", "lvnwgMKxXk");
        setIntField(term26110, term26110.getClass(), "value", 0);
        setField(term26097, term26097.getClass(), "count", term26110);
        setField(term26097, term26097.getClass(), "api", "FiSaNxpGPk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RateLimitManager$RateLimit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QMzQRRhneO";
        callMethod(klass, "setApi", argTypes, term26097, args);
    }

};


