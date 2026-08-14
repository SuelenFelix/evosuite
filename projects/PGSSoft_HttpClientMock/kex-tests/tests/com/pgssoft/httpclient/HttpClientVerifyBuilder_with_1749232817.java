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

public class HttpClientVerifyBuilder_with_1749232817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19655;

    public HttpClientVerifyBuilder_with_1749232817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19659 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19659, term19659.getClass(), "size", -1397251956);
        setField(term19659, term19659.getClass(), "first", null);
        setField(term19659, term19659.getClass(), "last", null);
        setIntField(term19659, term19659.getClass(), "modCount", -796934571);
        Object term19662 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19662, term19662.getClass(), "size", 405295896);
        setField(term19662, term19662.getClass(), "first", null);
        setField(term19662, term19662.getClass(), "last", null);
        setIntField(term19662, term19662.getClass(), "modCount", -814977075);
        ArrayDeque term19657 = new ArrayDeque();
        ((ArrayDeque) term19657).add(term19659);
        ((ArrayDeque) term19657).add(term19662);
        ArrayList term19667 = new ArrayList();
        ((ArrayList) term19667).add((Object)null);
        ((ArrayList) term19667).add((Object)null);
        ((ArrayList) term19667).add((Object)null);
        ((ArrayList) term19667).add((Object)null);
        ((ArrayList) term19667).add((Object)null);
        HashMap term19673 = new HashMap();
        ArrayList term19678 = new ArrayList();
        ((ArrayList) term19678).add((Object)null);
        term19655 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19656 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19671 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19672 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19656, term19656.getClass(), "actionBundles", term19657);
        setField(term19656, term19656.getClass(), "conditions", term19667);
        setField(term19672, term19672.getClass(), "matchers", term19673);
        setField(term19671, term19671.getClass(), "parameterConditions", term19672);
        setField(term19671, term19671.getClass(), "referenceCondition", null);
        setField(term19671, term19671.getClass(), "hostCondition", null);
        setField(term19671, term19671.getClass(), "pathCondition", null);
        setField(term19671, term19671.getClass(), "portCondition", null);
        setField(term19671, term19671.getClass(), "schemaCondition", null);
        setField(term19656, term19656.getClass(), "urlConditions", term19671);
        setField(term19655, term19655.getClass(), "ruleBuilder", term19656);
        setField(term19655, term19655.getClass(), "requests", term19678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.Condition");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "with", argTypes, term19655, args);
    }

};


