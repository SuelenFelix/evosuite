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

public class HttpClientVerifyBuilder_withPath_146348979711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19822;

    public HttpClientVerifyBuilder_withPath_146348979711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term19824 = new ArrayDeque();
        ArrayList term19828 = new ArrayList();
        ((ArrayList) term19828).add((Object)null);
        ((ArrayList) term19828).add((Object)null);
        ((ArrayList) term19828).add((Object)null);
        ((ArrayList) term19828).add((Object)null);
        ((ArrayList) term19828).add((Object)null);
        ((ArrayList) term19828).add((Object)null);
        ((ArrayList) term19828).add((Object)null);
        ((ArrayList) term19828).add((Object)null);
        ((ArrayList) term19828).add((Object)null);
        HashMap term19834 = new HashMap();
        ArrayList term19839 = new ArrayList();
        ((ArrayList) term19839).add((Object)null);
        ((ArrayList) term19839).add((Object)null);
        ((ArrayList) term19839).add((Object)null);
        ((ArrayList) term19839).add((Object)null);
        term19822 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19823 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19832 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19833 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19823, term19823.getClass(), "actionBundles", term19824);
        setField(term19823, term19823.getClass(), "conditions", term19828);
        setField(term19833, term19833.getClass(), "matchers", term19834);
        setField(term19832, term19832.getClass(), "parameterConditions", term19833);
        setField(term19832, term19832.getClass(), "referenceCondition", null);
        setField(term19832, term19832.getClass(), "hostCondition", null);
        setField(term19832, term19832.getClass(), "pathCondition", null);
        setField(term19832, term19832.getClass(), "portCondition", null);
        setField(term19832, term19832.getClass(), "schemaCondition", null);
        setField(term19823, term19823.getClass(), "urlConditions", term19832);
        setField(term19822, term19822.getClass(), "ruleBuilder", term19823);
        setField(term19822, term19822.getClass(), "requests", term19839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withPath", argTypes, term19822, args);
    }

};


