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

public class HttpLookupTableSource_ReadableMetadata_4_read_11753289371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6065;
     Object term6066;

    public HttpLookupTableSource_ReadableMetadata_4_read_11753289371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6065 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupTableSource$ReadableMetadata$4"));
        HashMap term6079 = new HashMap();
        Integer term6084 = new Integer(-522618178);
        Class<? extends Object> term6119 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term6118 = ((Class) term6119).getDeclaredField((String) "IGNORE_STATUS_CODE");
        ((Field) term6118).setAccessible(true);
        Object enum12 = ((Field) term6118).get((Object) null);
        term6066 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper"));
        setField(term6066, term6066.getClass(), "data", null);
        setField(term6066, term6066.getClass(), "errorMessage", "MAcUBcBckh");
        setField(term6066, term6066.getClass(), "httpHeadersMap", term6079);
        setField(term6066, term6066.getClass(), "httpStatusCode", term6084);
        setField(term6066, term6066.getClass(), "httpCompletionState", enum12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupTableSource$ReadableMetadata$4");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper");
        Object[] args = new Object[1];
        args[0] = term6066;
        callMethod(klass, "read", argTypes, term6065, args);
    }

};


