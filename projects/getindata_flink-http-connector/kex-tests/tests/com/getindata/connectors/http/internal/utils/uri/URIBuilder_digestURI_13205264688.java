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

public class URIBuilder_digestURI_13205264688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1619;
     Object term1711;

    public URIBuilder_digestURI_13205264688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1670 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1670, term1670.getClass(), "name", "");
        setField(term1670, term1670.getClass(), "value", "");
        Object term1673 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1673, term1673.getClass(), "name", "");
        setField(term1673, term1673.getClass(), "value", "");
        Object term1676 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1676, term1676.getClass(), "name", "");
        setField(term1676, term1676.getClass(), "value", "");
        Object term1679 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1679, term1679.getClass(), "name", "");
        setField(term1679, term1679.getClass(), "value", "");
        Object term1682 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term1682, term1682.getClass(), "name", "");
        setField(term1682, term1682.getClass(), "value", "");
        ArrayList term1668 = new ArrayList();
        ((ArrayList) term1668).add(term1670);
        ((ArrayList) term1668).add(term1673);
        ((ArrayList) term1668).add(term1676);
        ((ArrayList) term1668).add(term1679);
        ((ArrayList) term1668).add(term1682);
        term1619 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder"));
        setField(term1619, term1619.getClass(), "scheme", "TimdotUuNC");
        setField(term1619, term1619.getClass(), "encodedSchemeSpecificPart", "PkWMRdJcBb");
        setField(term1619, term1619.getClass(), "encodedAuthority", "jSpAteRute");
        setField(term1619, term1619.getClass(), "charset", null);
        setField(term1619, term1619.getClass(), "encodedPath", "swZVeJAxjt");
        setField(term1619, term1619.getClass(), "queryParams", term1668);
        setField(term1619, term1619.getClass(), "encodedFragment", "sEccwbJKYE");
        setField(term1619, term1619.getClass(), "encodedQuery", "AWRooQKkdW");
        term1711 = newInstance(Class.forName("java.net.URI"));
        setField(term1711, term1711.getClass(), "scheme", "ftp");
        setField(term1711, term1711.getClass(), "fragment", null);
        setField(term1711, term1711.getClass(), "authority", "ftp.is.co.za");
        setField(term1711, term1711.getClass(), "userInfo", null);
        setField(term1711, term1711.getClass(), "host", "ftp.is.co.za");
        setIntField(term1711, term1711.getClass(), "port", -1);
        setField(term1711, term1711.getClass(), "path", "/rfc/rfc1808.txt");
        setField(term1711, term1711.getClass(), "query", null);
        setField(term1711, term1711.getClass(), "schemeSpecificPart", null);
        setIntField(term1711, term1711.getClass(), "hash", 0);
        setField(term1711, term1711.getClass(), "decodedUserInfo", null);
        setField(term1711, term1711.getClass(), "decodedAuthority", null);
        setField(term1711, term1711.getClass(), "decodedPath", null);
        setField(term1711, term1711.getClass(), "decodedQuery", null);
        setField(term1711, term1711.getClass(), "decodedFragment", null);
        setField(term1711, term1711.getClass(), "decodedSchemeSpecificPart", null);
        setField(term1711, term1711.getClass(), "string", "ftp://ftp.is.co.za/rfc/rfc1808.txt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URI");
        Object[] args = new Object[1];
        args[0] = term1711;
        callMethod(klass, "digestURI", argTypes, term1619, args);
    }

};


