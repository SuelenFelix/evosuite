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

public class HttpRowDataWrapper_getHttpCompletionState_11442671967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8739;

    public HttpRowDataWrapper_getHttpCompletionState_11442671967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8752 = new HashMap();
        Integer term8757 = new Integer(-1456670397);
        Class<? extends Object> term8792 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term8791 = ((Class) term8792).getDeclaredField((String) "IGNORE_STATUS_CODE");
        ((Field) term8791).setAccessible(true);
        Object enum18 = ((Field) term8791).get((Object) null);
        term8739 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper"));
        setField(term8739, term8739.getClass(), "data", null);
        setField(term8739, term8739.getClass(), "errorMessage", "VgZnGoIFwQ");
        setField(term8739, term8739.getClass(), "httpHeadersMap", term8752);
        setField(term8739, term8739.getClass(), "httpStatusCode", term8757);
        setField(term8739, term8739.getClass(), "httpCompletionState", enum18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHttpCompletionState", argTypes, term8739, args);
    }

};


