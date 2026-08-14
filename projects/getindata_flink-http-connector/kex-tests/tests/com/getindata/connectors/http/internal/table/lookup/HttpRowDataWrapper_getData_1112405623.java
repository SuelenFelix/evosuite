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

public class HttpRowDataWrapper_getData_1112405623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6959;

    public HttpRowDataWrapper_getData_1112405623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6972 = new HashMap();
        Integer term6977 = new Integer(-883034806);
        Class<? extends Object> term7011 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term7010 = ((Class) term7011).getDeclaredField((String) "HTTP_ERROR_STATUS");
        ((Field) term7010).setAccessible(true);
        Object enum14 = ((Field) term7010).get((Object) null);
        term6959 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper"));
        setField(term6959, term6959.getClass(), "data", null);
        setField(term6959, term6959.getClass(), "errorMessage", "vQVyKLdtaz");
        setField(term6959, term6959.getClass(), "httpHeadersMap", term6972);
        setField(term6959, term6959.getClass(), "httpStatusCode", term6977);
        setField(term6959, term6959.getClass(), "httpCompletionState", enum14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term6959, args);
    }

};


