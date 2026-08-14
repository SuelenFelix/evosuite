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

public class HttpRowDataWrapper_getHttpHeadersMap_11170741765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7847;

    public HttpRowDataWrapper_getHttpHeadersMap_11170741765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7860 = new HashMap();
        Integer term7865 = new Integer(597278769);
        Class<? extends Object> term7900 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term7899 = ((Class) term7900).getDeclaredField((String) "IGNORE_STATUS_CODE");
        ((Field) term7899).setAccessible(true);
        Object enum16 = ((Field) term7899).get((Object) null);
        term7847 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper"));
        setField(term7847, term7847.getClass(), "data", null);
        setField(term7847, term7847.getClass(), "errorMessage", "wGmYcqUkgE");
        setField(term7847, term7847.getClass(), "httpHeadersMap", term7860);
        setField(term7847, term7847.getClass(), "httpStatusCode", term7865);
        setField(term7847, term7847.getClass(), "httpCompletionState", enum16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHttpHeadersMap", argTypes, term7847, args);
    }

};


