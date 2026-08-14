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

public class RateLimitManager_isBlocked_16500485374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21921;

    public RateLimitManager_isBlocked_16500485374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21921 = newInstance(Class.forName("com.scaleguard.server.http.router.RateLimitManager"));
        Object term21922 = newInstance(Class.forName("com.scaleguard.server.http.router.IPBlockingManager"));
        Object term21923 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term21928 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term21923, term21923.getClass(), "table", null);
        setField(term21923, term21923.getClass(), "nextTable", null);
        setLongField(term21923, term21923.getClass(), "baseCount", 0L);
        setIntField(term21923, term21923.getClass(), "sizeCtl", 0);
        setIntField(term21923, term21923.getClass(), "transferIndex", 0);
        setIntField(term21923, term21923.getClass(), "cellsBusy", 0);
        setField(term21923, term21923.getClass(), "counterCells", null);
        setField(term21923, term21923.getClass(), "keySet", null);
        setField(term21923, term21923.getClass(), "values", null);
        setField(term21923, term21923.getClass(), "entrySet", null);
        setField(term21923, term21923.getClass(), "keySet", null);
        setField(term21923, term21923.getClass(), "values", null);
        setField(term21922, term21922.getClass(), "rateLimitMap", term21923);
        setField(term21921, term21921.getClass(), "ibm", term21922);
        setField(term21928, term21928.getClass(), "table", null);
        setField(term21928, term21928.getClass(), "nextTable", null);
        setLongField(term21928, term21928.getClass(), "baseCount", 0L);
        setIntField(term21928, term21928.getClass(), "sizeCtl", 0);
        setIntField(term21928, term21928.getClass(), "transferIndex", 0);
        setIntField(term21928, term21928.getClass(), "cellsBusy", 0);
        setField(term21928, term21928.getClass(), "counterCells", null);
        setField(term21928, term21928.getClass(), "keySet", null);
        setField(term21928, term21928.getClass(), "values", null);
        setField(term21928, term21928.getClass(), "entrySet", null);
        setField(term21928, term21928.getClass(), "keySet", null);
        setField(term21928, term21928.getClass(), "values", null);
        setField(term21921, term21921.getClass(), "rateLimitMap", term21928);
        setIntField(term21921, term21921.getClass(), "allowedRate", 1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RateLimitManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oLoxfeWIGH";
        callMethod(klass, "isBlocked", argTypes, term21921, args);
    }

};


