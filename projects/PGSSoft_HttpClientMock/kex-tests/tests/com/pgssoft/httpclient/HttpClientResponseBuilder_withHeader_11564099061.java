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

public class HttpClientResponseBuilder_withHeader_11564099061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13467;

    public HttpClientResponseBuilder_withHeader_11564099061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13471 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13471, term13471.getClass(), "size", -1831826725);
        setField(term13471, term13471.getClass(), "first", null);
        setField(term13471, term13471.getClass(), "last", null);
        setIntField(term13471, term13471.getClass(), "modCount", 752152965);
        Object term13474 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13474, term13474.getClass(), "size", -1577069773);
        setField(term13474, term13474.getClass(), "first", null);
        setField(term13474, term13474.getClass(), "last", null);
        setIntField(term13474, term13474.getClass(), "modCount", -266625190);
        Object term13477 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13477, term13477.getClass(), "size", 489201218);
        setField(term13477, term13477.getClass(), "first", null);
        setField(term13477, term13477.getClass(), "last", null);
        setIntField(term13477, term13477.getClass(), "modCount", 464181937);
        Object term13480 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13480, term13480.getClass(), "size", -1455526612);
        setField(term13480, term13480.getClass(), "first", null);
        setField(term13480, term13480.getClass(), "last", null);
        setIntField(term13480, term13480.getClass(), "modCount", -941356098);
        Object term13483 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13483, term13483.getClass(), "size", -201517446);
        setField(term13483, term13483.getClass(), "first", null);
        setField(term13483, term13483.getClass(), "last", null);
        setIntField(term13483, term13483.getClass(), "modCount", -97742366);
        Object term13486 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13486, term13486.getClass(), "size", 1638851942);
        setField(term13486, term13486.getClass(), "first", null);
        setField(term13486, term13486.getClass(), "last", null);
        setIntField(term13486, term13486.getClass(), "modCount", 1374790203);
        Object term13489 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13489, term13489.getClass(), "size", 1160010161);
        setField(term13489, term13489.getClass(), "first", null);
        setField(term13489, term13489.getClass(), "last", null);
        setIntField(term13489, term13489.getClass(), "modCount", -423900705);
        Object term13492 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13492, term13492.getClass(), "size", -525570815);
        setField(term13492, term13492.getClass(), "first", null);
        setField(term13492, term13492.getClass(), "last", null);
        setIntField(term13492, term13492.getClass(), "modCount", 754055848);
        Object term13495 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13495, term13495.getClass(), "size", -19246901);
        setField(term13495, term13495.getClass(), "first", null);
        setField(term13495, term13495.getClass(), "last", null);
        setIntField(term13495, term13495.getClass(), "modCount", -370828664);
        ArrayDeque term13469 = new ArrayDeque();
        ((ArrayDeque) term13469).add(term13471);
        ((ArrayDeque) term13469).add(term13474);
        ((ArrayDeque) term13469).add(term13477);
        ((ArrayDeque) term13469).add(term13480);
        ((ArrayDeque) term13469).add(term13483);
        ((ArrayDeque) term13469).add(term13486);
        ((ArrayDeque) term13469).add(term13489);
        ((ArrayDeque) term13469).add(term13492);
        ((ArrayDeque) term13469).add(term13495);
        ArrayList term13500 = new ArrayList();
        ((ArrayList) term13500).add((Object)null);
        ((ArrayList) term13500).add((Object)null);
        ((ArrayList) term13500).add((Object)null);
        ((ArrayList) term13500).add((Object)null);
        ((ArrayList) term13500).add((Object)null);
        ((ArrayList) term13500).add((Object)null);
        ((ArrayList) term13500).add((Object)null);
        HashMap term13506 = new HashMap();
        term13467 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term13468 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term13504 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term13505 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term13468, term13468.getClass(), "actionBundles", term13469);
        setField(term13468, term13468.getClass(), "conditions", term13500);
        setField(term13505, term13505.getClass(), "matchers", term13506);
        setField(term13504, term13504.getClass(), "parameterConditions", term13505);
        setField(term13504, term13504.getClass(), "referenceCondition", null);
        setField(term13504, term13504.getClass(), "hostCondition", null);
        setField(term13504, term13504.getClass(), "pathCondition", null);
        setField(term13504, term13504.getClass(), "portCondition", null);
        setField(term13504, term13504.getClass(), "schemaCondition", null);
        setField(term13468, term13468.getClass(), "urlConditions", term13504);
        setField(term13467, term13467.getClass(), "ruleBuilder", term13468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "ytSBIKXogI";
        args[1] = "nHXjMycHlU";
        callMethod(klass, "withHeader", argTypes, term13467, args);
    }

};


