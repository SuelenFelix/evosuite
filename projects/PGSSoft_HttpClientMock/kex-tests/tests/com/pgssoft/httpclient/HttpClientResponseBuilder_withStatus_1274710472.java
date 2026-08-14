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

public class HttpClientResponseBuilder_withStatus_1274710472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13555;
     Object term13599;

    public HttpClientResponseBuilder_withStatus_1274710472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13559 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13559, term13559.getClass(), "size", 1168633950);
        setField(term13559, term13559.getClass(), "first", null);
        setField(term13559, term13559.getClass(), "last", null);
        setIntField(term13559, term13559.getClass(), "modCount", 1607082164);
        Object term13562 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13562, term13562.getClass(), "size", 1890399366);
        setField(term13562, term13562.getClass(), "first", null);
        setField(term13562, term13562.getClass(), "last", null);
        setIntField(term13562, term13562.getClass(), "modCount", -1867239125);
        Object term13565 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13565, term13565.getClass(), "size", 952869601);
        setField(term13565, term13565.getClass(), "first", null);
        setField(term13565, term13565.getClass(), "last", null);
        setIntField(term13565, term13565.getClass(), "modCount", 91958879);
        Object term13568 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13568, term13568.getClass(), "size", -645429025);
        setField(term13568, term13568.getClass(), "first", null);
        setField(term13568, term13568.getClass(), "last", null);
        setIntField(term13568, term13568.getClass(), "modCount", -688213483);
        Object term13571 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13571, term13571.getClass(), "size", 644154104);
        setField(term13571, term13571.getClass(), "first", null);
        setField(term13571, term13571.getClass(), "last", null);
        setIntField(term13571, term13571.getClass(), "modCount", 76650923);
        Object term13574 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13574, term13574.getClass(), "size", 1003743923);
        setField(term13574, term13574.getClass(), "first", null);
        setField(term13574, term13574.getClass(), "last", null);
        setIntField(term13574, term13574.getClass(), "modCount", 1887772522);
        Object term13577 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13577, term13577.getClass(), "size", 354196060);
        setField(term13577, term13577.getClass(), "first", null);
        setField(term13577, term13577.getClass(), "last", null);
        setIntField(term13577, term13577.getClass(), "modCount", -1840305774);
        Object term13580 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13580, term13580.getClass(), "size", 1365087144);
        setField(term13580, term13580.getClass(), "first", null);
        setField(term13580, term13580.getClass(), "last", null);
        setIntField(term13580, term13580.getClass(), "modCount", -1537255112);
        Object term13583 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13583, term13583.getClass(), "size", 934477462);
        setField(term13583, term13583.getClass(), "first", null);
        setField(term13583, term13583.getClass(), "last", null);
        setIntField(term13583, term13583.getClass(), "modCount", 4900410);
        ArrayDeque term13557 = new ArrayDeque();
        ((ArrayDeque) term13557).add(term13559);
        ((ArrayDeque) term13557).add(term13562);
        ((ArrayDeque) term13557).add(term13565);
        ((ArrayDeque) term13557).add(term13568);
        ((ArrayDeque) term13557).add(term13571);
        ((ArrayDeque) term13557).add(term13574);
        ((ArrayDeque) term13557).add(term13577);
        ((ArrayDeque) term13557).add(term13580);
        ((ArrayDeque) term13557).add(term13583);
        ArrayList term13588 = new ArrayList();
        ((ArrayList) term13588).add((Object)null);
        ((ArrayList) term13588).add((Object)null);
        ((ArrayList) term13588).add((Object)null);
        ((ArrayList) term13588).add((Object)null);
        ((ArrayList) term13588).add((Object)null);
        HashMap term13594 = new HashMap();
        term13555 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term13556 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term13592 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term13593 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term13556, term13556.getClass(), "actionBundles", term13557);
        setField(term13556, term13556.getClass(), "conditions", term13588);
        setField(term13593, term13593.getClass(), "matchers", term13594);
        setField(term13592, term13592.getClass(), "parameterConditions", term13593);
        setField(term13592, term13592.getClass(), "referenceCondition", null);
        setField(term13592, term13592.getClass(), "hostCondition", null);
        setField(term13592, term13592.getClass(), "pathCondition", null);
        setField(term13592, term13592.getClass(), "portCondition", null);
        setField(term13592, term13592.getClass(), "schemaCondition", null);
        setField(term13556, term13556.getClass(), "urlConditions", term13592);
        setField(term13555, term13555.getClass(), "ruleBuilder", term13556);
        term13599 = new Integer(-1252345779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13599;
        callMethod(klass, "withStatus", argTypes, term13555, args);
    }

};


