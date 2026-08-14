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

public class RateLimitManager_RateLimit_setMinuteKey_11175225392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25885;

    public RateLimitManager_RateLimit_setMinuteKey_11175225392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25885 = newInstance(Class.forName("com.scaleguard.server.http.router.RateLimitManager$RateLimit"));
        Object term25898 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term25885, term25885.getClass(), "minuteKey", "AOwXDxldzy");
        setIntField(term25898, term25898.getClass(), "value", 0);
        setField(term25885, term25885.getClass(), "count", term25898);
        setField(term25885, term25885.getClass(), "api", "oPjvcZQHAL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RateLimitManager$RateLimit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uCNCXXRNau";
        callMethod(klass, "setMinuteKey", argTypes, term25885, args);
    }

};


