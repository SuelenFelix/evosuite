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

public class RouteLogger_RouteStats_setMinTime_16674590810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26492;
     Object term26512;

    public RouteLogger_RouteStats_setMinTime_16674590810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26492 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        Object term26505 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term26507 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term26492, term26492.getClass(), "key", "UgIqArPAat");
        setLongField(term26505, term26505.getClass(), "value", 8428634514691209827L);
        setField(term26492, term26492.getClass(), "total", term26505);
        setLongField(term26507, term26507.getClass(), "value", -2585684163342970173L);
        setField(term26492, term26492.getClass(), "count", term26507);
        setDoubleField(term26492, term26492.getClass(), "averageRT", 0.8474802076607362);
        setLongField(term26492, term26492.getClass(), "minTime", -6573104506744284592L);
        setLongField(term26492, term26492.getClass(), "maxTime", -4920224193275732920L);
        term26512 = new Long(8428634514691209827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term26512;
        callMethod(klass, "setMinTime", argTypes, term26492, args);
    }

};


