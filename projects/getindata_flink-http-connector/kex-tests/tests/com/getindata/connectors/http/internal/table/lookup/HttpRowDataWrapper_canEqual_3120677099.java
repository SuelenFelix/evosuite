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

public class HttpRowDataWrapper_canEqual_3120677099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9676;
     Object term9730;

    public HttpRowDataWrapper_canEqual_3120677099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9689 = new HashMap();
        Integer term9694 = new Integer(1048535127);
        Class<? extends Object> term9742 = Class.forName((String) "com.getindata.connectors.http.internal.table.lookup.HttpCompletionState");
        Field term9741 = ((Class) term9742).getDeclaredField((String) "UNABLE_TO_DESERIALIZE_RESPONSE");
        ((Field) term9741).setAccessible(true);
        Object enum20 = ((Field) term9741).get((Object) null);
        term9676 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper"));
        setField(term9676, term9676.getClass(), "data", null);
        setField(term9676, term9676.getClass(), "errorMessage", "bWWfajKbEX");
        setField(term9676, term9676.getClass(), "httpHeadersMap", term9689);
        setField(term9676, term9676.getClass(), "httpStatusCode", term9694);
        setField(term9676, term9676.getClass(), "httpCompletionState", enum20);
        term9730 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpRowDataWrapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9730;
        callMethod(klass, "canEqual", argTypes, term9676, args);
    }

};


