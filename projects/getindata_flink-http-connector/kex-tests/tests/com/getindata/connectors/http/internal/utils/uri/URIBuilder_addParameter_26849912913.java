package com.getindata.connectors.http.internal.utils.uri;

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
import static com.getindata.connectors.http.internal.utils.uri.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class URIBuilder_addParameter_26849912913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2084;

    public URIBuilder_addParameter_26849912913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2084 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder"));
        setField(term2084, term2084.getClass(), "scheme", null);
        setField(term2084, term2084.getClass(), "encodedSchemeSpecificPart", null);
        setField(term2084, term2084.getClass(), "encodedAuthority", null);
        setField(term2084, term2084.getClass(), "charset", null);
        setField(term2084, term2084.getClass(), "encodedPath", null);
        setField(term2084, term2084.getClass(), "queryParams", null);
        setField(term2084, term2084.getClass(), "encodedFragment", null);
        setField(term2084, term2084.getClass(), "encodedQuery", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addParameter", argTypes, term2084, args);
    }

};


