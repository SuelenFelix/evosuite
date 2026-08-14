package com.getindata.connectors.http.internal.table.lookup;

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
import static com.getindata.connectors.http.internal.table.lookup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class HttpRowDataWrapper_equals_11162303388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9207;
     Object term9249;

    public HttpRowDataWrapper_equals_11162303388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9220 = new HashMap();
        Integer term9225 = new Integer(1622346318);
        Class<? extends Object> term9261 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term9260 = ((Class) term9261).getDeclaredField((String) "IGNORE_STATUS_CODE");
        ((Field) term9260).setAccessible(true);
        Object enum19 = ((Field) term9260).get((Object) null);
        term9207 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper"));
        setField(term9207, term9207.getClass(), "data", null);
        setField(term9207, term9207.getClass(), "errorMessage", "jUbSRrkrYZ");
        setField(term9207, term9207.getClass(), "httpHeadersMap", term9220);
        setField(term9207, term9207.getClass(), "httpStatusCode", term9225);
        setField(term9207, term9207.getClass(), "httpCompletionState", enum19);
        term9249 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9249;
        callMethod(klass, "equals", argTypes, term9207, args);
    }

};


