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

public class ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_ComposeHttpStatusCodeCheckerConfigBuilder_errorCodePrefix_5615538212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3296;

    public ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_ComposeHttpStatusCodeCheckerConfigBuilder_errorCodePrefix_5615538212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3296 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig$ComposeHttpStatusCodeCheckerConfigBuilder"));
        Object term3321 = newInstance(Class.forName("java.util.Properties"));
        Object term3322 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3296, term3296.getClass(), "whiteListPrefix", "OclPbYPkcH");
        setField(term3296, term3296.getClass(), "errorCodePrefix", "IoAlmYsBwc");
        setField(term3321, term3321.getClass(), "defaults", null);
        setField(term3322, term3322.getClass(), "table", null);
        setField(term3322, term3322.getClass(), "nextTable", null);
        setLongField(term3322, term3322.getClass(), "baseCount", 0L);
        setIntField(term3322, term3322.getClass(), "sizeCtl", 16);
        setIntField(term3322, term3322.getClass(), "transferIndex", 0);
        setIntField(term3322, term3322.getClass(), "cellsBusy", 0);
        setField(term3322, term3322.getClass(), "counterCells", null);
        setField(term3322, term3322.getClass(), "keySet", null);
        setField(term3322, term3322.getClass(), "values", null);
        setField(term3322, term3322.getClass(), "entrySet", null);
        setField(term3322, term3322.getClass(), "keySet", null);
        setField(term3322, term3322.getClass(), "values", null);
        setField(term3321, term3321.getClass(), "map", term3322);
        setField(term3321, term3321.getClass(), "table", null);
        setIntField(term3321, term3321.getClass(), "count", 0);
        setIntField(term3321, term3321.getClass(), "threshold", 0);
        setFloatField(term3321, term3321.getClass(), "loadFactor", 0.0F);
        setIntField(term3321, term3321.getClass(), "modCount", 0);
        setField(term3321, term3321.getClass(), "keySet", null);
        setField(term3321, term3321.getClass(), "entrySet", null);
        setField(term3321, term3321.getClass(), "values", null);
        setField(term3296, term3296.getClass(), "properties", term3321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig$ComposeHttpStatusCodeCheckerConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        callMethod(klass, "errorCodePrefix", argTypes, term3296, args);
    }

};


