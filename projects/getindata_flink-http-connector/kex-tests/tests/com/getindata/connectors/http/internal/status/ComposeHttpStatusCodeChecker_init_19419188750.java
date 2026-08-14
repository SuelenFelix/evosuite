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

public class ComposeHttpStatusCodeChecker_init_19419188750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997;

    public ComposeHttpStatusCodeChecker_init_19419188750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig"));
        Object term1022 = newInstance(Class.forName("java.util.Properties"));
        Object term1023 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term997, term997.getClass(), "whiteListPrefix", "ZiaGIbnzTs");
        setField(term997, term997.getClass(), "errorCodePrefix", "tbcdzjIfER");
        setField(term1022, term1022.getClass(), "defaults", null);
        setField(term1023, term1023.getClass(), "table", null);
        setField(term1023, term1023.getClass(), "nextTable", null);
        setLongField(term1023, term1023.getClass(), "baseCount", 0L);
        setIntField(term1023, term1023.getClass(), "sizeCtl", 16);
        setIntField(term1023, term1023.getClass(), "transferIndex", 0);
        setIntField(term1023, term1023.getClass(), "cellsBusy", 0);
        setField(term1023, term1023.getClass(), "counterCells", null);
        setField(term1023, term1023.getClass(), "keySet", null);
        setField(term1023, term1023.getClass(), "values", null);
        setField(term1023, term1023.getClass(), "entrySet", null);
        setField(term1023, term1023.getClass(), "keySet", null);
        setField(term1023, term1023.getClass(), "values", null);
        setField(term1022, term1022.getClass(), "map", term1023);
        setField(term1022, term1022.getClass(), "table", null);
        setIntField(term1022, term1022.getClass(), "count", 0);
        setIntField(term1022, term1022.getClass(), "threshold", 0);
        setFloatField(term1022, term1022.getClass(), "loadFactor", 0.0F);
        setIntField(term1022, term1022.getClass(), "modCount", 0);
        setField(term1022, term1022.getClass(), "keySet", null);
        setField(term1022, term1022.getClass(), "entrySet", null);
        setField(term1022, term1022.getClass(), "values", null);
        setField(term997, term997.getClass(), "properties", term1022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig");
        Object[] args = new Object[1];
        args[0] = term997;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


