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
import java.lang.Boolean;

public class URIBuilder_normalizePath_19586993515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2086;
     Object term2087;

    public URIBuilder_normalizePath_19586993515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2086 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder"));
        setField(term2086, term2086.getClass(), "scheme", null);
        setField(term2086, term2086.getClass(), "encodedSchemeSpecificPart", null);
        setField(term2086, term2086.getClass(), "encodedAuthority", null);
        setField(term2086, term2086.getClass(), "charset", null);
        setField(term2086, term2086.getClass(), "encodedPath", null);
        setField(term2086, term2086.getClass(), "queryParams", null);
        setField(term2086, term2086.getClass(), "encodedFragment", null);
        setField(term2086, term2086.getClass(), "encodedQuery", null);
        term2087 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2087;
        callMethod(klass, "normalizePath", argTypes, term2086, args);
    }

};


