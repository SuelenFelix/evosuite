package com.pgssoft.httpclient.internal;

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
import static com.pgssoft.httpclient.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class UrlConditions_matches_13958889793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5295;
     Object term5302;

    public UrlConditions_matches_13958889793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5297 = new HashMap();
        term5295 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5296 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5296, term5296.getClass(), "matchers", term5297);
        setField(term5295, term5295.getClass(), "parameterConditions", term5296);
        setField(term5295, term5295.getClass(), "referenceCondition", null);
        setField(term5295, term5295.getClass(), "hostCondition", null);
        setField(term5295, term5295.getClass(), "pathCondition", null);
        setField(term5295, term5295.getClass(), "portCondition", null);
        setField(term5295, term5295.getClass(), "schemaCondition", null);
        term5302 = newInstance(Class.forName("java.net.URI"));
        setField(term5302, term5302.getClass(), "scheme", "telnet");
        setField(term5302, term5302.getClass(), "fragment", null);
        setField(term5302, term5302.getClass(), "authority", "192.0.2.16:80");
        setField(term5302, term5302.getClass(), "userInfo", null);
        setField(term5302, term5302.getClass(), "host", "192.0.2.16");
        setIntField(term5302, term5302.getClass(), "port", 80);
        setField(term5302, term5302.getClass(), "path", "/");
        setField(term5302, term5302.getClass(), "query", null);
        setField(term5302, term5302.getClass(), "schemeSpecificPart", null);
        setIntField(term5302, term5302.getClass(), "hash", 0);
        setField(term5302, term5302.getClass(), "decodedUserInfo", null);
        setField(term5302, term5302.getClass(), "decodedAuthority", null);
        setField(term5302, term5302.getClass(), "decodedPath", null);
        setField(term5302, term5302.getClass(), "decodedQuery", null);
        setField(term5302, term5302.getClass(), "decodedFragment", null);
        setField(term5302, term5302.getClass(), "decodedSchemeSpecificPart", null);
        setField(term5302, term5302.getClass(), "string", "telnet://192.0.2.16:80/");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URI");
        Object[] args = new Object[1];
        args[0] = term5302;
        callMethod(klass, "matches", argTypes, term5295, args);
    }

};


