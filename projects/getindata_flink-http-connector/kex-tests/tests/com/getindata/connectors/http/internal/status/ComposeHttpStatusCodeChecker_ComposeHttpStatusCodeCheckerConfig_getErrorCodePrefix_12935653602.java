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

public class ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_getErrorCodePrefix_12935653602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;

    public ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_getErrorCodePrefix_12935653602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig"));
        Object term107 = newInstance(Class.forName("java.util.Properties"));
        Object term108 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term82, term82.getClass(), "whiteListPrefix", "MuLcgQHgqz");
        setField(term82, term82.getClass(), "errorCodePrefix", "xxtlPwDYFs");
        setField(term107, term107.getClass(), "defaults", null);
        setField(term108, term108.getClass(), "table", null);
        setField(term108, term108.getClass(), "nextTable", null);
        setLongField(term108, term108.getClass(), "baseCount", 0L);
        setIntField(term108, term108.getClass(), "sizeCtl", 16);
        setIntField(term108, term108.getClass(), "transferIndex", 0);
        setIntField(term108, term108.getClass(), "cellsBusy", 0);
        setField(term108, term108.getClass(), "counterCells", null);
        setField(term108, term108.getClass(), "keySet", null);
        setField(term108, term108.getClass(), "values", null);
        setField(term108, term108.getClass(), "entrySet", null);
        setField(term108, term108.getClass(), "keySet", null);
        setField(term108, term108.getClass(), "values", null);
        setField(term107, term107.getClass(), "map", term108);
        setField(term107, term107.getClass(), "table", null);
        setIntField(term107, term107.getClass(), "count", 0);
        setIntField(term107, term107.getClass(), "threshold", 0);
        setFloatField(term107, term107.getClass(), "loadFactor", 0.0F);
        setIntField(term107, term107.getClass(), "modCount", 0);
        setField(term107, term107.getClass(), "keySet", null);
        setField(term107, term107.getClass(), "entrySet", null);
        setField(term107, term107.getClass(), "values", null);
        setField(term82, term82.getClass(), "properties", term107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrorCodePrefix", argTypes, term82, args);
    }

};


