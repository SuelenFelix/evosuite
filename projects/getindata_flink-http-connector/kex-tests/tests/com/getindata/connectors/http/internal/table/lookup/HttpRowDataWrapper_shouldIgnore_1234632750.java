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

public class HttpRowDataWrapper_shouldIgnore_1234632750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6535;

    public HttpRowDataWrapper_shouldIgnore_1234632750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6548 = new HashMap();
        Integer term6553 = new Integer(1134449235);
        Class<? extends Object> term6577 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term6576 = ((Class) term6577).getDeclaredField((String) "SUCCESS");
        ((Field) term6576).setAccessible(true);
        Object enum13 = ((Field) term6576).get((Object) null);
        term6535 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper"));
        setField(term6535, term6535.getClass(), "data", null);
        setField(term6535, term6535.getClass(), "errorMessage", "oVgzLbrsFr");
        setField(term6535, term6535.getClass(), "httpHeadersMap", term6548);
        setField(term6535, term6535.getClass(), "httpStatusCode", term6553);
        setField(term6535, term6535.getClass(), "httpCompletionState", enum13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "shouldIgnore", argTypes, term6535, args);
    }

};


