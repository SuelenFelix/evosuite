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

public class HttpClientVerifyBuilder_withParameter_3135125105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19535;

    public HttpClientVerifyBuilder_withParameter_3135125105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19539 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19539, term19539.getClass(), "size", -896473214);
        setField(term19539, term19539.getClass(), "first", null);
        setField(term19539, term19539.getClass(), "last", null);
        setIntField(term19539, term19539.getClass(), "modCount", 401203924);
        ArrayDeque term19537 = new ArrayDeque();
        ((ArrayDeque) term19537).add(term19539);
        ArrayList term19544 = new ArrayList();
        ((ArrayList) term19544).add((Object)null);
        ((ArrayList) term19544).add((Object)null);
        ((ArrayList) term19544).add((Object)null);
        ((ArrayList) term19544).add((Object)null);
        ((ArrayList) term19544).add((Object)null);
        ((ArrayList) term19544).add((Object)null);
        ((ArrayList) term19544).add((Object)null);
        ((ArrayList) term19544).add((Object)null);
        HashMap term19550 = new HashMap();
        ArrayList term19555 = new ArrayList();
        term19535 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19536 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19548 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19549 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19536, term19536.getClass(), "actionBundles", term19537);
        setField(term19536, term19536.getClass(), "conditions", term19544);
        setField(term19549, term19549.getClass(), "matchers", term19550);
        setField(term19548, term19548.getClass(), "parameterConditions", term19549);
        setField(term19548, term19548.getClass(), "referenceCondition", null);
        setField(term19548, term19548.getClass(), "hostCondition", null);
        setField(term19548, term19548.getClass(), "pathCondition", null);
        setField(term19548, term19548.getClass(), "portCondition", null);
        setField(term19548, term19548.getClass(), "schemaCondition", null);
        setField(term19536, term19536.getClass(), "urlConditions", term19548);
        setField(term19535, term19535.getClass(), "ruleBuilder", term19536);
        setField(term19535, term19535.getClass(), "requests", term19555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "dpNsDgfPso";
        args[1] = "hCWPJQKpdc";
        callMethod(klass, "withParameter", argTypes, term19535, args);
    }

};


