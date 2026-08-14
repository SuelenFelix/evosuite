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

public class URIBuilder_parseQuery_18617775906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1290;

    public URIBuilder_parseQuery_18617775906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1341 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1341, term1341.getClass(), "name", "");
        setField(term1341, term1341.getClass(), "value", "");
        Object term1344 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1344, term1344.getClass(), "name", "");
        setField(term1344, term1344.getClass(), "value", "");
        Object term1347 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1347, term1347.getClass(), "name", "");
        setField(term1347, term1347.getClass(), "value", "");
        Object term1350 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1350, term1350.getClass(), "name", "");
        setField(term1350, term1350.getClass(), "value", "");
        Object term1353 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1353, term1353.getClass(), "name", "");
        setField(term1353, term1353.getClass(), "value", "");
        Object term1356 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1356, term1356.getClass(), "name", "");
        setField(term1356, term1356.getClass(), "value", "");
        ArrayList term1339 = new ArrayList();
        ((ArrayList) term1339).add(term1341);
        ((ArrayList) term1339).add(term1344);
        ((ArrayList) term1339).add(term1347);
        ((ArrayList) term1339).add(term1350);
        ((ArrayList) term1339).add(term1353);
        ((ArrayList) term1339).add(term1356);
        term1290 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder"));
        setField(term1290, term1290.getClass(), "scheme", "UoYtihxVaS");
        setField(term1290, term1290.getClass(), "encodedSchemeSpecificPart", "JDswTTCZHV");
        setField(term1290, term1290.getClass(), "encodedAuthority", "onpbIeEKoi");
        setField(term1290, term1290.getClass(), "charset", null);
        setField(term1290, term1290.getClass(), "encodedPath", "YRHGsAkhxb");
        setField(term1290, term1290.getClass(), "queryParams", term1339);
        setField(term1290, term1290.getClass(), "encodedFragment", "tPlsykYBqO");
        setField(term1290, term1290.getClass(), "encodedQuery", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = "whBvTVIIlC";
        args[1] = null;
        callMethod(klass, "parseQuery", argTypes, term1290, args);
    }

};


