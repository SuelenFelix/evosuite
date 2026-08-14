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

public class HttpLookupSourceRequestEntry_hashCode_4283323865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3673;

    public HttpLookupSourceRequestEntry_hashCode_4283323865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3687 = new HashMap();
        HashMap term3695 = new HashMap();
        term3673 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupSourceRequestEntry"));
        Object term3674 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.LookupQueryInfo"));
        setField(term3673, term3673.getClass(), "httpRequest", null);
        setField(term3674, term3674.getClass(), "lookupQuery", "tShwQLRGNe");
        setField(term3674, term3674.getClass(), "bodyBasedUrlQueryParams", term3687);
        setField(term3674, term3674.getClass(), "pathBasedUrlParams", term3695);
        setField(term3673, term3673.getClass(), "lookupQueryInfo", term3674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupSourceRequestEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3673, args);
    }

};


