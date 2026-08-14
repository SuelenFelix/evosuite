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

public class HttpLookupTableSource_ReadableMetadata_2_read_11753289991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5169;
     Object term5170;

    public HttpLookupTableSource_ReadableMetadata_2_read_11753289991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5169 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupTableSource$ReadableMetadata$2"));
        HashMap term5183 = new HashMap();
        Integer term5188 = new Integer(-1339778481);
        Class<? extends Object> term5212 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term5211 = ((Class) term5212).getDeclaredField((String) "SUCCESS");
        ((Field) term5211).setAccessible(true);
        Object enum10 = ((Field) term5211).get((Object) null);
        term5170 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper"));
        setField(term5170, term5170.getClass(), "data", null);
        setField(term5170, term5170.getClass(), "errorMessage", "KoyGrUJeJW");
        setField(term5170, term5170.getClass(), "httpHeadersMap", term5183);
        setField(term5170, term5170.getClass(), "httpStatusCode", term5188);
        setField(term5170, term5170.getClass(), "httpCompletionState", enum10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupTableSource$ReadableMetadata$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper");
        Object[] args = new Object[1];
        args[0] = term5170;
        callMethod(klass, "read", argTypes, term5169, args);
    }

};


