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

public class HttpRowDataWrapper_HttpRowDataWrapperBuilder_errorMessage_3703633012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;

    public HttpRowDataWrapper_HttpRowDataWrapperBuilder_errorMessage_3703633012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15 = new HashMap();
        Integer term20 = new Integer(1162663216);
        Class<? extends Object> term180 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term179 = ((Class) term180).getDeclaredField((String) "UNABLE_TO_DESERIALIZE_RESPONSE");
        ((Field) term179).setAccessible(true);
        Object enum0 = ((Field) term179).get((Object) null);
        term2 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder"));
        setField(term2, term2.getClass(), "data", null);
        setField(term2, term2.getClass(), "errorMessage", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "httpHeadersMap", term15);
        setField(term2, term2.getClass(), "httpStatusCode", term20);
        setField(term2, term2.getClass(), "httpCompletionState", enum0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        callMethod(klass, "errorMessage", argTypes, term2, args);
    }

};


