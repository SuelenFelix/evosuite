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

public class HttpRowDataWrapper_hashCode_156491701310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10193;

    public HttpRowDataWrapper_hashCode_156491701310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10206 = new HashMap();
        Integer term10211 = new Integer(-655067527);
        Class<? extends Object> term10246 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term10245 = ((Class) term10246).getDeclaredField((String) "IGNORE_STATUS_CODE");
        ((Field) term10245).setAccessible(true);
        Object enum21 = ((Field) term10245).get((Object) null);
        term10193 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper"));
        setField(term10193, term10193.getClass(), "data", null);
        setField(term10193, term10193.getClass(), "errorMessage", "cAPeiZHKGJ");
        setField(term10193, term10193.getClass(), "httpHeadersMap", term10206);
        setField(term10193, term10193.getClass(), "httpStatusCode", term10211);
        setField(term10193, term10193.getClass(), "httpCompletionState", enum21);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10193, args);
    }

};


