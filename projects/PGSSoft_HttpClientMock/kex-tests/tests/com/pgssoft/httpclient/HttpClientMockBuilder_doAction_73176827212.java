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

public class HttpClientMockBuilder_doAction_73176827212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5569;

    public HttpClientMockBuilder_doAction_73176827212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5573 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5573, term5573.getClass(), "size", -1885090354);
        setField(term5573, term5573.getClass(), "first", null);
        setField(term5573, term5573.getClass(), "last", null);
        setIntField(term5573, term5573.getClass(), "modCount", -2066804303);
        Object term5576 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5576, term5576.getClass(), "size", -1731761810);
        setField(term5576, term5576.getClass(), "first", null);
        setField(term5576, term5576.getClass(), "last", null);
        setIntField(term5576, term5576.getClass(), "modCount", 197109649);
        Object term5579 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5579, term5579.getClass(), "size", -1239406390);
        setField(term5579, term5579.getClass(), "first", null);
        setField(term5579, term5579.getClass(), "last", null);
        setIntField(term5579, term5579.getClass(), "modCount", 1557431527);
        Object term5582 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5582, term5582.getClass(), "size", -1504890659);
        setField(term5582, term5582.getClass(), "first", null);
        setField(term5582, term5582.getClass(), "last", null);
        setIntField(term5582, term5582.getClass(), "modCount", 1358829571);
        Object term5585 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5585, term5585.getClass(), "size", 991356662);
        setField(term5585, term5585.getClass(), "first", null);
        setField(term5585, term5585.getClass(), "last", null);
        setIntField(term5585, term5585.getClass(), "modCount", -506958186);
        Object term5588 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5588, term5588.getClass(), "size", -507387516);
        setField(term5588, term5588.getClass(), "first", null);
        setField(term5588, term5588.getClass(), "last", null);
        setIntField(term5588, term5588.getClass(), "modCount", -1970452551);
        Object term5591 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5591, term5591.getClass(), "size", -1896376975);
        setField(term5591, term5591.getClass(), "first", null);
        setField(term5591, term5591.getClass(), "last", null);
        setIntField(term5591, term5591.getClass(), "modCount", 729658803);
        ArrayDeque term5571 = new ArrayDeque();
        ((ArrayDeque) term5571).add(term5573);
        ((ArrayDeque) term5571).add(term5576);
        ((ArrayDeque) term5571).add(term5579);
        ((ArrayDeque) term5571).add(term5582);
        ((ArrayDeque) term5571).add(term5585);
        ((ArrayDeque) term5571).add(term5588);
        ((ArrayDeque) term5571).add(term5591);
        ArrayList term5596 = new ArrayList();
        ((ArrayList) term5596).add((Object)null);
        ((ArrayList) term5596).add((Object)null);
        ((ArrayList) term5596).add((Object)null);
        ((ArrayList) term5596).add((Object)null);
        ((ArrayList) term5596).add((Object)null);
        ((ArrayList) term5596).add((Object)null);
        HashMap term5602 = new HashMap();
        ArrayDeque term5609 = new ArrayDeque();
        ((ArrayDeque) term5609).add((Object)null);
        ((ArrayDeque) term5609).add((Object)null);
        ((ArrayDeque) term5609).add((Object)null);
        ((ArrayDeque) term5609).add((Object)null);
        ((ArrayDeque) term5609).add(term5579);
        ((ArrayDeque) term5609).add(term5591);
        ArrayList term5613 = new ArrayList();
        term5569 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term5570 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5600 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5601 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term5607 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term5608 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5617 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5618 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5570, term5570.getClass(), "actionBundles", term5571);
        setField(term5570, term5570.getClass(), "conditions", term5596);
        setField(term5601, term5601.getClass(), "matchers", term5602);
        setField(term5600, term5600.getClass(), "parameterConditions", term5601);
        setField(term5600, term5600.getClass(), "referenceCondition", null);
        setField(term5600, term5600.getClass(), "hostCondition", null);
        setField(term5600, term5600.getClass(), "pathCondition", null);
        setField(term5600, term5600.getClass(), "portCondition", null);
        setField(term5600, term5600.getClass(), "schemaCondition", null);
        setField(term5570, term5570.getClass(), "urlConditions", term5600);
        setField(term5569, term5569.getClass(), "ruleBuilder", term5570);
        setField(term5608, term5608.getClass(), "actionBundles", term5609);
        setField(term5608, term5608.getClass(), "conditions", term5613);
        setField(term5618, term5618.getClass(), "matchers", null);
        setField(term5617, term5617.getClass(), "parameterConditions", term5618);
        setField(term5617, term5617.getClass(), "referenceCondition", null);
        setField(term5617, term5617.getClass(), "hostCondition", null);
        setField(term5617, term5617.getClass(), "pathCondition", null);
        setField(term5617, term5617.getClass(), "portCondition", null);
        setField(term5617, term5617.getClass(), "schemaCondition", null);
        setField(term5608, term5608.getClass(), "urlConditions", term5617);
        setField(term5607, term5607.getClass(), "ruleBuilder", term5608);
        setField(term5569, term5569.getClass(), "responseBuilder", term5607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.Action");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "doAction", argTypes, term5569, args);
    }

};


