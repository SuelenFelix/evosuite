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

public class HttpRowDataWrapper_HttpRowDataWrapperBuilder_httpHeadersMap_194785414710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3463;

    public HttpRowDataWrapper_HttpRowDataWrapperBuilder_httpHeadersMap_194785414710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3463 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder"));
        setField(term3463, term3463.getClass(), "data", null);
        setField(term3463, term3463.getClass(), "errorMessage", null);
        setField(term3463, term3463.getClass(), "httpHeadersMap", null);
        setField(term3463, term3463.getClass(), "httpStatusCode", null);
        setField(term3463, term3463.getClass(), "httpCompletionState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "httpHeadersMap", argTypes, term3463, args);
    }

};


