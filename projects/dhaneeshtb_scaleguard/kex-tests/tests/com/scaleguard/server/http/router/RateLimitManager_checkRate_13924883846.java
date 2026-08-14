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

public class RateLimitManager_checkRate_13924883846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21969;

    public RateLimitManager_checkRate_13924883846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21969 = newInstance(Class.forName("com.scaleguard.server.http.router.RateLimitManager"));
        Object term21970 = newInstance(Class.forName("com.scaleguard.server.http.router.IPBlockingManager"));
        Object term21971 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term21976 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term21971, term21971.getClass(), "table", null);
        setField(term21971, term21971.getClass(), "nextTable", null);
        setLongField(term21971, term21971.getClass(), "baseCount", 0L);
        setIntField(term21971, term21971.getClass(), "sizeCtl", 0);
        setIntField(term21971, term21971.getClass(), "transferIndex", 0);
        setIntField(term21971, term21971.getClass(), "cellsBusy", 0);
        setField(term21971, term21971.getClass(), "counterCells", null);
        setField(term21971, term21971.getClass(), "keySet", null);
        setField(term21971, term21971.getClass(), "values", null);
        setField(term21971, term21971.getClass(), "entrySet", null);
        setField(term21971, term21971.getClass(), "keySet", null);
        setField(term21971, term21971.getClass(), "values", null);
        setField(term21970, term21970.getClass(), "rateLimitMap", term21971);
        setField(term21969, term21969.getClass(), "ibm", term21970);
        setField(term21976, term21976.getClass(), "table", null);
        setField(term21976, term21976.getClass(), "nextTable", null);
        setLongField(term21976, term21976.getClass(), "baseCount", 0L);
        setIntField(term21976, term21976.getClass(), "sizeCtl", 0);
        setIntField(term21976, term21976.getClass(), "transferIndex", 0);
        setIntField(term21976, term21976.getClass(), "cellsBusy", 0);
        setField(term21976, term21976.getClass(), "counterCells", null);
        setField(term21976, term21976.getClass(), "keySet", null);
        setField(term21976, term21976.getClass(), "values", null);
        setField(term21976, term21976.getClass(), "entrySet", null);
        setField(term21976, term21976.getClass(), "keySet", null);
        setField(term21976, term21976.getClass(), "values", null);
        setField(term21969, term21969.getClass(), "rateLimitMap", term21976);
        setIntField(term21969, term21969.getClass(), "allowedRate", 1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RateLimitManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.scaleguard.server.http.router.RouteTarget");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "vdErTHSsJu";
        callMethod(klass, "checkRate", argTypes, term21969, args);
    }

};


