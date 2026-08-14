package com.pgssoft.httpclient;

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
import static com.pgssoft.httpclient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

public class HttpClientVerifyBuilder_withBody_18518289368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19682;

    public HttpClientVerifyBuilder_withBody_18518289368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19686 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19686, term19686.getClass(), "size", 808614267);
        setField(term19686, term19686.getClass(), "first", null);
        setField(term19686, term19686.getClass(), "last", null);
        setIntField(term19686, term19686.getClass(), "modCount", 1611734632);
        ArrayDeque term19684 = new ArrayDeque();
        ((ArrayDeque) term19684).add(term19686);
        ArrayList term19691 = new ArrayList();
        ((ArrayList) term19691).add((Object)null);
        ((ArrayList) term19691).add((Object)null);
        ((ArrayList) term19691).add((Object)null);
        ((ArrayList) term19691).add((Object)null);
        ((ArrayList) term19691).add((Object)null);
        ((ArrayList) term19691).add((Object)null);
        ((ArrayList) term19691).add((Object)null);
        HashMap term19697 = new HashMap();
        ArrayList term19702 = new ArrayList();
        ((ArrayList) term19702).add((Object)null);
        ((ArrayList) term19702).add((Object)null);
        ((ArrayList) term19702).add((Object)null);
        ((ArrayList) term19702).add((Object)null);
        ((ArrayList) term19702).add((Object)null);
        ((ArrayList) term19702).add((Object)null);
        term19682 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19683 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19695 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19696 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19683, term19683.getClass(), "actionBundles", term19684);
        setField(term19683, term19683.getClass(), "conditions", term19691);
        setField(term19696, term19696.getClass(), "matchers", term19697);
        setField(term19695, term19695.getClass(), "parameterConditions", term19696);
        setField(term19695, term19695.getClass(), "referenceCondition", null);
        setField(term19695, term19695.getClass(), "hostCondition", null);
        setField(term19695, term19695.getClass(), "pathCondition", null);
        setField(term19695, term19695.getClass(), "portCondition", null);
        setField(term19695, term19695.getClass(), "schemaCondition", null);
        setField(term19683, term19683.getClass(), "urlConditions", term19695);
        setField(term19682, term19682.getClass(), "ruleBuilder", term19683);
        setField(term19682, term19682.getClass(), "requests", term19702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withBody", argTypes, term19682, args);
    }

};


