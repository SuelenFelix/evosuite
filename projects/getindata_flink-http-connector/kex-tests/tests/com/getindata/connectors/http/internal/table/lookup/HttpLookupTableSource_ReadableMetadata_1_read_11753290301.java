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

public class HttpLookupTableSource_ReadableMetadata_1_read_11753290301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5595;
     Object term5596;

    public HttpLookupTableSource_ReadableMetadata_1_read_11753290301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5595 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupTableSource$ReadableMetadata$1"));
        HashMap term5609 = new HashMap();
        Integer term5614 = new Integer(1725571209);
        Class<? extends Object> term5649 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term5648 = ((Class) term5649).getDeclaredField((String) "IGNORE_STATUS_CODE");
        ((Field) term5648).setAccessible(true);
        Object enum11 = ((Field) term5648).get((Object) null);
        term5596 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper"));
        setField(term5596, term5596.getClass(), "data", null);
        setField(term5596, term5596.getClass(), "errorMessage", "HqBOwkVqjD");
        setField(term5596, term5596.getClass(), "httpHeadersMap", term5609);
        setField(term5596, term5596.getClass(), "httpStatusCode", term5614);
        setField(term5596, term5596.getClass(), "httpCompletionState", enum11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupTableSource$ReadableMetadata$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper");
        Object[] args = new Object[1];
        args[0] = term5596;
        callMethod(klass, "read", argTypes, term5595, args);
    }

};


