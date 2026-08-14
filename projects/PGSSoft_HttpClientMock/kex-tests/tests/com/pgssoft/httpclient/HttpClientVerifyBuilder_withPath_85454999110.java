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

public class HttpClientVerifyBuilder_withPath_85454999110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19761;

    public HttpClientVerifyBuilder_withPath_85454999110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19765 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19765, term19765.getClass(), "size", -64893740);
        setField(term19765, term19765.getClass(), "first", null);
        setField(term19765, term19765.getClass(), "last", null);
        setIntField(term19765, term19765.getClass(), "modCount", -222012928);
        Object term19768 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19768, term19768.getClass(), "size", -146564963);
        setField(term19768, term19768.getClass(), "first", null);
        setField(term19768, term19768.getClass(), "last", null);
        setIntField(term19768, term19768.getClass(), "modCount", -83178716);
        Object term19771 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19771, term19771.getClass(), "size", -1292704466);
        setField(term19771, term19771.getClass(), "first", null);
        setField(term19771, term19771.getClass(), "last", null);
        setIntField(term19771, term19771.getClass(), "modCount", 1991858584);
        Object term19774 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19774, term19774.getClass(), "size", -1300947782);
        setField(term19774, term19774.getClass(), "first", null);
        setField(term19774, term19774.getClass(), "last", null);
        setIntField(term19774, term19774.getClass(), "modCount", 188512644);
        Object term19777 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19777, term19777.getClass(), "size", 1851127634);
        setField(term19777, term19777.getClass(), "first", null);
        setField(term19777, term19777.getClass(), "last", null);
        setIntField(term19777, term19777.getClass(), "modCount", 783730213);
        Object term19780 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19780, term19780.getClass(), "size", 1815951606);
        setField(term19780, term19780.getClass(), "first", null);
        setField(term19780, term19780.getClass(), "last", null);
        setIntField(term19780, term19780.getClass(), "modCount", 1105016932);
        ArrayDeque term19763 = new ArrayDeque();
        ((ArrayDeque) term19763).add(term19765);
        ((ArrayDeque) term19763).add(term19768);
        ((ArrayDeque) term19763).add(term19771);
        ((ArrayDeque) term19763).add(term19774);
        ((ArrayDeque) term19763).add(term19777);
        ((ArrayDeque) term19763).add(term19780);
        ArrayList term19785 = new ArrayList();
        ((ArrayList) term19785).add((Object)null);
        ((ArrayList) term19785).add((Object)null);
        ((ArrayList) term19785).add((Object)null);
        ((ArrayList) term19785).add((Object)null);
        ((ArrayList) term19785).add((Object)null);
        ((ArrayList) term19785).add((Object)null);
        ((ArrayList) term19785).add((Object)null);
        HashMap term19791 = new HashMap();
        ArrayList term19796 = new ArrayList();
        term19761 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19762 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19789 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19790 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19762, term19762.getClass(), "actionBundles", term19763);
        setField(term19762, term19762.getClass(), "conditions", term19785);
        setField(term19790, term19790.getClass(), "matchers", term19791);
        setField(term19789, term19789.getClass(), "parameterConditions", term19790);
        setField(term19789, term19789.getClass(), "referenceCondition", null);
        setField(term19789, term19789.getClass(), "hostCondition", null);
        setField(term19789, term19789.getClass(), "pathCondition", null);
        setField(term19789, term19789.getClass(), "portCondition", null);
        setField(term19789, term19789.getClass(), "schemaCondition", null);
        setField(term19762, term19762.getClass(), "urlConditions", term19789);
        setField(term19761, term19761.getClass(), "ruleBuilder", term19762);
        setField(term19761, term19761.getClass(), "requests", term19796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AdxvLJhNLe";
        callMethod(klass, "withPath", argTypes, term19761, args);
    }

};


