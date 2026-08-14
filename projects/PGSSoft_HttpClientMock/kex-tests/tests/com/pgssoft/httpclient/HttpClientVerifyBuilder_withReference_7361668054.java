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

public class HttpClientVerifyBuilder_withReference_7361668054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19496;

    public HttpClientVerifyBuilder_withReference_7361668054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19500 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19500, term19500.getClass(), "size", -1511130237);
        setField(term19500, term19500.getClass(), "first", null);
        setField(term19500, term19500.getClass(), "last", null);
        setIntField(term19500, term19500.getClass(), "modCount", 452088587);
        Object term19503 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19503, term19503.getClass(), "size", -1630069454);
        setField(term19503, term19503.getClass(), "first", null);
        setField(term19503, term19503.getClass(), "last", null);
        setIntField(term19503, term19503.getClass(), "modCount", 1499735894);
        Object term19506 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19506, term19506.getClass(), "size", 716486048);
        setField(term19506, term19506.getClass(), "first", null);
        setField(term19506, term19506.getClass(), "last", null);
        setIntField(term19506, term19506.getClass(), "modCount", -466708718);
        Object term19509 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19509, term19509.getClass(), "size", 1038029515);
        setField(term19509, term19509.getClass(), "first", null);
        setField(term19509, term19509.getClass(), "last", null);
        setIntField(term19509, term19509.getClass(), "modCount", 1137154606);
        Object term19512 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19512, term19512.getClass(), "size", -100681578);
        setField(term19512, term19512.getClass(), "first", null);
        setField(term19512, term19512.getClass(), "last", null);
        setIntField(term19512, term19512.getClass(), "modCount", 296568835);
        Object term19515 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19515, term19515.getClass(), "size", 1431951992);
        setField(term19515, term19515.getClass(), "first", null);
        setField(term19515, term19515.getClass(), "last", null);
        setIntField(term19515, term19515.getClass(), "modCount", -1608123016);
        ArrayDeque term19498 = new ArrayDeque();
        ((ArrayDeque) term19498).add(term19500);
        ((ArrayDeque) term19498).add(term19503);
        ((ArrayDeque) term19498).add(term19506);
        ((ArrayDeque) term19498).add(term19509);
        ((ArrayDeque) term19498).add(term19512);
        ((ArrayDeque) term19498).add(term19515);
        ArrayList term19520 = new ArrayList();
        ((ArrayList) term19520).add((Object)null);
        ((ArrayList) term19520).add((Object)null);
        HashMap term19526 = new HashMap();
        ArrayList term19531 = new ArrayList();
        ((ArrayList) term19531).add((Object)null);
        ((ArrayList) term19531).add((Object)null);
        ((ArrayList) term19531).add((Object)null);
        ((ArrayList) term19531).add((Object)null);
        ((ArrayList) term19531).add((Object)null);
        term19496 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19497 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19524 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19525 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19497, term19497.getClass(), "actionBundles", term19498);
        setField(term19497, term19497.getClass(), "conditions", term19520);
        setField(term19525, term19525.getClass(), "matchers", term19526);
        setField(term19524, term19524.getClass(), "parameterConditions", term19525);
        setField(term19524, term19524.getClass(), "referenceCondition", null);
        setField(term19524, term19524.getClass(), "hostCondition", null);
        setField(term19524, term19524.getClass(), "pathCondition", null);
        setField(term19524, term19524.getClass(), "portCondition", null);
        setField(term19524, term19524.getClass(), "schemaCondition", null);
        setField(term19497, term19497.getClass(), "urlConditions", term19524);
        setField(term19496, term19496.getClass(), "ruleBuilder", term19497);
        setField(term19496, term19496.getClass(), "requests", term19531);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withReference", argTypes, term19496, args);
    }

};


