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

public class HttpClientMockBuilder_withReference_13365077654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5098;

    public HttpClientMockBuilder_withReference_13365077654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5102 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5102, term5102.getClass(), "size", -1968847291);
        setField(term5102, term5102.getClass(), "first", null);
        setField(term5102, term5102.getClass(), "last", null);
        setIntField(term5102, term5102.getClass(), "modCount", 579005622);
        Object term5105 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5105, term5105.getClass(), "size", -14890619);
        setField(term5105, term5105.getClass(), "first", null);
        setField(term5105, term5105.getClass(), "last", null);
        setIntField(term5105, term5105.getClass(), "modCount", 1632125673);
        Object term5108 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5108, term5108.getClass(), "size", 454281060);
        setField(term5108, term5108.getClass(), "first", null);
        setField(term5108, term5108.getClass(), "last", null);
        setIntField(term5108, term5108.getClass(), "modCount", -1786399638);
        Object term5111 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5111, term5111.getClass(), "size", 2055867847);
        setField(term5111, term5111.getClass(), "first", null);
        setField(term5111, term5111.getClass(), "last", null);
        setIntField(term5111, term5111.getClass(), "modCount", -1048298087);
        Object term5114 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5114, term5114.getClass(), "size", 292681826);
        setField(term5114, term5114.getClass(), "first", null);
        setField(term5114, term5114.getClass(), "last", null);
        setIntField(term5114, term5114.getClass(), "modCount", 458147407);
        Object term5117 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5117, term5117.getClass(), "size", -184153539);
        setField(term5117, term5117.getClass(), "first", null);
        setField(term5117, term5117.getClass(), "last", null);
        setIntField(term5117, term5117.getClass(), "modCount", 493620644);
        ArrayDeque term5100 = new ArrayDeque();
        ((ArrayDeque) term5100).add(term5102);
        ((ArrayDeque) term5100).add(term5105);
        ((ArrayDeque) term5100).add(term5108);
        ((ArrayDeque) term5100).add(term5111);
        ((ArrayDeque) term5100).add(term5114);
        ((ArrayDeque) term5100).add(term5117);
        ArrayList term5122 = new ArrayList();
        ((ArrayList) term5122).add((Object)null);
        ((ArrayList) term5122).add((Object)null);
        HashMap term5128 = new HashMap();
        ArrayDeque term5135 = new ArrayDeque();
        ((ArrayDeque) term5135).add((Object)null);
        ((ArrayDeque) term5135).add((Object)null);
        ((ArrayDeque) term5135).add((Object)null);
        ((ArrayDeque) term5135).add((Object)null);
        ((ArrayDeque) term5135).add((Object)null);
        ArrayList term5139 = new ArrayList();
        ((ArrayList) term5139).add((Object)null);
        ((ArrayList) term5139).add((Object)null);
        ((ArrayList) term5139).add((Object)null);
        term5098 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term5099 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5126 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5127 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term5133 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term5134 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5143 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5144 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5099, term5099.getClass(), "actionBundles", term5100);
        setField(term5099, term5099.getClass(), "conditions", term5122);
        setField(term5127, term5127.getClass(), "matchers", term5128);
        setField(term5126, term5126.getClass(), "parameterConditions", term5127);
        setField(term5126, term5126.getClass(), "referenceCondition", null);
        setField(term5126, term5126.getClass(), "hostCondition", null);
        setField(term5126, term5126.getClass(), "pathCondition", null);
        setField(term5126, term5126.getClass(), "portCondition", null);
        setField(term5126, term5126.getClass(), "schemaCondition", null);
        setField(term5099, term5099.getClass(), "urlConditions", term5126);
        setField(term5098, term5098.getClass(), "ruleBuilder", term5099);
        setField(term5134, term5134.getClass(), "actionBundles", term5135);
        setField(term5134, term5134.getClass(), "conditions", term5139);
        setField(term5144, term5144.getClass(), "matchers", null);
        setField(term5143, term5143.getClass(), "parameterConditions", term5144);
        setField(term5143, term5143.getClass(), "referenceCondition", null);
        setField(term5143, term5143.getClass(), "hostCondition", null);
        setField(term5143, term5143.getClass(), "pathCondition", null);
        setField(term5143, term5143.getClass(), "portCondition", null);
        setField(term5143, term5143.getClass(), "schemaCondition", null);
        setField(term5134, term5134.getClass(), "urlConditions", term5143);
        setField(term5133, term5133.getClass(), "ruleBuilder", term5134);
        setField(term5098, term5098.getClass(), "responseBuilder", term5133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withReference", argTypes, term5098, args);
    }

};


