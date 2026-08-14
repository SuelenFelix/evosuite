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

public class RouteLogger_RouteStats_getTotal_2283584901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26194;

    public RouteLogger_RouteStats_getTotal_2283584901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26194 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        Object term26207 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term26209 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term26194, term26194.getClass(), "key", "BFwtIJkozx");
        setLongField(term26207, term26207.getClass(), "value", 2442117782898005296L);
        setField(term26194, term26194.getClass(), "total", term26207);
        setLongField(term26209, term26209.getClass(), "value", 6375119433582206027L);
        setField(term26194, term26194.getClass(), "count", term26209);
        setDoubleField(term26194, term26194.getClass(), "averageRT", 0.13238746331190498);
        setLongField(term26194, term26194.getClass(), "minTime", 2442117782898005296L);
        setLongField(term26194, term26194.getClass(), "maxTime", 6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotal", argTypes, term26194, args);
    }

};


