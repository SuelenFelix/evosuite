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

public class RouteLogger_RouteStats_getCount_19729837073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26256;

    public RouteLogger_RouteStats_getCount_19729837073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26256 = newInstance(Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats"));
        Object term26269 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term26271 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term26256, term26256.getClass(), "key", "aUqkaiSINd");
        setLongField(term26269, term26269.getClass(), "value", 7411271909051562686L);
        setField(term26256, term26256.getClass(), "total", term26269);
        setLongField(term26271, term26271.getClass(), "value", 4872422362414183754L);
        setField(term26256, term26256.getClass(), "count", term26271);
        setDoubleField(term26256, term26256.getClass(), "averageRT", 0.5523635872663106);
        setLongField(term26256, term26256.getClass(), "minTime", 5270370404989704783L);
        setLongField(term26256, term26256.getClass(), "maxTime", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteLogger$RouteStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCount", argTypes, term26256, args);
    }

};


