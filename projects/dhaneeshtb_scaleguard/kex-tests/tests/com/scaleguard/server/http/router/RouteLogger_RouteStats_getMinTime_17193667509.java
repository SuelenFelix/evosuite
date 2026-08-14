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

public class RouteLogger_RouteStats_getMinTime_17193667509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26462;

    public RouteLogger_RouteStats_getMinTime_17193667509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26462 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        Object term26475 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term26477 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term26462, term26462.getClass(), "key", "QySSrixSJt");
        setLongField(term26475, term26475.getClass(), "value", -6573104506744284592L);
        setField(term26462, term26462.getClass(), "total", term26475);
        setLongField(term26477, term26477.getClass(), "value", -4920224193275732920L);
        setField(term26462, term26462.getClass(), "count", term26477);
        setDoubleField(term26462, term26462.getClass(), "averageRT", 0.37773193782763337);
        setLongField(term26462, term26462.getClass(), "minTime", -316468845751588286L);
        setLongField(term26462, term26462.getClass(), "maxTime", 5127676408959197577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinTime", argTypes, term26462, args);
    }

};


