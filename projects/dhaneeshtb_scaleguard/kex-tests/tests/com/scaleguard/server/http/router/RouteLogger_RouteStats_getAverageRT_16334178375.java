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

public class RouteLogger_RouteStats_getAverageRT_16334178375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26318;

    public RouteLogger_RouteStats_getAverageRT_16334178375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26318 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        Object term26331 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term26333 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term26318, term26318.getClass(), "key", "GgQFLRdyzF");
        setLongField(term26331, term26331.getClass(), "value", -2813493605142626659L);
        setField(term26318, term26318.getClass(), "total", term26331);
        setLongField(term26333, term26333.getClass(), "value", -8885298608300233488L);
        setField(term26318, term26318.getClass(), "count", term26333);
        setDoubleField(term26318, term26318.getClass(), "averageRT", 0.28570734989730284);
        setLongField(term26318, term26318.getClass(), "minTime", -7237588299778557629L);
        setLongField(term26318, term26318.getClass(), "maxTime", 6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAverageRT", argTypes, term26318, args);
    }

};


