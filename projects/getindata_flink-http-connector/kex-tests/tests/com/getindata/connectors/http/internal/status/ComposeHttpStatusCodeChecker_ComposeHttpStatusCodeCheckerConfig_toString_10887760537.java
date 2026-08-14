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

public class ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_toString_10887760537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359;

    public ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_toString_10887760537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig"));
        Object term384 = newInstance(Class.forName("java.util.Properties"));
        Object term385 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term359, term359.getClass(), "whiteListPrefix", "MxlszYVzRf");
        setField(term359, term359.getClass(), "errorCodePrefix", "LQFpaHEwXR");
        setField(term384, term384.getClass(), "defaults", null);
        setField(term385, term385.getClass(), "table", null);
        setField(term385, term385.getClass(), "nextTable", null);
        setLongField(term385, term385.getClass(), "baseCount", 0L);
        setIntField(term385, term385.getClass(), "sizeCtl", 16);
        setIntField(term385, term385.getClass(), "transferIndex", 0);
        setIntField(term385, term385.getClass(), "cellsBusy", 0);
        setField(term385, term385.getClass(), "counterCells", null);
        setField(term385, term385.getClass(), "keySet", null);
        setField(term385, term385.getClass(), "values", null);
        setField(term385, term385.getClass(), "entrySet", null);
        setField(term385, term385.getClass(), "keySet", null);
        setField(term385, term385.getClass(), "values", null);
        setField(term384, term384.getClass(), "map", term385);
        setField(term384, term384.getClass(), "table", null);
        setIntField(term384, term384.getClass(), "count", 0);
        setIntField(term384, term384.getClass(), "threshold", 0);
        setFloatField(term384, term384.getClass(), "loadFactor", 0.0F);
        setIntField(term384, term384.getClass(), "modCount", 0);
        setField(term384, term384.getClass(), "keySet", null);
        setField(term384, term384.getClass(), "entrySet", null);
        setField(term384, term384.getClass(), "values", null);
        setField(term359, term359.getClass(), "properties", term384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term359, args);
    }

};


