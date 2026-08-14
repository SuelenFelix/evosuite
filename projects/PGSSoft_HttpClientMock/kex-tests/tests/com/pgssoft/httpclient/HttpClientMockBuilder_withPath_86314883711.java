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

public class HttpClientMockBuilder_withPath_86314883711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5519;

    public HttpClientMockBuilder_withPath_86314883711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5523 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5523, term5523.getClass(), "size", 1598895173);
        setField(term5523, term5523.getClass(), "first", null);
        setField(term5523, term5523.getClass(), "last", null);
        setIntField(term5523, term5523.getClass(), "modCount", 1830648570);
        Object term5526 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5526, term5526.getClass(), "size", -227365013);
        setField(term5526, term5526.getClass(), "first", null);
        setField(term5526, term5526.getClass(), "last", null);
        setIntField(term5526, term5526.getClass(), "modCount", 11724947);
        Object term5529 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5529, term5529.getClass(), "size", 1953277050);
        setField(term5529, term5529.getClass(), "first", null);
        setField(term5529, term5529.getClass(), "last", null);
        setIntField(term5529, term5529.getClass(), "modCount", 1283079251);
        Object term5532 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5532, term5532.getClass(), "size", -523949691);
        setField(term5532, term5532.getClass(), "first", null);
        setField(term5532, term5532.getClass(), "last", null);
        setIntField(term5532, term5532.getClass(), "modCount", 1398204340);
        Object term5535 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5535, term5535.getClass(), "size", 229204365);
        setField(term5535, term5535.getClass(), "first", null);
        setField(term5535, term5535.getClass(), "last", null);
        setIntField(term5535, term5535.getClass(), "modCount", -461771056);
        Object term5538 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5538, term5538.getClass(), "size", -243422082);
        setField(term5538, term5538.getClass(), "first", null);
        setField(term5538, term5538.getClass(), "last", null);
        setIntField(term5538, term5538.getClass(), "modCount", 1384592638);
        Object term5541 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5541, term5541.getClass(), "size", -1002370457);
        setField(term5541, term5541.getClass(), "first", null);
        setField(term5541, term5541.getClass(), "last", null);
        setIntField(term5541, term5541.getClass(), "modCount", -2014576105);
        ArrayDeque term5521 = new ArrayDeque();
        ((ArrayDeque) term5521).add(term5523);
        ((ArrayDeque) term5521).add(term5526);
        ((ArrayDeque) term5521).add(term5529);
        ((ArrayDeque) term5521).add(term5532);
        ((ArrayDeque) term5521).add(term5535);
        ((ArrayDeque) term5521).add(term5538);
        ((ArrayDeque) term5521).add(term5541);
        ArrayList term5546 = new ArrayList();
        ((ArrayList) term5546).add((Object)null);
        ((ArrayList) term5546).add((Object)null);
        ((ArrayList) term5546).add((Object)null);
        ((ArrayList) term5546).add((Object)null);
        ((ArrayList) term5546).add((Object)null);
        ((ArrayList) term5546).add((Object)null);
        HashMap term5552 = new HashMap();
        ArrayDeque term5559 = new ArrayDeque();
        ((ArrayDeque) term5559).add((Object)null);
        ((ArrayDeque) term5559).add((Object)null);
        ((ArrayDeque) term5559).add((Object)null);
        ((ArrayDeque) term5559).add((Object)null);
        ((ArrayDeque) term5559).add(term5529);
        ((ArrayDeque) term5559).add(term5541);
        ((ArrayDeque) term5559).add(term5538);
        ArrayList term5563 = new ArrayList();
        ((ArrayList) term5563).add((Object)null);
        ((ArrayList) term5563).add((Object)null);
        ((ArrayList) term5563).add((Object)null);
        ((ArrayList) term5563).add((Object)null);
        ((ArrayList) term5563).add((Object)null);
        ((ArrayList) term5563).add((Object)null);
        ((ArrayList) term5563).add((Object)null);
        ((ArrayList) term5563).add((Object)null);
        ((ArrayList) term5563).add((Object)null);
        term5519 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term5520 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5550 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5551 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term5557 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term5558 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5567 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5568 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5520, term5520.getClass(), "actionBundles", term5521);
        setField(term5520, term5520.getClass(), "conditions", term5546);
        setField(term5551, term5551.getClass(), "matchers", term5552);
        setField(term5550, term5550.getClass(), "parameterConditions", term5551);
        setField(term5550, term5550.getClass(), "referenceCondition", null);
        setField(term5550, term5550.getClass(), "hostCondition", null);
        setField(term5550, term5550.getClass(), "pathCondition", null);
        setField(term5550, term5550.getClass(), "portCondition", null);
        setField(term5550, term5550.getClass(), "schemaCondition", null);
        setField(term5520, term5520.getClass(), "urlConditions", term5550);
        setField(term5519, term5519.getClass(), "ruleBuilder", term5520);
        setField(term5558, term5558.getClass(), "actionBundles", term5559);
        setField(term5558, term5558.getClass(), "conditions", term5563);
        setField(term5568, term5568.getClass(), "matchers", null);
        setField(term5567, term5567.getClass(), "parameterConditions", term5568);
        setField(term5567, term5567.getClass(), "referenceCondition", null);
        setField(term5567, term5567.getClass(), "hostCondition", null);
        setField(term5567, term5567.getClass(), "pathCondition", null);
        setField(term5567, term5567.getClass(), "portCondition", null);
        setField(term5567, term5567.getClass(), "schemaCondition", null);
        setField(term5558, term5558.getClass(), "urlConditions", term5567);
        setField(term5557, term5557.getClass(), "ruleBuilder", term5558);
        setField(term5519, term5519.getClass(), "responseBuilder", term5557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withPath", argTypes, term5519, args);
    }

};


