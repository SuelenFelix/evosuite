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

public class RateLimitManager_log_13617135235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21956;

    public RateLimitManager_log_13617135235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21956 = newInstance(Class.forName("com.scaleguard.server.http.router.RateLimitManager"));
        Object term21957 = newInstance(Class.forName("com.scaleguard.server.http.router.IPBlockingManager"));
        Object term21958 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term21963 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term21958, term21958.getClass(), "table", null);
        setField(term21958, term21958.getClass(), "nextTable", null);
        setLongField(term21958, term21958.getClass(), "baseCount", 0L);
        setIntField(term21958, term21958.getClass(), "sizeCtl", 0);
        setIntField(term21958, term21958.getClass(), "transferIndex", 0);
        setIntField(term21958, term21958.getClass(), "cellsBusy", 0);
        setField(term21958, term21958.getClass(), "counterCells", null);
        setField(term21958, term21958.getClass(), "keySet", null);
        setField(term21958, term21958.getClass(), "values", null);
        setField(term21958, term21958.getClass(), "entrySet", null);
        setField(term21958, term21958.getClass(), "keySet", null);
        setField(term21958, term21958.getClass(), "values", null);
        setField(term21957, term21957.getClass(), "rateLimitMap", term21958);
        setField(term21956, term21956.getClass(), "ibm", term21957);
        setField(term21963, term21963.getClass(), "table", null);
        setField(term21963, term21963.getClass(), "nextTable", null);
        setLongField(term21963, term21963.getClass(), "baseCount", 0L);
        setIntField(term21963, term21963.getClass(), "sizeCtl", 0);
        setIntField(term21963, term21963.getClass(), "transferIndex", 0);
        setIntField(term21963, term21963.getClass(), "cellsBusy", 0);
        setField(term21963, term21963.getClass(), "counterCells", null);
        setField(term21963, term21963.getClass(), "keySet", null);
        setField(term21963, term21963.getClass(), "values", null);
        setField(term21963, term21963.getClass(), "entrySet", null);
        setField(term21963, term21963.getClass(), "keySet", null);
        setField(term21963, term21963.getClass(), "values", null);
        setField(term21956, term21956.getClass(), "rateLimitMap", term21963);
        setIntField(term21956, term21956.getClass(), "allowedRate", 1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RateLimitManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.scaleguard.server.http.router.RouteTarget");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "log", argTypes, term21956, args);
    }

};


