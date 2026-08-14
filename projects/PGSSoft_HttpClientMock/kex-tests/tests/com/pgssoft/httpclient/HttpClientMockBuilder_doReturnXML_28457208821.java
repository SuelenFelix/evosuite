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

public class HttpClientMockBuilder_doReturnXML_28457208821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8916;

    public HttpClientMockBuilder_doReturnXML_28457208821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8920 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8920, term8920.getClass(), "size", -1362856620);
        setField(term8920, term8920.getClass(), "first", null);
        setField(term8920, term8920.getClass(), "last", null);
        setIntField(term8920, term8920.getClass(), "modCount", -1835839814);
        Object term8923 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8923, term8923.getClass(), "size", -1404350380);
        setField(term8923, term8923.getClass(), "first", null);
        setField(term8923, term8923.getClass(), "last", null);
        setIntField(term8923, term8923.getClass(), "modCount", -2013924238);
        ArrayDeque term8918 = new ArrayDeque();
        ((ArrayDeque) term8918).add(term8920);
        ((ArrayDeque) term8918).add(term8923);
        ArrayList term8928 = new ArrayList();
        ((ArrayList) term8928).add((Object)null);
        ((ArrayList) term8928).add((Object)null);
        HashMap term8934 = new HashMap();
        ArrayDeque term8941 = new ArrayDeque();
        ((ArrayDeque) term8941).add((Object)null);
        ((ArrayDeque) term8941).add((Object)null);
        ((ArrayDeque) term8941).add((Object)null);
        ((ArrayDeque) term8941).add((Object)null);
        ((ArrayDeque) term8941).add((Object)null);
        ArrayList term8945 = new ArrayList();
        ((ArrayList) term8945).add((Object)null);
        ((ArrayList) term8945).add((Object)null);
        ((ArrayList) term8945).add((Object)null);
        ((ArrayList) term8945).add((Object)null);
        term8916 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term8917 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term8932 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term8933 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term8939 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term8940 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term8949 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term8950 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term8917, term8917.getClass(), "actionBundles", term8918);
        setField(term8917, term8917.getClass(), "conditions", term8928);
        setField(term8933, term8933.getClass(), "matchers", term8934);
        setField(term8932, term8932.getClass(), "parameterConditions", term8933);
        setField(term8932, term8932.getClass(), "referenceCondition", null);
        setField(term8932, term8932.getClass(), "hostCondition", null);
        setField(term8932, term8932.getClass(), "pathCondition", null);
        setField(term8932, term8932.getClass(), "portCondition", null);
        setField(term8932, term8932.getClass(), "schemaCondition", null);
        setField(term8917, term8917.getClass(), "urlConditions", term8932);
        setField(term8916, term8916.getClass(), "ruleBuilder", term8917);
        setField(term8940, term8940.getClass(), "actionBundles", term8941);
        setField(term8940, term8940.getClass(), "conditions", term8945);
        setField(term8950, term8950.getClass(), "matchers", null);
        setField(term8949, term8949.getClass(), "parameterConditions", term8950);
        setField(term8949, term8949.getClass(), "referenceCondition", null);
        setField(term8949, term8949.getClass(), "hostCondition", null);
        setField(term8949, term8949.getClass(), "pathCondition", null);
        setField(term8949, term8949.getClass(), "portCondition", null);
        setField(term8949, term8949.getClass(), "schemaCondition", null);
        setField(term8940, term8940.getClass(), "urlConditions", term8949);
        setField(term8939, term8939.getClass(), "ruleBuilder", term8940);
        setField(term8916, term8916.getClass(), "responseBuilder", term8939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = "RkybSrpybU";
        args[1] = null;
        callMethod(klass, "doReturnXML", argTypes, term8916, args);
    }

};


