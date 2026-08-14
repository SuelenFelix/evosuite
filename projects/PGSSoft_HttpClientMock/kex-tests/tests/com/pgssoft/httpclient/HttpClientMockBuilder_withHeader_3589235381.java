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

public class HttpClientMockBuilder_withHeader_3589235381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4887;

    public HttpClientMockBuilder_withHeader_3589235381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4891 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term4891, term4891.getClass(), "size", -616727354);
        setField(term4891, term4891.getClass(), "first", null);
        setField(term4891, term4891.getClass(), "last", null);
        setIntField(term4891, term4891.getClass(), "modCount", -1955890973);
        Object term4894 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term4894, term4894.getClass(), "size", -2038273078);
        setField(term4894, term4894.getClass(), "first", null);
        setField(term4894, term4894.getClass(), "last", null);
        setIntField(term4894, term4894.getClass(), "modCount", 1227103734);
        Object term4897 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term4897, term4897.getClass(), "size", -1339778481);
        setField(term4897, term4897.getClass(), "first", null);
        setField(term4897, term4897.getClass(), "last", null);
        setIntField(term4897, term4897.getClass(), "modCount", 1725571209);
        Object term4900 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term4900, term4900.getClass(), "size", -522618178);
        setField(term4900, term4900.getClass(), "first", null);
        setField(term4900, term4900.getClass(), "last", null);
        setIntField(term4900, term4900.getClass(), "modCount", 1134449235);
        Object term4903 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term4903, term4903.getClass(), "size", -883034806);
        setField(term4903, term4903.getClass(), "first", null);
        setField(term4903, term4903.getClass(), "last", null);
        setIntField(term4903, term4903.getClass(), "modCount", 1585847225);
        Object term4906 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term4906, term4906.getClass(), "size", 597278769);
        setField(term4906, term4906.getClass(), "first", null);
        setField(term4906, term4906.getClass(), "last", null);
        setIntField(term4906, term4906.getClass(), "modCount", -1685132342);
        ArrayDeque term4889 = new ArrayDeque();
        ((ArrayDeque) term4889).add(term4891);
        ((ArrayDeque) term4889).add(term4894);
        ((ArrayDeque) term4889).add(term4897);
        ((ArrayDeque) term4889).add(term4900);
        ((ArrayDeque) term4889).add(term4903);
        ((ArrayDeque) term4889).add(term4906);
        ArrayList term4911 = new ArrayList();
        ((ArrayList) term4911).add((Object)null);
        ((ArrayList) term4911).add((Object)null);
        HashMap term4917 = new HashMap();
        ArrayDeque term4924 = new ArrayDeque();
        ((ArrayDeque) term4924).add((Object)null);
        ArrayList term4928 = new ArrayList();
        ((ArrayList) term4928).add((Object)null);
        ((ArrayList) term4928).add((Object)null);
        ((ArrayList) term4928).add((Object)null);
        ((ArrayList) term4928).add((Object)null);
        ((ArrayList) term4928).add((Object)null);
        ((ArrayList) term4928).add((Object)null);
        ((ArrayList) term4928).add((Object)null);
        ((ArrayList) term4928).add((Object)null);
        ((ArrayList) term4928).add((Object)null);
        term4887 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term4888 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term4915 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term4916 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term4922 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term4923 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term4932 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term4933 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term4888, term4888.getClass(), "actionBundles", term4889);
        setField(term4888, term4888.getClass(), "conditions", term4911);
        setField(term4916, term4916.getClass(), "matchers", term4917);
        setField(term4915, term4915.getClass(), "parameterConditions", term4916);
        setField(term4915, term4915.getClass(), "referenceCondition", null);
        setField(term4915, term4915.getClass(), "hostCondition", null);
        setField(term4915, term4915.getClass(), "pathCondition", null);
        setField(term4915, term4915.getClass(), "portCondition", null);
        setField(term4915, term4915.getClass(), "schemaCondition", null);
        setField(term4888, term4888.getClass(), "urlConditions", term4915);
        setField(term4887, term4887.getClass(), "ruleBuilder", term4888);
        setField(term4923, term4923.getClass(), "actionBundles", term4924);
        setField(term4923, term4923.getClass(), "conditions", term4928);
        setField(term4933, term4933.getClass(), "matchers", null);
        setField(term4932, term4932.getClass(), "parameterConditions", term4933);
        setField(term4932, term4932.getClass(), "referenceCondition", null);
        setField(term4932, term4932.getClass(), "hostCondition", null);
        setField(term4932, term4932.getClass(), "pathCondition", null);
        setField(term4932, term4932.getClass(), "portCondition", null);
        setField(term4932, term4932.getClass(), "schemaCondition", null);
        setField(term4923, term4923.getClass(), "urlConditions", term4932);
        setField(term4922, term4922.getClass(), "ruleBuilder", term4923);
        setField(term4887, term4887.getClass(), "responseBuilder", term4922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "EGtDIRbSSb";
        args[1] = "SzjVpOQTyS";
        callMethod(klass, "withHeader", argTypes, term4887, args);
    }

};


