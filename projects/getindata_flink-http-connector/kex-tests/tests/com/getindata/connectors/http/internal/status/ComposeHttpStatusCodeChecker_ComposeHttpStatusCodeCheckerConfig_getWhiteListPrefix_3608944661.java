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

public class ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_getWhiteListPrefix_3608944661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_getWhiteListPrefix_3608944661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig"));
        Object term52 = newInstance(Class.forName("java.util.Properties"));
        Object term53 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term27, term27.getClass(), "whiteListPrefix", "PAEBtnZtTD");
        setField(term27, term27.getClass(), "errorCodePrefix", "sjlJAEtRrb");
        setField(term52, term52.getClass(), "defaults", null);
        setField(term53, term53.getClass(), "table", null);
        setField(term53, term53.getClass(), "nextTable", null);
        setLongField(term53, term53.getClass(), "baseCount", 0L);
        setIntField(term53, term53.getClass(), "sizeCtl", 16);
        setIntField(term53, term53.getClass(), "transferIndex", 0);
        setIntField(term53, term53.getClass(), "cellsBusy", 0);
        setField(term53, term53.getClass(), "counterCells", null);
        setField(term53, term53.getClass(), "keySet", null);
        setField(term53, term53.getClass(), "values", null);
        setField(term53, term53.getClass(), "entrySet", null);
        setField(term53, term53.getClass(), "keySet", null);
        setField(term53, term53.getClass(), "values", null);
        setField(term52, term52.getClass(), "map", term53);
        setField(term52, term52.getClass(), "table", null);
        setIntField(term52, term52.getClass(), "count", 0);
        setIntField(term52, term52.getClass(), "threshold", 0);
        setFloatField(term52, term52.getClass(), "loadFactor", 0.0F);
        setIntField(term52, term52.getClass(), "modCount", 0);
        setField(term52, term52.getClass(), "keySet", null);
        setField(term52, term52.getClass(), "entrySet", null);
        setField(term52, term52.getClass(), "values", null);
        setField(term27, term27.getClass(), "properties", term52);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWhiteListPrefix", argTypes, term27, args);
    }

};


