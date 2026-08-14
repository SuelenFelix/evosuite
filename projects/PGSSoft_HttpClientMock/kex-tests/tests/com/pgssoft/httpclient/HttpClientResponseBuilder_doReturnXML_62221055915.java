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

public class HttpClientResponseBuilder_doReturnXML_62221055915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17062;

    public HttpClientResponseBuilder_doReturnXML_62221055915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17066 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term17066, term17066.getClass(), "size", -781832877);
        setField(term17066, term17066.getClass(), "first", null);
        setField(term17066, term17066.getClass(), "last", null);
        setIntField(term17066, term17066.getClass(), "modCount", 797203987);
        ArrayDeque term17064 = new ArrayDeque();
        ((ArrayDeque) term17064).add(term17066);
        ArrayList term17071 = new ArrayList();
        ((ArrayList) term17071).add((Object)null);
        ((ArrayList) term17071).add((Object)null);
        HashMap term17077 = new HashMap();
        term17062 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term17063 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term17075 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term17076 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term17063, term17063.getClass(), "actionBundles", term17064);
        setField(term17063, term17063.getClass(), "conditions", term17071);
        setField(term17076, term17076.getClass(), "matchers", term17077);
        setField(term17075, term17075.getClass(), "parameterConditions", term17076);
        setField(term17075, term17075.getClass(), "referenceCondition", null);
        setField(term17075, term17075.getClass(), "hostCondition", null);
        setField(term17075, term17075.getClass(), "pathCondition", null);
        setField(term17075, term17075.getClass(), "portCondition", null);
        setField(term17075, term17075.getClass(), "schemaCondition", null);
        setField(term17063, term17063.getClass(), "urlConditions", term17075);
        setField(term17062, term17062.getClass(), "ruleBuilder", term17063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = "tPlsykYBqO";
        args[1] = null;
        callMethod(klass, "doReturnXML", argTypes, term17062, args);
    }

};


