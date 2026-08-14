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

public class HttpClientMockBuilder_with_7752642417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5311;

    public HttpClientMockBuilder_with_7752642417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5315 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5315, term5315.getClass(), "size", 304775596);
        setField(term5315, term5315.getClass(), "first", null);
        setField(term5315, term5315.getClass(), "last", null);
        setIntField(term5315, term5315.getClass(), "modCount", -1347665717);
        Object term5318 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5318, term5318.getClass(), "size", -1888585309);
        setField(term5318, term5318.getClass(), "first", null);
        setField(term5318, term5318.getClass(), "last", null);
        setIntField(term5318, term5318.getClass(), "modCount", 683666002);
        ArrayDeque term5313 = new ArrayDeque();
        ((ArrayDeque) term5313).add(term5315);
        ((ArrayDeque) term5313).add(term5318);
        ArrayList term5323 = new ArrayList();
        ((ArrayList) term5323).add((Object)null);
        ((ArrayList) term5323).add((Object)null);
        ((ArrayList) term5323).add((Object)null);
        ((ArrayList) term5323).add((Object)null);
        ((ArrayList) term5323).add((Object)null);
        ((ArrayList) term5323).add((Object)null);
        ((ArrayList) term5323).add((Object)null);
        ((ArrayList) term5323).add((Object)null);
        HashMap term5329 = new HashMap();
        ArrayDeque term5336 = new ArrayDeque();
        ((ArrayDeque) term5336).add((Object)null);
        ((ArrayDeque) term5336).add((Object)null);
        ((ArrayDeque) term5336).add((Object)null);
        ArrayList term5340 = new ArrayList();
        ((ArrayList) term5340).add((Object)null);
        ((ArrayList) term5340).add((Object)null);
        ((ArrayList) term5340).add((Object)null);
        ((ArrayList) term5340).add((Object)null);
        ((ArrayList) term5340).add((Object)null);
        ((ArrayList) term5340).add((Object)null);
        term5311 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term5312 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5327 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5328 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term5334 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term5335 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5344 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5345 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5312, term5312.getClass(), "actionBundles", term5313);
        setField(term5312, term5312.getClass(), "conditions", term5323);
        setField(term5328, term5328.getClass(), "matchers", term5329);
        setField(term5327, term5327.getClass(), "parameterConditions", term5328);
        setField(term5327, term5327.getClass(), "referenceCondition", null);
        setField(term5327, term5327.getClass(), "hostCondition", null);
        setField(term5327, term5327.getClass(), "pathCondition", null);
        setField(term5327, term5327.getClass(), "portCondition", null);
        setField(term5327, term5327.getClass(), "schemaCondition", null);
        setField(term5312, term5312.getClass(), "urlConditions", term5327);
        setField(term5311, term5311.getClass(), "ruleBuilder", term5312);
        setField(term5335, term5335.getClass(), "actionBundles", term5336);
        setField(term5335, term5335.getClass(), "conditions", term5340);
        setField(term5345, term5345.getClass(), "matchers", null);
        setField(term5344, term5344.getClass(), "parameterConditions", term5345);
        setField(term5344, term5344.getClass(), "referenceCondition", null);
        setField(term5344, term5344.getClass(), "hostCondition", null);
        setField(term5344, term5344.getClass(), "pathCondition", null);
        setField(term5344, term5344.getClass(), "portCondition", null);
        setField(term5344, term5344.getClass(), "schemaCondition", null);
        setField(term5335, term5335.getClass(), "urlConditions", term5344);
        setField(term5334, term5334.getClass(), "ruleBuilder", term5335);
        setField(term5311, term5311.getClass(), "responseBuilder", term5334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.Condition");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "with", argTypes, term5311, args);
    }

};


