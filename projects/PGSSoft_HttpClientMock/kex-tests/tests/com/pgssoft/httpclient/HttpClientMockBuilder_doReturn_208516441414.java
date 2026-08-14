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

public class HttpClientMockBuilder_doReturn_208516441414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5688;
     Object term5735;

    public HttpClientMockBuilder_doReturn_208516441414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5692 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5692, term5692.getClass(), "size", -165587447);
        setField(term5692, term5692.getClass(), "first", null);
        setField(term5692, term5692.getClass(), "last", null);
        setIntField(term5692, term5692.getClass(), "modCount", -1347358701);
        Object term5695 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5695, term5695.getClass(), "size", 806595993);
        setField(term5695, term5695.getClass(), "first", null);
        setField(term5695, term5695.getClass(), "last", null);
        setIntField(term5695, term5695.getClass(), "modCount", 548228925);
        Object term5698 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5698, term5698.getClass(), "size", -749861210);
        setField(term5698, term5698.getClass(), "first", null);
        setField(term5698, term5698.getClass(), "last", null);
        setIntField(term5698, term5698.getClass(), "modCount", 1694224101);
        Object term5701 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5701, term5701.getClass(), "size", 937859191);
        setField(term5701, term5701.getClass(), "first", null);
        setField(term5701, term5701.getClass(), "last", null);
        setIntField(term5701, term5701.getClass(), "modCount", -916584829);
        Object term5704 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5704, term5704.getClass(), "size", -2131181468);
        setField(term5704, term5704.getClass(), "first", null);
        setField(term5704, term5704.getClass(), "last", null);
        setIntField(term5704, term5704.getClass(), "modCount", 282916351);
        Object term5707 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5707, term5707.getClass(), "size", 880977281);
        setField(term5707, term5707.getClass(), "first", null);
        setField(term5707, term5707.getClass(), "last", null);
        setIntField(term5707, term5707.getClass(), "modCount", 371943306);
        ArrayDeque term5690 = new ArrayDeque();
        ((ArrayDeque) term5690).add(term5692);
        ((ArrayDeque) term5690).add(term5695);
        ((ArrayDeque) term5690).add(term5698);
        ((ArrayDeque) term5690).add(term5701);
        ((ArrayDeque) term5690).add(term5704);
        ((ArrayDeque) term5690).add(term5707);
        ArrayList term5712 = new ArrayList();
        ((ArrayList) term5712).add((Object)null);
        ((ArrayList) term5712).add((Object)null);
        ((ArrayList) term5712).add((Object)null);
        ((ArrayList) term5712).add((Object)null);
        ((ArrayList) term5712).add((Object)null);
        HashMap term5718 = new HashMap();
        ArrayDeque term5725 = new ArrayDeque();
        ((ArrayDeque) term5725).add((Object)null);
        ArrayList term5729 = new ArrayList();
        ((ArrayList) term5729).add((Object)null);
        ((ArrayList) term5729).add((Object)null);
        ((ArrayList) term5729).add((Object)null);
        ((ArrayList) term5729).add((Object)null);
        term5688 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term5689 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5716 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5717 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term5723 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term5724 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5733 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5734 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5689, term5689.getClass(), "actionBundles", term5690);
        setField(term5689, term5689.getClass(), "conditions", term5712);
        setField(term5717, term5717.getClass(), "matchers", term5718);
        setField(term5716, term5716.getClass(), "parameterConditions", term5717);
        setField(term5716, term5716.getClass(), "referenceCondition", null);
        setField(term5716, term5716.getClass(), "hostCondition", null);
        setField(term5716, term5716.getClass(), "pathCondition", null);
        setField(term5716, term5716.getClass(), "portCondition", null);
        setField(term5716, term5716.getClass(), "schemaCondition", null);
        setField(term5689, term5689.getClass(), "urlConditions", term5716);
        setField(term5688, term5688.getClass(), "ruleBuilder", term5689);
        setField(term5724, term5724.getClass(), "actionBundles", term5725);
        setField(term5724, term5724.getClass(), "conditions", term5729);
        setField(term5734, term5734.getClass(), "matchers", null);
        setField(term5733, term5733.getClass(), "parameterConditions", term5734);
        setField(term5733, term5733.getClass(), "referenceCondition", null);
        setField(term5733, term5733.getClass(), "hostCondition", null);
        setField(term5733, term5733.getClass(), "pathCondition", null);
        setField(term5733, term5733.getClass(), "portCondition", null);
        setField(term5733, term5733.getClass(), "schemaCondition", null);
        setField(term5724, term5724.getClass(), "urlConditions", term5733);
        setField(term5723, term5723.getClass(), "ruleBuilder", term5724);
        setField(term5688, term5688.getClass(), "responseBuilder", term5723);
        term5735 = new Integer(-75206835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term5735;
        args[1] = "aJlieCFVtF";
        callMethod(klass, "doReturn", argTypes, term5688, args);
    }

};


