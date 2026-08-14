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
import java.lang.Long;

public class RouteLogger_RouteStats_setMaxTime_93922448212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26554;
     Object term26574;

    public RouteLogger_RouteStats_setMaxTime_93922448212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26554 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        Object term26567 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term26569 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term26554, term26554.getClass(), "key", "gFWxmEVAsk");
        setLongField(term26567, term26567.getClass(), "value", 2486810210675247493L);
        setField(term26554, term26554.getClass(), "total", term26567);
        setLongField(term26569, term26569.getClass(), "value", 7009926388951271268L);
        setField(term26554, term26554.getClass(), "count", term26569);
        setDoubleField(term26554, term26554.getClass(), "averageRT", 0.7655020693602768);
        setLongField(term26554, term26554.getClass(), "minTime", -4365849114644724155L);
        setLongField(term26554, term26554.getClass(), "maxTime", 2486810210675247493L);
        term26574 = new Long(7009926388951271268L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term26574;
        callMethod(klass, "setMaxTime", argTypes, term26554, args);
    }

};


