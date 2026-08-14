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

public class URIBuilder_addParameter_2684991293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term924;

    public URIBuilder_addParameter_2684991293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term975 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term975, term975.getClass(), "name", "");
        setField(term975, term975.getClass(), "value", "");
        Object term978 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term978, term978.getClass(), "name", "");
        setField(term978, term978.getClass(), "value", "");
        Object term981 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term981, term981.getClass(), "name", "");
        setField(term981, term981.getClass(), "value", "");
        Object term984 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term984, term984.getClass(), "name", "");
        setField(term984, term984.getClass(), "value", "");
        Object term987 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term987, term987.getClass(), "name", "");
        setField(term987, term987.getClass(), "value", "");
        Object term990 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term990, term990.getClass(), "name", "");
        setField(term990, term990.getClass(), "value", "");
        Object term993 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term993, term993.getClass(), "name", "");
        setField(term993, term993.getClass(), "value", "");
        ArrayList term973 = new ArrayList();
        ((ArrayList) term973).add(term975);
        ((ArrayList) term973).add(term978);
        ((ArrayList) term973).add(term981);
        ((ArrayList) term973).add(term984);
        ((ArrayList) term973).add(term987);
        ((ArrayList) term973).add(term990);
        ((ArrayList) term973).add(term993);
        term924 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder"));
        setField(term924, term924.getClass(), "scheme", "RkybSrpybU");
        setField(term924, term924.getClass(), "encodedSchemeSpecificPart", "xOEqzGAmDU");
        setField(term924, term924.getClass(), "encodedAuthority", "eZFUvlxvGV");
        setField(term924, term924.getClass(), "charset", null);
        setField(term924, term924.getClass(), "encodedPath", "BYqFIqCKAV");
        setField(term924, term924.getClass(), "queryParams", term973);
        setField(term924, term924.getClass(), "encodedFragment", "aKnKipADSo");
        setField(term924, term924.getClass(), "encodedQuery", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "UlajhuVLaP";
        args[1] = "gGSMzuGICf";
        callMethod(klass, "addParameter", argTypes, term924, args);
    }

};


