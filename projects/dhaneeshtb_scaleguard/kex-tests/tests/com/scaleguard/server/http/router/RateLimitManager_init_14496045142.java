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
import java.lang.Integer;
import java.lang.Object;

public class RateLimitManager_init_14496045142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21900;
     Object term21902;

    public RateLimitManager_init_14496045142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21900 = new Integer(-1239406390);
        term21902 = newInstance(Class.forName("com.scaleguard.server.http.router.IPBlockingManager"));
        Object term21903 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term21903, term21903.getClass(), "table", null);
        setField(term21903, term21903.getClass(), "nextTable", null);
        setLongField(term21903, term21903.getClass(), "baseCount", 0L);
        setIntField(term21903, term21903.getClass(), "sizeCtl", 0);
        setIntField(term21903, term21903.getClass(), "transferIndex", 0);
        setIntField(term21903, term21903.getClass(), "cellsBusy", 0);
        setField(term21903, term21903.getClass(), "counterCells", null);
        setField(term21903, term21903.getClass(), "keySet", null);
        setField(term21903, term21903.getClass(), "values", null);
        setField(term21903, term21903.getClass(), "entrySet", null);
        setField(term21903, term21903.getClass(), "keySet", null);
        setField(term21903, term21903.getClass(), "values", null);
        setField(term21902, term21902.getClass(), "rateLimitMap", term21903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RateLimitManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.scaleguard.server.http.router.IPBlockingManager");
        Object[] args = new Object[2];
        args[0] = term21900;
        args[1] = term21902;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


