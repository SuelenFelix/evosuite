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

public class ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_getProperties_20815668703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;

    public ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_getProperties_20815668703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig"));
        Object term162 = newInstance(Class.forName("java.util.Properties"));
        Object term163 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term137, term137.getClass(), "whiteListPrefix", "jJCZpVmanW");
        setField(term137, term137.getClass(), "errorCodePrefix", "EGtDIRbSSb");
        setField(term162, term162.getClass(), "defaults", null);
        setField(term163, term163.getClass(), "table", null);
        setField(term163, term163.getClass(), "nextTable", null);
        setLongField(term163, term163.getClass(), "baseCount", 0L);
        setIntField(term163, term163.getClass(), "sizeCtl", 16);
        setIntField(term163, term163.getClass(), "transferIndex", 0);
        setIntField(term163, term163.getClass(), "cellsBusy", 0);
        setField(term163, term163.getClass(), "counterCells", null);
        setField(term163, term163.getClass(), "keySet", null);
        setField(term163, term163.getClass(), "values", null);
        setField(term163, term163.getClass(), "entrySet", null);
        setField(term163, term163.getClass(), "keySet", null);
        setField(term163, term163.getClass(), "values", null);
        setField(term162, term162.getClass(), "map", term163);
        setField(term162, term162.getClass(), "table", null);
        setIntField(term162, term162.getClass(), "count", 0);
        setIntField(term162, term162.getClass(), "threshold", 0);
        setFloatField(term162, term162.getClass(), "loadFactor", 0.0F);
        setIntField(term162, term162.getClass(), "modCount", 0);
        setField(term162, term162.getClass(), "keySet", null);
        setField(term162, term162.getClass(), "entrySet", null);
        setField(term162, term162.getClass(), "values", null);
        setField(term137, term137.getClass(), "properties", term162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProperties", argTypes, term137, args);
    }

};


