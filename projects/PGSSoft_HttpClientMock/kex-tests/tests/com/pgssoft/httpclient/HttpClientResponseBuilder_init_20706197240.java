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
import java.util.ArrayDeque;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class HttpClientResponseBuilder_init_20706197240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13438;

    public HttpClientResponseBuilder_init_20706197240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13441 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term13443 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term13444 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term13441, term13441.getClass(), "size", 1824538861);
        setField(term13443, term13443.getClass(), "item", null);
        setField(term13443, term13443.getClass(), "next", null);
        setField(term13443, term13443.getClass(), "prev", null);
        setField(term13441, term13441.getClass(), "first", term13443);
        setField(term13444, term13444.getClass(), "item", null);
        setField(term13444, term13444.getClass(), "next", null);
        setField(term13444, term13444.getClass(), "prev", null);
        setField(term13441, term13441.getClass(), "last", term13444);
        setIntField(term13441, term13441.getClass(), "modCount", 499519708);
        Object term13446 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term13448 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term13446, term13446.getClass(), "size", 1501165033);
        setField(term13448, term13448.getClass(), "item", null);
        setField(term13448, term13448.getClass(), "next", null);
        setField(term13448, term13448.getClass(), "prev", term13444);
        setField(term13446, term13446.getClass(), "first", term13448);
        setField(term13446, term13446.getClass(), "last", term13448);
        setIntField(term13446, term13446.getClass(), "modCount", 510162332);
        Object term13450 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term13452 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term13450, term13450.getClass(), "size", 888506903);
        setField(term13452, term13452.getClass(), "item", null);
        setField(term13452, term13452.getClass(), "next", null);
        setField(term13452, term13452.getClass(), "prev", term13443);
        setField(term13450, term13450.getClass(), "first", term13452);
        setField(term13450, term13450.getClass(), "last", term13444);
        setIntField(term13450, term13450.getClass(), "modCount", 200252898);
        ArrayDeque term13439 = new ArrayDeque();
        ((ArrayDeque) term13439).add(term13441);
        ((ArrayDeque) term13439).add(term13446);
        ((ArrayDeque) term13439).add(term13450);
        ArrayList term13456 = new ArrayList();
        ((ArrayList) term13456).add((Object)null);
        ((ArrayList) term13456).add((Object)null);
        ((ArrayList) term13456).add((Object)null);
        ((ArrayList) term13456).add((Object)null);
        ((ArrayList) term13456).add((Object)null);
        HashMap term13462 = new HashMap();
        term13438 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term13460 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term13461 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term13438, term13438.getClass(), "actionBundles", term13439);
        setField(term13438, term13438.getClass(), "conditions", term13456);
        setField(term13461, term13461.getClass(), "matchers", term13462);
        setField(term13460, term13460.getClass(), "parameterConditions", term13461);
        setField(term13460, term13460.getClass(), "referenceCondition", null);
        setField(term13460, term13460.getClass(), "hostCondition", null);
        setField(term13460, term13460.getClass(), "pathCondition", null);
        setField(term13460, term13460.getClass(), "portCondition", null);
        setField(term13460, term13460.getClass(), "schemaCondition", null);
        setField(term13438, term13438.getClass(), "urlConditions", term13460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder");
        Object[] args = new Object[1];
        args[0] = term13438;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


