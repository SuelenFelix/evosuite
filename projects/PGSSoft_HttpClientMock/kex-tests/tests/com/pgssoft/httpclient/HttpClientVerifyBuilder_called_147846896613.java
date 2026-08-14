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

public class HttpClientVerifyBuilder_called_147846896613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19891;

    public HttpClientVerifyBuilder_called_147846896613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19895 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19895, term19895.getClass(), "size", -886200503);
        setField(term19895, term19895.getClass(), "first", null);
        setField(term19895, term19895.getClass(), "last", null);
        setIntField(term19895, term19895.getClass(), "modCount", 1136393691);
        Object term19898 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19898, term19898.getClass(), "size", -1288536479);
        setField(term19898, term19898.getClass(), "first", null);
        setField(term19898, term19898.getClass(), "last", null);
        setIntField(term19898, term19898.getClass(), "modCount", 1092038167);
        Object term19901 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19901, term19901.getClass(), "size", 1879729823);
        setField(term19901, term19901.getClass(), "first", null);
        setField(term19901, term19901.getClass(), "last", null);
        setIntField(term19901, term19901.getClass(), "modCount", 1443855558);
        Object term19904 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19904, term19904.getClass(), "size", -1933419449);
        setField(term19904, term19904.getClass(), "first", null);
        setField(term19904, term19904.getClass(), "last", null);
        setIntField(term19904, term19904.getClass(), "modCount", -1804322375);
        ArrayDeque term19893 = new ArrayDeque();
        ((ArrayDeque) term19893).add(term19895);
        ((ArrayDeque) term19893).add(term19898);
        ((ArrayDeque) term19893).add(term19901);
        ((ArrayDeque) term19893).add(term19904);
        ArrayList term19909 = new ArrayList();
        ((ArrayList) term19909).add((Object)null);
        ((ArrayList) term19909).add((Object)null);
        HashMap term19915 = new HashMap();
        ArrayList term19920 = new ArrayList();
        ((ArrayList) term19920).add((Object)null);
        ((ArrayList) term19920).add((Object)null);
        ((ArrayList) term19920).add((Object)null);
        ((ArrayList) term19920).add((Object)null);
        ((ArrayList) term19920).add((Object)null);
        ((ArrayList) term19920).add((Object)null);
        ((ArrayList) term19920).add((Object)null);
        term19891 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19892 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19913 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19914 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19892, term19892.getClass(), "actionBundles", term19893);
        setField(term19892, term19892.getClass(), "conditions", term19909);
        setField(term19914, term19914.getClass(), "matchers", term19915);
        setField(term19913, term19913.getClass(), "parameterConditions", term19914);
        setField(term19913, term19913.getClass(), "referenceCondition", null);
        setField(term19913, term19913.getClass(), "hostCondition", null);
        setField(term19913, term19913.getClass(), "pathCondition", null);
        setField(term19913, term19913.getClass(), "portCondition", null);
        setField(term19913, term19913.getClass(), "schemaCondition", null);
        setField(term19892, term19892.getClass(), "urlConditions", term19913);
        setField(term19891, term19891.getClass(), "ruleBuilder", term19892);
        setField(term19891, term19891.getClass(), "requests", term19920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "called", argTypes, term19891, args);
    }

};


