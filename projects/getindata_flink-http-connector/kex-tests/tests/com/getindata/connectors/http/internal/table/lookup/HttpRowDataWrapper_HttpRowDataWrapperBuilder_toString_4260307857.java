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

public class HttpRowDataWrapper_HttpRowDataWrapperBuilder_toString_4260307857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2994;

    public HttpRowDataWrapper_HttpRowDataWrapperBuilder_toString_4260307857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3007 = new HashMap();
        Integer term3012 = new Integer(-2038273078);
        Class<? extends Object> term3047 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term3046 = ((Class) term3047).getDeclaredField((String) "IGNORE_STATUS_CODE");
        ((Field) term3046).setAccessible(true);
        Object enum6 = ((Field) term3046).get((Object) null);
        term2994 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder"));
        setField(term2994, term2994.getClass(), "data", null);
        setField(term2994, term2994.getClass(), "errorMessage", "hNxWaHcfhY");
        setField(term2994, term2994.getClass(), "httpHeadersMap", term3007);
        setField(term2994, term2994.getClass(), "httpStatusCode", term3012);
        setField(term2994, term2994.getClass(), "httpCompletionState", enum6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2994, args);
    }

};


