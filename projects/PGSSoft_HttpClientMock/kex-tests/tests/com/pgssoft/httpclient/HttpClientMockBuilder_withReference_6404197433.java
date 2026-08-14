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

public class HttpClientMockBuilder_withReference_6404197433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5038;

    public HttpClientMockBuilder_withReference_6404197433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5042 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5042, term5042.getClass(), "size", -469968304);
        setField(term5042, term5042.getClass(), "first", null);
        setField(term5042, term5042.getClass(), "last", null);
        setIntField(term5042, term5042.getClass(), "modCount", -1145578966);
        Object term5045 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5045, term5045.getClass(), "size", 679763016);
        setField(term5045, term5045.getClass(), "first", null);
        setField(term5045, term5045.getClass(), "last", null);
        setIntField(term5045, term5045.getClass(), "modCount", 1962444399);
        Object term5048 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5048, term5048.getClass(), "size", 767834723);
        setField(term5048, term5048.getClass(), "first", null);
        setField(term5048, term5048.getClass(), "last", null);
        setIntField(term5048, term5048.getClass(), "modCount", -602026508);
        ArrayDeque term5040 = new ArrayDeque();
        ((ArrayDeque) term5040).add(term5042);
        ((ArrayDeque) term5040).add(term5045);
        ((ArrayDeque) term5040).add(term5048);
        ArrayList term5053 = new ArrayList();
        ((ArrayList) term5053).add((Object)null);
        ((ArrayList) term5053).add((Object)null);
        ((ArrayList) term5053).add((Object)null);
        ((ArrayList) term5053).add((Object)null);
        ((ArrayList) term5053).add((Object)null);
        ((ArrayList) term5053).add((Object)null);
        ((ArrayList) term5053).add((Object)null);
        HashMap term5059 = new HashMap();
        ArrayDeque term5066 = new ArrayDeque();
        ((ArrayDeque) term5066).add((Object)null);
        ((ArrayDeque) term5066).add((Object)null);
        ArrayList term5070 = new ArrayList();
        ((ArrayList) term5070).add((Object)null);
        ((ArrayList) term5070).add((Object)null);
        ((ArrayList) term5070).add((Object)null);
        ((ArrayList) term5070).add((Object)null);
        ((ArrayList) term5070).add((Object)null);
        ((ArrayList) term5070).add((Object)null);
        term5038 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term5039 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5057 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5058 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term5064 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term5065 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5074 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5075 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5039, term5039.getClass(), "actionBundles", term5040);
        setField(term5039, term5039.getClass(), "conditions", term5053);
        setField(term5058, term5058.getClass(), "matchers", term5059);
        setField(term5057, term5057.getClass(), "parameterConditions", term5058);
        setField(term5057, term5057.getClass(), "referenceCondition", null);
        setField(term5057, term5057.getClass(), "hostCondition", null);
        setField(term5057, term5057.getClass(), "pathCondition", null);
        setField(term5057, term5057.getClass(), "portCondition", null);
        setField(term5057, term5057.getClass(), "schemaCondition", null);
        setField(term5039, term5039.getClass(), "urlConditions", term5057);
        setField(term5038, term5038.getClass(), "ruleBuilder", term5039);
        setField(term5065, term5065.getClass(), "actionBundles", term5066);
        setField(term5065, term5065.getClass(), "conditions", term5070);
        setField(term5075, term5075.getClass(), "matchers", null);
        setField(term5074, term5074.getClass(), "parameterConditions", term5075);
        setField(term5074, term5074.getClass(), "referenceCondition", null);
        setField(term5074, term5074.getClass(), "hostCondition", null);
        setField(term5074, term5074.getClass(), "pathCondition", null);
        setField(term5074, term5074.getClass(), "portCondition", null);
        setField(term5074, term5074.getClass(), "schemaCondition", null);
        setField(term5065, term5065.getClass(), "urlConditions", term5074);
        setField(term5064, term5064.getClass(), "ruleBuilder", term5065);
        setField(term5038, term5038.getClass(), "responseBuilder", term5064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        callMethod(klass, "withReference", argTypes, term5038, args);
    }

};


