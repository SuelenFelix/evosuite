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

public class RouteLogger_RouteStats_getMaxTime_180312197211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26524;

    public RouteLogger_RouteStats_getMaxTime_180312197211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26524 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        Object term26537 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term26539 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term26524, term26524.getClass(), "key", "cAfXSAOdaf");
        setLongField(term26537, term26537.getClass(), "value", 8059786003080744426L);
        setField(term26524, term26524.getClass(), "total", term26537);
        setLongField(term26539, term26539.getClass(), "value", -4365849114644724155L);
        setField(term26524, term26524.getClass(), "count", term26539);
        setDoubleField(term26524, term26524.getClass(), "averageRT", 0.5183269973490326);
        setLongField(term26524, term26524.getClass(), "minTime", -2585684163342970173L);
        setLongField(term26524, term26524.getClass(), "maxTime", 8059786003080744426L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxTime", argTypes, term26524, args);
    }

};


