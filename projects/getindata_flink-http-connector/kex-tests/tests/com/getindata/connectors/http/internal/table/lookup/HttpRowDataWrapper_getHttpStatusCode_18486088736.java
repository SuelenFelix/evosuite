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

public class HttpRowDataWrapper_getHttpStatusCode_18486088736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8315;

    public HttpRowDataWrapper_getHttpStatusCode_18486088736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8328 = new HashMap();
        Integer term8333 = new Integer(-1685132342);
        Class<? extends Object> term8357 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term8356 = ((Class) term8357).getDeclaredField((String) "SUCCESS");
        ((Field) term8356).setAccessible(true);
        Object enum17 = ((Field) term8356).get((Object) null);
        term8315 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper"));
        setField(term8315, term8315.getClass(), "data", null);
        setField(term8315, term8315.getClass(), "errorMessage", "idgaQsnJpQ");
        setField(term8315, term8315.getClass(), "httpHeadersMap", term8328);
        setField(term8315, term8315.getClass(), "httpStatusCode", term8333);
        setField(term8315, term8315.getClass(), "httpCompletionState", enum17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHttpStatusCode", argTypes, term8315, args);
    }

};


