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

public class HttpClientResponseBuilder_doReturnJSON_175881440613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16945;

    public HttpClientResponseBuilder_doReturnJSON_175881440613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16949 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term16949, term16949.getClass(), "size", 1467356494);
        setField(term16949, term16949.getClass(), "first", null);
        setField(term16949, term16949.getClass(), "last", null);
        setIntField(term16949, term16949.getClass(), "modCount", -26316536);
        Object term16952 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term16952, term16952.getClass(), "size", 1716165145);
        setField(term16952, term16952.getClass(), "first", null);
        setField(term16952, term16952.getClass(), "last", null);
        setIntField(term16952, term16952.getClass(), "modCount", 1692937831);
        Object term16955 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term16955, term16955.getClass(), "size", -1539747985);
        setField(term16955, term16955.getClass(), "first", null);
        setField(term16955, term16955.getClass(), "last", null);
        setIntField(term16955, term16955.getClass(), "modCount", -1982489643);
        Object term16958 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term16958, term16958.getClass(), "size", 550892835);
        setField(term16958, term16958.getClass(), "first", null);
        setField(term16958, term16958.getClass(), "last", null);
        setIntField(term16958, term16958.getClass(), "modCount", 1237549886);
        Object term16961 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term16961, term16961.getClass(), "size", -1945635750);
        setField(term16961, term16961.getClass(), "first", null);
        setField(term16961, term16961.getClass(), "last", null);
        setIntField(term16961, term16961.getClass(), "modCount", -1622760744);
        Object term16964 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term16964, term16964.getClass(), "size", 2068435279);
        setField(term16964, term16964.getClass(), "first", null);
        setField(term16964, term16964.getClass(), "last", null);
        setIntField(term16964, term16964.getClass(), "modCount", -1556527718);
        Object term16967 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term16967, term16967.getClass(), "size", 895255351);
        setField(term16967, term16967.getClass(), "first", null);
        setField(term16967, term16967.getClass(), "last", null);
        setIntField(term16967, term16967.getClass(), "modCount", -1317044799);
        ArrayDeque term16947 = new ArrayDeque();
        ((ArrayDeque) term16947).add(term16949);
        ((ArrayDeque) term16947).add(term16952);
        ((ArrayDeque) term16947).add(term16955);
        ((ArrayDeque) term16947).add(term16958);
        ((ArrayDeque) term16947).add(term16961);
        ((ArrayDeque) term16947).add(term16964);
        ((ArrayDeque) term16947).add(term16967);
        ArrayList term16972 = new ArrayList();
        ((ArrayList) term16972).add((Object)null);
        ((ArrayList) term16972).add((Object)null);
        ((ArrayList) term16972).add((Object)null);
        ((ArrayList) term16972).add((Object)null);
        HashMap term16978 = new HashMap();
        term16945 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term16946 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term16976 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term16977 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term16946, term16946.getClass(), "actionBundles", term16947);
        setField(term16946, term16946.getClass(), "conditions", term16972);
        setField(term16977, term16977.getClass(), "matchers", term16978);
        setField(term16976, term16976.getClass(), "parameterConditions", term16977);
        setField(term16976, term16976.getClass(), "referenceCondition", null);
        setField(term16976, term16976.getClass(), "hostCondition", null);
        setField(term16976, term16976.getClass(), "pathCondition", null);
        setField(term16976, term16976.getClass(), "portCondition", null);
        setField(term16976, term16976.getClass(), "schemaCondition", null);
        setField(term16946, term16946.getClass(), "urlConditions", term16976);
        setField(term16945, term16945.getClass(), "ruleBuilder", term16946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = "kBdSllIBVz";
        args[1] = null;
        callMethod(klass, "doReturnJSON", argTypes, term16945, args);
    }

};


