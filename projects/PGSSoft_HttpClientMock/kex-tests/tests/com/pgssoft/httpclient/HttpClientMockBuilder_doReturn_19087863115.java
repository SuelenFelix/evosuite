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

public class HttpClientMockBuilder_doReturn_19087863115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5759;

    public HttpClientMockBuilder_doReturn_19087863115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5763 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5763, term5763.getClass(), "size", -1618206977);
        setField(term5763, term5763.getClass(), "first", null);
        setField(term5763, term5763.getClass(), "last", null);
        setIntField(term5763, term5763.getClass(), "modCount", -1747406163);
        ArrayDeque term5761 = new ArrayDeque();
        ((ArrayDeque) term5761).add(term5763);
        ArrayList term5768 = new ArrayList();
        ((ArrayList) term5768).add((Object)null);
        HashMap term5774 = new HashMap();
        ArrayDeque term5781 = new ArrayDeque();
        ((ArrayDeque) term5781).add((Object)null);
        ((ArrayDeque) term5781).add((Object)null);
        ((ArrayDeque) term5781).add((Object)null);
        ((ArrayDeque) term5781).add((Object)null);
        ((ArrayDeque) term5781).add((Object)null);
        ((ArrayDeque) term5781).add((Object)null);
        ArrayList term5785 = new ArrayList();
        ((ArrayList) term5785).add((Object)null);
        ((ArrayList) term5785).add((Object)null);
        ((ArrayList) term5785).add((Object)null);
        ((ArrayList) term5785).add((Object)null);
        ((ArrayList) term5785).add((Object)null);
        ((ArrayList) term5785).add((Object)null);
        ((ArrayList) term5785).add((Object)null);
        term5759 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term5760 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5772 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5773 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term5779 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term5780 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5789 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5790 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5760, term5760.getClass(), "actionBundles", term5761);
        setField(term5760, term5760.getClass(), "conditions", term5768);
        setField(term5773, term5773.getClass(), "matchers", term5774);
        setField(term5772, term5772.getClass(), "parameterConditions", term5773);
        setField(term5772, term5772.getClass(), "referenceCondition", null);
        setField(term5772, term5772.getClass(), "hostCondition", null);
        setField(term5772, term5772.getClass(), "pathCondition", null);
        setField(term5772, term5772.getClass(), "portCondition", null);
        setField(term5772, term5772.getClass(), "schemaCondition", null);
        setField(term5760, term5760.getClass(), "urlConditions", term5772);
        setField(term5759, term5759.getClass(), "ruleBuilder", term5760);
        setField(term5780, term5780.getClass(), "actionBundles", term5781);
        setField(term5780, term5780.getClass(), "conditions", term5785);
        setField(term5790, term5790.getClass(), "matchers", null);
        setField(term5789, term5789.getClass(), "parameterConditions", term5790);
        setField(term5789, term5789.getClass(), "referenceCondition", null);
        setField(term5789, term5789.getClass(), "hostCondition", null);
        setField(term5789, term5789.getClass(), "pathCondition", null);
        setField(term5789, term5789.getClass(), "portCondition", null);
        setField(term5789, term5789.getClass(), "schemaCondition", null);
        setField(term5780, term5780.getClass(), "urlConditions", term5789);
        setField(term5779, term5779.getClass(), "ruleBuilder", term5780);
        setField(term5759, term5759.getClass(), "responseBuilder", term5779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = "ZiaGIbnzTs";
        args[1] = null;
        callMethod(klass, "doReturn", argTypes, term5759, args);
    }

};


