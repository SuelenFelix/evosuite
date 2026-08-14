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

public class RouteLogger_RouteStats_getMaxTime_180312197225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26662;

    public RouteLogger_RouteStats_getMaxTime_180312197225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26662 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        setField(term26662, term26662.getClass(), "key", null);
        setField(term26662, term26662.getClass(), "total", null);
        setField(term26662, term26662.getClass(), "count", null);
        setDoubleField(term26662, term26662.getClass(), "averageRT", 0.0);
        setLongField(term26662, term26662.getClass(), "minTime", 0L);
        setLongField(term26662, term26662.getClass(), "maxTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxTime", argTypes, term26662, args);
    }

};


