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
import java.lang.Integer;

public class HttpClientVerifyBuilder_called_147847088814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19924;
     Object term19957;

    public HttpClientVerifyBuilder_called_147847088814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19928 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19928, term19928.getClass(), "size", 1595814906);
        setField(term19928, term19928.getClass(), "first", null);
        setField(term19928, term19928.getClass(), "last", null);
        setIntField(term19928, term19928.getClass(), "modCount", -834193529);
        Object term19931 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19931, term19931.getClass(), "size", 335780735);
        setField(term19931, term19931.getClass(), "first", null);
        setField(term19931, term19931.getClass(), "last", null);
        setIntField(term19931, term19931.getClass(), "modCount", -1541981599);
        Object term19934 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19934, term19934.getClass(), "size", 1605456363);
        setField(term19934, term19934.getClass(), "first", null);
        setField(term19934, term19934.getClass(), "last", null);
        setIntField(term19934, term19934.getClass(), "modCount", 2059896693);
        Object term19937 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19937, term19937.getClass(), "size", 2109912812);
        setField(term19937, term19937.getClass(), "first", null);
        setField(term19937, term19937.getClass(), "last", null);
        setIntField(term19937, term19937.getClass(), "modCount", 1841286431);
        ArrayDeque term19926 = new ArrayDeque();
        ((ArrayDeque) term19926).add(term19928);
        ((ArrayDeque) term19926).add(term19931);
        ((ArrayDeque) term19926).add(term19934);
        ((ArrayDeque) term19926).add(term19937);
        ArrayList term19942 = new ArrayList();
        ((ArrayList) term19942).add((Object)null);
        ((ArrayList) term19942).add((Object)null);
        HashMap term19948 = new HashMap();
        ArrayList term19953 = new ArrayList();
        ((ArrayList) term19953).add((Object)null);
        ((ArrayList) term19953).add((Object)null);
        ((ArrayList) term19953).add((Object)null);
        term19924 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19925 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19946 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19947 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19925, term19925.getClass(), "actionBundles", term19926);
        setField(term19925, term19925.getClass(), "conditions", term19942);
        setField(term19947, term19947.getClass(), "matchers", term19948);
        setField(term19946, term19946.getClass(), "parameterConditions", term19947);
        setField(term19946, term19946.getClass(), "referenceCondition", null);
        setField(term19946, term19946.getClass(), "hostCondition", null);
        setField(term19946, term19946.getClass(), "pathCondition", null);
        setField(term19946, term19946.getClass(), "portCondition", null);
        setField(term19946, term19946.getClass(), "schemaCondition", null);
        setField(term19925, term19925.getClass(), "urlConditions", term19946);
        setField(term19924, term19924.getClass(), "ruleBuilder", term19925);
        setField(term19924, term19924.getClass(), "requests", term19953);
        term19957 = new Integer(-1723168189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19957;
        callMethod(klass, "called", argTypes, term19924, args);
    }

};


