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

public class HttpLookupTableSource_ReadableMetadata_3_read_11753289681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4743;
     Object term4744;

    public HttpLookupTableSource_ReadableMetadata_3_read_11753289681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4743 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupTableSource$ReadableMetadata$3"));
        HashMap term4757 = new HashMap();
        Integer term4762 = new Integer(1227103734);
        Class<? extends Object> term4786 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term4785 = ((Class) term4786).getDeclaredField((String) "SUCCESS");
        ((Field) term4785).setAccessible(true);
        Object enum9 = ((Field) term4785).get((Object) null);
        term4744 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper"));
        setField(term4744, term4744.getClass(), "data", null);
        setField(term4744, term4744.getClass(), "errorMessage", "JUmudUmaaV");
        setField(term4744, term4744.getClass(), "httpHeadersMap", term4757);
        setField(term4744, term4744.getClass(), "httpStatusCode", term4762);
        setField(term4744, term4744.getClass(), "httpCompletionState", enum9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupTableSource$ReadableMetadata$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper");
        Object[] args = new Object[1];
        args[0] = term4744;
        callMethod(klass, "read", argTypes, term4743, args);
    }

};


