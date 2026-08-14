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
import java.lang.Double;

public class RouteLogger_RouteStats_setAverageRT_2306005178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26430;
     Object term26450;

    public RouteLogger_RouteStats_setAverageRT_2306005178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26430 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        Object term26443 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term26445 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term26430, term26430.getClass(), "key", "jVdmaiSLFy");
        setLongField(term26443, term26443.getClass(), "value", -316468845751588286L);
        setField(term26430, term26430.getClass(), "total", term26443);
        setLongField(term26445, term26445.getClass(), "value", 5127676408959197577L);
        setField(term26430, term26430.getClass(), "count", term26445);
        setDoubleField(term26430, term26430.getClass(), "averageRT", 0.36923381893433327);
        setLongField(term26430, term26430.getClass(), "minTime", -5476826692763582090L);
        setLongField(term26430, term26430.getClass(), "maxTime", -872011222785455006L);
        term26450 = new Double(0.6076495596892013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term26450;
        callMethod(klass, "setAverageRT", argTypes, term26430, args);
    }

};


