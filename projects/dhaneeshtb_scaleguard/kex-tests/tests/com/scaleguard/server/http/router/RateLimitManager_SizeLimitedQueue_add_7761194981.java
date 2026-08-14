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

public class RateLimitManager_SizeLimitedQueue_add_7761194981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40131;

    public RateLimitManager_SizeLimitedQueue_add_7761194981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40131 = newInstance(Class.forName("com.scaleguard.server.http.router.RateLimitManager$SizeLimitedQueue"));
        setIntField(term40131, term40131.getClass(), "SizeLimitOfQueue", 0);
        setIntField(term40131, term40131.getClass(), "size", 0);
        setField(term40131, term40131.getClass(), "first", null);
        setField(term40131, term40131.getClass(), "last", null);
        setIntField(term40131, term40131.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RateLimitManager$SizeLimitedQueue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term40131, args);
    }

};


