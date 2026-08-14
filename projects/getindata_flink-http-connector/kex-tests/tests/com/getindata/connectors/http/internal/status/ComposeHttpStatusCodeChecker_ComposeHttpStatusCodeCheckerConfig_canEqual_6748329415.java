package com.getindata.connectors.http.internal.status;

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
import static com.getindata.connectors.http.internal.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_canEqual_6748329415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248;
     Object term283;

    public ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_canEqual_6748329415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig"));
        Object term273 = newInstance(Class.forName("java.util.Properties"));
        Object term274 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term248, term248.getClass(), "whiteListPrefix", "hRNSzYYIrc");
        setField(term248, term248.getClass(), "errorCodePrefix", "RMFIsYGgne");
        setField(term273, term273.getClass(), "defaults", null);
        setField(term274, term274.getClass(), "table", null);
        setField(term274, term274.getClass(), "nextTable", null);
        setLongField(term274, term274.getClass(), "baseCount", 0L);
        setIntField(term274, term274.getClass(), "sizeCtl", 16);
        setIntField(term274, term274.getClass(), "transferIndex", 0);
        setIntField(term274, term274.getClass(), "cellsBusy", 0);
        setField(term274, term274.getClass(), "counterCells", null);
        setField(term274, term274.getClass(), "keySet", null);
        setField(term274, term274.getClass(), "values", null);
        setField(term274, term274.getClass(), "entrySet", null);
        setField(term274, term274.getClass(), "keySet", null);
        setField(term274, term274.getClass(), "values", null);
        setField(term273, term273.getClass(), "map", term274);
        setField(term273, term273.getClass(), "table", null);
        setIntField(term273, term273.getClass(), "count", 0);
        setIntField(term273, term273.getClass(), "threshold", 0);
        setFloatField(term273, term273.getClass(), "loadFactor", 0.0F);
        setIntField(term273, term273.getClass(), "modCount", 0);
        setField(term273, term273.getClass(), "keySet", null);
        setField(term273, term273.getClass(), "entrySet", null);
        setField(term273, term273.getClass(), "values", null);
        setField(term248, term248.getClass(), "properties", term273);
        term283 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term283;
        callMethod(klass, "canEqual", argTypes, term248, args);
    }

};


