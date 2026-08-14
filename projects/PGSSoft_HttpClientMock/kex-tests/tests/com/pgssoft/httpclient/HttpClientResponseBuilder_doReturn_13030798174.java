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

public class HttpClientResponseBuilder_doReturn_13030798174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13621;

    public HttpClientResponseBuilder_doReturn_13030798174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13625 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13625, term13625.getClass(), "size", -1488938905);
        setField(term13625, term13625.getClass(), "first", null);
        setField(term13625, term13625.getClass(), "last", null);
        setIntField(term13625, term13625.getClass(), "modCount", 1916544127);
        Object term13628 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13628, term13628.getClass(), "size", -1133405894);
        setField(term13628, term13628.getClass(), "first", null);
        setField(term13628, term13628.getClass(), "last", null);
        setIntField(term13628, term13628.getClass(), "modCount", 1289741214);
        Object term13631 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13631, term13631.getClass(), "size", 243280944);
        setField(term13631, term13631.getClass(), "first", null);
        setField(term13631, term13631.getClass(), "last", null);
        setIntField(term13631, term13631.getClass(), "modCount", -726681073);
        Object term13634 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13634, term13634.getClass(), "size", -1724487863);
        setField(term13634, term13634.getClass(), "first", null);
        setField(term13634, term13634.getClass(), "last", null);
        setIntField(term13634, term13634.getClass(), "modCount", -128490829);
        Object term13637 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13637, term13637.getClass(), "size", 202214133);
        setField(term13637, term13637.getClass(), "first", null);
        setField(term13637, term13637.getClass(), "last", null);
        setIntField(term13637, term13637.getClass(), "modCount", 1543091617);
        Object term13640 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13640, term13640.getClass(), "size", -763166094);
        setField(term13640, term13640.getClass(), "first", null);
        setField(term13640, term13640.getClass(), "last", null);
        setIntField(term13640, term13640.getClass(), "modCount", -222941705);
        Object term13643 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13643, term13643.getClass(), "size", 291864719);
        setField(term13643, term13643.getClass(), "first", null);
        setField(term13643, term13643.getClass(), "last", null);
        setIntField(term13643, term13643.getClass(), "modCount", -1549607466);
        ArrayDeque term13623 = new ArrayDeque();
        ((ArrayDeque) term13623).add(term13625);
        ((ArrayDeque) term13623).add(term13628);
        ((ArrayDeque) term13623).add(term13631);
        ((ArrayDeque) term13623).add(term13634);
        ((ArrayDeque) term13623).add(term13637);
        ((ArrayDeque) term13623).add(term13640);
        ((ArrayDeque) term13623).add(term13643);
        ArrayList term13648 = new ArrayList();
        ((ArrayList) term13648).add((Object)null);
        ((ArrayList) term13648).add((Object)null);
        ((ArrayList) term13648).add((Object)null);
        ((ArrayList) term13648).add((Object)null);
        ((ArrayList) term13648).add((Object)null);
        ((ArrayList) term13648).add((Object)null);
        ((ArrayList) term13648).add((Object)null);
        ((ArrayList) term13648).add((Object)null);
        HashMap term13654 = new HashMap();
        term13621 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term13622 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term13652 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term13653 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term13622, term13622.getClass(), "actionBundles", term13623);
        setField(term13622, term13622.getClass(), "conditions", term13648);
        setField(term13653, term13653.getClass(), "matchers", term13654);
        setField(term13652, term13652.getClass(), "parameterConditions", term13653);
        setField(term13652, term13652.getClass(), "referenceCondition", null);
        setField(term13652, term13652.getClass(), "hostCondition", null);
        setField(term13652, term13652.getClass(), "pathCondition", null);
        setField(term13652, term13652.getClass(), "portCondition", null);
        setField(term13652, term13652.getClass(), "schemaCondition", null);
        setField(term13622, term13622.getClass(), "urlConditions", term13652);
        setField(term13621, term13621.getClass(), "ruleBuilder", term13622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ieCtQFdkii";
        callMethod(klass, "doReturn", argTypes, term13621, args);
    }

};


