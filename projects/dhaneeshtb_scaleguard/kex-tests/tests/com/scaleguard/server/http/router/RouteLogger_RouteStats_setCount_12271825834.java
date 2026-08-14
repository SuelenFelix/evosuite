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

public class RouteLogger_RouteStats_setCount_12271825834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26286;
     Object term26306;

    public RouteLogger_RouteStats_setCount_12271825834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26286 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        Object term26299 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term26301 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term26286, term26286.getClass(), "key", "IVtVcsDYoX");
        setLongField(term26299, term26299.getClass(), "value", 6811161968424632369L);
        setField(term26286, term26286.getClass(), "total", term26299);
        setLongField(term26301, term26301.getClass(), "value", -7237588299778557629L);
        setField(term26286, term26286.getClass(), "count", term26301);
        setDoubleField(term26286, term26286.getClass(), "averageRT", 0.544608645520025);
        setLongField(term26286, term26286.getClass(), "minTime", 4872422362414183754L);
        setLongField(term26286, term26286.getClass(), "maxTime", 6811161968424632369L);
        term26306 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term26306, term26306.getClass(), "value", 6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.atomic.AtomicLong");
        Object[] args = new Object[1];
        args[0] = term26306;
        callMethod(klass, "setCount", argTypes, term26286, args);
    }

};


