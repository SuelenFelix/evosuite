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

public class ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_ComposeHttpStatusCodeCheckerConfigBuilder_toString_3783664505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3509;

    public ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_ComposeHttpStatusCodeCheckerConfigBuilder_toString_3783664505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3509 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig$ComposeHttpStatusCodeCheckerConfigBuilder"));
        Object term3534 = newInstance(Class.forName("java.util.Properties"));
        Object term3535 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3509, term3509.getClass(), "whiteListPrefix", "kuTXqwMtDB");
        setField(term3509, term3509.getClass(), "errorCodePrefix", "Ghbwtircqb");
        setField(term3534, term3534.getClass(), "defaults", null);
        setField(term3535, term3535.getClass(), "table", null);
        setField(term3535, term3535.getClass(), "nextTable", null);
        setLongField(term3535, term3535.getClass(), "baseCount", 0L);
        setIntField(term3535, term3535.getClass(), "sizeCtl", 16);
        setIntField(term3535, term3535.getClass(), "transferIndex", 0);
        setIntField(term3535, term3535.getClass(), "cellsBusy", 0);
        setField(term3535, term3535.getClass(), "counterCells", null);
        setField(term3535, term3535.getClass(), "keySet", null);
        setField(term3535, term3535.getClass(), "values", null);
        setField(term3535, term3535.getClass(), "entrySet", null);
        setField(term3535, term3535.getClass(), "keySet", null);
        setField(term3535, term3535.getClass(), "values", null);
        setField(term3534, term3534.getClass(), "map", term3535);
        setField(term3534, term3534.getClass(), "table", null);
        setIntField(term3534, term3534.getClass(), "count", 0);
        setIntField(term3534, term3534.getClass(), "threshold", 0);
        setFloatField(term3534, term3534.getClass(), "loadFactor", 0.0F);
        setIntField(term3534, term3534.getClass(), "modCount", 0);
        setField(term3534, term3534.getClass(), "keySet", null);
        setField(term3534, term3534.getClass(), "entrySet", null);
        setField(term3534, term3534.getClass(), "values", null);
        setField(term3509, term3509.getClass(), "properties", term3534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig$ComposeHttpStatusCodeCheckerConfigBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3509, args);
    }

};


