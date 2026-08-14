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

public class URIBuilder_parseQuery_186177759016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2089;

    public URIBuilder_parseQuery_186177759016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2089 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder"));
        setField(term2089, term2089.getClass(), "scheme", null);
        setField(term2089, term2089.getClass(), "encodedSchemeSpecificPart", null);
        setField(term2089, term2089.getClass(), "encodedAuthority", null);
        setField(term2089, term2089.getClass(), "charset", null);
        setField(term2089, term2089.getClass(), "encodedPath", null);
        setField(term2089, term2089.getClass(), "queryParams", null);
        setField(term2089, term2089.getClass(), "encodedFragment", null);
        setField(term2089, term2089.getClass(), "encodedQuery", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "parseQuery", argTypes, term2089, args);
    }

};


