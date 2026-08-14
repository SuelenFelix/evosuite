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

public class HttpClientMockBuilder_doReturnXML_160965411320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8865;

    public HttpClientMockBuilder_doReturnXML_160965411320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term8867 = new ArrayDeque();
        ArrayList term8871 = new ArrayList();
        ((ArrayList) term8871).add((Object)null);
        HashMap term8877 = new HashMap();
        ArrayDeque term8884 = new ArrayDeque();
        ((ArrayDeque) term8884).add((Object)null);
        ((ArrayDeque) term8884).add((Object)null);
        ((ArrayDeque) term8884).add((Object)null);
        ((ArrayDeque) term8884).add((Object)null);
        ((ArrayDeque) term8884).add((Object)null);
        ArrayList term8888 = new ArrayList();
        ((ArrayList) term8888).add((Object)null);
        ((ArrayList) term8888).add((Object)null);
        ((ArrayList) term8888).add((Object)null);
        term8865 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term8866 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term8875 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term8876 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term8882 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term8883 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term8892 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term8893 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term8866, term8866.getClass(), "actionBundles", term8867);
        setField(term8866, term8866.getClass(), "conditions", term8871);
        setField(term8876, term8876.getClass(), "matchers", term8877);
        setField(term8875, term8875.getClass(), "parameterConditions", term8876);
        setField(term8875, term8875.getClass(), "referenceCondition", null);
        setField(term8875, term8875.getClass(), "hostCondition", null);
        setField(term8875, term8875.getClass(), "pathCondition", null);
        setField(term8875, term8875.getClass(), "portCondition", null);
        setField(term8875, term8875.getClass(), "schemaCondition", null);
        setField(term8866, term8866.getClass(), "urlConditions", term8875);
        setField(term8865, term8865.getClass(), "ruleBuilder", term8866);
        setField(term8883, term8883.getClass(), "actionBundles", term8884);
        setField(term8883, term8883.getClass(), "conditions", term8888);
        setField(term8893, term8893.getClass(), "matchers", null);
        setField(term8892, term8892.getClass(), "parameterConditions", term8893);
        setField(term8892, term8892.getClass(), "referenceCondition", null);
        setField(term8892, term8892.getClass(), "hostCondition", null);
        setField(term8892, term8892.getClass(), "pathCondition", null);
        setField(term8892, term8892.getClass(), "portCondition", null);
        setField(term8892, term8892.getClass(), "schemaCondition", null);
        setField(term8883, term8883.getClass(), "urlConditions", term8892);
        setField(term8882, term8882.getClass(), "ruleBuilder", term8883);
        setField(term8865, term8865.getClass(), "responseBuilder", term8882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "doReturnXML", argTypes, term8865, args);
    }

};


