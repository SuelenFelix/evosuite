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

public class ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_equals_1293296884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192;
     Object term227;

    public ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_equals_1293296884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig"));
        Object term217 = newInstance(Class.forName("java.util.Properties"));
        Object term218 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term192, term192.getClass(), "whiteListPrefix", "SzjVpOQTyS");
        setField(term192, term192.getClass(), "errorCodePrefix", "MjGYSRKTNF");
        setField(term217, term217.getClass(), "defaults", null);
        setField(term218, term218.getClass(), "table", null);
        setField(term218, term218.getClass(), "nextTable", null);
        setLongField(term218, term218.getClass(), "baseCount", 0L);
        setIntField(term218, term218.getClass(), "sizeCtl", 16);
        setIntField(term218, term218.getClass(), "transferIndex", 0);
        setIntField(term218, term218.getClass(), "cellsBusy", 0);
        setField(term218, term218.getClass(), "counterCells", null);
        setField(term218, term218.getClass(), "keySet", null);
        setField(term218, term218.getClass(), "values", null);
        setField(term218, term218.getClass(), "entrySet", null);
        setField(term218, term218.getClass(), "keySet", null);
        setField(term218, term218.getClass(), "values", null);
        setField(term217, term217.getClass(), "map", term218);
        setField(term217, term217.getClass(), "table", null);
        setIntField(term217, term217.getClass(), "count", 0);
        setIntField(term217, term217.getClass(), "threshold", 0);
        setFloatField(term217, term217.getClass(), "loadFactor", 0.0F);
        setIntField(term217, term217.getClass(), "modCount", 0);
        setField(term217, term217.getClass(), "keySet", null);
        setField(term217, term217.getClass(), "entrySet", null);
        setField(term217, term217.getClass(), "values", null);
        setField(term192, term192.getClass(), "properties", term217);
        term227 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term227;
        callMethod(klass, "equals", argTypes, term192, args);
    }

};


