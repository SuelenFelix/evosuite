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

public class RouteLogger_RouteStats_setKey_6755052097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26378;

    public RouteLogger_RouteStats_setKey_6755052097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26378 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        Object term26391 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term26393 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term26378, term26378.getClass(), "key", "vCUIiQSkZO");
        setLongField(term26391, term26391.getClass(), "value", -5476826692763582090L);
        setField(term26378, term26378.getClass(), "total", term26391);
        setLongField(term26393, term26393.getClass(), "value", -872011222785455006L);
        setField(term26378, term26378.getClass(), "count", term26393);
        setDoubleField(term26378, term26378.getClass(), "averageRT", 0.2641345529914265);
        setLongField(term26378, term26378.getClass(), "minTime", -4325723315152823407L);
        setLongField(term26378, term26378.getClass(), "maxTime", 2535595959091595249L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oAVrawlRsA";
        callMethod(klass, "setKey", argTypes, term26378, args);
    }

};


