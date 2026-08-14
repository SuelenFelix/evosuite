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

public class HttpClientResponseBuilder_doReturnJSON_64192668911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16896;

    public HttpClientResponseBuilder_doReturnJSON_64192668911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16900 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term16900, term16900.getClass(), "size", 633598642);
        setField(term16900, term16900.getClass(), "first", null);
        setField(term16900, term16900.getClass(), "last", null);
        setIntField(term16900, term16900.getClass(), "modCount", 1862841859);
        Object term16903 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term16903, term16903.getClass(), "size", -1114668574);
        setField(term16903, term16903.getClass(), "first", null);
        setField(term16903, term16903.getClass(), "last", null);
        setIntField(term16903, term16903.getClass(), "modCount", 514511037);
        Object term16906 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term16906, term16906.getClass(), "size", 1713573821);
        setField(term16906, term16906.getClass(), "first", null);
        setField(term16906, term16906.getClass(), "last", null);
        setIntField(term16906, term16906.getClass(), "modCount", 1956590498);
        ArrayDeque term16898 = new ArrayDeque();
        ((ArrayDeque) term16898).add(term16900);
        ((ArrayDeque) term16898).add(term16903);
        ((ArrayDeque) term16898).add(term16906);
        ArrayList term16911 = new ArrayList();
        ((ArrayList) term16911).add((Object)null);
        ((ArrayList) term16911).add((Object)null);
        ((ArrayList) term16911).add((Object)null);
        ((ArrayList) term16911).add((Object)null);
        HashMap term16917 = new HashMap();
        term16896 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term16897 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term16915 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term16916 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term16897, term16897.getClass(), "actionBundles", term16898);
        setField(term16897, term16897.getClass(), "conditions", term16911);
        setField(term16916, term16916.getClass(), "matchers", term16917);
        setField(term16915, term16915.getClass(), "parameterConditions", term16916);
        setField(term16915, term16915.getClass(), "referenceCondition", null);
        setField(term16915, term16915.getClass(), "hostCondition", null);
        setField(term16915, term16915.getClass(), "pathCondition", null);
        setField(term16915, term16915.getClass(), "portCondition", null);
        setField(term16915, term16915.getClass(), "schemaCondition", null);
        setField(term16897, term16897.getClass(), "urlConditions", term16915);
        setField(term16896, term16896.getClass(), "ruleBuilder", term16897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWHnvSvaPl";
        callMethod(klass, "doReturnJSON", argTypes, term16896, args);
    }

};


