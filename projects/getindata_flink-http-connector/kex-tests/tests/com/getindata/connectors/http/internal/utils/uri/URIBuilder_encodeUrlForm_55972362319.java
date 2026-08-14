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

public class URIBuilder_encodeUrlForm_55972362319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2092;

    public URIBuilder_encodeUrlForm_55972362319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2092 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder"));
        setField(term2092, term2092.getClass(), "scheme", null);
        setField(term2092, term2092.getClass(), "encodedSchemeSpecificPart", null);
        setField(term2092, term2092.getClass(), "encodedAuthority", null);
        setField(term2092, term2092.getClass(), "charset", null);
        setField(term2092, term2092.getClass(), "encodedPath", null);
        setField(term2092, term2092.getClass(), "queryParams", null);
        setField(term2092, term2092.getClass(), "encodedFragment", null);
        setField(term2092, term2092.getClass(), "encodedQuery", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "encodeUrlForm", argTypes, term2092, args);
    }

};


