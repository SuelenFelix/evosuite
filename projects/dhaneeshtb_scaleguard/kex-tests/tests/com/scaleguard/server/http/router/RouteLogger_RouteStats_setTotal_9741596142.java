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

public class RouteLogger_RouteStats_setTotal_9741596142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26224;
     Object term26244;

    public RouteLogger_RouteStats_setTotal_9741596142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26224 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        Object term26237 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term26239 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term26224, term26224.getClass(), "key", "cIMeTiVeEp");
        setLongField(term26237, term26237.getClass(), "value", -8257434502486459194L);
        setField(term26224, term26224.getClass(), "total", term26237);
        setLongField(term26239, term26239.getClass(), "value", -8400487765614892086L);
        setField(term26224, term26224.getClass(), "count", term26239);
        setDoubleField(term26224, term26224.getClass(), "averageRT", 0.3455959125047594);
        setLongField(term26224, term26224.getClass(), "minTime", -8257434502486459194L);
        setLongField(term26224, term26224.getClass(), "maxTime", -8400487765614892086L);
        term26244 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term26244, term26244.getClass(), "value", 5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.atomic.AtomicLong");
        Object[] args = new Object[1];
        args[0] = term26244;
        callMethod(klass, "setTotal", argTypes, term26224, args);
    }

};


