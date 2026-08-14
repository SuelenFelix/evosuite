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

public class RouteLogger_RouteStats_setCount_122718258318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26630;

    public RouteLogger_RouteStats_setCount_122718258318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26630 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        setField(term26630, term26630.getClass(), "key", null);
        setField(term26630, term26630.getClass(), "total", null);
        setField(term26630, term26630.getClass(), "count", null);
        setDoubleField(term26630, term26630.getClass(), "averageRT", 0.0);
        setLongField(term26630, term26630.getClass(), "minTime", 0L);
        setLongField(term26630, term26630.getClass(), "maxTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.atomic.AtomicLong");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCount", argTypes, term26630, args);
    }

};


