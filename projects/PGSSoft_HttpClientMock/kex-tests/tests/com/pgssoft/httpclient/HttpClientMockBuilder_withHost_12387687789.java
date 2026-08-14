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

public class HttpClientMockBuilder_withHost_12387687789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5399;

    public HttpClientMockBuilder_withHost_12387687789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5403 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5403, term5403.getClass(), "size", -341152642);
        setField(term5403, term5403.getClass(), "first", null);
        setField(term5403, term5403.getClass(), "last", null);
        setIntField(term5403, term5403.getClass(), "modCount", -2015854073);
        Object term5406 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5406, term5406.getClass(), "size", 538259104);
        setField(term5406, term5406.getClass(), "first", null);
        setField(term5406, term5406.getClass(), "last", null);
        setIntField(term5406, term5406.getClass(), "modCount", 96566506);
        Object term5409 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5409, term5409.getClass(), "size", -343325701);
        setField(term5409, term5409.getClass(), "first", null);
        setField(term5409, term5409.getClass(), "last", null);
        setIntField(term5409, term5409.getClass(), "modCount", 107945604);
        Object term5412 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5412, term5412.getClass(), "size", -1963464809);
        setField(term5412, term5412.getClass(), "first", null);
        setField(term5412, term5412.getClass(), "last", null);
        setIntField(term5412, term5412.getClass(), "modCount", 71190297);
        ArrayDeque term5401 = new ArrayDeque();
        ((ArrayDeque) term5401).add(term5403);
        ((ArrayDeque) term5401).add(term5406);
        ((ArrayDeque) term5401).add(term5409);
        ((ArrayDeque) term5401).add(term5412);
        ArrayList term5417 = new ArrayList();
        ((ArrayList) term5417).add((Object)null);
        ((ArrayList) term5417).add((Object)null);
        HashMap term5423 = new HashMap();
        ArrayDeque term5430 = new ArrayDeque();
        ((ArrayDeque) term5430).add((Object)null);
        ((ArrayDeque) term5430).add((Object)null);
        ((ArrayDeque) term5430).add((Object)null);
        ((ArrayDeque) term5430).add((Object)null);
        ((ArrayDeque) term5430).add((Object)null);
        ArrayList term5434 = new ArrayList();
        term5399 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term5400 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5421 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5422 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term5428 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term5429 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5438 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5439 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5400, term5400.getClass(), "actionBundles", term5401);
        setField(term5400, term5400.getClass(), "conditions", term5417);
        setField(term5422, term5422.getClass(), "matchers", term5423);
        setField(term5421, term5421.getClass(), "parameterConditions", term5422);
        setField(term5421, term5421.getClass(), "referenceCondition", null);
        setField(term5421, term5421.getClass(), "hostCondition", null);
        setField(term5421, term5421.getClass(), "pathCondition", null);
        setField(term5421, term5421.getClass(), "portCondition", null);
        setField(term5421, term5421.getClass(), "schemaCondition", null);
        setField(term5400, term5400.getClass(), "urlConditions", term5421);
        setField(term5399, term5399.getClass(), "ruleBuilder", term5400);
        setField(term5429, term5429.getClass(), "actionBundles", term5430);
        setField(term5429, term5429.getClass(), "conditions", term5434);
        setField(term5439, term5439.getClass(), "matchers", null);
        setField(term5438, term5438.getClass(), "parameterConditions", term5439);
        setField(term5438, term5438.getClass(), "referenceCondition", null);
        setField(term5438, term5438.getClass(), "hostCondition", null);
        setField(term5438, term5438.getClass(), "pathCondition", null);
        setField(term5438, term5438.getClass(), "portCondition", null);
        setField(term5438, term5438.getClass(), "schemaCondition", null);
        setField(term5429, term5429.getClass(), "urlConditions", term5438);
        setField(term5428, term5428.getClass(), "ruleBuilder", term5429);
        setField(term5399, term5399.getClass(), "responseBuilder", term5428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        callMethod(klass, "withHost", argTypes, term5399, args);
    }

};


