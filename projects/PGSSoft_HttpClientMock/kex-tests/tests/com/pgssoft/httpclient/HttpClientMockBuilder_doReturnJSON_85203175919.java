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

public class HttpClientMockBuilder_doReturnJSON_85203175919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8790;

    public HttpClientMockBuilder_doReturnJSON_85203175919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8794 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8794, term8794.getClass(), "size", 474518942);
        setField(term8794, term8794.getClass(), "first", null);
        setField(term8794, term8794.getClass(), "last", null);
        setIntField(term8794, term8794.getClass(), "modCount", -1656687479);
        Object term8797 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8797, term8797.getClass(), "size", -249614216);
        setField(term8797, term8797.getClass(), "first", null);
        setField(term8797, term8797.getClass(), "last", null);
        setIntField(term8797, term8797.getClass(), "modCount", 1870727665);
        Object term8800 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8800, term8800.getClass(), "size", -519881101);
        setField(term8800, term8800.getClass(), "first", null);
        setField(term8800, term8800.getClass(), "last", null);
        setIntField(term8800, term8800.getClass(), "modCount", -680920524);
        Object term8803 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8803, term8803.getClass(), "size", -916335264);
        setField(term8803, term8803.getClass(), "first", null);
        setField(term8803, term8803.getClass(), "last", null);
        setIntField(term8803, term8803.getClass(), "modCount", -919416536);
        Object term8806 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8806, term8806.getClass(), "size", -43417861);
        setField(term8806, term8806.getClass(), "first", null);
        setField(term8806, term8806.getClass(), "last", null);
        setIntField(term8806, term8806.getClass(), "modCount", -1533843432);
        Object term8809 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8809, term8809.getClass(), "size", -123338791);
        setField(term8809, term8809.getClass(), "first", null);
        setField(term8809, term8809.getClass(), "last", null);
        setIntField(term8809, term8809.getClass(), "modCount", -1467089634);
        Object term8812 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8812, term8812.getClass(), "size", 413548937);
        setField(term8812, term8812.getClass(), "first", null);
        setField(term8812, term8812.getClass(), "last", null);
        setIntField(term8812, term8812.getClass(), "modCount", 1901317214);
        Object term8815 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8815, term8815.getClass(), "size", 1166710220);
        setField(term8815, term8815.getClass(), "first", null);
        setField(term8815, term8815.getClass(), "last", null);
        setIntField(term8815, term8815.getClass(), "modCount", -1070592289);
        ArrayDeque term8792 = new ArrayDeque();
        ((ArrayDeque) term8792).add(term8794);
        ((ArrayDeque) term8792).add(term8797);
        ((ArrayDeque) term8792).add(term8800);
        ((ArrayDeque) term8792).add(term8803);
        ((ArrayDeque) term8792).add(term8806);
        ((ArrayDeque) term8792).add(term8809);
        ((ArrayDeque) term8792).add(term8812);
        ((ArrayDeque) term8792).add(term8815);
        ArrayList term8820 = new ArrayList();
        HashMap term8826 = new HashMap();
        ArrayDeque term8833 = new ArrayDeque();
        ((ArrayDeque) term8833).add((Object)null);
        ((ArrayDeque) term8833).add((Object)null);
        ((ArrayDeque) term8833).add((Object)null);
        ((ArrayDeque) term8833).add(term8800);
        ArrayList term8837 = new ArrayList();
        ((ArrayList) term8837).add((Object)null);
        term8790 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term8791 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term8824 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term8825 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term8831 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term8832 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term8841 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term8842 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term8791, term8791.getClass(), "actionBundles", term8792);
        setField(term8791, term8791.getClass(), "conditions", term8820);
        setField(term8825, term8825.getClass(), "matchers", term8826);
        setField(term8824, term8824.getClass(), "parameterConditions", term8825);
        setField(term8824, term8824.getClass(), "referenceCondition", null);
        setField(term8824, term8824.getClass(), "hostCondition", null);
        setField(term8824, term8824.getClass(), "pathCondition", null);
        setField(term8824, term8824.getClass(), "portCondition", null);
        setField(term8824, term8824.getClass(), "schemaCondition", null);
        setField(term8791, term8791.getClass(), "urlConditions", term8824);
        setField(term8790, term8790.getClass(), "ruleBuilder", term8791);
        setField(term8832, term8832.getClass(), "actionBundles", term8833);
        setField(term8832, term8832.getClass(), "conditions", term8837);
        setField(term8842, term8842.getClass(), "matchers", null);
        setField(term8841, term8841.getClass(), "parameterConditions", term8842);
        setField(term8841, term8841.getClass(), "referenceCondition", null);
        setField(term8841, term8841.getClass(), "hostCondition", null);
        setField(term8841, term8841.getClass(), "pathCondition", null);
        setField(term8841, term8841.getClass(), "portCondition", null);
        setField(term8841, term8841.getClass(), "schemaCondition", null);
        setField(term8832, term8832.getClass(), "urlConditions", term8841);
        setField(term8831, term8831.getClass(), "ruleBuilder", term8832);
        setField(term8790, term8790.getClass(), "responseBuilder", term8831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = "pCTimMblYc";
        args[1] = null;
        callMethod(klass, "doReturnJSON", argTypes, term8790, args);
    }

};


