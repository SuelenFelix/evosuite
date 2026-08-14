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
import java.util.ArrayList;
import java.lang.Object;

public class URIBuilder_build_13533546064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1126;

    public URIBuilder_build_13533546064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1177 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1177, term1177.getClass(), "name", "");
        setField(term1177, term1177.getClass(), "value", "");
        ArrayList term1175 = new ArrayList();
        ((ArrayList) term1175).add(term1177);
        term1126 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder"));
        setField(term1126, term1126.getClass(), "scheme", "hxCBltsObl");
        setField(term1126, term1126.getClass(), "encodedSchemeSpecificPart", "BndsHwAFMv");
        setField(term1126, term1126.getClass(), "encodedAuthority", "GzFkzHGYFt");
        setField(term1126, term1126.getClass(), "charset", null);
        setField(term1126, term1126.getClass(), "encodedPath", "tShwQLRGNe");
        setField(term1126, term1126.getClass(), "queryParams", term1175);
        setField(term1126, term1126.getClass(), "encodedFragment", "jDtqGUpnZN");
        setField(term1126, term1126.getClass(), "encodedQuery", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1126, args);
    }

};


