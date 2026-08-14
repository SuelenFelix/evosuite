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

public class URIBuilder_buildString_8281372077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1467;

    public URIBuilder_buildString_8281372077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1518 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1518, term1518.getClass(), "name", "");
        setField(term1518, term1518.getClass(), "value", "");
        Object term1521 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1521, term1521.getClass(), "name", "");
        setField(term1521, term1521.getClass(), "value", "");
        Object term1524 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1524, term1524.getClass(), "name", "");
        setField(term1524, term1524.getClass(), "value", "");
        Object term1527 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1527, term1527.getClass(), "name", "");
        setField(term1527, term1527.getClass(), "value", "");
        Object term1530 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1530, term1530.getClass(), "name", "");
        setField(term1530, term1530.getClass(), "value", "");
        ArrayList term1516 = new ArrayList();
        ((ArrayList) term1516).add(term1518);
        ((ArrayList) term1516).add(term1521);
        ((ArrayList) term1516).add(term1524);
        ((ArrayList) term1516).add(term1527);
        ((ArrayList) term1516).add(term1530);
        term1467 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder"));
        setField(term1467, term1467.getClass(), "scheme", "IgRJUzaCwW");
        setField(term1467, term1467.getClass(), "encodedSchemeSpecificPart", "JUmudUmaaV");
        setField(term1467, term1467.getClass(), "encodedAuthority", "KoyGrUJeJW");
        setField(term1467, term1467.getClass(), "charset", null);
        setField(term1467, term1467.getClass(), "encodedPath", "HqBOwkVqjD");
        setField(term1467, term1467.getClass(), "queryParams", term1516);
        setField(term1467, term1467.getClass(), "encodedFragment", "LvJFtLBaxj");
        setField(term1467, term1467.getClass(), "encodedQuery", "PHvxnGHptP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildString", argTypes, term1467, args);
    }

};


