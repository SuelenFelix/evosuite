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

public class HttpClientMockBuilder_doReturnStatus_112619767316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5813;
     Object term5842;

    public HttpClientMockBuilder_doReturnStatus_112619767316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5815 = new ArrayDeque();
        ArrayList term5819 = new ArrayList();
        ((ArrayList) term5819).add((Object)null);
        ((ArrayList) term5819).add((Object)null);
        ((ArrayList) term5819).add((Object)null);
        ((ArrayList) term5819).add((Object)null);
        ((ArrayList) term5819).add((Object)null);
        ((ArrayList) term5819).add((Object)null);
        ((ArrayList) term5819).add((Object)null);
        HashMap term5825 = new HashMap();
        ArrayDeque term5832 = new ArrayDeque();
        ((ArrayDeque) term5832).add((Object)null);
        ArrayList term5836 = new ArrayList();
        ((ArrayList) term5836).add((Object)null);
        ((ArrayList) term5836).add((Object)null);
        ((ArrayList) term5836).add((Object)null);
        ((ArrayList) term5836).add((Object)null);
        ((ArrayList) term5836).add((Object)null);
        ((ArrayList) term5836).add((Object)null);
        term5813 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term5814 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5823 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5824 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term5830 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term5831 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5840 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5841 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5814, term5814.getClass(), "actionBundles", term5815);
        setField(term5814, term5814.getClass(), "conditions", term5819);
        setField(term5824, term5824.getClass(), "matchers", term5825);
        setField(term5823, term5823.getClass(), "parameterConditions", term5824);
        setField(term5823, term5823.getClass(), "referenceCondition", null);
        setField(term5823, term5823.getClass(), "hostCondition", null);
        setField(term5823, term5823.getClass(), "pathCondition", null);
        setField(term5823, term5823.getClass(), "portCondition", null);
        setField(term5823, term5823.getClass(), "schemaCondition", null);
        setField(term5814, term5814.getClass(), "urlConditions", term5823);
        setField(term5813, term5813.getClass(), "ruleBuilder", term5814);
        setField(term5831, term5831.getClass(), "actionBundles", term5832);
        setField(term5831, term5831.getClass(), "conditions", term5836);
        setField(term5841, term5841.getClass(), "matchers", null);
        setField(term5840, term5840.getClass(), "parameterConditions", term5841);
        setField(term5840, term5840.getClass(), "referenceCondition", null);
        setField(term5840, term5840.getClass(), "hostCondition", null);
        setField(term5840, term5840.getClass(), "pathCondition", null);
        setField(term5840, term5840.getClass(), "portCondition", null);
        setField(term5840, term5840.getClass(), "schemaCondition", null);
        setField(term5831, term5831.getClass(), "urlConditions", term5840);
        setField(term5830, term5830.getClass(), "ruleBuilder", term5831);
        setField(term5813, term5813.getClass(), "responseBuilder", term5830);
        term5842 = new Integer(1320570890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5842;
        callMethod(klass, "doReturnStatus", argTypes, term5813, args);
    }

};


