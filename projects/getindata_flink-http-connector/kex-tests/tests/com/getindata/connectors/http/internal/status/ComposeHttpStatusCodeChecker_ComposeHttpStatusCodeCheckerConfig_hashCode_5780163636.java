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

public class ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_hashCode_5780163636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304;

    public ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_hashCode_5780163636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig"));
        Object term329 = newInstance(Class.forName("java.util.Properties"));
        Object term330 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term304, term304.getClass(), "whiteListPrefix", "NRdvgJlhkX");
        setField(term304, term304.getClass(), "errorCodePrefix", "uuaPigETmJ");
        setField(term329, term329.getClass(), "defaults", null);
        setField(term330, term330.getClass(), "table", null);
        setField(term330, term330.getClass(), "nextTable", null);
        setLongField(term330, term330.getClass(), "baseCount", 0L);
        setIntField(term330, term330.getClass(), "sizeCtl", 16);
        setIntField(term330, term330.getClass(), "transferIndex", 0);
        setIntField(term330, term330.getClass(), "cellsBusy", 0);
        setField(term330, term330.getClass(), "counterCells", null);
        setField(term330, term330.getClass(), "keySet", null);
        setField(term330, term330.getClass(), "values", null);
        setField(term330, term330.getClass(), "entrySet", null);
        setField(term330, term330.getClass(), "keySet", null);
        setField(term330, term330.getClass(), "values", null);
        setField(term329, term329.getClass(), "map", term330);
        setField(term329, term329.getClass(), "table", null);
        setIntField(term329, term329.getClass(), "count", 0);
        setIntField(term329, term329.getClass(), "threshold", 0);
        setFloatField(term329, term329.getClass(), "loadFactor", 0.0F);
        setIntField(term329, term329.getClass(), "modCount", 0);
        setField(term329, term329.getClass(), "keySet", null);
        setField(term329, term329.getClass(), "entrySet", null);
        setField(term329, term329.getClass(), "values", null);
        setField(term304, term304.getClass(), "properties", term329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term304, args);
    }

};


