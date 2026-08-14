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

public class URIBuilder_build_135335460614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2085;

    public URIBuilder_build_135335460614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2085 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder"));
        setField(term2085, term2085.getClass(), "scheme", null);
        setField(term2085, term2085.getClass(), "encodedSchemeSpecificPart", null);
        setField(term2085, term2085.getClass(), "encodedAuthority", null);
        setField(term2085, term2085.getClass(), "charset", null);
        setField(term2085, term2085.getClass(), "encodedPath", null);
        setField(term2085, term2085.getClass(), "queryParams", null);
        setField(term2085, term2085.getClass(), "encodedFragment", null);
        setField(term2085, term2085.getClass(), "encodedQuery", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2085, args);
    }

};


