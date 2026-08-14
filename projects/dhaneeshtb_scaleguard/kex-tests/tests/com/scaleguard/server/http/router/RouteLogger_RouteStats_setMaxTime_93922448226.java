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
import java.lang.Long;

public class RouteLogger_RouteStats_setMaxTime_93922448226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26666;
     Object term26670;

    public RouteLogger_RouteStats_setMaxTime_93922448226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26666 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        setField(term26666, term26666.getClass(), "key", null);
        setField(term26666, term26666.getClass(), "total", null);
        setField(term26666, term26666.getClass(), "count", null);
        setDoubleField(term26666, term26666.getClass(), "averageRT", 0.0);
        setLongField(term26666, term26666.getClass(), "minTime", 0L);
        setLongField(term26666, term26666.getClass(), "maxTime", 0L);
        term26670 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term26670;
        callMethod(klass, "setMaxTime", argTypes, term26666, args);
    }

};


