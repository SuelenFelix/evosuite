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

public class HttpClientMockBuilder_withParameter_2868284505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5145;

    public HttpClientMockBuilder_withParameter_2868284505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5149 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5149, term5149.getClass(), "size", -93135961);
        setField(term5149, term5149.getClass(), "first", null);
        setField(term5149, term5149.getClass(), "last", null);
        setIntField(term5149, term5149.getClass(), "modCount", -112921587);
        Object term5152 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5152, term5152.getClass(), "size", 933028652);
        setField(term5152, term5152.getClass(), "first", null);
        setField(term5152, term5152.getClass(), "last", null);
        setIntField(term5152, term5152.getClass(), "modCount", 287287233);
        Object term5155 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5155, term5155.getClass(), "size", 962840079);
        setField(term5155, term5155.getClass(), "first", null);
        setField(term5155, term5155.getClass(), "last", null);
        setIntField(term5155, term5155.getClass(), "modCount", 1540719661);
        Object term5158 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5158, term5158.getClass(), "size", 1265463001);
        setField(term5158, term5158.getClass(), "first", null);
        setField(term5158, term5158.getClass(), "last", null);
        setIntField(term5158, term5158.getClass(), "modCount", 335112684);
        Object term5161 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5161, term5161.getClass(), "size", 1551099402);
        setField(term5161, term5161.getClass(), "first", null);
        setField(term5161, term5161.getClass(), "last", null);
        setIntField(term5161, term5161.getClass(), "modCount", -2027534003);
        ArrayDeque term5147 = new ArrayDeque();
        ((ArrayDeque) term5147).add(term5149);
        ((ArrayDeque) term5147).add(term5152);
        ((ArrayDeque) term5147).add(term5155);
        ((ArrayDeque) term5147).add(term5158);
        ((ArrayDeque) term5147).add(term5161);
        ArrayList term5166 = new ArrayList();
        ((ArrayList) term5166).add((Object)null);
        ((ArrayList) term5166).add((Object)null);
        ((ArrayList) term5166).add((Object)null);
        ((ArrayList) term5166).add((Object)null);
        ((ArrayList) term5166).add((Object)null);
        HashMap term5172 = new HashMap();
        ArrayDeque term5179 = new ArrayDeque();
        ((ArrayDeque) term5179).add((Object)null);
        ArrayList term5183 = new ArrayList();
        term5145 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term5146 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5170 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5171 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term5177 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term5178 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5187 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5188 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5146, term5146.getClass(), "actionBundles", term5147);
        setField(term5146, term5146.getClass(), "conditions", term5166);
        setField(term5171, term5171.getClass(), "matchers", term5172);
        setField(term5170, term5170.getClass(), "parameterConditions", term5171);
        setField(term5170, term5170.getClass(), "referenceCondition", null);
        setField(term5170, term5170.getClass(), "hostCondition", null);
        setField(term5170, term5170.getClass(), "pathCondition", null);
        setField(term5170, term5170.getClass(), "portCondition", null);
        setField(term5170, term5170.getClass(), "schemaCondition", null);
        setField(term5146, term5146.getClass(), "urlConditions", term5170);
        setField(term5145, term5145.getClass(), "ruleBuilder", term5146);
        setField(term5178, term5178.getClass(), "actionBundles", term5179);
        setField(term5178, term5178.getClass(), "conditions", term5183);
        setField(term5188, term5188.getClass(), "matchers", null);
        setField(term5187, term5187.getClass(), "parameterConditions", term5188);
        setField(term5187, term5187.getClass(), "referenceCondition", null);
        setField(term5187, term5187.getClass(), "hostCondition", null);
        setField(term5187, term5187.getClass(), "pathCondition", null);
        setField(term5187, term5187.getClass(), "portCondition", null);
        setField(term5187, term5187.getClass(), "schemaCondition", null);
        setField(term5178, term5178.getClass(), "urlConditions", term5187);
        setField(term5177, term5177.getClass(), "ruleBuilder", term5178);
        setField(term5145, term5145.getClass(), "responseBuilder", term5177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "RMFIsYGgne";
        args[1] = "NRdvgJlhkX";
        callMethod(klass, "withParameter", argTypes, term5145, args);
    }

};


