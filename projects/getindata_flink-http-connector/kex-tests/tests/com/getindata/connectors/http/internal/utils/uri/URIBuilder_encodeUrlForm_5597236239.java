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
import java.util.LinkedList;

public class URIBuilder_encodeUrlForm_5597236239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1938;
     Object term2021;

    public URIBuilder_encodeUrlForm_5597236239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1989 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1989, term1989.getClass(), "name", "");
        setField(term1989, term1989.getClass(), "value", "");
        Object term1992 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1992, term1992.getClass(), "name", "");
        setField(term1992, term1992.getClass(), "value", "");
        ArrayList term1987 = new ArrayList();
        ((ArrayList) term1987).add(term1989);
        ((ArrayList) term1987).add(term1992);
        term1938 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder"));
        setField(term1938, term1938.getClass(), "scheme", "vjxIhXHxGR");
        setField(term1938, term1938.getClass(), "encodedSchemeSpecificPart", "QXzGXbEXMu");
        setField(term1938, term1938.getClass(), "encodedAuthority", "qxSDVejjiY");
        setField(term1938, term1938.getClass(), "charset", null);
        setField(term1938, term1938.getClass(), "encodedPath", "xBsXSDjXYK");
        setField(term1938, term1938.getClass(), "queryParams", term1987);
        setField(term1938, term1938.getClass(), "encodedFragment", "SJiQaLvSKv");
        setField(term1938, term1938.getClass(), "encodedQuery", "OEXDRUKcFl");
        term2021 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2021;
        callMethod(klass, "encodeUrlForm", argTypes, term1938, args);
    }

};


