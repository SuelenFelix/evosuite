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

public class RateLimitManager_RateLimit_setCount_5308990111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26169;

    public RateLimitManager_RateLimit_setCount_5308990111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26169 = newInstance(Class.forName("com.scaleguard.server.http.router.RateLimitManager$RateLimit"));
        setField(term26169, term26169.getClass(), "minuteKey", null);
        setField(term26169, term26169.getClass(), "count", null);
        setField(term26169, term26169.getClass(), "api", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RateLimitManager$RateLimit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.atomic.AtomicInteger");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCount", argTypes, term26169, args);
    }

};


