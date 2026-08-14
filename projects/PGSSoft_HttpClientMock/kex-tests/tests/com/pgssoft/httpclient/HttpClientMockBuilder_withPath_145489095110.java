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

public class HttpClientMockBuilder_withPath_145489095110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5462;

    public HttpClientMockBuilder_withPath_145489095110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5466 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5466, term5466.getClass(), "size", 202001407);
        setField(term5466, term5466.getClass(), "first", null);
        setField(term5466, term5466.getClass(), "last", null);
        setIntField(term5466, term5466.getClass(), "modCount", 158873461);
        Object term5469 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5469, term5469.getClass(), "size", -430151637);
        setField(term5469, term5469.getClass(), "first", null);
        setField(term5469, term5469.getClass(), "last", null);
        setIntField(term5469, term5469.getClass(), "modCount", -1697741339);
        ArrayDeque term5464 = new ArrayDeque();
        ((ArrayDeque) term5464).add(term5466);
        ((ArrayDeque) term5464).add(term5469);
        ArrayList term5474 = new ArrayList();
        ((ArrayList) term5474).add((Object)null);
        ((ArrayList) term5474).add((Object)null);
        ((ArrayList) term5474).add((Object)null);
        ((ArrayList) term5474).add((Object)null);
        ((ArrayList) term5474).add((Object)null);
        ((ArrayList) term5474).add((Object)null);
        ((ArrayList) term5474).add((Object)null);
        HashMap term5480 = new HashMap();
        ArrayDeque term5487 = new ArrayDeque();
        ((ArrayDeque) term5487).add((Object)null);
        ((ArrayDeque) term5487).add((Object)null);
        ArrayList term5491 = new ArrayList();
        ((ArrayList) term5491).add((Object)null);
        ((ArrayList) term5491).add((Object)null);
        ((ArrayList) term5491).add((Object)null);
        ((ArrayList) term5491).add((Object)null);
        ((ArrayList) term5491).add((Object)null);
        ((ArrayList) term5491).add((Object)null);
        ((ArrayList) term5491).add((Object)null);
        ((ArrayList) term5491).add((Object)null);
        ((ArrayList) term5491).add((Object)null);
        term5462 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term5463 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5478 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5479 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term5485 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term5486 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5495 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5496 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5463, term5463.getClass(), "actionBundles", term5464);
        setField(term5463, term5463.getClass(), "conditions", term5474);
        setField(term5479, term5479.getClass(), "matchers", term5480);
        setField(term5478, term5478.getClass(), "parameterConditions", term5479);
        setField(term5478, term5478.getClass(), "referenceCondition", null);
        setField(term5478, term5478.getClass(), "hostCondition", null);
        setField(term5478, term5478.getClass(), "pathCondition", null);
        setField(term5478, term5478.getClass(), "portCondition", null);
        setField(term5478, term5478.getClass(), "schemaCondition", null);
        setField(term5463, term5463.getClass(), "urlConditions", term5478);
        setField(term5462, term5462.getClass(), "ruleBuilder", term5463);
        setField(term5486, term5486.getClass(), "actionBundles", term5487);
        setField(term5486, term5486.getClass(), "conditions", term5491);
        setField(term5496, term5496.getClass(), "matchers", null);
        setField(term5495, term5495.getClass(), "parameterConditions", term5496);
        setField(term5495, term5495.getClass(), "referenceCondition", null);
        setField(term5495, term5495.getClass(), "hostCondition", null);
        setField(term5495, term5495.getClass(), "pathCondition", null);
        setField(term5495, term5495.getClass(), "portCondition", null);
        setField(term5495, term5495.getClass(), "schemaCondition", null);
        setField(term5486, term5486.getClass(), "urlConditions", term5495);
        setField(term5485, term5485.getClass(), "ruleBuilder", term5486);
        setField(term5462, term5462.getClass(), "responseBuilder", term5485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "withPath", argTypes, term5462, args);
    }

};


