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

public class HttpRowDataWrapper_toString_207567670311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10661;

    public HttpRowDataWrapper_toString_207567670311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10674 = new HashMap();
        Integer term10679 = new Integer(-6029667);
        Class<? extends Object> term10714 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term10713 = ((Class) term10714).getDeclaredField((String) "IGNORE_STATUS_CODE");
        ((Field) term10713).setAccessible(true);
        Object enum22 = ((Field) term10713).get((Object) null);
        term10661 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper"));
        setField(term10661, term10661.getClass(), "data", null);
        setField(term10661, term10661.getClass(), "errorMessage", "LvJFtLBaxj");
        setField(term10661, term10661.getClass(), "httpHeadersMap", term10674);
        setField(term10661, term10661.getClass(), "httpStatusCode", term10679);
        setField(term10661, term10661.getClass(), "httpCompletionState", enum22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10661, args);
    }

};


