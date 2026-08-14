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
import java.lang.Double;

public class RouteLogger_RouteStats_setAverageRT_23060051722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26646;
     Object term26650;

    public RouteLogger_RouteStats_setAverageRT_23060051722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26646 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        setField(term26646, term26646.getClass(), "key", null);
        setField(term26646, term26646.getClass(), "total", null);
        setField(term26646, term26646.getClass(), "count", null);
        setDoubleField(term26646, term26646.getClass(), "averageRT", 0.0);
        setLongField(term26646, term26646.getClass(), "minTime", 0L);
        setLongField(term26646, term26646.getClass(), "maxTime", 0L);
        term26650 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term26650;
        callMethod(klass, "setAverageRT", argTypes, term26646, args);
    }

};


