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

public class RouteLogger_RouteStats_addRT_122639781013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26586;
     Object term26606;

    public RouteLogger_RouteStats_addRT_122639781013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26586 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        Object term26599 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term26601 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term26586, term26586.getClass(), "key", "LmtyEJAnHW");
        setLongField(term26599, term26599.getClass(), "value", -7672528020740371001L);
        setField(term26586, term26586.getClass(), "total", term26599);
        setLongField(term26601, term26601.getClass(), "value", -4502405999831680926L);
        setField(term26586, term26586.getClass(), "count", term26601);
        setDoubleField(term26586, term26586.getClass(), "averageRT", 0.1374549299694151);
        setLongField(term26586, term26586.getClass(), "minTime", -7672528020740371001L);
        setLongField(term26586, term26586.getClass(), "maxTime", -4502405999831680926L);
        term26606 = new Long(1967728129628047933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term26606;
        callMethod(klass, "addRT", argTypes, term26586, args);
    }

};


