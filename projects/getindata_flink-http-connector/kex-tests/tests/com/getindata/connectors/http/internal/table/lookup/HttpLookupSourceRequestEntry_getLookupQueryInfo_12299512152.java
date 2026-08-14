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
import java.lang.Object;
import java.util.HashMap;

public class HttpLookupSourceRequestEntry_getLookupQueryInfo_12299512152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3551;

    public HttpLookupSourceRequestEntry_getLookupQueryInfo_12299512152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3565 = new HashMap();
        HashMap term3573 = new HashMap();
        term3551 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupSourceRequestEntry"));
        Object term3552 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.LookupQueryInfo"));
        setField(term3551, term3551.getClass(), "httpRequest", null);
        setField(term3552, term3552.getClass(), "lookupQuery", "dWRymuLBtr");
        setField(term3552, term3552.getClass(), "bodyBasedUrlQueryParams", term3565);
        setField(term3552, term3552.getClass(), "pathBasedUrlParams", term3573);
        setField(term3551, term3551.getClass(), "lookupQueryInfo", term3552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupSourceRequestEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLookupQueryInfo", argTypes, term3551, args);
    }

};


