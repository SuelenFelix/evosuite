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

public class HttpRowDataWrapper_getErrorMessage_11159650664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7423;

    public HttpRowDataWrapper_getErrorMessage_11159650664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7436 = new HashMap();
        Integer term7441 = new Integer(1585847225);
        Class<? extends Object> term7465 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term7464 = ((Class) term7465).getDeclaredField((String) "SUCCESS");
        ((Field) term7464).setAccessible(true);
        Object enum15 = ((Field) term7464).get((Object) null);
        term7423 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper"));
        setField(term7423, term7423.getClass(), "data", null);
        setField(term7423, term7423.getClass(), "errorMessage", "OWKQODBLzb");
        setField(term7423, term7423.getClass(), "httpHeadersMap", term7436);
        setField(term7423, term7423.getClass(), "httpStatusCode", term7441);
        setField(term7423, term7423.getClass(), "httpCompletionState", enum15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrorMessage", argTypes, term7423, args);
    }

};


