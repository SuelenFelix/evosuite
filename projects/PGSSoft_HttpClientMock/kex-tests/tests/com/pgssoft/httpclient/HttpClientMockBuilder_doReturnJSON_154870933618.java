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

public class HttpClientMockBuilder_doReturnJSON_154870933618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8721;

    public HttpClientMockBuilder_doReturnJSON_154870933618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8725 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8725, term8725.getClass(), "size", 147209682);
        setField(term8725, term8725.getClass(), "first", null);
        setField(term8725, term8725.getClass(), "last", null);
        setIntField(term8725, term8725.getClass(), "modCount", 34470066);
        Object term8728 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8728, term8728.getClass(), "size", 2058711405);
        setField(term8728, term8728.getClass(), "first", null);
        setField(term8728, term8728.getClass(), "last", null);
        setIntField(term8728, term8728.getClass(), "modCount", 1743683601);
        Object term8731 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8731, term8731.getClass(), "size", -945116798);
        setField(term8731, term8731.getClass(), "first", null);
        setField(term8731, term8731.getClass(), "last", null);
        setIntField(term8731, term8731.getClass(), "modCount", 1593461795);
        Object term8734 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8734, term8734.getClass(), "size", 515182546);
        setField(term8734, term8734.getClass(), "first", null);
        setField(term8734, term8734.getClass(), "last", null);
        setIntField(term8734, term8734.getClass(), "modCount", -936895502);
        Object term8737 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8737, term8737.getClass(), "size", -129547140);
        setField(term8737, term8737.getClass(), "first", null);
        setField(term8737, term8737.getClass(), "last", null);
        setIntField(term8737, term8737.getClass(), "modCount", 199287428);
        Object term8740 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term8740, term8740.getClass(), "size", -1195339592);
        setField(term8740, term8740.getClass(), "first", null);
        setField(term8740, term8740.getClass(), "last", null);
        setIntField(term8740, term8740.getClass(), "modCount", -376422566);
        ArrayDeque term8723 = new ArrayDeque();
        ((ArrayDeque) term8723).add(term8725);
        ((ArrayDeque) term8723).add(term8728);
        ((ArrayDeque) term8723).add(term8731);
        ((ArrayDeque) term8723).add(term8734);
        ((ArrayDeque) term8723).add(term8737);
        ((ArrayDeque) term8723).add(term8740);
        ArrayList term8745 = new ArrayList();
        ((ArrayList) term8745).add((Object)null);
        ((ArrayList) term8745).add((Object)null);
        ((ArrayList) term8745).add((Object)null);
        ((ArrayList) term8745).add((Object)null);
        ((ArrayList) term8745).add((Object)null);
        HashMap term8751 = new HashMap();
        ArrayDeque term8758 = new ArrayDeque();
        ((ArrayDeque) term8758).add((Object)null);
        ((ArrayDeque) term8758).add((Object)null);
        ((ArrayDeque) term8758).add((Object)null);
        ArrayList term8762 = new ArrayList();
        ((ArrayList) term8762).add((Object)null);
        ((ArrayList) term8762).add((Object)null);
        ((ArrayList) term8762).add((Object)null);
        ((ArrayList) term8762).add((Object)null);
        term8721 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term8722 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term8749 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term8750 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term8756 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term8757 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term8766 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term8767 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term8722, term8722.getClass(), "actionBundles", term8723);
        setField(term8722, term8722.getClass(), "conditions", term8745);
        setField(term8750, term8750.getClass(), "matchers", term8751);
        setField(term8749, term8749.getClass(), "parameterConditions", term8750);
        setField(term8749, term8749.getClass(), "referenceCondition", null);
        setField(term8749, term8749.getClass(), "hostCondition", null);
        setField(term8749, term8749.getClass(), "pathCondition", null);
        setField(term8749, term8749.getClass(), "portCondition", null);
        setField(term8749, term8749.getClass(), "schemaCondition", null);
        setField(term8722, term8722.getClass(), "urlConditions", term8749);
        setField(term8721, term8721.getClass(), "ruleBuilder", term8722);
        setField(term8757, term8757.getClass(), "actionBundles", term8758);
        setField(term8757, term8757.getClass(), "conditions", term8762);
        setField(term8767, term8767.getClass(), "matchers", null);
        setField(term8766, term8766.getClass(), "parameterConditions", term8767);
        setField(term8766, term8766.getClass(), "referenceCondition", null);
        setField(term8766, term8766.getClass(), "hostCondition", null);
        setField(term8766, term8766.getClass(), "pathCondition", null);
        setField(term8766, term8766.getClass(), "portCondition", null);
        setField(term8766, term8766.getClass(), "schemaCondition", null);
        setField(term8757, term8757.getClass(), "urlConditions", term8766);
        setField(term8756, term8756.getClass(), "ruleBuilder", term8757);
        setField(term8721, term8721.getClass(), "responseBuilder", term8756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "doReturnJSON", argTypes, term8721, args);
    }

};


