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

public class HttpRowDataWrapper_HttpRowDataWrapperBuilder_httpCompletionState_8117635595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1644;
     Object enum4;

    public HttpRowDataWrapper_HttpRowDataWrapperBuilder_httpCompletionState_8117635595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1657 = new HashMap();
        Integer term1662 = new Integer(-616727354);
        Class<? extends Object> term1722 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term1721 = ((Class) term1722).getDeclaredField((String) "UNABLE_TO_DESERIALIZE_RESPONSE");
        ((Field) term1721).setAccessible(true);
        Object enum3 = ((Field) term1721).get((Object) null);
        term1644 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder"));
        setField(term1644, term1644.getClass(), "data", null);
        setField(term1644, term1644.getClass(), "errorMessage", "HyxfbSQYBe");
        setField(term1644, term1644.getClass(), "httpHeadersMap", term1657);
        setField(term1644, term1644.getClass(), "httpStatusCode", term1662);
        setField(term1644, term1644.getClass(), "httpCompletionState", enum3);
        Class<? extends Object> term2174 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term2173 = ((Class) term2174).getDeclaredField((String) "EXCEPTION");
        ((Field) term2173).setAccessible(true);
        enum4 = ((Field) term2173).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Object[] args = new Object[1];
        args[0] = enum4;
        callMethod(klass, "httpCompletionState", argTypes, term1644, args);
    }

};


