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

public class HttpClientVerifyBuilder_withHeader_2414174221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19270;

    public HttpClientVerifyBuilder_withHeader_2414174221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19274 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19274, term19274.getClass(), "size", 109078154);
        setField(term19274, term19274.getClass(), "first", null);
        setField(term19274, term19274.getClass(), "last", null);
        setIntField(term19274, term19274.getClass(), "modCount", -314165467);
        Object term19277 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19277, term19277.getClass(), "size", 963694071);
        setField(term19277, term19277.getClass(), "first", null);
        setField(term19277, term19277.getClass(), "last", null);
        setIntField(term19277, term19277.getClass(), "modCount", -995785731);
        Object term19280 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19280, term19280.getClass(), "size", 1349815364);
        setField(term19280, term19280.getClass(), "first", null);
        setField(term19280, term19280.getClass(), "last", null);
        setIntField(term19280, term19280.getClass(), "modCount", 2128383340);
        Object term19283 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19283, term19283.getClass(), "size", 1238598518);
        setField(term19283, term19283.getClass(), "first", null);
        setField(term19283, term19283.getClass(), "last", null);
        setIntField(term19283, term19283.getClass(), "modCount", -558146961);
        Object term19286 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19286, term19286.getClass(), "size", 1505480070);
        setField(term19286, term19286.getClass(), "first", null);
        setField(term19286, term19286.getClass(), "last", null);
        setIntField(term19286, term19286.getClass(), "modCount", -829088844);
        Object term19289 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19289, term19289.getClass(), "size", -31751777);
        setField(term19289, term19289.getClass(), "first", null);
        setField(term19289, term19289.getClass(), "last", null);
        setIntField(term19289, term19289.getClass(), "modCount", -246967963);
        Object term19292 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19292, term19292.getClass(), "size", -1777140369);
        setField(term19292, term19292.getClass(), "first", null);
        setField(term19292, term19292.getClass(), "last", null);
        setIntField(term19292, term19292.getClass(), "modCount", 993627098);
        ArrayDeque term19272 = new ArrayDeque();
        ((ArrayDeque) term19272).add(term19274);
        ((ArrayDeque) term19272).add(term19277);
        ((ArrayDeque) term19272).add(term19280);
        ((ArrayDeque) term19272).add(term19283);
        ((ArrayDeque) term19272).add(term19286);
        ((ArrayDeque) term19272).add(term19289);
        ((ArrayDeque) term19272).add(term19292);
        ArrayList term19297 = new ArrayList();
        ((ArrayList) term19297).add((Object)null);
        ((ArrayList) term19297).add((Object)null);
        ((ArrayList) term19297).add((Object)null);
        ((ArrayList) term19297).add((Object)null);
        HashMap term19303 = new HashMap();
        ArrayList term19308 = new ArrayList();
        ((ArrayList) term19308).add((Object)null);
        ((ArrayList) term19308).add((Object)null);
        ((ArrayList) term19308).add((Object)null);
        ((ArrayList) term19308).add((Object)null);
        ((ArrayList) term19308).add((Object)null);
        ((ArrayList) term19308).add((Object)null);
        ((ArrayList) term19308).add((Object)null);
        ((ArrayList) term19308).add((Object)null);
        term19270 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19271 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19301 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19302 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19271, term19271.getClass(), "actionBundles", term19272);
        setField(term19271, term19271.getClass(), "conditions", term19297);
        setField(term19302, term19302.getClass(), "matchers", term19303);
        setField(term19301, term19301.getClass(), "parameterConditions", term19302);
        setField(term19301, term19301.getClass(), "referenceCondition", null);
        setField(term19301, term19301.getClass(), "hostCondition", null);
        setField(term19301, term19301.getClass(), "pathCondition", null);
        setField(term19301, term19301.getClass(), "portCondition", null);
        setField(term19301, term19301.getClass(), "schemaCondition", null);
        setField(term19271, term19271.getClass(), "urlConditions", term19301);
        setField(term19270, term19270.getClass(), "ruleBuilder", term19271);
        setField(term19270, term19270.getClass(), "requests", term19308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "iNwOJRBEjp";
        args[1] = "XylxrMBraH";
        callMethod(klass, "withHeader", argTypes, term19270, args);
    }

};


