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

public class HttpRowDataWrapper_HttpRowDataWrapperBuilder_build_63104506913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3466;

    public HttpRowDataWrapper_HttpRowDataWrapperBuilder_build_63104506913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3466 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder"));
        setField(term3466, term3466.getClass(), "data", null);
        setField(term3466, term3466.getClass(), "errorMessage", null);
        setField(term3466, term3466.getClass(), "httpHeadersMap", null);
        setField(term3466, term3466.getClass(), "httpStatusCode", null);
        setField(term3466, term3466.getClass(), "httpCompletionState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3466, args);
    }

};


