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

public class RateLimitManager_getIbm_11274611023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21908;

    public RateLimitManager_getIbm_11274611023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21908 = newInstance(Class.forName("com.scaleguard.server.http.router.RateLimitManager"));
        Object term21909 = newInstance(Class.forName("com.scaleguard.server.http.router.IPBlockingManager"));
        Object term21910 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term21915 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term21910, term21910.getClass(), "table", null);
        setField(term21910, term21910.getClass(), "nextTable", null);
        setLongField(term21910, term21910.getClass(), "baseCount", 0L);
        setIntField(term21910, term21910.getClass(), "sizeCtl", 0);
        setIntField(term21910, term21910.getClass(), "transferIndex", 0);
        setIntField(term21910, term21910.getClass(), "cellsBusy", 0);
        setField(term21910, term21910.getClass(), "counterCells", null);
        setField(term21910, term21910.getClass(), "keySet", null);
        setField(term21910, term21910.getClass(), "values", null);
        setField(term21910, term21910.getClass(), "entrySet", null);
        setField(term21910, term21910.getClass(), "keySet", null);
        setField(term21910, term21910.getClass(), "values", null);
        setField(term21909, term21909.getClass(), "rateLimitMap", term21910);
        setField(term21908, term21908.getClass(), "ibm", term21909);
        setField(term21915, term21915.getClass(), "table", null);
        setField(term21915, term21915.getClass(), "nextTable", null);
        setLongField(term21915, term21915.getClass(), "baseCount", 0L);
        setIntField(term21915, term21915.getClass(), "sizeCtl", 0);
        setIntField(term21915, term21915.getClass(), "transferIndex", 0);
        setIntField(term21915, term21915.getClass(), "cellsBusy", 0);
        setField(term21915, term21915.getClass(), "counterCells", null);
        setField(term21915, term21915.getClass(), "keySet", null);
        setField(term21915, term21915.getClass(), "values", null);
        setField(term21915, term21915.getClass(), "entrySet", null);
        setField(term21915, term21915.getClass(), "keySet", null);
        setField(term21915, term21915.getClass(), "values", null);
        setField(term21908, term21908.getClass(), "rateLimitMap", term21915);
        setIntField(term21908, term21908.getClass(), "allowedRate", 1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RateLimitManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIbm", argTypes, term21908, args);
    }

};


