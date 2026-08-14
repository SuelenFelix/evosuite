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

public class HttpClientMockBuilder_doReturn_208510483213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5619;

    public HttpClientMockBuilder_doReturn_208510483213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5623 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5623, term5623.getClass(), "size", -1410220680);
        setField(term5623, term5623.getClass(), "first", null);
        setField(term5623, term5623.getClass(), "last", null);
        setIntField(term5623, term5623.getClass(), "modCount", 389427431);
        Object term5626 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5626, term5626.getClass(), "size", -1945706126);
        setField(term5626, term5626.getClass(), "first", null);
        setField(term5626, term5626.getClass(), "last", null);
        setIntField(term5626, term5626.getClass(), "modCount", 1152356969);
        Object term5629 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5629, term5629.getClass(), "size", -1667990367);
        setField(term5629, term5629.getClass(), "first", null);
        setField(term5629, term5629.getClass(), "last", null);
        setIntField(term5629, term5629.getClass(), "modCount", -1214628358);
        Object term5632 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5632, term5632.getClass(), "size", 1102721075);
        setField(term5632, term5632.getClass(), "first", null);
        setField(term5632, term5632.getClass(), "last", null);
        setIntField(term5632, term5632.getClass(), "modCount", -426764678);
        Object term5635 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5635, term5635.getClass(), "size", -1222614956);
        setField(term5635, term5635.getClass(), "first", null);
        setField(term5635, term5635.getClass(), "last", null);
        setIntField(term5635, term5635.getClass(), "modCount", -1870495012);
        Object term5638 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5638, term5638.getClass(), "size", -1310015129);
        setField(term5638, term5638.getClass(), "first", null);
        setField(term5638, term5638.getClass(), "last", null);
        setIntField(term5638, term5638.getClass(), "modCount", -2104981311);
        ArrayDeque term5621 = new ArrayDeque();
        ((ArrayDeque) term5621).add(term5623);
        ((ArrayDeque) term5621).add(term5626);
        ((ArrayDeque) term5621).add(term5629);
        ((ArrayDeque) term5621).add(term5632);
        ((ArrayDeque) term5621).add(term5635);
        ((ArrayDeque) term5621).add(term5638);
        ArrayList term5643 = new ArrayList();
        ((ArrayList) term5643).add((Object)null);
        ((ArrayList) term5643).add((Object)null);
        ((ArrayList) term5643).add((Object)null);
        ((ArrayList) term5643).add((Object)null);
        ((ArrayList) term5643).add((Object)null);
        HashMap term5649 = new HashMap();
        ArrayDeque term5656 = new ArrayDeque();
        ((ArrayDeque) term5656).add((Object)null);
        ArrayList term5660 = new ArrayList();
        term5619 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term5620 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5647 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5648 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term5654 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term5655 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5664 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5665 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5620, term5620.getClass(), "actionBundles", term5621);
        setField(term5620, term5620.getClass(), "conditions", term5643);
        setField(term5648, term5648.getClass(), "matchers", term5649);
        setField(term5647, term5647.getClass(), "parameterConditions", term5648);
        setField(term5647, term5647.getClass(), "referenceCondition", null);
        setField(term5647, term5647.getClass(), "hostCondition", null);
        setField(term5647, term5647.getClass(), "pathCondition", null);
        setField(term5647, term5647.getClass(), "portCondition", null);
        setField(term5647, term5647.getClass(), "schemaCondition", null);
        setField(term5620, term5620.getClass(), "urlConditions", term5647);
        setField(term5619, term5619.getClass(), "ruleBuilder", term5620);
        setField(term5655, term5655.getClass(), "actionBundles", term5656);
        setField(term5655, term5655.getClass(), "conditions", term5660);
        setField(term5665, term5665.getClass(), "matchers", null);
        setField(term5664, term5664.getClass(), "parameterConditions", term5665);
        setField(term5664, term5664.getClass(), "referenceCondition", null);
        setField(term5664, term5664.getClass(), "hostCondition", null);
        setField(term5664, term5664.getClass(), "pathCondition", null);
        setField(term5664, term5664.getClass(), "portCondition", null);
        setField(term5664, term5664.getClass(), "schemaCondition", null);
        setField(term5655, term5655.getClass(), "urlConditions", term5664);
        setField(term5654, term5654.getClass(), "ruleBuilder", term5655);
        setField(term5619, term5619.getClass(), "responseBuilder", term5654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVcInYnLWB";
        callMethod(klass, "doReturn", argTypes, term5619, args);
    }

};


