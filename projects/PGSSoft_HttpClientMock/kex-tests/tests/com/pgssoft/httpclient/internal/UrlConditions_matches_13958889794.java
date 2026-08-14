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

public class UrlConditions_matches_13958889794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9474;
     Object term9481;

    public UrlConditions_matches_13958889794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9476 = new HashMap();
        term9474 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term9475 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term9475, term9475.getClass(), "matchers", term9476);
        setField(term9474, term9474.getClass(), "parameterConditions", term9475);
        setField(term9474, term9474.getClass(), "referenceCondition", null);
        setField(term9474, term9474.getClass(), "hostCondition", null);
        setField(term9474, term9474.getClass(), "pathCondition", null);
        setField(term9474, term9474.getClass(), "portCondition", null);
        setField(term9474, term9474.getClass(), "schemaCondition", null);
        term9481 = newInstance(Class.forName("java.net.URI"));
        setField(term9481, term9481.getClass(), "scheme", "telnet");
        setField(term9481, term9481.getClass(), "fragment", null);
        setField(term9481, term9481.getClass(), "authority", "192.0.2.16:80");
        setField(term9481, term9481.getClass(), "userInfo", null);
        setField(term9481, term9481.getClass(), "host", "192.0.2.16");
        setIntField(term9481, term9481.getClass(), "port", 80);
        setField(term9481, term9481.getClass(), "path", "/");
        setField(term9481, term9481.getClass(), "query", null);
        setField(term9481, term9481.getClass(), "schemeSpecificPart", null);
        setIntField(term9481, term9481.getClass(), "hash", 0);
        setField(term9481, term9481.getClass(), "decodedUserInfo", null);
        setField(term9481, term9481.getClass(), "decodedAuthority", null);
        setField(term9481, term9481.getClass(), "decodedPath", null);
        setField(term9481, term9481.getClass(), "decodedQuery", null);
        setField(term9481, term9481.getClass(), "decodedFragment", null);
        setField(term9481, term9481.getClass(), "decodedSchemeSpecificPart", null);
        setField(term9481, term9481.getClass(), "string", "telnet://192.0.2.16:80/");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URI");
        Object[] args = new Object[1];
        args[0] = term9481;
        callMethod(klass, "matches", argTypes, term9474, args);
    }

};


