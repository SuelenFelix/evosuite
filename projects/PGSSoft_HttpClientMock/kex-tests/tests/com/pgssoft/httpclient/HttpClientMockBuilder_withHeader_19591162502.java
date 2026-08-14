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

public class HttpClientMockBuilder_withHeader_19591162502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4978;

    public HttpClientMockBuilder_withHeader_19591162502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4982 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term4982, term4982.getClass(), "size", 1048535127);
        setField(term4982, term4982.getClass(), "first", null);
        setField(term4982, term4982.getClass(), "last", null);
        setIntField(term4982, term4982.getClass(), "modCount", -655067527);
        Object term4985 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term4985, term4985.getClass(), "size", -6029667);
        setField(term4985, term4985.getClass(), "first", null);
        setField(term4985, term4985.getClass(), "last", null);
        setIntField(term4985, term4985.getClass(), "modCount", -2068769794);
        Object term4988 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term4988, term4988.getClass(), "size", -117576464);
        setField(term4988, term4988.getClass(), "first", null);
        setField(term4988, term4988.getClass(), "last", null);
        setIntField(term4988, term4988.getClass(), "modCount", -1007160944);
        ArrayDeque term4980 = new ArrayDeque();
        ((ArrayDeque) term4980).add(term4982);
        ((ArrayDeque) term4980).add(term4985);
        ((ArrayDeque) term4980).add(term4988);
        ArrayList term4993 = new ArrayList();
        ((ArrayList) term4993).add((Object)null);
        ((ArrayList) term4993).add((Object)null);
        ((ArrayList) term4993).add((Object)null);
        ((ArrayList) term4993).add((Object)null);
        ((ArrayList) term4993).add((Object)null);
        HashMap term4999 = new HashMap();
        ArrayDeque term5006 = new ArrayDeque();
        ((ArrayDeque) term5006).add((Object)null);
        ((ArrayDeque) term5006).add((Object)null);
        ((ArrayDeque) term5006).add((Object)null);
        ((ArrayDeque) term5006).add((Object)null);
        ((ArrayDeque) term5006).add((Object)null);
        ((ArrayDeque) term5006).add((Object)null);
        ArrayList term5010 = new ArrayList();
        ((ArrayList) term5010).add((Object)null);
        ((ArrayList) term5010).add((Object)null);
        ((ArrayList) term5010).add((Object)null);
        ((ArrayList) term5010).add((Object)null);
        ((ArrayList) term5010).add((Object)null);
        term4978 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term4979 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term4997 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term4998 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term5004 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term5005 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5014 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5015 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term4979, term4979.getClass(), "actionBundles", term4980);
        setField(term4979, term4979.getClass(), "conditions", term4993);
        setField(term4998, term4998.getClass(), "matchers", term4999);
        setField(term4997, term4997.getClass(), "parameterConditions", term4998);
        setField(term4997, term4997.getClass(), "referenceCondition", null);
        setField(term4997, term4997.getClass(), "hostCondition", null);
        setField(term4997, term4997.getClass(), "pathCondition", null);
        setField(term4997, term4997.getClass(), "portCondition", null);
        setField(term4997, term4997.getClass(), "schemaCondition", null);
        setField(term4979, term4979.getClass(), "urlConditions", term4997);
        setField(term4978, term4978.getClass(), "ruleBuilder", term4979);
        setField(term5005, term5005.getClass(), "actionBundles", term5006);
        setField(term5005, term5005.getClass(), "conditions", term5010);
        setField(term5015, term5015.getClass(), "matchers", null);
        setField(term5014, term5014.getClass(), "parameterConditions", term5015);
        setField(term5014, term5014.getClass(), "referenceCondition", null);
        setField(term5014, term5014.getClass(), "hostCondition", null);
        setField(term5014, term5014.getClass(), "pathCondition", null);
        setField(term5014, term5014.getClass(), "portCondition", null);
        setField(term5014, term5014.getClass(), "schemaCondition", null);
        setField(term5005, term5005.getClass(), "urlConditions", term5014);
        setField(term5004, term5004.getClass(), "ruleBuilder", term5005);
        setField(term4978, term4978.getClass(), "responseBuilder", term5004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[2];
        args[0] = "MjGYSRKTNF";
        args[1] = null;
        callMethod(klass, "withHeader", argTypes, term4978, args);
    }

};


