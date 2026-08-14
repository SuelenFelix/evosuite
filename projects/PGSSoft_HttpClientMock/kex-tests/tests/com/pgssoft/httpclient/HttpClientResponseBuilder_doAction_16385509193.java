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

public class HttpClientResponseBuilder_doAction_16385509193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13601;

    public HttpClientResponseBuilder_doAction_16385509193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13605 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13605, term13605.getClass(), "size", -2063365430);
        setField(term13605, term13605.getClass(), "first", null);
        setField(term13605, term13605.getClass(), "last", null);
        setIntField(term13605, term13605.getClass(), "modCount", 812570053);
        ArrayDeque term13603 = new ArrayDeque();
        ((ArrayDeque) term13603).add(term13605);
        ArrayList term13610 = new ArrayList();
        ((ArrayList) term13610).add((Object)null);
        HashMap term13616 = new HashMap();
        term13601 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term13602 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term13614 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term13615 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term13602, term13602.getClass(), "actionBundles", term13603);
        setField(term13602, term13602.getClass(), "conditions", term13610);
        setField(term13615, term13615.getClass(), "matchers", term13616);
        setField(term13614, term13614.getClass(), "parameterConditions", term13615);
        setField(term13614, term13614.getClass(), "referenceCondition", null);
        setField(term13614, term13614.getClass(), "hostCondition", null);
        setField(term13614, term13614.getClass(), "pathCondition", null);
        setField(term13614, term13614.getClass(), "portCondition", null);
        setField(term13614, term13614.getClass(), "schemaCondition", null);
        setField(term13602, term13602.getClass(), "urlConditions", term13614);
        setField(term13601, term13601.getClass(), "ruleBuilder", term13602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.Action");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "doAction", argTypes, term13601, args);
    }

};


