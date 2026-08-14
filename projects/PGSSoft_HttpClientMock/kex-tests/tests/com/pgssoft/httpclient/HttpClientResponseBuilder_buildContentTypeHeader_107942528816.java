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

public class HttpClientResponseBuilder_buildContentTypeHeader_107942528816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17104;

    public HttpClientResponseBuilder_buildContentTypeHeader_107942528816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17108 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term17108, term17108.getClass(), "size", 1973060703);
        setField(term17108, term17108.getClass(), "first", null);
        setField(term17108, term17108.getClass(), "last", null);
        setIntField(term17108, term17108.getClass(), "modCount", -138239905);
        Object term17111 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term17111, term17111.getClass(), "size", 1709474063);
        setField(term17111, term17111.getClass(), "first", null);
        setField(term17111, term17111.getClass(), "last", null);
        setIntField(term17111, term17111.getClass(), "modCount", 1406617209);
        Object term17114 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term17114, term17114.getClass(), "size", 1706047059);
        setField(term17114, term17114.getClass(), "first", null);
        setField(term17114, term17114.getClass(), "last", null);
        setIntField(term17114, term17114.getClass(), "modCount", 590451710);
        Object term17117 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term17117, term17117.getClass(), "size", -1999787419);
        setField(term17117, term17117.getClass(), "first", null);
        setField(term17117, term17117.getClass(), "last", null);
        setIntField(term17117, term17117.getClass(), "modCount", -1224443634);
        Object term17120 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term17120, term17120.getClass(), "size", 1048451946);
        setField(term17120, term17120.getClass(), "first", null);
        setField(term17120, term17120.getClass(), "last", null);
        setIntField(term17120, term17120.getClass(), "modCount", 5603560);
        ArrayDeque term17106 = new ArrayDeque();
        ((ArrayDeque) term17106).add(term17108);
        ((ArrayDeque) term17106).add(term17111);
        ((ArrayDeque) term17106).add(term17114);
        ((ArrayDeque) term17106).add(term17117);
        ((ArrayDeque) term17106).add(term17120);
        ArrayList term17125 = new ArrayList();
        ((ArrayList) term17125).add((Object)null);
        ((ArrayList) term17125).add((Object)null);
        HashMap term17131 = new HashMap();
        term17104 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term17105 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term17129 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term17130 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term17105, term17105.getClass(), "actionBundles", term17106);
        setField(term17105, term17105.getClass(), "conditions", term17125);
        setField(term17130, term17130.getClass(), "matchers", term17131);
        setField(term17129, term17129.getClass(), "parameterConditions", term17130);
        setField(term17129, term17129.getClass(), "referenceCondition", null);
        setField(term17129, term17129.getClass(), "hostCondition", null);
        setField(term17129, term17129.getClass(), "pathCondition", null);
        setField(term17129, term17129.getClass(), "portCondition", null);
        setField(term17129, term17129.getClass(), "schemaCondition", null);
        setField(term17105, term17105.getClass(), "urlConditions", term17129);
        setField(term17104, term17104.getClass(), "ruleBuilder", term17105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = "bLPjGVBhlX";
        args[1] = null;
        callMethod(klass, "buildContentTypeHeader", argTypes, term17104, args);
    }

};


