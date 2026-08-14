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

public class HttpClientVerifyBuilder_withHost_6384278189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19706;

    public HttpClientVerifyBuilder_withHost_6384278189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19710 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19710, term19710.getClass(), "size", 868908117);
        setField(term19710, term19710.getClass(), "first", null);
        setField(term19710, term19710.getClass(), "last", null);
        setIntField(term19710, term19710.getClass(), "modCount", 1789351397);
        Object term19713 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19713, term19713.getClass(), "size", 2145528170);
        setField(term19713, term19713.getClass(), "first", null);
        setField(term19713, term19713.getClass(), "last", null);
        setIntField(term19713, term19713.getClass(), "modCount", -585773976);
        Object term19716 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19716, term19716.getClass(), "size", 852806940);
        setField(term19716, term19716.getClass(), "first", null);
        setField(term19716, term19716.getClass(), "last", null);
        setIntField(term19716, term19716.getClass(), "modCount", 698551724);
        Object term19719 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19719, term19719.getClass(), "size", -1631048635);
        setField(term19719, term19719.getClass(), "first", null);
        setField(term19719, term19719.getClass(), "last", null);
        setIntField(term19719, term19719.getClass(), "modCount", 1342808731);
        ArrayDeque term19708 = new ArrayDeque();
        ((ArrayDeque) term19708).add(term19710);
        ((ArrayDeque) term19708).add(term19713);
        ((ArrayDeque) term19708).add(term19716);
        ((ArrayDeque) term19708).add(term19719);
        ArrayList term19724 = new ArrayList();
        ((ArrayList) term19724).add((Object)null);
        ((ArrayList) term19724).add((Object)null);
        ((ArrayList) term19724).add((Object)null);
        ((ArrayList) term19724).add((Object)null);
        ((ArrayList) term19724).add((Object)null);
        ((ArrayList) term19724).add((Object)null);
        HashMap term19730 = new HashMap();
        ArrayList term19735 = new ArrayList();
        ((ArrayList) term19735).add((Object)null);
        ((ArrayList) term19735).add((Object)null);
        ((ArrayList) term19735).add((Object)null);
        term19706 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19707 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19728 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19729 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19707, term19707.getClass(), "actionBundles", term19708);
        setField(term19707, term19707.getClass(), "conditions", term19724);
        setField(term19729, term19729.getClass(), "matchers", term19730);
        setField(term19728, term19728.getClass(), "parameterConditions", term19729);
        setField(term19728, term19728.getClass(), "referenceCondition", null);
        setField(term19728, term19728.getClass(), "hostCondition", null);
        setField(term19728, term19728.getClass(), "pathCondition", null);
        setField(term19728, term19728.getClass(), "portCondition", null);
        setField(term19728, term19728.getClass(), "schemaCondition", null);
        setField(term19707, term19707.getClass(), "urlConditions", term19728);
        setField(term19706, term19706.getClass(), "ruleBuilder", term19707);
        setField(term19706, term19706.getClass(), "requests", term19735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XOiDvlDhdc";
        callMethod(klass, "withHost", argTypes, term19706, args);
    }

};


