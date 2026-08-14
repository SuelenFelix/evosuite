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

public class IPBlockingManager_block_13873075691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40067;

    public IPBlockingManager_block_13873075691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40067 = newInstance(Class.forName("com.scaleguard.server.http.router.IPBlockingManager"));
        Object term40068 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term40068, term40068.getClass(), "table", null);
        setField(term40068, term40068.getClass(), "nextTable", null);
        setLongField(term40068, term40068.getClass(), "baseCount", 0L);
        setIntField(term40068, term40068.getClass(), "sizeCtl", 0);
        setIntField(term40068, term40068.getClass(), "transferIndex", 0);
        setIntField(term40068, term40068.getClass(), "cellsBusy", 0);
        setField(term40068, term40068.getClass(), "counterCells", null);
        setField(term40068, term40068.getClass(), "keySet", null);
        setField(term40068, term40068.getClass(), "values", null);
        setField(term40068, term40068.getClass(), "entrySet", null);
        setField(term40068, term40068.getClass(), "keySet", null);
        setField(term40068, term40068.getClass(), "values", null);
        setField(term40067, term40067.getClass(), "rateLimitMap", term40068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.IPBlockingManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvqRPoVTcD";
        callMethod(klass, "block", argTypes, term40067, args);
    }

};


