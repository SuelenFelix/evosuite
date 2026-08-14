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

public class HttpClientVerifyBuilder_withParameter_16634149986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19603;

    public HttpClientVerifyBuilder_withParameter_16634149986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19607 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19607, term19607.getClass(), "size", -1212399479);
        setField(term19607, term19607.getClass(), "first", null);
        setField(term19607, term19607.getClass(), "last", null);
        setIntField(term19607, term19607.getClass(), "modCount", 2107679041);
        Object term19610 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19610, term19610.getClass(), "size", 2040965507);
        setField(term19610, term19610.getClass(), "first", null);
        setField(term19610, term19610.getClass(), "last", null);
        setIntField(term19610, term19610.getClass(), "modCount", -1281083262);
        Object term19613 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19613, term19613.getClass(), "size", 1059930704);
        setField(term19613, term19613.getClass(), "first", null);
        setField(term19613, term19613.getClass(), "last", null);
        setIntField(term19613, term19613.getClass(), "modCount", -1967153290);
        ArrayDeque term19605 = new ArrayDeque();
        ((ArrayDeque) term19605).add(term19607);
        ((ArrayDeque) term19605).add(term19610);
        ((ArrayDeque) term19605).add(term19613);
        ArrayList term19618 = new ArrayList();
        ((ArrayList) term19618).add((Object)null);
        ((ArrayList) term19618).add((Object)null);
        ((ArrayList) term19618).add((Object)null);
        HashMap term19624 = new HashMap();
        ArrayList term19629 = new ArrayList();
        ((ArrayList) term19629).add((Object)null);
        ((ArrayList) term19629).add((Object)null);
        ((ArrayList) term19629).add((Object)null);
        ((ArrayList) term19629).add((Object)null);
        ((ArrayList) term19629).add((Object)null);
        term19603 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19604 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19622 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19623 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19604, term19604.getClass(), "actionBundles", term19605);
        setField(term19604, term19604.getClass(), "conditions", term19618);
        setField(term19623, term19623.getClass(), "matchers", term19624);
        setField(term19622, term19622.getClass(), "parameterConditions", term19623);
        setField(term19622, term19622.getClass(), "referenceCondition", null);
        setField(term19622, term19622.getClass(), "hostCondition", null);
        setField(term19622, term19622.getClass(), "pathCondition", null);
        setField(term19622, term19622.getClass(), "portCondition", null);
        setField(term19622, term19622.getClass(), "schemaCondition", null);
        setField(term19604, term19604.getClass(), "urlConditions", term19622);
        setField(term19603, term19603.getClass(), "ruleBuilder", term19604);
        setField(term19603, term19603.getClass(), "requests", term19629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[2];
        args[0] = "WzMEhMXkKx";
        args[1] = null;
        callMethod(klass, "withParameter", argTypes, term19603, args);
    }

};


