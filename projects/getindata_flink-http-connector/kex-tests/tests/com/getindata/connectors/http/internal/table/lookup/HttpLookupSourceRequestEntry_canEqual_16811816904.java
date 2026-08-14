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

public class HttpLookupSourceRequestEntry_canEqual_16811816904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3632;
     Object term3662;

    public HttpLookupSourceRequestEntry_canEqual_16811816904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3646 = new HashMap();
        HashMap term3654 = new HashMap();
        term3632 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupSourceRequestEntry"));
        Object term3633 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.LookupQueryInfo"));
        setField(term3632, term3632.getClass(), "httpRequest", null);
        setField(term3633, term3633.getClass(), "lookupQuery", "UlajhuVLaP");
        setField(term3633, term3633.getClass(), "bodyBasedUrlQueryParams", term3646);
        setField(term3633, term3633.getClass(), "pathBasedUrlParams", term3654);
        setField(term3632, term3632.getClass(), "lookupQueryInfo", term3633);
        term3662 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.HttpLookupSourceRequestEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3662;
        callMethod(klass, "canEqual", argTypes, term3632, args);
    }

};


