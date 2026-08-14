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

public class HttpRowDataWrapper_HttpRowDataWrapperBuilder_build_6310450696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2562;

    public HttpRowDataWrapper_HttpRowDataWrapperBuilder_build_6310450696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2575 = new HashMap();
        Integer term2580 = new Integer(-1955890973);
        Class<? extends Object> term2606 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term2605 = ((Class) term2606).getDeclaredField((String) "EXCEPTION");
        ((Field) term2605).setAccessible(true);
        Object enum5 = ((Field) term2605).get((Object) null);
        term2562 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder"));
        setField(term2562, term2562.getClass(), "data", null);
        setField(term2562, term2562.getClass(), "errorMessage", "pCTimMblYc");
        setField(term2562, term2562.getClass(), "httpHeadersMap", term2575);
        setField(term2562, term2562.getClass(), "httpStatusCode", term2580);
        setField(term2562, term2562.getClass(), "httpCompletionState", enum5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2562, args);
    }

};


