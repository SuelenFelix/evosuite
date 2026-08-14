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

public class RouteLogger_RouteStats_getKey_20488863936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26348;

    public RouteLogger_RouteStats_getKey_20488863936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26348 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        Object term26361 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term26363 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term26348, term26348.getClass(), "key", "irKkxyVwDT");
        setLongField(term26361, term26361.getClass(), "value", -4325723315152823407L);
        setField(term26348, term26348.getClass(), "total", term26361);
        setLongField(term26363, term26363.getClass(), "value", 2535595959091595249L);
        setField(term26348, term26348.getClass(), "count", term26363);
        setDoubleField(term26348, term26348.getClass(), "averageRT", 0.40176586625454525);
        setLongField(term26348, term26348.getClass(), "minTime", -2813493605142626659L);
        setLongField(term26348, term26348.getClass(), "maxTime", -8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKey", argTypes, term26348, args);
    }

};


