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
import java.util.LinkedHashMap;

public class HttpRowDataWrapper_HttpRowDataWrapperBuilder_httpHeadersMap_19478541473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term641;
     Object term682;

    public HttpRowDataWrapper_HttpRowDataWrapperBuilder_httpHeadersMap_19478541473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term654 = new HashMap();
        Integer term659 = new Integer(1484323161);
        Class<? extends Object> term766 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term765 = ((Class) term766).getDeclaredField((String) "HTTP_ERROR_STATUS");
        ((Field) term765).setAccessible(true);
        Object enum1 = ((Field) term765).get((Object) null);
        term641 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder"));
        setField(term641, term641.getClass(), "data", null);
        setField(term641, term641.getClass(), "errorMessage", "xxtlPwDYFs");
        setField(term641, term641.getClass(), "httpHeadersMap", term654);
        setField(term641, term641.getClass(), "httpStatusCode", term659);
        setField(term641, term641.getClass(), "httpCompletionState", enum1);
        term682 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper$HttpRowDataWrapperBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term682;
        callMethod(klass, "httpHeadersMap", argTypes, term641, args);
    }

};


