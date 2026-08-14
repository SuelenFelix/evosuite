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
import java.util.LinkedHashMap;

public class Slf4JHttpLookupPostRequestCallback_call_6708111481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4614;
     Object term4615;
     Object term4657;

    public Slf4JHttpLookupPostRequestCallback_call_6708111481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4614 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.Slf4JHttpLookupPostRequestCallback"));
        HashMap term4629 = new HashMap();
        HashMap term4637 = new HashMap();
        term4615 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupSourceRequestEntry"));
        Object term4616 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.LookupQueryInfo"));
        setField(term4615, term4615.getClass(), "httpRequest", null);
        setField(term4616, term4616.getClass(), "lookupQuery", "ytSBIKXogI");
        setField(term4616, term4616.getClass(), "bodyBasedUrlQueryParams", term4629);
        setField(term4616, term4616.getClass(), "pathBasedUrlParams", term4637);
        setField(term4615, term4615.getClass(), "lookupQueryInfo", term4616);
        term4657 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.Slf4JHttpLookupPostRequestCallback");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.net.http.HttpResponse");
        argTypes[1] = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupSourceRequestEntry");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.Map");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term4615;
        args[2] = "eqJfYWRaEL";
        args[3] = term4657;
        callMethod(klass, "call", argTypes, term4614, args);
    }

};


