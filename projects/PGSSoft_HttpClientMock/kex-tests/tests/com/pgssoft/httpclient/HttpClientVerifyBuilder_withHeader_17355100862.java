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

public class HttpClientVerifyBuilder_withHeader_17355100862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19356;

    public HttpClientVerifyBuilder_withHeader_17355100862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19360 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19360, term19360.getClass(), "size", 872295704);
        setField(term19360, term19360.getClass(), "first", null);
        setField(term19360, term19360.getClass(), "last", null);
        setIntField(term19360, term19360.getClass(), "modCount", 86041387);
        Object term19363 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19363, term19363.getClass(), "size", 1010721666);
        setField(term19363, term19363.getClass(), "first", null);
        setField(term19363, term19363.getClass(), "last", null);
        setIntField(term19363, term19363.getClass(), "modCount", 27043781);
        Object term19366 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19366, term19366.getClass(), "size", -1367122405);
        setField(term19366, term19366.getClass(), "first", null);
        setField(term19366, term19366.getClass(), "last", null);
        setIntField(term19366, term19366.getClass(), "modCount", -1703625118);
        Object term19369 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19369, term19369.getClass(), "size", 1104108112);
        setField(term19369, term19369.getClass(), "first", null);
        setField(term19369, term19369.getClass(), "last", null);
        setIntField(term19369, term19369.getClass(), "modCount", 1648665618);
        Object term19372 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19372, term19372.getClass(), "size", 633765954);
        setField(term19372, term19372.getClass(), "first", null);
        setField(term19372, term19372.getClass(), "last", null);
        setIntField(term19372, term19372.getClass(), "modCount", 269110087);
        Object term19375 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19375, term19375.getClass(), "size", 1545119095);
        setField(term19375, term19375.getClass(), "first", null);
        setField(term19375, term19375.getClass(), "last", null);
        setIntField(term19375, term19375.getClass(), "modCount", 1671229683);
        Object term19378 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19378, term19378.getClass(), "size", 34167717);
        setField(term19378, term19378.getClass(), "first", null);
        setField(term19378, term19378.getClass(), "last", null);
        setIntField(term19378, term19378.getClass(), "modCount", -514195141);
        Object term19381 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19381, term19381.getClass(), "size", -297946422);
        setField(term19381, term19381.getClass(), "first", null);
        setField(term19381, term19381.getClass(), "last", null);
        setIntField(term19381, term19381.getClass(), "modCount", 385463636);
        Object term19384 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19384, term19384.getClass(), "size", -1677599962);
        setField(term19384, term19384.getClass(), "first", null);
        setField(term19384, term19384.getClass(), "last", null);
        setIntField(term19384, term19384.getClass(), "modCount", -1790275458);
        ArrayDeque term19358 = new ArrayDeque();
        ((ArrayDeque) term19358).add(term19360);
        ((ArrayDeque) term19358).add(term19363);
        ((ArrayDeque) term19358).add(term19366);
        ((ArrayDeque) term19358).add(term19369);
        ((ArrayDeque) term19358).add(term19372);
        ((ArrayDeque) term19358).add(term19375);
        ((ArrayDeque) term19358).add(term19378);
        ((ArrayDeque) term19358).add(term19381);
        ((ArrayDeque) term19358).add(term19384);
        ArrayList term19389 = new ArrayList();
        ((ArrayList) term19389).add((Object)null);
        HashMap term19395 = new HashMap();
        ArrayList term19400 = new ArrayList();
        ((ArrayList) term19400).add((Object)null);
        term19356 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19357 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19393 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19394 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19357, term19357.getClass(), "actionBundles", term19358);
        setField(term19357, term19357.getClass(), "conditions", term19389);
        setField(term19394, term19394.getClass(), "matchers", term19395);
        setField(term19393, term19393.getClass(), "parameterConditions", term19394);
        setField(term19393, term19393.getClass(), "referenceCondition", null);
        setField(term19393, term19393.getClass(), "hostCondition", null);
        setField(term19393, term19393.getClass(), "pathCondition", null);
        setField(term19393, term19393.getClass(), "portCondition", null);
        setField(term19393, term19393.getClass(), "schemaCondition", null);
        setField(term19357, term19357.getClass(), "urlConditions", term19393);
        setField(term19356, term19356.getClass(), "ruleBuilder", term19357);
        setField(term19356, term19356.getClass(), "requests", term19400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[2];
        args[0] = "pORebkoRdD";
        args[1] = null;
        callMethod(klass, "withHeader", argTypes, term19356, args);
    }

};


