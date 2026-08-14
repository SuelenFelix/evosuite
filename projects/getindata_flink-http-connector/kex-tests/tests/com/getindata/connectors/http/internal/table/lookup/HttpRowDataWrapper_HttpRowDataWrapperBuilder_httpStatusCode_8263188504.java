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

public class HttpRowDataWrapper_HttpRowDataWrapperBuilder_httpStatusCode_8263188504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1178;
     Object term1219;

    public HttpRowDataWrapper_HttpRowDataWrapperBuilder_httpStatusCode_8263188504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1191 = new HashMap();
        Integer term1196 = new Integer(391863371);
        Class<? extends Object> term1232 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term1231 = ((Class) term1232).getDeclaredField((String) "HTTP_ERROR_STATUS");
        ((Field) term1231).setAccessible(true);
        Object enum2 = ((Field) term1231).get((Object) null);
        term1178 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder"));
        setField(term1178, term1178.getClass(), "data", null);
        setField(term1178, term1178.getClass(), "errorMessage", "tbcdzjIfER");
        setField(term1178, term1178.getClass(), "httpHeadersMap", term1191);
        setField(term1178, term1178.getClass(), "httpStatusCode", term1196);
        setField(term1178, term1178.getClass(), "httpCompletionState", enum2);
        term1219 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1219;
        callMethod(klass, "httpStatusCode", argTypes, term1178, args);
    }

};


