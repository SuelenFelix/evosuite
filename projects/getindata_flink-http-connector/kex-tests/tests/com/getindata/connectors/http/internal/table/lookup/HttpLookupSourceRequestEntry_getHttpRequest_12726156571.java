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

public class HttpLookupSourceRequestEntry_getHttpRequest_12726156571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3511;

    public HttpLookupSourceRequestEntry_getHttpRequest_12726156571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3525 = new HashMap();
        HashMap term3533 = new HashMap();
        term3511 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupSourceRequestEntry"));
        Object term3512 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.LookupQueryInfo"));
        setField(term3511, term3511.getClass(), "httpRequest", null);
        setField(term3512, term3512.getClass(), "lookupQuery", "flxyYxBRtu");
        setField(term3512, term3512.getClass(), "bodyBasedUrlQueryParams", term3525);
        setField(term3512, term3512.getClass(), "pathBasedUrlParams", term3533);
        setField(term3511, term3511.getClass(), "lookupQueryInfo", term3512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupSourceRequestEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHttpRequest", argTypes, term3511, args);
    }

};


