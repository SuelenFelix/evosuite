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
import java.util.HashMap;

public class ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_ComposeHttpStatusCodeCheckerConfigBuilder_properties_13680370573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373;
     Object term3408;

    public ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_ComposeHttpStatusCodeCheckerConfigBuilder_properties_13680370573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig$ComposeHttpStatusCodeCheckerConfigBuilder"));
        Object term3398 = newInstance(Class.forName("java.util.Properties"));
        Object term3399 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3373, term3373.getClass(), "whiteListPrefix", "OWDIEULEFu");
        setField(term3373, term3373.getClass(), "errorCodePrefix", "dWRymuLBtr");
        setField(term3398, term3398.getClass(), "defaults", null);
        setField(term3399, term3399.getClass(), "table", null);
        setField(term3399, term3399.getClass(), "nextTable", null);
        setLongField(term3399, term3399.getClass(), "baseCount", 0L);
        setIntField(term3399, term3399.getClass(), "sizeCtl", 16);
        setIntField(term3399, term3399.getClass(), "transferIndex", 0);
        setIntField(term3399, term3399.getClass(), "cellsBusy", 0);
        setField(term3399, term3399.getClass(), "counterCells", null);
        setField(term3399, term3399.getClass(), "keySet", null);
        setField(term3399, term3399.getClass(), "values", null);
        setField(term3399, term3399.getClass(), "entrySet", null);
        setField(term3399, term3399.getClass(), "keySet", null);
        setField(term3399, term3399.getClass(), "values", null);
        setField(term3398, term3398.getClass(), "map", term3399);
        setField(term3398, term3398.getClass(), "table", null);
        setIntField(term3398, term3398.getClass(), "count", 0);
        setIntField(term3398, term3398.getClass(), "threshold", 0);
        setFloatField(term3398, term3398.getClass(), "loadFactor", 0.0F);
        setIntField(term3398, term3398.getClass(), "modCount", 0);
        setField(term3398, term3398.getClass(), "keySet", null);
        setField(term3398, term3398.getClass(), "entrySet", null);
        setField(term3398, term3398.getClass(), "values", null);
        setField(term3373, term3373.getClass(), "properties", term3398);
        term3408 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig$ComposeHttpStatusCodeCheckerConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Properties");
        Object[] args = new Object[1];
        args[0] = term3408;
        callMethod(klass, "properties", argTypes, term3373, args);
    }

};


