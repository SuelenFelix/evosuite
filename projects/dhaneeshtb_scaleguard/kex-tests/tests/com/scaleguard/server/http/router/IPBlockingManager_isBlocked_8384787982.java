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

public class IPBlockingManager_isBlocked_8384787982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40095;

    public IPBlockingManager_isBlocked_8384787982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40095 = newInstance(Class.forName("com.scaleguard.server.http.router.IPBlockingManager"));
        Object term40096 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term40096, term40096.getClass(), "table", null);
        setField(term40096, term40096.getClass(), "nextTable", null);
        setLongField(term40096, term40096.getClass(), "baseCount", 0L);
        setIntField(term40096, term40096.getClass(), "sizeCtl", 0);
        setIntField(term40096, term40096.getClass(), "transferIndex", 0);
        setIntField(term40096, term40096.getClass(), "cellsBusy", 0);
        setField(term40096, term40096.getClass(), "counterCells", null);
        setField(term40096, term40096.getClass(), "keySet", null);
        setField(term40096, term40096.getClass(), "values", null);
        setField(term40096, term40096.getClass(), "entrySet", null);
        setField(term40096, term40096.getClass(), "keySet", null);
        setField(term40096, term40096.getClass(), "values", null);
        setField(term40095, term40095.getClass(), "rateLimitMap", term40096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.IPBlockingManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kMMtGnlzVA";
        callMethod(klass, "isBlocked", argTypes, term40095, args);
    }

};


